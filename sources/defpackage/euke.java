package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euke extends eyfy implements eyht {
    public static final euke a;
    private static volatile eyhz e;
    public int b;
    public eygr c = eyfy.emptyProtobufList();
    public eygi d = emptyIntList();

    static {
        euke eukeVar = new euke();
        a = eukeVar;
        eyfy.registerDefaultInstance(euke.class, eukeVar);
    }

    private euke() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002Ț\u0003'", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new euke();
        }
        if (ordinal == 4) {
            return new eukd();
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
        synchronized (euke.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
