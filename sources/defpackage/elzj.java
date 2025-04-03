package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzj extends eyfy implements eyht {
    public static final elzj a;
    private static volatile eyhz e;
    public int b;
    public emai c;
    public eygr d = emptyProtobufList();

    static {
        elzj elzjVar = new elzj();
        a = elzjVar;
        eyfy.registerDefaultInstance(elzj.class, elzjVar);
    }

    private elzj() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004ဉ\u0000", new Object[]{"b", "d", elzf.class, "c"});
        }
        if (ordinal == 3) {
            return new elzj();
        }
        if (ordinal == 4) {
            return new elzg();
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
        synchronized (elzj.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
