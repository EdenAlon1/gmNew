package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epfs extends eyfy implements eyht {
    public static final epfs a;
    private static volatile eyhz f;
    public int b;
    public eygi c = emptyIntList();
    public eygi d = emptyIntList();
    public int e;

    static {
        epfs epfsVar = new epfs();
        a = epfsVar;
        eyfy.registerDefaultInstance(epfs.class, epfsVar);
    }

    private epfs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = epef.a;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ࠞ\u0002ࠞ\u0003င\u0000", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e"});
        }
        if (ordinal == 3) {
            return new epfs();
        }
        if (ordinal == 4) {
            return new epfr();
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
        synchronized (epfs.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
