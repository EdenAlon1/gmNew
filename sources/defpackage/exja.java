package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exja extends eyfy implements eyht {
    public static final exja a;
    private static volatile eyhz d;
    public eyev b;
    public int c;
    private int e;

    static {
        exja exjaVar = new exja();
        a = exjaVar;
        eyfy.registerDefaultInstance(exja.class, exjaVar);
    }

    private exja() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new exja();
        }
        if (ordinal == 4) {
            return new exiz();
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
        synchronized (exja.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
