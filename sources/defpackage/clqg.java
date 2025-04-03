package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clqg extends eyfy implements eyht {
    public static final clqg a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public clns e;
    public eyja f;
    public int g;

    static {
        clqg clqgVar = new clqg();
        a = clqgVar;
        eyfy.registerDefaultInstance(clqg.class, clqgVar);
    }

    private clqg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0001\u0005င\u0002", new Object[]{"d", "c", "b", "e", clqo.class, clqk.class, "f", "g"});
        }
        if (ordinal == 3) {
            return new clqg();
        }
        if (ordinal == 4) {
            return new clqf();
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
        synchronized (clqg.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
