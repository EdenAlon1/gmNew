package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epeu extends eyfy implements eyht {
    public static final epeu a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        epeu epeuVar = new epeu();
        a = epeuVar;
        eyfy.registerDefaultInstance(epeu.class, epeuVar);
    }

    private epeu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new epeu();
        }
        if (ordinal == 4) {
            return new epet();
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
        synchronized (epeu.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
