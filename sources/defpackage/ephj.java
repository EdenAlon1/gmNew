package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephj extends eyfy implements eyht {
    public static final ephj a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public eoyo e;

    static {
        ephj ephjVar = new ephj();
        a = ephjVar;
        eyfy.registerDefaultInstance(ephj.class, ephjVar);
    }

    private ephj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u00017\u0000\u0002\u083f\u0000\u0003ဉ\u0000", new Object[]{"d", "c", "b", ephi.a, "e"});
        }
        if (ordinal == 3) {
            return new ephj();
        }
        if (ordinal == 4) {
            return new ephh();
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
        synchronized (ephj.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
