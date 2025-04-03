package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fayf extends eyfy implements eyht {
    public static final fayf a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public String d = "";
    public long e;
    public long f;

    static {
        fayf fayfVar = new fayf();
        a = fayfVar;
        eyfy.registerDefaultInstance(fayf.class, fayfVar);
    }

    private fayf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fayf();
        }
        if (ordinal == 4) {
            return new faye();
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
        synchronized (fayf.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
