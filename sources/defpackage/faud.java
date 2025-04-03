package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faud extends eyfy implements eyht {
    public static final faud a;
    private static volatile eyhz h;
    public Object c;
    public int d;
    public int f;
    public int b = 0;
    public String e = "";
    public String g = "";

    static {
        faud faudVar = new faud();
        a = faudVar;
        eyfy.registerDefaultInstance(faud.class, faudVar);
    }

    private faud() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0001\u0000\u0001\u000f\r\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005\f\u0006<\u0000\u0007<\u0000\b<\u0000\n<\u0000\u000b<\u0000\f<\u0000\rȈ\u000f<\u0000", new Object[]{"c", "b", "d", "e", fato.class, faua.class, "f", fauc.class, fatl.class, fatw.class, fatq.class, fats.class, fatu.class, "g", faty.class});
        }
        if (ordinal == 3) {
            return new faud();
        }
        if (ordinal == 4) {
            return new fatm();
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
        synchronized (faud.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
