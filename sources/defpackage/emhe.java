package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emhe extends eyfy implements eyht {
    public static final emhe a;
    private static volatile eyhz e;
    public int c;
    public String b = "";
    public String d = "";

    static {
        emhe emheVar = new emhe();
        a = emheVar;
        eyfy.registerDefaultInstance(emhe.class, emheVar);
    }

    private emhe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new emhe();
        }
        if (ordinal == 4) {
            return new emhd();
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
        synchronized (emhe.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
