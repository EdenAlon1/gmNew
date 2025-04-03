package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjg extends eyfy implements eyht {
    public static final epjg a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        epjg epjgVar = new epjg();
        a = epjgVar;
        eyfy.registerDefaultInstance(epjg.class, epjgVar);
    }

    private epjg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"d", "c", "b", "e", fbrb.a, epgk.class});
        }
        if (ordinal == 3) {
            return new epjg();
        }
        if (ordinal == 4) {
            return new epjf();
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
        synchronized (epjg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
