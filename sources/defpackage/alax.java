package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alax extends eyfy implements eyht {
    public static final alax a;
    private static volatile eyhz d;
    public int b;
    public double c;
    private int e;

    static {
        alax alaxVar = new alax();
        a = alaxVar;
        eyfy.registerDefaultInstance(alax.class, alaxVar);
    }

    private alax() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002က\u0001", new Object[]{"e", "b", alav.a, "c"});
        }
        if (ordinal == 3) {
            return new alax();
        }
        if (ordinal == 4) {
            return new alau();
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
        synchronized (alax.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
