package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryu extends eyfy implements eyht {
    public static final eryu a;
    private static volatile eyhz h;
    public int b;
    public int d;
    public erys f;
    public esof g;
    public String c = "";
    public String e = "";

    static {
        eryu eryuVar = new eryu();
        a = eryuVar;
        eyfy.registerDefaultInstance(eryu.class, eryuVar);
    }

    private eryu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eryu();
        }
        if (ordinal == 4) {
            return new eryt();
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
        synchronized (eryu.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
