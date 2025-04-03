package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erye extends eyfy implements eyht {
    public static final erye a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public boolean f;

    static {
        erye eryeVar = new erye();
        a = eryeVar;
        eyfy.registerDefaultInstance(erye.class, eryeVar);
    }

    private erye() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0003\u0007\u0005\u0000\u0000\u0000\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004", new Object[]{"d", "e", "f", "b", "c"});
        }
        if (ordinal == 3) {
            return new erye();
        }
        if (ordinal == 4) {
            return new eryd();
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
        synchronized (erye.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
