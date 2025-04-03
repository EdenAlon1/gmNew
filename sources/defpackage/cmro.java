package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmro extends eyfy implements eyht {
    public static final cmro a;
    private static volatile eyhz e;
    public int b;
    public cmrl c;
    public eygr d = emptyProtobufList();

    static {
        cmro cmroVar = new cmro();
        a = cmroVar;
        eyfy.registerDefaultInstance(cmro.class, cmroVar);
    }

    private cmro() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", cmrs.class});
        }
        if (ordinal == 3) {
            return new cmro();
        }
        if (ordinal == 4) {
            return new cmrn();
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
        synchronized (cmro.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
