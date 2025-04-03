package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezjj extends eyfy implements eyht {
    public static final ezjj a;
    private static volatile eyhz d;
    public fcfq b;
    public fbip c;
    private int e;

    static {
        ezjj ezjjVar = new ezjj();
        a = ezjjVar;
        eyfy.registerDefaultInstance(ezjj.class, ezjjVar);
    }

    private ezjj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new ezjj();
        }
        if (ordinal == 4) {
            return new ezji();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezjj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
