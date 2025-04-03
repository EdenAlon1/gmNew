package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqh implements aqe {
    static final aqf a = new aqf(new aqh());
    private static final Set b = Collections.singleton(aua.b);

    @Override // defpackage.aqe
    public final DynamicRangeProfiles a() {
        return null;
    }

    @Override // defpackage.aqe
    public final Set b(aua auaVar) {
        boolean equals = aua.b.equals(auaVar);
        Objects.toString(auaVar);
        ksw.b(equals, "DynamicRange is not supported: ".concat(String.valueOf(auaVar)));
        return b;
    }

    @Override // defpackage.aqe
    public final Set c() {
        return b;
    }
}
