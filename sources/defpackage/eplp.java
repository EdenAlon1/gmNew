package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eplp extends eyfy implements eyht {
    public static final eplp a;
    private static volatile eyhz w;
    public int b;
    public int c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public int t;
    public int u;
    public int v;

    static {
        eplp eplpVar = new eplp();
        a = eplpVar;
        eyfy.registerDefaultInstance(eplp.class, eplpVar);
    }

    private eplp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0014\u0000\u0001\u0001\u0017\u0014\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဌ\u0006\bင\u0007\tင\b\nဌ\t\u000bင\n\fင\u000b\rခ\u0010\u000eဌ\u0011\u0010င\u0012\u0012ဌ\u0013\u0014င\f\u0015င\r\u0016င\u000e\u0017င\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "s", "t", "u", "v", "o", "p", "q", "r"});
        }
        if (ordinal == 3) {
            return new eplp();
        }
        if (ordinal == 4) {
            return new epll();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = w;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eplp.class) {
            eyhzVar = w;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                w = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
