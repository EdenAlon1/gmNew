package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbyg extends eyfy implements eyht {
    public static final fbyg a;
    private static volatile eyhz e;
    public int b;
    public fcfo c;
    public eygr d;

    static {
        fbyg fbygVar = new fbyg();
        a = fbygVar;
        eyfy.registerDefaultInstance(fbyg.class, fbygVar);
    }

    private fbyg() {
        eyfy.emptyProtobufList();
        this.d = emptyProtobufList();
    }

    public final void a() {
        eygr eygrVar = this.d;
        if (eygrVar.c()) {
            return;
        }
        this.d = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001b", new Object[]{"b", "c", "d", fcfg.class});
        }
        if (ordinal == 3) {
            return new fbyg();
        }
        if (ordinal == 4) {
            return new fbyf();
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
        synchronized (fbyg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
