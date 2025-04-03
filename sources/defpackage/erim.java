package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erim extends eyfy implements eyht {
    public static final erim a;
    private static volatile eyhz i;
    public int b;
    public long d;
    public erjs g;
    public int h;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        erim erimVar = new erim();
        a = erimVar;
        eyfy.registerDefaultInstance(erim.class, erimVar);
    }

    private erim() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဉ\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", erkc.a});
        }
        if (ordinal == 3) {
            return new erim();
        }
        if (ordinal == 4) {
            return new eril();
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
        synchronized (erim.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
