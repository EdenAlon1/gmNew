package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exdr extends eyfy implements eyht {
    public static final exdr a;
    private static volatile eyhz d;
    public int b;
    public exdt c;
    private exdp e;

    static {
        exdr exdrVar = new exdr();
        a = exdrVar;
        eyfy.registerDefaultInstance(exdr.class, exdrVar);
    }

    private exdr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "e", "c"});
        }
        if (ordinal == 3) {
            return new exdr();
        }
        if (ordinal == 4) {
            return new exdq();
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
        synchronized (exdr.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
