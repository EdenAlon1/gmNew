package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exsf extends eyfy implements eyht {
    public static final exsf a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        exsf exsfVar = new exsf();
        a = exsfVar;
        eyfy.registerDefaultInstance(exsf.class, exsfVar);
    }

    private exsf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0005ဈ\u0005\b᠌\b", new Object[]{"b", "c", exsd.a, "d", "e", exse.a});
        }
        if (ordinal == 3) {
            return new exsf();
        }
        if (ordinal == 4) {
            return new exsc();
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
        synchronized (exsf.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
