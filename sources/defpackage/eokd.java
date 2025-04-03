package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eokd extends eyfy implements eyht {
    public static final eokd a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        eokd eokdVar = new eokd();
        a = eokdVar;
        eyfy.registerDefaultInstance(eokd.class, eokdVar);
    }

    private eokd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", eoka.a, "d", eokb.a});
        }
        if (ordinal == 3) {
            return new eokd();
        }
        if (ordinal == 4) {
            return new eokc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eokd.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
