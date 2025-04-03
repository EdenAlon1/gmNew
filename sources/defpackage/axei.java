package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axei extends eyfy implements eyht {
    public static final axei a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public long d;

    static {
        axei axeiVar = new axei();
        a = axeiVar;
        eyfy.registerDefaultInstance(axei.class, axeiVar);
    }

    private axei() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new axei();
        }
        if (ordinal == 4) {
            return new axeh();
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
        synchronized (axei.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
