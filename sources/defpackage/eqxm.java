package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxm extends eyfy implements eyht {
    public static final eqxm a;
    private static volatile eyhz m;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public int g;
    public int h;
    public int i;
    public int l;
    public String f = "";
    public String j = "";
    public String k = "";

    static {
        eqxm eqxmVar = new eqxm();
        a = eqxmVar;
        eyfy.registerDefaultInstance(eqxm.class, eqxmVar);
    }

    private eqxm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bဈ\u0007\tဈ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", eqwq.a, "h", eqxr.a, "i", "j", "k", "l"});
        }
        if (ordinal == 3) {
            return new eqxm();
        }
        if (ordinal == 4) {
            return new eqxl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqxm.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
