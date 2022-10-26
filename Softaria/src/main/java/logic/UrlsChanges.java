package logic;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;


public class UrlsChanges {

  private final Set<String> changed = Collections.synchronizedSet( new HashSet<>());
  private final Set<String> added = Collections.synchronizedSet( new HashSet<>());
  private final Set<String> deleted = Collections.synchronizedSet( new HashSet<>());


  /**
   * Iterates over the first hashtable and finds changed and added urls.
   * Then finds added urls with help of MapDifference.
   * @param first - table for yesterday urls.
   * @param second - table for today urls.
   */
  public void findChanges(Hashtable<String, String> first, Hashtable<String, String> second) {

    Iterator<Entry<String, String>> iter = first.entrySet().stream().iterator();

    while (iter.hasNext()) {

      Entry<String, String> entry = iter.next();
      String key = entry.getKey();

      if (second.containsKey(key)) {

        if (!Objects.equals(second.get(key), entry.getValue()))

          changed.add(key);
      } else

        deleted.add(key);
    }
    // I could use same lib (where MapDifference comes from) for finding changed
    // and deleted urls too, but thought that it will be understandable and more efficient this way.
    MapDifference<String, String> diff = Maps.difference(first, second);
    Iterator<String> iterDiff = diff.entriesOnlyOnRight().keySet().stream().iterator();

    while (iterDiff.hasNext()) {
      added.add(iterDiff.next());
    }
  }

  public Set<String> getChanged() {
    return changed;
  }

  public Set<String> getAdded() {
    return added;
  }

  public Set<String> getDeleted() {
    return deleted;
  }
}
