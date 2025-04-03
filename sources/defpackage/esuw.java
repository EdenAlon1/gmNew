package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esuw extends eyfy implements eyht {
    public static final esuw a;
    private static volatile eyhz e;
    public int b;
    public etau c;
    public eygr d = emptyProtobufList();

    static {
        esuw esuwVar = new esuw();
        a = esuwVar;
        eyfy.registerDefaultInstance(esuw.class, esuwVar);
    }

    private esuw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0000\u0001\u001bϧဉ\u0000", new Object[]{"b", "d", eswr.class, "c"});
        }
        if (ordinal == 3) {
            return new esuw();
        }
        if (ordinal == 4) {
            return new esuv();
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
        synchronized (esuw.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
