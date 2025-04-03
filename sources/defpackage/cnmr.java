package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnmr extends eyfy implements eyht {
    public static final cnmr a;
    private static volatile eyhz e;
    public int b;
    public eyhm c = eyhm.a;
    public long d;

    static {
        cnmr cnmrVar = new cnmr();
        a = cnmrVar;
        eyfy.registerDefaultInstance(cnmr.class, cnmrVar);
    }

    private cnmr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဂ\u0000", new Object[]{"b", "c", cnmq.a, "d"});
        }
        if (ordinal == 3) {
            return new cnmr();
        }
        if (ordinal == 4) {
            return new cnmp();
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
        synchronized (cnmr.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
