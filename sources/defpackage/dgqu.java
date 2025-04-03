package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgqu extends eyfy implements eyht {
    public static final dgqu a;
    private static volatile eyhz f;
    public int b;
    public ewpe d;
    public String c = "";
    public String e = "";

    static {
        dgqu dgquVar = new dgqu();
        a = dgquVar;
        eyfy.registerDefaultInstance(dgqu.class, dgquVar);
    }

    private dgqu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ለ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new dgqu();
        }
        if (ordinal == 4) {
            return new dgqt();
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
        synchronized (dgqu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
