package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epfo extends eyfy implements eyht {
    public static final epfo a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        epfo epfoVar = new epfo();
        a = epfoVar;
        eyfy.registerDefaultInstance(epfo.class, epfoVar);
    }

    private epfo() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new epfo();
        }
        if (ordinal == 4) {
            return new epfn();
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
        synchronized (epfo.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
