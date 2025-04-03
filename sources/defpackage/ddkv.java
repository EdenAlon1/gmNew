package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddkv extends eyfy implements eyht {
    public static final ddkv a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        ddkv ddkvVar = new ddkv();
        a = ddkvVar;
        eyfy.registerDefaultInstance(ddkv.class, ddkvVar);
    }

    private ddkv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new ddkv();
        }
        if (ordinal == 4) {
            return new ddku();
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
        synchronized (ddkv.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
