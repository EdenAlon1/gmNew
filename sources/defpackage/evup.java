package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evup extends eyfy implements eyht {
    public static final evup a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public long d;

    static {
        evup evupVar = new evup();
        a = evupVar;
        eyfy.registerDefaultInstance(evup.class, evupVar);
    }

    private evup() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new evup();
        }
        if (ordinal == 4) {
            return new evuo();
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
        synchronized (evup.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
