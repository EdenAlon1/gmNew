package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjv {
    public final engw a;
    public final boolean b;
    public final boolean c;
    public final ffix d;

    public zjv(engw engwVar, boolean z, boolean z2, ffix ffixVar) {
        engwVar.getClass();
        this.a = engwVar;
        this.b = z;
        this.c = z2;
        this.d = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjv)) {
            return false;
        }
        zjv zjvVar = (zjv) obj;
        return ffkj.e(this.a, zjvVar.a) && this.b == zjvVar.b && this.c == zjvVar.c && ffkj.e(this.d, zjvVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffix ffixVar = this.d;
        return ((((hashCode + zju.a(this.b)) * 31) + zju.a(this.c)) * 31) + ffixVar.hashCode();
    }

    public final String toString() {
        return "ReplyOverlayUiData(replies=" + this.a + ", overflow=" + this.b + ", isEnabled=" + this.c + ", onClose=" + this.d + ")";
    }
}
