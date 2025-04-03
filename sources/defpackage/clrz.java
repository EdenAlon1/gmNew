package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clrz extends eyfy implements eyht {
    public static final clrz a;
    private static volatile eyhz g;
    public int b;
    public eydq c;
    public clsn d;
    public clns e;
    public cloj f;

    static {
        clrz clrzVar = new clrz();
        a = clrzVar;
        eyfy.registerDefaultInstance(clrz.class, clrzVar);
    }

    private clrz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new clrz();
        }
        if (ordinal == 4) {
            return new clry();
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
        synchronized (clrz.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
