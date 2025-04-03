package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fagx extends eyfy implements eyht {
    public static final fagx a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;
    public fahc g;

    static {
        fagx fagxVar = new fagx();
        a = fagxVar;
        eyfy.registerDefaultInstance(fagx.class, fagxVar);
    }

    private fagx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007\u0006ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fagx();
        }
        if (ordinal == 4) {
            return new fagw();
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
        synchronized (fagx.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
