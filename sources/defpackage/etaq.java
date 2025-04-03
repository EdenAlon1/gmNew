package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etaq extends eyfy implements eyht {
    public static final etaq a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f;
    public eydq g;

    static {
        etaq etaqVar = new etaq();
        a = etaqVar;
        eyfy.registerDefaultInstance(etaq.class, etaqVar);
    }

    private etaq() {
        eyee eyeeVar = eyee.b;
        this.f = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\bȈ\nဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new etaq();
        }
        if (ordinal == 4) {
            return new etap();
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
        synchronized (etaq.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
