package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqg extends eyfy implements eyht {
    public static final fgqg a;
    private static volatile eyhz p;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public fgqo j;
    public eygr k = emptyProtobufList();
    public int l;
    public int m;
    public int n;
    public fgqo o;

    static {
        fgqg fgqgVar = new fgqg();
        a = fgqgVar;
        eyfy.registerDefaultInstance(fgqg.class, fgqgVar);
    }

    private fgqg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"b", "c", "d", "f", "i", "k", fgqe.class, "l", "e", "g", "h", "j", "m", "n", "o"});
        }
        if (ordinal == 3) {
            return new fgqg();
        }
        if (ordinal == 4) {
            return new fgqf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = p;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fgqg.class) {
            eyhzVar = p;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                p = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
