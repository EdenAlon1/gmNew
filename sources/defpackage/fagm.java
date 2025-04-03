package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fagm extends eyfy implements eyht {
    public static final fagm a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public eygr d = emptyProtobufList();

    static {
        fagm fagmVar = new fagm();
        a = fagmVar;
        eyfy.registerDefaultInstance(fagm.class, fagmVar);
    }

    private fagm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"b", "c", "d", eydq.class});
        }
        if (ordinal == 3) {
            return new fagm();
        }
        if (ordinal == 4) {
            return new fagl();
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
        synchronized (fagm.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
