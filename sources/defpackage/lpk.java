package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpk {
    public static final lpk a = new lpj().a();
    public final int b;
    public final int c;
    private lpi d;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
    }

    public lpk(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final lpi a() {
        if (this.d == null) {
            this.d = new lpi(this);
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lpk lpkVar = (lpk) obj;
            if (this.b == lpkVar.b && this.c == lpkVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b + 527) * 961) + this.c) * 31) + 1) * 31;
    }
}
