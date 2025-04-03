package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awws extends eyfy implements eyht {
    public static final awws a;
    private static volatile eyhz e;
    public eygr b = emptyProtobufList();
    public eygr c = emptyProtobufList();
    public eygr d = emptyProtobufList();

    static {
        awws awwsVar = new awws();
        a = awwsVar;
        eyfy.registerDefaultInstance(awws.class, awwsVar);
    }

    private awws() {
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
            return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"b", awtr.class, "c", awyh.class, "d", axav.class});
        }
        if (ordinal == 3) {
            return new awws();
        }
        if (ordinal == 4) {
            return new awwr();
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
        synchronized (awws.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
