package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecww extends eyfy implements eyht {
    public static final ecww a;
    private static volatile eyhz j;
    public int b;
    public String c = "";
    public eyee d = eyee.b;
    public String e = "";
    public eygr f = emptyProtobufList();
    public eygr g = eyfy.emptyProtobufList();
    public boolean h;
    public long i;

    static {
        ecww ecwwVar = new ecww();
        a = ecwwVar;
        eyfy.registerDefaultInstance(ecww.class, ecwwVar);
    }

    private ecww() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", ecxb.class, "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new ecww();
        }
        if (ordinal == 4) {
            return new ecwv();
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
        synchronized (ecww.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
