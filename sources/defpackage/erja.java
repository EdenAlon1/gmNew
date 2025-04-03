package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erja extends eyfy implements eyht {
    public static final erja a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        erja erjaVar = new erja();
        a = erjaVar;
        eyfy.registerDefaultInstance(erja.class, erjaVar);
    }

    private erja() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0001", new Object[]{"b", "c", erkc.a, "e", "f", "d"});
        }
        if (ordinal == 3) {
            return new erja();
        }
        if (ordinal == 4) {
            return new eriz();
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
        synchronized (erja.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
