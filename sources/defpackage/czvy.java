package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czvy extends eyfy implements eyht {
    public static final czvy a;
    private static volatile eyhz g;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f = "";

    static {
        czvy czvyVar = new czvy();
        a = czvyVar;
        eyfy.registerDefaultInstance(czvy.class, czvyVar);
    }

    private czvy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new czvy();
        }
        if (ordinal == 4) {
            return new czvx();
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
        synchronized (czvy.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
