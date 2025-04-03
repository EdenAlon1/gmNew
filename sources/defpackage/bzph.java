package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzph extends eyfy implements eyht {
    public static final bzph a;
    private static volatile eyhz e;
    public boolean c;
    public eygr b = eyfy.emptyProtobufList();
    public String d = "";

    static {
        bzph bzphVar = new bzph();
        a = bzphVar;
        eyfy.registerDefaultInstance(bzph.class, bzphVar);
    }

    private bzph() {
    }

    public final void a() {
        eygr eygrVar = this.b;
        if (eygrVar.c()) {
            return;
        }
        this.b = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\u0007\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new bzph();
        }
        if (ordinal == 4) {
            return new bzpg();
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
        synchronized (bzph.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
