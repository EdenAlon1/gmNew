package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evxu extends eyfy implements eyht {
    public static final evxu a;
    private static volatile eyhz n;
    public int b;
    public Object d;
    public int g;
    public int i;
    public int j;
    public int l;
    public int m;
    public int c = 0;
    public String e = "";
    public String f = "";
    public eygr h = emptyProtobufList();
    public eygr k = emptyProtobufList();

    static {
        evxu evxuVar = new evxu();
        a = evxuVar;
        eyfy.registerDefaultInstance(evxu.class, evxuVar);
    }

    private evxu() {
    }

    public final void a() {
        eygr eygrVar = this.h;
        if (eygrVar.c()) {
            return;
        }
        this.h = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\r\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0005;\u0000\u0006᠌\b\b᠌\u0003\t᠌\u0004\n᠌\u0002\u000b᠌\u0007\f;\u0000\r\u001b", new Object[]{"d", "c", "b", "e", "f", "h", evxi.class, "m", evxq.a, "i", evxl.a, "j", evxj.a, "g", evxs.a, "l", evxo.a, "k", evzn.class});
        }
        if (ordinal == 3) {
            return new evxu();
        }
        if (ordinal == 4) {
            return new evxn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evxu.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
