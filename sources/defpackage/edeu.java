package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edeu extends eyfy implements eyht {
    public static final edeu a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        edeu edeuVar = new edeu();
        a = edeuVar;
        eyfy.registerDefaultInstance(edeu.class, edeuVar);
    }

    private edeu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", edeo.class, edeq.class, edej.class});
        }
        if (ordinal == 3) {
            return new edeu();
        }
        if (ordinal == 4) {
            return new edet();
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
        synchronized (edeu.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
