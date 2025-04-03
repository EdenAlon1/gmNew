package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyk extends eyfy implements eyht {
    public static final esyk a;
    private static volatile eyhz g;
    public int b;
    public etau c;
    public String d = "";
    public int e;
    public String f;

    static {
        esyk esykVar = new esyk();
        a = esykVar;
        eyfy.registerDefaultInstance(esyk.class, esykVar);
    }

    private esyk() {
        emptyIntList();
        eyfy.emptyProtobufList();
        this.f = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0000\u0001Ȉ\u0004\u0004\bȈϧဉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (ordinal == 3) {
            return new esyk();
        }
        if (ordinal == 4) {
            return new esyj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esyk.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
