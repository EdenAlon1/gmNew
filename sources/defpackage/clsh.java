package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clsh extends eyfy implements eyht {
    public static final clsh a;
    private static volatile eyhz i;
    public int b;
    public eydq c;
    public clsn d;
    public clns e;
    public clpc f;
    public clpi g;
    public int h;

    static {
        clsh clshVar = new clsh();
        a = clshVar;
        eyfy.registerDefaultInstance(clsh.class, clshVar);
    }

    private clsh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", clpx.a});
        }
        if (ordinal == 3) {
            return new clsh();
        }
        if (ordinal == 4) {
            return new clsg();
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
        synchronized (clsh.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
