package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezyz extends eyfy implements eyht {
    public static final ezyz a;
    private static volatile eyhz d;
    public boolean b;
    public String c = "";

    static {
        ezyz ezyzVar = new ezyz();
        a = ezyzVar;
        eyfy.registerDefaultInstance(ezyz.class, ezyzVar);
    }

    private ezyz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ezyz();
        }
        if (ordinal == 4) {
            return new ezyy();
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
        synchronized (ezyz.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
