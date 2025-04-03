package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayds extends eyfy implements eyht {
    public static final ayds a;
    private static volatile eyhz f;
    public int b;
    public eygl c = emptyLongList();
    public eygr d = emptyProtobufList();
    public int e;

    static {
        ayds aydsVar = new ayds();
        a = aydsVar;
        eyfy.registerDefaultInstance(ayds.class, aydsVar);
    }

    private ayds() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001%\u0002\u001b\u0003ဌ\u0000", new Object[]{"b", "c", "d", aydh.class, "e"});
        }
        if (ordinal == 3) {
            return new ayds();
        }
        if (ordinal == 4) {
            return new aydr();
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
        synchronized (ayds.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
