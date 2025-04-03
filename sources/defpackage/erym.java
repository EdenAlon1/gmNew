package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erym extends eyfy implements eyht {
    public static final erym a;
    private static volatile eyhz f;
    public int b;
    public eygr c = emptyProtobufList();
    public String d = "";
    public eryi e;

    static {
        erym erymVar = new erym();
        a = erymVar;
        eyfy.registerDefaultInstance(erym.class, erymVar);
    }

    private erym() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002\u001b\u0003Ȉ\u0005ဉ\u0000", new Object[]{"b", "c", erur.class, "d", "e"});
        }
        if (ordinal == 3) {
            return new erym();
        }
        if (ordinal == 4) {
            return new eryl();
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
        synchronized (erym.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
