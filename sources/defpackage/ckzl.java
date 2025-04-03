package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckzl extends eyfy implements eyht {
    public static final ckzl a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public awui d;
    public String e;
    public axad f;

    static {
        ckzl ckzlVar = new ckzl();
        a = ckzlVar;
        eyfy.registerDefaultInstance(ckzl.class, ckzlVar);
    }

    private ckzl() {
        emptyProtobufList();
        this.e = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ckzl();
        }
        if (ordinal == 4) {
            return new ckzk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ckzl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
