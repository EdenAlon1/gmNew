package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjwg extends eyfy implements eyht {
    public static final cjwg a;
    private static volatile eyhz g;
    public int b;
    public long d;
    public boolean e;
    public String c = "";
    public String f = "";

    static {
        cjwg cjwgVar = new cjwg();
        a = cjwgVar;
        eyfy.registerDefaultInstance(cjwg.class, cjwgVar);
    }

    private cjwg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဂ\u0000\u0003ဇ\u0001\u0006ለ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cjwg();
        }
        if (ordinal == 4) {
            return new cjwf();
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
        synchronized (cjwg.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
