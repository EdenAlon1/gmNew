package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euqd {
    public final euqq a;
    public final int b;
    private final int c;

    public euqd(euqq euqqVar, int i, int i2) {
        this.a = euqqVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean b() {
        return this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof euqd) {
            euqd euqdVar = (euqd) obj;
            if (this.a.equals(euqdVar.a) && this.b == euqdVar.b && this.c == euqdVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(this.c != 0 ? "provider" : "direct");
        sb.append("}");
        return sb.toString();
    }

    public euqd(Class cls, int i, int i2) {
        this(new euqq(euqp.class, cls), i, i2);
    }
}
