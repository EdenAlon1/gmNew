package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgle extends eyfy implements eyht {
    public static final fgle a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public String d = "";

    static {
        fgle fgleVar = new fgle();
        a = fgleVar;
        eyfy.registerDefaultInstance(fgle.class, fgleVar);
    }

    private fgle() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fgle();
        }
        if (ordinal == 4) {
            return new fgld();
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
        synchronized (fgle.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
