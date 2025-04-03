package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyog extends eyfy implements eyht {
    public static final eyog a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        eyog eyogVar = new eyog();
        a = eyogVar;
        eyfy.registerDefaultInstance(eyog.class, eyogVar);
    }

    private eyog() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eync.class});
        }
        if (ordinal == 3) {
            return new eyog();
        }
        if (ordinal == 4) {
            return new eyof();
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
        synchronized (eyog.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
