package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqgj extends eyfy implements eyht {
    public static final cqgj a;
    private static volatile eyhz j;
    public int b;
    public Object d;
    public eyja g;
    public cqgi i;
    public int c = 0;
    public eyee e = eyee.b;
    public eygr f = emptyProtobufList();
    public eygr h = emptyProtobufList();

    static {
        cqgj cqgjVar = new cqgj();
        a = cqgjVar;
        eyfy.registerDefaultInstance(cqgj.class, cqgjVar);
    }

    private cqgj() {
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
            return newMessageInfo(a, "\u0000\b\u0001\u0001\u0001\t\b\u0000\u0002\u0000\u0001\n\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u001b\u0007ဉ\u0000\b\u001b\tဉ\u0001", new Object[]{"d", "c", "b", "e", cqfx.class, cqgb.class, cqgd.class, "f", cqgj.class, "g", "h", cqgj.class, "i"});
        }
        if (ordinal == 3) {
            return new cqgj();
        }
        if (ordinal == 4) {
            return new cqge();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cqgj.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
