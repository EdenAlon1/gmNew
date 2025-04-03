package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exfw extends eyfy implements eyht {
    public static final exfw a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public exfu f;
    public long g;

    static {
        exfw exfwVar = new exfw();
        a = exfwVar;
        eyfy.registerDefaultInstance(exfw.class, exfwVar);
    }

    private exfw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဂ\u0000\u0004ဉ\u0001\u0005ဂ\u0002\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", exgq.class, exgk.class, "e", "f", "g", exfe.class, exfg.class, exfy.class, exgm.class, exfp.class, exga.class, exfc.class, exfa.class, exgo.class});
        }
        if (ordinal == 3) {
            return new exfw();
        }
        if (ordinal == 4) {
            return new exfv();
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
        synchronized (exfw.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
