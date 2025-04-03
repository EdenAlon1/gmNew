package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eslk extends eyfy implements eyht {
    public static final eslk a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public faom g;
    public int h;
    public int i;
    public String f = "";
    public eyee j = eyee.b;

    static {
        eslk eslkVar = new eslk();
        a = eslkVar;
        eyfy.registerDefaultInstance(eslk.class, eslkVar);
    }

    private eslk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0007\u0004Ȉ\u0005ဉ\u0000\u0006\u000b\u0007\u000b\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new eslk();
        }
        if (ordinal == 4) {
            return new esli();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eslk.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
