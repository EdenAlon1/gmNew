package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewjr extends eyfy implements eyht {
    public static final ewjr a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public eyee d = eyee.b;

    static {
        ewjr ewjrVar = new ewjr();
        a = ewjrVar;
        eyfy.registerDefaultInstance(ewjr.class, ewjrVar);
    }

    private ewjr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004ည\u0002", new Object[]{"b", "c", ewkp.class, "d"});
        }
        if (ordinal == 3) {
            return new ewjr();
        }
        if (ordinal == 4) {
            return new ewjq();
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
        synchronized (ewjr.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
