package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezxh extends eyfy implements eyht {
    public static final ezxh a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public String d = "";
    public boolean e;

    static {
        ezxh ezxhVar = new ezxh();
        a = ezxhVar;
        eyfy.registerDefaultInstance(ezxh.class, ezxhVar);
    }

    private ezxh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ezxh();
        }
        if (ordinal == 4) {
            return new ezxg();
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
        synchronized (ezxh.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
