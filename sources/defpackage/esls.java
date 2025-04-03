package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esls extends eyfy implements eyht {
    public static final esls a;
    private static volatile eyhz h;
    public int c;
    public boolean f;
    public int g;
    public String b = "";
    public String d = "";
    public String e = "";

    static {
        esls eslsVar = new esls();
        a = eslsVar;
        eyfy.registerDefaultInstance(esls.class, eslsVar);
    }

    private esls() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\f", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new esls();
        }
        if (ordinal == 4) {
            return new eslq();
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
        synchronized (esls.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
