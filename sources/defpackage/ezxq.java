package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezxq extends eyfy implements eyht {
    public static final ezxq a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public eygi d = emptyIntList();
    public int e;

    static {
        ezxq ezxqVar = new ezxq();
        a = ezxqVar;
        eyfy.registerDefaultInstance(ezxq.class, ezxqVar);
    }

    private ezxq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003,\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ezxq();
        }
        if (ordinal == 4) {
            return new ezxp();
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
        synchronized (ezxq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
