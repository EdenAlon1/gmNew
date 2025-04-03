package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class droa extends eyfy implements eyht {
    public static final droa a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        droa droaVar = new droa();
        a = droaVar;
        eyfy.registerDefaultInstance(droa.class, droaVar);
    }

    private droa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000de\u0002\u0000\u0000\u0000d<\u0000e<\u0000", new Object[]{"c", "b", drnz.class, drnw.class});
        }
        if (ordinal == 3) {
            return new droa();
        }
        if (ordinal == 4) {
            return new drnx();
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
        synchronized (droa.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
