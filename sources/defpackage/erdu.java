package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdu extends eyfy implements eyht {
    public static final erdu a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public long d;

    static {
        erdu erduVar = new erdu();
        a = erduVar;
        eyfy.registerDefaultInstance(erdu.class, erduVar);
    }

    private erdu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"b", "c", erds.a, "d"});
        }
        if (ordinal == 3) {
            return new erdu();
        }
        if (ordinal == 4) {
            return new erdr();
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
        synchronized (erdu.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
