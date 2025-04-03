package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmbx extends eyfy implements eyht {
    public static final cmbx a;
    public static final eygm u = new eygm(cmes.e, cmes.UNRECOGNIZED);
    public static final eygm v = new eygm(clxs.e, clxs.UNRECOGNIZED);
    private static volatile eyhz w;
    public int b;
    public String c;
    public eyhm d = eyhm.a;
    public String e;
    public cmeq f;
    public eyhm g;
    public eyhm h;
    public eyhm i;
    public eyhm j;
    public eyhm k;
    public eyhm l;
    public eyhm m;
    public eyhm n;
    public boolean o;
    public eygr p;
    public cmeq q;
    public eyhm r;
    public eyhm s;
    public eyhm t;
    private eyhm x;
    private eyhm y;
    private eyhm z;

    static {
        cmbx cmbxVar = new cmbx();
        a = cmbxVar;
        eyfy.registerDefaultInstance(cmbx.class, cmbxVar);
    }

    private cmbx() {
        eyhm eyhmVar = eyhm.a;
        this.x = eyhmVar;
        this.y = eyhmVar;
        this.z = eyhmVar;
        this.g = eyhmVar;
        this.h = eyhmVar;
        this.i = eyhmVar;
        this.j = eyhmVar;
        this.k = eyhmVar;
        this.l = eyhmVar;
        this.m = eyhmVar;
        this.n = eyhmVar;
        this.r = eyhmVar;
        this.s = eyhmVar;
        this.t = eyhmVar;
        this.c = "";
        this.e = "";
        this.p = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0015\u0000\u0001\u0001\u0017\u0015\u000f\u0001\u0000\u0001Ȉ\u00032\u00042\u00052\u00062\u0007Ȉ\bဉ\u0000\t2\n2\u000b2\r2\u000e2\u000f2\u00102\u0011\u0007\u00122\u0013\u001b\u0014ဉ\u0001\u00152\u00162\u00172", new Object[]{"b", "c", "d", cmbg.a, "x", cmbu.a, "y", cmbi.a, "z", cmbv.a, "e", "f", "g", cmbn.a, "j", cmbp.a, "k", cmbw.a, "l", cmbo.a, "h", cmbk.a, "m", cmbq.a, "n", cmbr.a, "o", "i", cmbj.a, "p", clxy.class, "q", "r", cmbt.a, "s", cmbs.a, "t", cmbh.a});
        }
        if (ordinal == 3) {
            return new cmbx();
        }
        if (ordinal == 4) {
            return new cmbf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = w;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cmbx.class) {
            eyhzVar = w;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                w = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
