package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqg implements aqe {
    private final DynamicRangeProfiles a;

    public aqg(Object obj) {
        this.a = ja$$ExternalSyntheticApiModelOutline0.m453m(obj);
    }

    private static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            aua a = aqd.a(longValue);
            ksw.i(a, a.s(longValue, "Dynamic range profile cannot be converted to a DynamicRange object: "));
            hashSet.add(a);
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.aqe
    public final DynamicRangeProfiles a() {
        return this.a;
    }

    @Override // defpackage.aqe
    public final Set b(aua auaVar) {
        Set profileCaptureRequestConstraints;
        Long b = aqd.b(auaVar, this.a);
        Objects.toString(auaVar);
        ksw.b(b != null, "DynamicRange is not supported: ".concat(String.valueOf(auaVar)));
        profileCaptureRequestConstraints = this.a.getProfileCaptureRequestConstraints(b.longValue());
        return d(profileCaptureRequestConstraints);
    }

    @Override // defpackage.aqe
    public final Set c() {
        Set supportedProfiles;
        supportedProfiles = this.a.getSupportedProfiles();
        return d(supportedProfiles);
    }
}
