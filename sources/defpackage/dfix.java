package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfix extends eyfy implements eyht {
    public static final dfix a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public int f;
    public int c = 0;
    public String e = "";

    static {
        dfix dfixVar = new dfix();
        a = dfixVar;
        eyfy.registerDefaultInstance(dfix.class, dfixVar);
    }

    private dfix() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003<\u0000\u0004<\u0000", new Object[]{"d", "c", "b", "e", "f", dfjy.class, eeov.class});
        }
        if (ordinal == 3) {
            return new dfix();
        }
        if (ordinal == 4) {
            return new dfiw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dfix.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
