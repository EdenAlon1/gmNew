package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exhj extends eyfy implements eyht {
    public static final exhj a;
    private static volatile eyhz f;
    public String b = "";
    public int c;
    public int d;
    public boolean e;

    static {
        exhj exhjVar = new exhj();
        a = exhjVar;
        eyfy.registerDefaultInstance(exhj.class, exhjVar);
    }

    private exhj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new exhj();
        }
        if (ordinal == 4) {
            return new exhi();
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
        synchronized (exhj.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
