package defpackage;

import com.google.android.gms.droidguard.internal.IDroidGuardHandle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgcr extends dgdi {
    public final IDroidGuardHandle a;
    private final dgbz b;

    public dgcr(IDroidGuardHandle iDroidGuardHandle, dgbz dgbzVar) {
        if (iDroidGuardHandle == null) {
            throw new NullPointerException("Null handle");
        }
        this.a = iDroidGuardHandle;
        this.b = dgbzVar;
    }

    @Override // defpackage.dgdi
    public final IDroidGuardHandle a() {
        return this.a;
    }

    @Override // defpackage.dgdi
    public final dgbz b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        dgbz dgbzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgdi) {
            dgdi dgdiVar = (dgdi) obj;
            if (this.a.equals(dgdiVar.a()) && ((dgbzVar = this.b) != null ? dgbzVar.equals(dgdiVar.b()) : dgdiVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        dgbz dgbzVar = this.b;
        return (hashCode * 1000003) ^ (dgbzVar == null ? 0 : dgbzVar.hashCode());
    }

    public final String toString() {
        dgbz dgbzVar = this.b;
        return "InitializedHandle{handle=" + this.a.toString() + ", appSideVmProcess=" + String.valueOf(dgbzVar) + "}";
    }
}
