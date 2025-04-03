package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esve extends eyfy implements eyht {
    public static final esve a;
    private static volatile eyhz e;
    public int b;
    public etau c;
    public eygr d = emptyProtobufList();

    static {
        esve esveVar = new esve();
        a = esveVar;
        eyfy.registerDefaultInstance(esve.class, esveVar);
    }

    private esve() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0000\u0001\u001bϧဉ\u0000", new Object[]{"b", "d", etah.class, "c"});
        }
        if (ordinal == 3) {
            return new esve();
        }
        if (ordinal == 4) {
            return new esvd();
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
        synchronized (esve.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
