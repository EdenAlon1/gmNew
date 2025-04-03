package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajsj extends eyfy implements eyht {
    public static final ajsj a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        ajsj ajsjVar = new ajsj();
        a = ajsjVar;
        eyfy.registerDefaultInstance(ajsj.class, ajsjVar);
    }

    private ajsj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", ajsg.class, ajrz.class});
        }
        if (ordinal == 3) {
            return new ajsj();
        }
        if (ordinal == 4) {
            return new ajsi();
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
        synchronized (ajsj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
