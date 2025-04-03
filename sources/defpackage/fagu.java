package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fagu extends eyfy implements eyht {
    public static final fagu a;
    private static volatile eyhz h;
    public int b;
    public fakk c;
    public faje d;
    public String e = "";
    public eygr f = eyfy.emptyProtobufList();
    public String g = "";

    static {
        fagu faguVar = new fagu();
        a = faguVar;
        eyfy.registerDefaultInstance(fagu.class, faguVar);
    }

    private fagu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ț\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fagu();
        }
        if (ordinal == 4) {
            return new fagt();
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
        synchronized (fagu.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
