package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyy extends eyfy implements eyht {
    public static final esyy a;
    private static volatile eyhz e;
    public eygr b = emptyProtobufList();
    public String c = "";
    public int d;

    static {
        esyy esyyVar = new esyy();
        a = esyyVar;
        eyfy.registerDefaultInstance(esyy.class, esyyVar);
    }

    private esyy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0004", new Object[]{"b", eszz.class, "c", "d"});
        }
        if (ordinal == 3) {
            return new esyy();
        }
        if (ordinal == 4) {
            return new esyx();
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
        synchronized (esyy.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
