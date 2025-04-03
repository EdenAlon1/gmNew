package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgqp extends eyfy implements eyht {
    public static final dgqp a;
    private static volatile eyhz j;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;
    public dgqn i;
    private int k;

    static {
        dgqp dgqpVar = new dgqp();
        a = dgqpVar;
        eyfy.registerDefaultInstance(dgqp.class, dgqpVar);
    }

    private dgqp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006\u0007\u0007\u0007\bဉ\u0004", new Object[]{"k", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new dgqp();
        }
        if (ordinal == 4) {
            return new dgqo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dgqp.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
