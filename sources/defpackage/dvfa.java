package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfa extends eyfy implements eyht {
    public static final dvfa a;
    private static volatile eyhz e;
    public int b;
    public evwj c;
    public int d;

    static {
        dvfa dvfaVar = new dvfa();
        a = dvfaVar;
        eyfy.registerDefaultInstance(dvfa.class, dvfaVar);
    }

    private dvfa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new dvfa();
        }
        if (ordinal == 4) {
            return new dvez();
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
        synchronized (dvfa.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
