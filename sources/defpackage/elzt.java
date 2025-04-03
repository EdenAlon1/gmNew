package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzt extends eyfy implements eyht {
    public static final elzt a;
    private static volatile eyhz f;
    public String b = "";
    public eygr c = emptyProtobufList();
    public int d;
    public int e;
    private int g;

    static {
        elzt elztVar = new elzt();
        a = elztVar;
        eyfy.registerDefaultInstance(elzt.class, elztVar);
    }

    private elzt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002Ȉ\u0003\u001b\u0005ဌ\u0000\u0006ဌ\u0001", new Object[]{"g", "b", "c", elzp.class, "d", "e"});
        }
        if (ordinal == 3) {
            return new elzt();
        }
        if (ordinal == 4) {
            return new elzn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (elzt.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
