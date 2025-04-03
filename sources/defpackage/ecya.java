package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecya extends eyfy implements eyht {
    public static final eygj a = new ecxy();
    public static final ecya b;
    private static volatile eyhz m;
    public int c;
    public boolean e;
    public ecyc j;
    public boolean k;
    public boolean l;
    public eyee d = eyee.b;
    public String f = "";
    public eygr g = eyfy.emptyProtobufList();
    public eygr h = eyfy.emptyProtobufList();
    public eygi i = emptyIntList();

    static {
        ecya ecyaVar = new ecya();
        b = ecyaVar;
        eyfy.registerDefaultInstance(ecya.class, ecyaVar);
    }

    private ecya() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", eulk.a, "j", "k", "l"});
        }
        if (ordinal == 3) {
            return new ecya();
        }
        if (ordinal == 4) {
            return new ecxz();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ecya.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
