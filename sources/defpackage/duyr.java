package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duyr extends eyfy implements eyht {
    public static final duyr a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        duyr duyrVar = new duyr();
        a = duyrVar;
        eyfy.registerDefaultInstance(duyr.class, duyrVar);
    }

    private duyr() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", duzc.class});
        }
        if (ordinal == 3) {
            return new duyr();
        }
        if (ordinal == 4) {
            return new duyq();
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
        synchronized (duyr.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
