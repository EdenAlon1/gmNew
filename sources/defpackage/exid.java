package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exid extends eyfy implements eyht {
    public static final exid a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public faun f;
    public boolean g;

    static {
        exid exidVar = new exid();
        a = exidVar;
        eyfy.registerDefaultInstance(exid.class, exidVar);
    }

    private exid() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005\u0007\u0006ဉ\u0003", new Object[]{"b", "c", "d", "e", "g", "f"});
        }
        if (ordinal == 3) {
            return new exid();
        }
        if (ordinal == 4) {
            return new exic();
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
        synchronized (exid.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
