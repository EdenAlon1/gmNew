package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dein extends eyfy implements eyht {
    public static final dein a;
    private static volatile eyhz c;
    public long b;
    private int d;
    private eyhm e = eyhm.a;
    private eyhm f = eyhm.a;

    static {
        dein deinVar = new dein();
        a = deinVar;
        eyfy.registerDefaultInstance(dein.class, deinVar);
    }

    private dein() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0002\u0000\u0000\u00072\b2\tဂ\u0000", new Object[]{"d", "e", deil.a, "f", deim.a, "b"});
        }
        if (ordinal == 3) {
            return new dein();
        }
        if (ordinal == 4) {
            return new deik();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dein.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
