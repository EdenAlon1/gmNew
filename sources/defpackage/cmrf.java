package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmrf extends eyfy implements eyht {
    public static final cmrf a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public long c;

    static {
        cmrf cmrfVar = new cmrf();
        a = cmrfVar;
        eyfy.registerDefaultInstance(cmrf.class, cmrfVar);
    }

    private cmrf() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"b", cmro.class, "c"});
        }
        if (ordinal == 3) {
            return new cmrf();
        }
        if (ordinal == 4) {
            return new cmre();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cmrf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
