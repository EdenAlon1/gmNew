package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezil extends eyfy implements eyht {
    public static final ezil a;
    public static final eyfw b;
    private static volatile eyhz e;
    public int c;
    public int d;

    static {
        ezil ezilVar = new ezil();
        a = ezilVar;
        eyfy.registerDefaultInstance(ezil.class, ezilVar);
        b = eyfy.newSingularGeneratedExtension(ezit.a, ezilVar, ezilVar, null, 23, eyjr.MESSAGE, ezil.class);
    }

    private ezil() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"c", "d"});
        }
        if (ordinal == 3) {
            return new ezil();
        }
        if (ordinal == 4) {
            return new ezik();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezil.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
