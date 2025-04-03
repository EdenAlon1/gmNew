package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fise extends fisa {
    public static final fird A;
    public static final fird B;
    public static final fird C;
    public static final fird D;
    public static final fird E;
    public static final fird F;
    public static final firl o;
    public static final firl p;
    public static final firl q;
    public static final firl r;
    public static final firl s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final firl t;
    public static final firl u;
    public static final fird v;
    public static final fird w;
    public static final fird x;
    public static final fird y;
    public static final fird z;
    public final int G;
    private final transient fisd[] H;

    static {
        firl firlVar = fith.a;
        o = firlVar;
        fitl fitlVar = new fitl(firn.k, 1000L);
        p = fitlVar;
        fitl fitlVar2 = new fitl(firn.j, 60000L);
        q = fitlVar2;
        fitl fitlVar3 = new fitl(firn.i, 3600000L);
        r = fitlVar3;
        fitl fitlVar4 = new fitl(firn.h, 43200000L);
        s = fitlVar4;
        fitl fitlVar5 = new fitl(firn.g, 86400000L);
        t = fitlVar5;
        u = new fitl(firn.f, 604800000L);
        v = new fitj(firf.x, firlVar, fitlVar);
        w = new fitj(firf.w, firlVar, fitlVar5);
        x = new fitj(firf.v, fitlVar, fitlVar2);
        y = new fitj(firf.u, fitlVar, fitlVar5);
        z = new fitj(firf.t, fitlVar2, fitlVar3);
        A = new fitj(firf.s, fitlVar2, fitlVar5);
        fitj fitjVar = new fitj(firf.r, fitlVar3, fitlVar5);
        B = fitjVar;
        fitj fitjVar2 = new fitj(firf.o, fitlVar3, fitlVar4);
        C = fitjVar2;
        D = new fitq(fitjVar, firf.q);
        E = new fitq(fitjVar2, firf.p);
        F = new fisc();
    }

    public fise(firb firbVar, int i) {
        super(firbVar, null);
        this.H = new fisd[1024];
        this.G = i;
    }

    @Override // defpackage.fisa
    protected void M(firz firzVar) {
        throw null;
    }

    final int N(long j, int i, int i2) {
        return ((int) ((j - (ac(i) + ab(i, i2))) / 86400000)) + 1;
    }

    final int O(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    final int P(long j, int i) {
        return ((int) ((j - ac(i)) / 86400000)) + 1;
    }

    final int Q(long j) {
        int Y = Y(j);
        return R(Y, T(j, Y));
    }

    public abstract int R(int i, int i2);

    final int S(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public abstract int T(long j, int i);

    final int U(long j) {
        return V(j, Y(j));
    }

    final int V(long j, int i) {
        long aa = aa(i);
        if (j < aa) {
            return W(i - 1);
        }
        if (j >= aa(i + 1)) {
            return 1;
        }
        return ((int) ((j - aa) / 604800000)) + 1;
    }

    final int W(int i) {
        return (int) ((aa(i + 1) - aa(i)) / 604800000);
    }

    final int X(long j) {
        int Y = Y(j);
        int V = V(j, Y);
        return V == 1 ? Y(j + 604800000) : V > 51 ? Y(j - 1209600000) : Y;
    }

    final int Y(long j) {
        long j2 = j >> 1;
        long j3 = 31083597720000L + j2;
        if (j3 < 0) {
            j3 = 31067819244001L + j2;
        }
        int i = (int) (j3 / 15778476000L);
        long ac = ac(i);
        long j4 = j - ac;
        if (j4 < 0) {
            return i - 1;
        }
        if (j4 >= 31536000000L) {
            return ac + (true == ag(i) ? 31622400000L : 31536000000L) > j ? i : i + 1;
        }
        return i;
    }

    public abstract long Z(int i);

    final long aa(int i) {
        long ac = ac(i);
        return O(ac) > 8 - this.G ? ac + ((8 - r8) * 86400000) : ac - ((r8 - 1) * 86400000);
    }

    public abstract long ab(int i, int i2);

    final long ac(int i) {
        fisd[] fisdVarArr = this.H;
        int i2 = i & 1023;
        fisd fisdVar = fisdVarArr[i2];
        if (fisdVar == null || fisdVar.a != i) {
            fisd fisdVar2 = new fisd(i, Z(i));
            fisdVarArr[i2] = fisdVar2;
            fisdVar = fisdVar2;
        }
        return fisdVar.b;
    }

    final long ad(int i, int i2, int i3) {
        return ac(i) + ab(i, i2) + ((i3 - 1) * 86400000);
    }

    public abstract long ae(long j, int i);

    public boolean af(long j) {
        throw null;
    }

    public abstract boolean ag(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fise fiseVar = (fise) obj;
            if (this.G == fiseVar.G && z().equals(fiseVar.z())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + z().hashCode() + this.G;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        firk z2 = z();
        if (z2 != null) {
            sb.append(z2.c);
        }
        if (this.G != 4) {
            sb.append(",mdfw=");
            sb.append(this.G);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.fisa, defpackage.firb
    public final firk z() {
        firb firbVar = this.a;
        return firbVar != null ? firbVar.z() : firk.a;
    }
}
