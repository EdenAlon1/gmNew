package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eruq extends eyfy implements eyht {
    public static final eruq a;
    private static volatile eyhz h;
    public int b;
    public boolean d;
    public int e;
    public erzz g;
    public String c = "";
    public String f = "";

    static {
        eruq eruqVar = new eruq();
        a = eruqVar;
        eyfy.registerDefaultInstance(eruq.class, eruqVar);
    }

    private eruq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\f\u0004Ȉ\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eruq();
        }
        if (ordinal == 4) {
            return new erup();
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
        synchronized (eruq.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
