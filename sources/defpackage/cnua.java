package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnua extends eyfy implements eyht {
    public static final cnua a;
    private static volatile eyhz f;
    public int b;
    public cnuv c;
    public eygr d = emptyProtobufList();
    public eygr e = emptyProtobufList();

    static {
        cnua cnuaVar = new cnua();
        a = cnuaVar;
        eyfy.registerDefaultInstance(cnua.class, cnuaVar);
    }

    private cnua() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", cnsw.class, "e", cntd.class});
        }
        if (ordinal == 3) {
            return new cnua();
        }
        if (ordinal == 4) {
            return new cntz();
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
        synchronized (cnua.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
