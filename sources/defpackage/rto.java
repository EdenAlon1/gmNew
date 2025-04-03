package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rto extends eyfy implements eyht {
    public static final rto a;
    private static volatile eyhz e;
    public int b;
    public rtq c;
    public rts d;

    static {
        rto rtoVar = new rto();
        a = rtoVar;
        eyfy.registerDefaultInstance(rto.class, rtoVar);
    }

    private rto() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new rto();
        }
        if (ordinal == 4) {
            return new rtn();
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
        synchronized (rto.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
