package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezjf extends eyfy implements eyht {
    public static final ezjf a;
    public static final eyfw b;
    private static volatile eyhz d;
    public eygr c = eyfy.emptyProtobufList();

    static {
        ezjf ezjfVar = new ezjf();
        a = ezjfVar;
        eyfy.registerDefaultInstance(ezjf.class, ezjfVar);
        b = eyfy.newSingularGeneratedExtension(ezit.a, ezjfVar, ezjfVar, null, 274192245, eyjr.MESSAGE, ezjf.class);
    }

    private ezjf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"c"});
        }
        if (ordinal == 3) {
            return new ezjf();
        }
        if (ordinal == 4) {
            return new ezje();
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
        synchronized (ezjf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
