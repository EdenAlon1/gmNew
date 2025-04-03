package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faxj extends eyfy implements eyht {
    public static final faxj a;
    private static volatile eyhz e;
    public boolean b;
    public int c;
    public String d = "";
    private int f;

    static {
        faxj faxjVar = new faxj();
        a = faxjVar;
        eyfy.registerDefaultInstance(faxj.class, faxjVar);
    }

    private faxj() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new faxj();
        }
        if (ordinal == 4) {
            return new faxi();
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
        synchronized (faxj.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
