package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exwl extends eyfy implements eyht {
    public static final exwl a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public exyb d;
    public exxk e;
    public exyl f;
    public exxy g;

    static {
        exwl exwlVar = new exwl();
        a = exwlVar;
        eyfy.registerDefaultInstance(exwl.class, exwlVar);
    }

    private exwl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0001\u0007ဉ\u0004", new Object[]{"b", "c", "e", "f", "d", "g"});
        }
        if (ordinal == 3) {
            return new exwl();
        }
        if (ordinal == 4) {
            return new exwk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exwl.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
