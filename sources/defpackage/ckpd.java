package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckpd extends eyfy implements eyht {
    public static final ckpd a;
    private static volatile eyhz h;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public String f = "";
    public ckon g;

    static {
        ckpd ckpdVar = new ckpd();
        a = ckpdVar;
        eyfy.registerDefaultInstance(ckpd.class, ckpdVar);
    }

    private ckpd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ckpd();
        }
        if (ordinal == 4) {
            return new ckpc();
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
        synchronized (ckpd.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
