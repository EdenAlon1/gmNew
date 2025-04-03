package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqq extends eyfy implements eyht {
    public static final ceqq a;
    private static volatile eyhz e;
    public String b = "";
    public long c;
    public long d;

    static {
        ceqq ceqqVar = new ceqq();
        a = ceqqVar;
        eyfy.registerDefaultInstance(ceqq.class, ceqqVar);
    }

    private ceqq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ceqq();
        }
        if (ordinal == 4) {
            return new ceqp();
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
        synchronized (ceqq.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
