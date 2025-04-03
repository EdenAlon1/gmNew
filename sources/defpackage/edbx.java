package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edbx extends eyfy implements eyht {
    public static final edbx a;
    private static volatile eyhz h;
    public int b;
    public long f;
    public String c = "";
    public eyee d = eyee.b;
    public String e = "";
    public eygr g = emptyProtobufList();

    static {
        edbx edbxVar = new edbx();
        a = edbxVar;
        eyfy.registerDefaultInstance(edbx.class, edbxVar);
    }

    private edbx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", edbz.class});
        }
        if (ordinal == 3) {
            return new edbx();
        }
        if (ordinal == 4) {
            return new edbw();
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
        synchronized (edbx.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
