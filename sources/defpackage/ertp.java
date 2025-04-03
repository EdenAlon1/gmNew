package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ertp extends eyfy implements eyht {
    public static final ertp a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public eygr d = emptyProtobufList();
    public erul e;
    public escu f;

    static {
        ertp ertpVar = new ertp();
        a = ertpVar;
        eyfy.registerDefaultInstance(ertp.class, ertpVar);
    }

    private ertp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002Ȉ\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"b", "c", "d", erul.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new ertp();
        }
        if (ordinal == 4) {
            return new erto();
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
        synchronized (ertp.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
