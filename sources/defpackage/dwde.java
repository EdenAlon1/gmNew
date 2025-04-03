package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwde extends eyfy implements eyht {
    public static final dwde a;
    private static volatile eyhz e;
    public int b;
    public int c = 250;
    public dwcz d;
    private int f;

    static {
        dwde dwdeVar = new dwde();
        a = dwdeVar;
        eyfy.registerDefaultInstance(dwde.class, dwdeVar);
    }

    private dwde() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"f", "b", dwdc.a, "c", "d"});
        }
        if (ordinal == 3) {
            return new dwde();
        }
        if (ordinal == 4) {
            return new dwdb();
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
        synchronized (dwde.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
