package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewmw extends eyfy implements eyht {
    public static final ewmw a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public ewmt f;

    static {
        ewmw ewmwVar = new ewmw();
        a = ewmwVar;
        eyfy.registerDefaultInstance(ewmw.class, ewmwVar);
    }

    private ewmw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\f\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ewmw();
        }
        if (ordinal == 4) {
            return new ewmv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewmw.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
