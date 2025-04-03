package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezzy extends eyfy implements eyht {
    public static final ezzy a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        ezzy ezzyVar = new ezzy();
        a = ezzyVar;
        eyfy.registerDefaultInstance(ezzy.class, ezzyVar);
    }

    private ezzy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new ezzy();
        }
        if (ordinal == 4) {
            return new ezzx();
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
        synchronized (ezzy.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
