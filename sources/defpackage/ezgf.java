package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezgf extends eyfy implements eyht {
    public static final ezgf a;
    private static volatile eyhz d;
    public String b = "";
    public eygr c = emptyProtobufList();

    static {
        ezgf ezgfVar = new ezgf();
        a = ezgfVar;
        eyfy.registerDefaultInstance(ezgf.class, ezgfVar);
    }

    private ezgf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", ezgd.class});
        }
        if (ordinal == 3) {
            return new ezgf();
        }
        if (ordinal == 4) {
            return new ezge();
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
        synchronized (ezgf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
