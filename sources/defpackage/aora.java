package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aora extends eyfy implements eyht {
    public static final aora a;
    private static volatile eyhz m;
    public int b;
    public int c;
    public awui i;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";

    static {
        aora aoraVar = new aora();
        a = aoraVar;
        eyfy.registerDefaultInstance(aora.class, aoraVar);
    }

    private aora() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000\bȈ\tȈ\nȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (ordinal == 3) {
            return new aora();
        }
        if (ordinal == 4) {
            return new aoqx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (aora.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
