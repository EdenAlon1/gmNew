package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exgc extends eyfy implements eyht {
    public static final exgc a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public exgg d;

    static {
        exgc exgcVar = new exgc();
        a = exgcVar;
        eyfy.registerDefaultInstance(exgc.class, exgcVar);
    }

    private exgc() {
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
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", exfw.class, "d"});
        }
        if (ordinal == 3) {
            return new exgc();
        }
        if (ordinal == 4) {
            return new exgb();
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
        synchronized (exgc.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
