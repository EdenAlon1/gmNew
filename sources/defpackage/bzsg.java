package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzsg extends eyfy implements eyht {
    public static final bzsg a;
    private static volatile eyhz e;
    public eygr b = emptyProtobufList();
    public String c = "";
    public eygr d = eyfy.emptyProtobufList();

    static {
        bzsg bzsgVar = new bzsg();
        a = bzsgVar;
        eyfy.registerDefaultInstance(bzsg.class, bzsgVar);
    }

    private bzsg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001c\u0002Ȉ\u0003Ț", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new bzsg();
        }
        if (ordinal == 4) {
            return new bzsf();
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
        synchronized (bzsg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
