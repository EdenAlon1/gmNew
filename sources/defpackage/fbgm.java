package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbgm extends eyfy implements eyht {
    public static final fbgm a;
    private static volatile eyhz e;
    public int b;
    public fblh c;
    public eygr d = emptyProtobufList();

    static {
        fbgm fbgmVar = new fbgm();
        a = fbgmVar;
        eyfy.registerDefaultInstance(fbgm.class, fbgmVar);
    }

    private fbgm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", fbge.class});
        }
        if (ordinal == 3) {
            return new fbgm();
        }
        if (ordinal == 4) {
            return new fbgl();
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
        synchronized (fbgm.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
