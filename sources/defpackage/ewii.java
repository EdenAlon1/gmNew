package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewii extends eyfy implements eyht {
    public static final ewii a;
    private static volatile eyhz h;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;
    public boolean g;

    static {
        ewii ewiiVar = new ewii();
        a = ewiiVar;
        eyfy.registerDefaultInstance(ewii.class, ewiiVar);
    }

    private ewii() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0002\u0006\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ewii();
        }
        if (ordinal == 4) {
            return new ewih();
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
        synchronized (ewii.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
