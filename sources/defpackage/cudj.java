package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudj extends eyfy implements eyht {
    public static final cudj a;
    private static volatile eyhz f;
    public int c;
    public eygr b = emptyProtobufList();
    public eygr d = emptyProtobufList();
    public eygr e = emptyProtobufList();

    static {
        cudj cudjVar = new cudj();
        a = cudjVar;
        eyfy.registerDefaultInstance(cudj.class, cudjVar);
    }

    private cudj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\f\u0003\u001b\u0004\u001b", new Object[]{"b", cucl.class, "c", "d", cubl.class, "e", cubl.class});
        }
        if (ordinal == 3) {
            return new cudj();
        }
        if (ordinal == 4) {
            return new cudi();
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
        synchronized (cudj.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
