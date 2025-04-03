package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eisq extends eyfy implements eyht {
    public static final eisq a;
    private static volatile eyhz f;
    public int b;
    public eisk c;
    public String d = "";
    public boolean e;

    static {
        eisq eisqVar = new eisq();
        a = eisqVar;
        eyfy.registerDefaultInstance(eisq.class, eisqVar);
    }

    private eisq() {
        emptyProtobufList();
        eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eisq();
        }
        if (ordinal == 4) {
            return new eisp();
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
        synchronized (eisq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
