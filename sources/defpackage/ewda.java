package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewda extends eyfy implements eyht {
    public static final ewda a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        ewda ewdaVar = new ewda();
        a = ewdaVar;
        eyfy.registerDefaultInstance(ewda.class, ewdaVar);
    }

    private ewda() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", ewcu.class, ewcw.class, ewcl.class, ewcs.class, ewcq.class, ewcy.class, ewco.class});
        }
        if (ordinal == 3) {
            return new ewda();
        }
        if (ordinal == 4) {
            return new ewcz();
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
        synchronized (ewda.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
