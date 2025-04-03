package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exqx extends eyfy implements eyht {
    public static final exqx a;
    private static volatile eyhz l;
    public int b;
    public eygr c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public String f = "";
    public long g;
    public exsm h;
    public exsv i;
    public exrn j;
    public long k;

    static {
        exqx exqxVar = new exqx();
        a = exqxVar;
        eyfy.registerDefaultInstance(exqx.class, exqxVar);
    }

    private exqx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဈ\u0001\u0007ဉ\u0006\tဂ\b\fဈ\u0002\u000eဂ\u0003", new Object[]{"b", "c", exqw.class, "d", "h", "i", "e", "j", "k", "f", "g"});
        }
        if (ordinal == 3) {
            return new exqx();
        }
        if (ordinal == 4) {
            return new exqu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exqx.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
