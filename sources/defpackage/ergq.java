package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergq extends eyfy implements eyht {
    public static final ergq a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public ergv e;

    static {
        ergq ergqVar = new ergq();
        a = ergqVar;
        eyfy.registerDefaultInstance(ergq.class, ergqVar);
    }

    private ergq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"b", "c", ergp.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new ergq();
        }
        if (ordinal == 4) {
            return new ergo();
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
        synchronized (ergq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
