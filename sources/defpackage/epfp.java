package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epfp extends eyfy implements eyht {
    public static final epfp a;
    private static volatile eyhz i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        epfp epfpVar = new epfp();
        a = epfpVar;
        eyfy.registerDefaultInstance(epfp.class, epfpVar);
    }

    private epfp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", epfv.a, "f", epee.a, "g", epef.a, "h", epfo.class, epfm.class});
        }
        if (ordinal == 3) {
            return new epfp();
        }
        if (ordinal == 4) {
            return new epfk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epfp.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
