package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eszc extends eyfy implements eyht {
    public static final eszc a;
    private static volatile eyhz e;
    public eygr b = emptyProtobufList();
    public String c = "";
    public int d;

    static {
        eszc eszcVar = new eszc();
        a = eszcVar;
        eyfy.registerDefaultInstance(eszc.class, eszcVar);
    }

    private eszc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0004", new Object[]{"b", etah.class, "c", "d"});
        }
        if (ordinal == 3) {
            return new eszc();
        }
        if (ordinal == 4) {
            return new eszb();
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
        synchronized (eszc.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
