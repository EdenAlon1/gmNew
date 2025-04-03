package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cila extends eyfy implements eyht {
    public static final cila a;
    private static volatile eyhz q;
    public int b;
    public fcek c;
    public int d;
    public int g;
    public boolean h;
    public int i;
    public long j;
    public fcek l;
    public boolean n;
    public boolean p;
    public String e = "";
    public eyee f = eyee.b;
    public String k = "";
    public eyee m = eyee.b;
    public String o = "";

    static {
        cila cilaVar = new cila();
        a = cilaVar;
        eyfy.registerDefaultInstance(cila.class, cilaVar);
    }

    private cila() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003Ȉ\u0004\n\u0005\f\u0006\u0007\u0007\u0004\b\u0002\tȈ\nဉ\u0001\u000bည\u0002\fဇ\u0003\rለ\u0004\u000eဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (ordinal == 3) {
            return new cila();
        }
        if (ordinal == 4) {
            return new cikz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = q;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cila.class) {
            eyhzVar = q;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                q = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
