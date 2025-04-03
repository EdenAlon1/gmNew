package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eded extends eyfy implements eyht {
    public static final eded a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public eygr d = emptyProtobufList();
    public int e;

    static {
        eded ededVar = new eded();
        a = ededVar;
        eyfy.registerDefaultInstance(eded.class, ededVar);
    }

    private eded() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"b", "c", "d", edew.class, "e"});
        }
        if (ordinal == 3) {
            return new eded();
        }
        if (ordinal == 4) {
            return new edec();
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
        synchronized (eded.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
