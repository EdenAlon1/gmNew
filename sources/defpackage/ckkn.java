package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckkn extends eyfy implements eyht {
    public static final ckkn a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        ckkn ckknVar = new ckkn();
        a = ckknVar;
        eyfy.registerDefaultInstance(ckkn.class, ckknVar);
    }

    private ckkn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0000\n\u000e\u0005\u0000\u0000\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", ckkt.class, ckkp.class, ckkr.class, ckkv.class, ckkx.class});
        }
        if (ordinal == 3) {
            return new ckkn();
        }
        if (ordinal == 4) {
            return new ckkm();
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
        synchronized (ckkn.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
