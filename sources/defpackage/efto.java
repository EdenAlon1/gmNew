package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efto extends eyfy implements eyht {
    public static final efto a;
    private static volatile eyhz e;
    public String b = "";
    public String c = "";
    public int d;

    static {
        efto eftoVar = new efto();
        a = eftoVar;
        eyfy.registerDefaultInstance(efto.class, eftoVar);
    }

    private efto() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new efto();
        }
        if (ordinal == 4) {
            return new eftn();
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
        synchronized (efto.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
