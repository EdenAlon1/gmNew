package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoym extends eyfy implements eyht {
    public static final eoym a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public eyev h;
    public eygr g = eyfy.emptyProtobufList();
    public String i = "";

    static {
        eoym eoymVar = new eoym();
        a = eoymVar;
        eyfy.registerDefaultInstance(eoym.class, eoymVar);
    }

    private eoym() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001a\u0006ဉ\u0004\u0007ဈ\u0005", new Object[]{"b", "c", eoyl.a, "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new eoym();
        }
        if (ordinal == 4) {
            return new eoyk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eoym.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
