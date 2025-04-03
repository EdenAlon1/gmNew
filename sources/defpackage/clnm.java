package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clnm extends eyfy implements eyht {
    public static final clnm a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public eygr e = emptyProtobufList();

    static {
        clnm clnmVar = new clnm();
        a = clnmVar;
        eyfy.registerDefaultInstance(clnm.class, clnmVar);
    }

    private clnm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", clno.class});
        }
        if (ordinal == 3) {
            return new clnm();
        }
        if (ordinal == 4) {
            return new clnl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (clnm.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
