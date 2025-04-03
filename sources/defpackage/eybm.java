package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eybm extends eyfy implements eyht {
    public static final eybm a;
    private static volatile eyhz e;
    public int b;
    public eyas c;
    public int d;

    static {
        eybm eybmVar = new eybm();
        a = eybmVar;
        eyfy.registerDefaultInstance(eybm.class, eybmVar);
    }

    private eybm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", eybk.a});
        }
        if (ordinal == 3) {
            return new eybm();
        }
        if (ordinal == 4) {
            return new eybj();
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
        synchronized (eybm.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
