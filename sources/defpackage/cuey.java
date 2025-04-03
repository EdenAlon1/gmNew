package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuey extends eyfy implements eyht {
    public static final cuey a;
    private static volatile eyhz f;
    public int c;
    public int d;
    public String b = "";
    public String e = "";

    static {
        cuey cueyVar = new cuey();
        a = cueyVar;
        eyfy.registerDefaultInstance(cuey.class, cueyVar);
    }

    private cuey() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new cuey();
        }
        if (ordinal == 4) {
            return new cuew();
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
        synchronized (cuey.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
