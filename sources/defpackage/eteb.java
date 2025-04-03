package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eteb extends eyfy implements eyht {
    public static final eteb a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        eteb etebVar = new eteb();
        a = etebVar;
        eyfy.registerDefaultInstance(eteb.class, etebVar);
    }

    private eteb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new eteb();
        }
        if (ordinal == 4) {
            return new etea();
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
        synchronized (eteb.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
