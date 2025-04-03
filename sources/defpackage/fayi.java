package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fayi extends eyfy implements eyht {
    public static final fayi a;
    private static volatile eyhz h;
    public int b;
    public int e;
    public awup g;
    public eyee c = eyee.b;
    public eyee d = eyee.b;
    public String f = "";

    static {
        fayi fayiVar = new fayi();
        a = fayiVar;
        eyfy.registerDefaultInstance(fayi.class, fayiVar);
    }

    private fayi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fayi();
        }
        if (ordinal == 4) {
            return new fayh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fayi.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
