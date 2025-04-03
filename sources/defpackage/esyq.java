package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyq extends eyfy implements eyht {
    public static final esyq a;
    private static volatile eyhz e;
    public eygr b = emptyProtobufList();
    public String c = "";
    public int d;

    static {
        esyq esyqVar = new esyq();
        a = esyqVar;
        eyfy.registerDefaultInstance(esyq.class, esyqVar);
    }

    private esyq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0004", new Object[]{"b", eswr.class, "c", "d"});
        }
        if (ordinal == 3) {
            return new esyq();
        }
        if (ordinal == 4) {
            return new esyp();
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
        synchronized (esyq.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
