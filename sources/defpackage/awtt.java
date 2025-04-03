package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awtt extends eyfy implements eyht {
    public static final awtt a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public eygr d = eyfy.emptyProtobufList();
    public String e = "";

    static {
        awtt awttVar = new awtt();
        a = awttVar;
        eyfy.registerDefaultInstance(awtt.class, awttVar);
    }

    private awtt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0004ဈ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new awtt();
        }
        if (ordinal == 4) {
            return new awts();
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
        synchronized (awtt.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
