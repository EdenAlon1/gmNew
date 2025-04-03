package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esce extends eyfy implements eyht {
    public static final esce a;
    private static volatile eyhz f;
    public int b;
    public eygr c = emptyProtobufList();
    public ervg d;
    public esba e;

    static {
        esce esceVar = new esce();
        a = esceVar;
        eyfy.registerDefaultInstance(esce.class, esceVar);
    }

    private esce() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", escy.class, "d", "e"});
        }
        if (ordinal == 3) {
            return new esce();
        }
        if (ordinal == 4) {
            return new escd();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esce.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
