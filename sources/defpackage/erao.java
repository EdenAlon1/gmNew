package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erao extends eyfy implements eyht {
    public static final erao a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eygr d;

    static {
        erao eraoVar = new erao();
        a = eraoVar;
        eyfy.registerDefaultInstance(erao.class, eraoVar);
    }

    private erao() {
        eyfy.emptyProtobufList();
        this.d = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0003\u001b", new Object[]{"b", "c", eppm.a, "d", eran.class});
        }
        if (ordinal == 3) {
            return new erao();
        }
        if (ordinal == 4) {
            return new eral();
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
        synchronized (erao.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
