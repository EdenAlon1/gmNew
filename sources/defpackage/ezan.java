package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezan extends eyfy implements eyht {
    public static final ezan a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        ezan ezanVar = new ezan();
        a = ezanVar;
        eyfy.registerDefaultInstance(ezan.class, ezanVar);
    }

    private ezan() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", ezao.a, "d", eytn.a, "e", "f"});
        }
        if (ordinal == 3) {
            return new ezan();
        }
        if (ordinal == 4) {
            return new ezam();
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
        synchronized (ezan.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
