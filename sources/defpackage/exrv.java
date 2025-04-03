package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exrv extends eyfy implements eyht {
    public static final exrv a;
    private static volatile eyhz h;
    public int b;
    public long e;
    public long g;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        exrv exrvVar = new exrv();
        a = exrvVar;
        eyfy.registerDefaultInstance(exrv.class, exrvVar);
    }

    private exrv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004\u0006ဈ\u0001", new Object[]{"b", "c", "f", "e", "g", "d"});
        }
        if (ordinal == 3) {
            return new exrv();
        }
        if (ordinal == 4) {
            return new exru();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exrv.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
