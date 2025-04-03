package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyuz extends eyfy implements eyht {
    public static final eyuz a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public int d;

    static {
        eyuz eyuzVar = new eyuz();
        a = eyuzVar;
        eyfy.registerDefaultInstance(eyuz.class, eyuzVar);
    }

    private eyuz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", eyuy.a});
        }
        if (ordinal == 3) {
            return new eyuz();
        }
        if (ordinal == 4) {
            return new eyux();
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
        synchronized (eyuz.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
