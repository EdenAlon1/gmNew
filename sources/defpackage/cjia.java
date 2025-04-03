package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjia extends eyfy implements eyht {
    public static final cjia a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        cjia cjiaVar = new cjia();
        a = cjiaVar;
        eyfy.registerDefaultInstance(cjia.class, cjiaVar);
    }

    private cjia() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0000eh\u0004\u0000\u0000\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"c", "b", cjhy.class, cjhw.class, cjhs.class, cjhu.class});
        }
        if (ordinal == 3) {
            return new cjia();
        }
        if (ordinal == 4) {
            return new cjhq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cjia.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
