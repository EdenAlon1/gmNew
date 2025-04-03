package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class desl extends eyfy implements eyht {
    public static final desl a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public String d = "";

    static {
        desl deslVar = new desl();
        a = deslVar;
        eyfy.registerDefaultInstance(desl.class, deslVar);
    }

    private desl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new desl();
        }
        if (ordinal == 4) {
            return new desk();
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
        synchronized (desl.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
