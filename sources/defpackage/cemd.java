package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cemd extends eyfy implements eyht {
    public static final cemd a;
    private static volatile eyhz f;
    public int b;
    public long d;
    public String c = "";
    public eygr e = eyfy.emptyProtobufList();

    static {
        cemd cemdVar = new cemd();
        a = cemdVar;
        eyfy.registerDefaultInstance(cemd.class, cemdVar);
    }

    private cemd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u0002\u0004Ț", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new cemd();
        }
        if (ordinal == 4) {
            return new cemc();
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
        synchronized (cemd.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
