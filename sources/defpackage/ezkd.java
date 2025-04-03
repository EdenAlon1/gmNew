package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezkd extends eyfy implements eyht {
    public static final ezkd a;
    private static volatile eyhz e;
    public int b;
    public eygi c = emptyIntList();
    public int d;

    static {
        ezkd ezkdVar = new ezkd();
        a = ezkdVar;
        eyfy.registerDefaultInstance(ezkd.class, ezkdVar);
    }

    private ezkd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002᠌\u0000", new Object[]{"b", "c", "d", ezka.a});
        }
        if (ordinal == 3) {
            return new ezkd();
        }
        if (ordinal == 4) {
            return new ezkc();
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
        synchronized (ezkd.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
