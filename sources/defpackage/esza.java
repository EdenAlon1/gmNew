package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esza extends eyfy implements eyht {
    public static final esza a;
    private static volatile eyhz h;
    public int b;
    public etau c;
    public eyja d;
    public eygr e = eyfy.emptyProtobufList();
    public String f = "";
    public boolean g;
    private int i;

    static {
        esza eszaVar = new esza();
        a = eszaVar;
        eyfy.registerDefaultInstance(esza.class, eszaVar);
    }

    private esza() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0001\u0000\u0001ဉ\u0001\u0004Ț\u0005\u0004\u0006Ȉ\u0007\u0007ϧဉ\u0000", new Object[]{"b", "d", "e", "i", "f", "g", "c"});
        }
        if (ordinal == 3) {
            return new esza();
        }
        if (ordinal == 4) {
            return new esyz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esza.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
