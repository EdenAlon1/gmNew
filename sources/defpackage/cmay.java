package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmay extends eyfy<cmay, cmap> implements eyht {
    public static final cmay a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public eygr d = emptyProtobufList();

    static {
        cmay cmayVar = new cmay();
        a = cmayVar;
        eyfy.registerDefaultInstance(cmay.class, cmayVar);
    }

    private cmay() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b", new Object[]{"b", "c", "d", cmax.class});
        }
        if (ordinal == 3) {
            return new cmay();
        }
        if (ordinal == 4) {
            return new cmap();
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
        synchronized (cmay.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
