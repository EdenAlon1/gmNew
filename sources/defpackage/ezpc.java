package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezpc extends eyfy implements eyht {
    public static final ezpc a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        ezpc ezpcVar = new ezpc();
        a = ezpcVar;
        eyfy.registerDefaultInstance(ezpc.class, ezpcVar);
    }

    private ezpc() {
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ezpb.a});
        }
        if (ordinal == 3) {
            return new ezpc();
        }
        if (ordinal == 4) {
            return new ezpa();
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
        synchronized (ezpc.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
