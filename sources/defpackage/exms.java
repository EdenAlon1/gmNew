package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exms extends eyfy implements eyht {
    public static final exms a;
    public static final eyfw b;
    private static volatile eyhz d;
    public eyhm c = eyhm.a;

    static {
        exms exmsVar = new exms();
        a = exmsVar;
        eyfy.registerDefaultInstance(exms.class, exmsVar);
        b = eyfy.newSingularGeneratedExtension(eula.a, exmsVar, exmsVar, null, 458105876, eyjr.MESSAGE, exms.class);
    }

    private exms() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", exmr.a});
        }
        if (ordinal == 3) {
            return new exms();
        }
        if (ordinal == 4) {
            return new exmq();
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
        synchronized (exms.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
