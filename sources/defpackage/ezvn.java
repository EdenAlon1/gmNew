package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezvn extends eyfy implements eyht {
    public static final ezvn a;
    public static final eyfw b;
    private static volatile eyhz f;
    public ezwd c;
    public ezwj d;
    public ezvt e;
    private int g;

    static {
        ezvn ezvnVar = new ezvn();
        a = ezvnVar;
        eyfy.registerDefaultInstance(ezvn.class, ezvnVar);
        b = eyfy.newSingularGeneratedExtension(ezie.a, ezvnVar, ezvnVar, null, 284070414, eyjr.MESSAGE, ezvn.class);
    }

    private ezvn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0006ဉ\u0005", new Object[]{"g", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ezvn();
        }
        if (ordinal == 4) {
            return new ezvm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezvn.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
