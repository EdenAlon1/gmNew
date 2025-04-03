package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dywx extends dyxb {
    public final dyxf a;
    private final String b;

    public dywx(String str, dyxf dyxfVar) {
        this.b = str;
        this.a = dyxfVar;
    }

    @Override // defpackage.dyxb
    public final dyxf a() {
        return this.a;
    }

    @Override // defpackage.dyxb
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyxb) {
            dyxb dyxbVar = (dyxb) obj;
            if (this.b.equals(dyxbVar.b()) && this.a.equals(dyxbVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "LighterJobParameters{tag=" + this.b + ", lighterRetryPolicy=" + this.a.toString() + "}";
    }
}
