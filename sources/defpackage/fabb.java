package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class fabb extends eyfy implements eyht {
    public static final fabb a;
    private static volatile eyhz h;
    public int b;
    public faar c;
    public ezzt d;
    public String e = "";
    public eygi f = emptyIntList();
    public String g = "";

    static {
        fabb fabbVar = new fabb();
        a = fabbVar;
        eyfy.registerDefaultInstance(fabb.class, fabbVar);
    }

    private fabb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004,\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fabb();
        }
        if (ordinal == 4) {
            return new faba();
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
        synchronized (fabb.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
