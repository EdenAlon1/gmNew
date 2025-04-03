package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajsg extends eyfy implements eyht {
    public static final ajsg a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        ajsg ajsgVar = new ajsg();
        a = ajsgVar;
        eyfy.registerDefaultInstance(ajsg.class, ajsgVar);
    }

    private ajsg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u000b\u0002\u0000\u0000\u0000\u0001\f\u000b<\u0000", new Object[]{"c", "b", "d", ajse.class});
        }
        if (ordinal == 3) {
            return new ajsg();
        }
        if (ordinal == 4) {
            return new ajsf();
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
        synchronized (ajsg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
