package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgz extends eyfy implements eyht {
    public static final esgz a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public int c;

    static {
        esgz esgzVar = new esgz();
        a = esgzVar;
        eyfy.registerDefaultInstance(esgz.class, esgzVar);
    }

    private esgz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004\f", new Object[]{"b", fbxa.class, "c"});
        }
        if (ordinal == 3) {
            return new esgz();
        }
        if (ordinal == 4) {
            return new esgy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esgz.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
