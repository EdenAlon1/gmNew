package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes9.dex */
final class g extends h {
    private final Set d;

    g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.d = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.h
    protected final ZoneRules c(String str) {
        if (this.d.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new e("Not a built-in time zone: " + str);
    }

    @Override // j$.time.zone.h
    protected final Set d() {
        return this.d;
    }
}
