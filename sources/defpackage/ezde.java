package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezde extends eyfy implements eyht {
    public static final ezde a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();
    public int e;

    static {
        ezde ezdeVar = new ezde();
        a = ezdeVar;
        eyfy.registerDefaultInstance(ezde.class, ezdeVar);
    }

    private ezde() {
    }

    public final void a() {
        eygr eygrVar = this.d;
        if (eygrVar.c()) {
            return;
        }
        this.d = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0004᠌\u0002", new Object[]{"b", "c", ezdb.a, "d", ezcz.class, "e", ezcm.a});
        }
        if (ordinal == 3) {
            return new ezde();
        }
        if (ordinal == 4) {
            return new ezcv();
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
        synchronized (ezde.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
