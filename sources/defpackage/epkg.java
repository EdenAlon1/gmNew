package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epkg extends eyfy implements eyht {
    public static final epkg a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        epkg epkgVar = new epkg();
        a = epkgVar;
        eyfy.registerDefaultInstance(epkg.class, epkgVar);
    }

    private epkg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = epab.a;
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", eyggVar, "d", eyggVar});
        }
        if (ordinal == 3) {
            return new epkg();
        }
        if (ordinal == 4) {
            return new epkf();
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
        synchronized (epkg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
