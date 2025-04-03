package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dixv extends eyfy implements eyht {
    public static final dixv a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public String d = "";
    public boolean e;
    public int f;

    static {
        dixv dixvVar = new dixv();
        a = dixvVar;
        eyfy.registerDefaultInstance(dixv.class, dixvVar);
    }

    private dixv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", eyvk.a});
        }
        if (ordinal == 3) {
            return new dixv();
        }
        if (ordinal == 4) {
            return new dixu();
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
        synchronized (dixv.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
