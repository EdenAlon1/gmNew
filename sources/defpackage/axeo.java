package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axeo extends eyfy implements eyht {
    public static final axeo a;
    private static volatile eyhz g;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    static {
        axeo axeoVar = new axeo();
        a = axeoVar;
        eyfy.registerDefaultInstance(axeo.class, axeoVar);
    }

    private axeo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new axeo();
        }
        if (ordinal == 4) {
            return new axen();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (axeo.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
