package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eynr extends eyfy implements eyht {
    public static final eynr a;
    private static volatile eyhz d;
    public eygl b = emptyLongList();
    public eygr c = eyfy.emptyProtobufList();

    static {
        eynr eynrVar = new eynr();
        a = eynrVar;
        eyfy.registerDefaultInstance(eynr.class, eynrVar);
    }

    private eynr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0014\u0002\u001a", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new eynr();
        }
        if (ordinal == 4) {
            return new eynq();
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
        synchronized (eynr.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
