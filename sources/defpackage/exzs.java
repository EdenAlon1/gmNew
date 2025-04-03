package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exzs extends eyfy implements eyht {
    public static final exzs a;
    private static volatile eyhz h;
    public int b;
    public fauw c;
    public boolean d;
    public exzp e;
    public exzp f;
    public int g;

    static {
        exzs exzsVar = new exzs();
        a = exzsVar;
        eyfy.registerDefaultInstance(exzs.class, exzsVar);
    }

    private exzs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004᠌\u0004\u0005ဇ\u0001", new Object[]{"b", "c", "e", "f", "g", exzm.a, "d"});
        }
        if (ordinal == 3) {
            return new exzs();
        }
        if (ordinal == 4) {
            return new exzr();
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
        synchronized (exzs.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
