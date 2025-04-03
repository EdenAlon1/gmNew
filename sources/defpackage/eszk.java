package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eszk extends eyfy implements eyht {
    public static final eszk a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        eszk eszkVar = new eszk();
        a = eszkVar;
        eyfy.registerDefaultInstance(eszk.class, eszkVar);
    }

    private eszk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000b\u0001\u0000\u0001\u000f\u000b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bȈ\t<\u0000\f<\u0000\u000f<\u0000", new Object[]{"c", "b", etac.class, eswu.class, esww.class, etak.class, etaf.class, eyex.class, esxm.class, "d", eswf.class, etay.class, eswk.class});
        }
        if (ordinal == 3) {
            return new eszk();
        }
        if (ordinal == 4) {
            return new eszi();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eszk.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
