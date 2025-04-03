package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwo extends eyfy implements eyht {
    public static final epwo a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        epwo epwoVar = new epwo();
        a = epwoVar;
        eyfy.registerDefaultInstance(epwo.class, epwoVar);
    }

    private epwo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001g\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001e<\u0000f<\u0000g<\u0000", new Object[]{"d", "c", "b", "e", epwm.a, "f", epww.class, epwk.class, epwu.class});
        }
        if (ordinal == 3) {
            return new epwo();
        }
        if (ordinal == 4) {
            return new epwl();
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
        synchronized (epwo.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
