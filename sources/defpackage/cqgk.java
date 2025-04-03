package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqgk extends eyfy implements eyht {
    public static final cqgk a;
    private static volatile eyhz h;
    public int b;
    public eygr c = emptyProtobufList();
    public cqfu d;
    public cqfz e;
    public boolean f;
    public eyja g;

    static {
        cqgk cqgkVar = new cqgk();
        a = cqgkVar;
        eyfy.registerDefaultInstance(cqgk.class, cqgkVar);
    }

    private cqgk() {
    }

    public final void a() {
        eygr eygrVar = this.c;
        if (eygrVar.c()) {
            return;
        }
        this.c = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005ဉ\u0002", new Object[]{"b", "c", cqgj.class, "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new cqgk();
        }
        if (ordinal == 4) {
            return new cqfv();
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
        synchronized (cqgk.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
