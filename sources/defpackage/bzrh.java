package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzrh extends eyfy implements eyht {
    public static final bzrh a;
    private static volatile eyhz f;
    public eygr b = emptyProtobufList();
    public eygr c = emptyProtobufList();
    public String d = "";
    public boolean e;

    static {
        bzrh bzrhVar = new bzrh();
        a = bzrhVar;
        eyfy.registerDefaultInstance(bzrh.class, bzrhVar);
    }

    private bzrh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001c\u0002\u001c\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new bzrh();
        }
        if (ordinal == 4) {
            return new bzrg();
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
        synchronized (bzrh.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
