package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class fabf extends eyfy implements eyht {
    public static final fabf a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        fabf fabfVar = new fabf();
        a = fabfVar;
        eyfy.registerDefaultInstance(fabf.class, fabfVar);
    }

    private fabf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"c", "b", "d", fabd.class});
        }
        if (ordinal == 3) {
            return new fabf();
        }
        if (ordinal == 4) {
            return new fabe();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fabf.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
