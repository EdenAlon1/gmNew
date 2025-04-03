package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkd {
    public final ffix a;
    public final ffix b;
    public final boolean c;

    public abkd(ffix ffixVar, ffix ffixVar2, boolean z) {
        this.a = ffixVar;
        this.b = ffixVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abkd)) {
            return false;
        }
        abkd abkdVar = (abkd) obj;
        return ffkj.e(this.a, abkdVar.a) && ffkj.e(this.b, abkdVar.b) && this.c == abkdVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SpeedBumpScreenArgs(onBack=" + this.a + ", onContinue=" + this.b + ", isGroupConversation=" + this.c + ")";
    }
}
