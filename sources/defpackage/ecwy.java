package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecwy extends eyfy implements eyht {
    public static final ecwy a;
    private static volatile eyhz j;
    public int b;
    public String c = "";
    public eygr d = emptyProtobufList();
    public eygr e = emptyProtobufList();
    public eygr f = emptyProtobufList();
    public eygr g = emptyProtobufList();
    public eygr h = emptyProtobufList();
    public eygi i = emptyIntList();

    static {
        ecwy ecwyVar = new ecwy();
        a = ecwyVar;
        eyfy.registerDefaultInstance(ecwy.class, ecwyVar);
    }

    private ecwy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0000\u0001ဈ\u0000\u0002\u001c\u0003\u001c\u0004\u001c\u0005\u001c\u0006\u001c\u0007\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new ecwy();
        }
        if (ordinal == 4) {
            return new ecwx();
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
        synchronized (ecwy.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
