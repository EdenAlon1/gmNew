package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgnu extends eyfy implements eyht {
    public static final fgnu a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public long f;

    static {
        fgnu fgnuVar = new fgnu();
        a = fgnuVar;
        eyfy.registerDefaultInstance(fgnu.class, fgnuVar);
    }

    private fgnu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fgnu();
        }
        if (ordinal == 4) {
            return new fgnt();
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
        synchronized (fgnu.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
