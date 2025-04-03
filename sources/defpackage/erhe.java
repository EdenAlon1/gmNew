package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhe extends eyfy implements eyht {
    public static final erhe a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public eygr d = eyfy.emptyProtobufList();
    public eygr e = eyfy.emptyProtobufList();
    public eygr f = eyfy.emptyProtobufList();
    public eygr g = eyfy.emptyProtobufList();
    public ergv h;
    public boolean i;

    static {
        erhe erheVar = new erhe();
        a = erheVar;
        eyfy.registerDefaultInstance(erhe.class, erheVar);
    }

    private erhe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0004\u0000\u0001᠌\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0007ဉ\u0002\tဇ\u0004", new Object[]{"b", "c", erhd.a, "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new erhe();
        }
        if (ordinal == 4) {
            return new erhc();
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
        synchronized (erhe.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
