package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eskc extends eyfy implements eyht {
    public static final eskc a;
    private static volatile eyhz g;
    public int c;
    public int d;
    public String b = "";
    public String e = "";
    public String f = "";

    static {
        eskc eskcVar = new eskc();
        a = eskcVar;
        eyfy.registerDefaultInstance(eskc.class, eskcVar);
    }

    private eskc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new eskc();
        }
        if (ordinal == 4) {
            return new eskb();
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
        synchronized (eskc.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
