package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evte extends eyfy implements eyht {
    public static final evte a;
    private static volatile eyhz i;
    public int b;
    public Object d;
    public int g;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        evte evteVar = new evte();
        a = evteVar;
        eyfy.registerDefaultInstance(evte.class, evteVar);
    }

    private evte() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003᠌\u0003\u0004ဈ\u0004\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", evjq.a, "h", evta.class, evtd.class});
        }
        if (ordinal == 3) {
            return new evte();
        }
        if (ordinal == 4) {
            return new evtb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evte.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
