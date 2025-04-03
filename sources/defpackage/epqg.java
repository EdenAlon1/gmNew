package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqg extends eyfy implements eyht {
    public static final epqg a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        epqg epqgVar = new epqg();
        a = epqgVar;
        eyfy.registerDefaultInstance(epqg.class, epqgVar);
    }

    private epqg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001h\u0005\u0000\u0000\u0000\u0001ဇ\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"d", "c", "b", "e", epqb.class, eppz.class, epqd.class, epqf.class});
        }
        if (ordinal == 3) {
            return new epqg();
        }
        if (ordinal == 4) {
            return new eppx();
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
        synchronized (epqg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
