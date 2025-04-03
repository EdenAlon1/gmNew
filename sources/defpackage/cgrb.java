package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgrb extends eyfy implements eyht {
    public static final cgrb a;
    private static volatile eyhz f;
    public int b;
    public eygr c = eyfy.emptyProtobufList();
    public eygr d = eyfy.emptyProtobufList();
    public int e;

    static {
        cgrb cgrbVar = new cgrb();
        a = cgrbVar;
        eyfy.registerDefaultInstance(cgrb.class, cgrbVar);
    }

    private cgrb() {
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
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002Ț\u0003ဌ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new cgrb();
        }
        if (ordinal == 4) {
            return new cgra();
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
        synchronized (cgrb.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
