package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eslw extends eyfy implements eyht {
    public static final eslw a;
    private static volatile eyhz f;
    public String b = "";
    public String c = "";
    public eyee d = eyee.b;
    public String e = "";

    static {
        eslw eslwVar = new eslw();
        a = eslwVar;
        eyfy.registerDefaultInstance(eslw.class, eslwVar);
    }

    private eslw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0005\n\u0006Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eslw();
        }
        if (ordinal == 4) {
            return new eslv();
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
        synchronized (eslw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
