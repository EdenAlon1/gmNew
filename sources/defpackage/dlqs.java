package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlqs extends dlqu {
    private final Map a;

    public dlqs(Map map) {
        this.a = map;
    }

    @Override // defpackage.dlqu, defpackage.dlrf
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.dlrf
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dlrf) {
            dlrf dlrfVar = (dlrf) obj;
            if (dlrfVar.b() == 1 && ennc.m(this.a, dlrfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConfigDataMapOrSyncFailureReason{configDataMap=" + ennc.g(this.a) + "}";
    }
}
