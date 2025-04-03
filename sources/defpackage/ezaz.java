package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezaz extends eyfy implements eyht {
    public static final ezaz a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        ezaz ezazVar = new ezaz();
        a = ezazVar;
        eyfy.registerDefaultInstance(ezaz.class, ezazVar);
    }

    private ezaz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", ezax.a, "d", "e", ezaw.a});
        }
        if (ordinal == 3) {
            return new ezaz();
        }
        if (ordinal == 4) {
            return new ezav();
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
        synchronized (ezaz.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
