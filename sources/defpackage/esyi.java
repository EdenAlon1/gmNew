package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyi extends eyfy implements eyht {
    public static final esyi a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        esyi esyiVar = new esyi();
        a = esyiVar;
        eyfy.registerDefaultInstance(esyi.class, esyiVar);
    }

    private esyi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eswb.class});
        }
        if (ordinal == 3) {
            return new esyi();
        }
        if (ordinal == 4) {
            return new esyh();
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
        synchronized (esyi.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
