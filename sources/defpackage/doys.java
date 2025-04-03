package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doys extends eyfy implements eyht {
    public static final doys a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public int d;

    static {
        doys doysVar = new doys();
        a = doysVar;
        eyfy.registerDefaultInstance(doys.class, doysVar);
    }

    private doys() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new doys();
        }
        if (ordinal == 4) {
            return new doyr();
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
        synchronized (doys.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
