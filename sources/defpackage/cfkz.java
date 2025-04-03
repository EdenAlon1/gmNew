package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfkz extends eyfy implements eyht {
    public static final cfkz a;
    private static volatile eyhz c;
    public ceun b;
    private int d;

    static {
        cfkz cfkzVar = new cfkz();
        a = cfkzVar;
        eyfy.registerDefaultInstance(cfkz.class, cfkzVar);
    }

    private cfkz() {
        eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new cfkz();
        }
        if (ordinal == 4) {
            return new cfky();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cfkz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
