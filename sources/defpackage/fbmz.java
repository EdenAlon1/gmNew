package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmz extends eyfy implements eyht {
    public static final fbmz a;
    private static volatile eyhz j;
    public int b = 0;
    public Object c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    static {
        fbmz fbmzVar = new fbmz();
        a = fbmzVar;
        eyfy.registerDefaultInstance(fbmz.class, fbmzVar);
    }

    private fbmz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0001\u0000\u0001m\u000e\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\b\u0007e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000m<\u0000", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", fbnn.class, fbmf.class, fbmv.class, fbmd.class, fbmn.class, fbmb.class, fblz.class, fbmj.class});
        }
        if (ordinal == 3) {
            return new fbmz();
        }
        if (ordinal == 4) {
            return new fbmy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbmz.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
