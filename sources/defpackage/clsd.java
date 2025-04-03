package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clsd extends eyfy implements eyht {
    public static final clsd a;
    private static volatile eyhz j;
    public int b;
    public eydq c;
    public clsn d;
    public clqc e;
    public clqx f;
    public clns g;
    public boolean h;
    public int i;

    static {
        clsd clsdVar = new clsd();
        a = clsdVar;
        eyfy.registerDefaultInstance(clsd.class, clsdVar);
    }

    private clsd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", clpx.a});
        }
        if (ordinal == 3) {
            return new clsd();
        }
        if (ordinal == 4) {
            return new clsc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (clsd.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
