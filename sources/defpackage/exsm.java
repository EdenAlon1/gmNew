package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exsm extends eyfy implements eyht {
    public static final exsm a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public exsl f;
    public int c = 0;
    public String e = "";

    static {
        exsm exsmVar = new exsm();
        a = exsmVar;
        eyfy.registerDefaultInstance(exsm.class, exsmVar);
    }

    private exsm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u0003ဉ\u0001\u0004;\u0000", new Object[]{"d", "c", "b", "e", "f"});
        }
        if (ordinal == 3) {
            return new exsm();
        }
        if (ordinal == 4) {
            return new exsg();
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
        synchronized (exsm.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
