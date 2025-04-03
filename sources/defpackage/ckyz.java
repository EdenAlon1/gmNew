package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckyz extends eyfy implements eyht {
    public static final ckyz a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public eygr d;
    public awui e;

    static {
        ckyz ckyzVar = new ckyz();
        a = ckyzVar;
        eyfy.registerDefaultInstance(ckyz.class, ckyzVar);
    }

    private ckyz() {
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
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0003\u001b\u0004ဉ\u0000", new Object[]{"b", "c", "d", aora.class, "e"});
        }
        if (ordinal == 3) {
            return new ckyz();
        }
        if (ordinal == 4) {
            return new ckyy();
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
        synchronized (ckyz.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
