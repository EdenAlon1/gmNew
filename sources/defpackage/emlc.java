package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlc extends eyfy implements eyht {
    public static final emlc a;
    private static volatile eyhz f;
    public eygr b = eyfy.emptyProtobufList();
    public eygr c = eyfy.emptyProtobufList();
    public eygr d = eyfy.emptyProtobufList();
    public eygr e = eyfy.emptyProtobufList();

    static {
        emlc emlcVar = new emlc();
        a = emlcVar;
        eyfy.registerDefaultInstance(emlc.class, emlcVar);
    }

    private emlc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001a\u0002\u001a\u0003\u001a\u0004\u001a", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new emlc();
        }
        if (ordinal == 4) {
            return new emlb();
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
        synchronized (emlc.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
