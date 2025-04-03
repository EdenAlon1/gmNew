package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exli extends eyfy implements eyht {
    public static final exli a;
    private static volatile eyhz f;
    public int b;
    public float c;
    public String d = "";
    public String e = "";
    private int g;

    static {
        exli exliVar = new exli();
        a = exliVar;
        eyfy.registerDefaultInstance(exli.class, exliVar);
    }

    private exli() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new exli();
        }
        if (ordinal == 4) {
            return new exlh();
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
        synchronized (exli.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
