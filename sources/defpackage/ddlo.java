package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddlo extends eyfy<ddlo, ddln> implements eyht {
    public static final ddlo a;
    private static volatile eyhz i;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public boolean f;
    public long g;
    public int h;

    static {
        ddlo ddloVar = new ddlo();
        a = ddloVar;
        eyfy.registerDefaultInstance(ddlo.class, ddloVar);
    }

    private ddlo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", ephl.a});
        }
        if (ordinal == 3) {
            return new ddlo();
        }
        if (ordinal == 4) {
            return new ddln();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ddlo.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
