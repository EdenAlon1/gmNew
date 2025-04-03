package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzma extends eyfy implements eyht {
    public static final bzma a;
    private static volatile eyhz q;
    public int b;
    public int c;
    public eygr d;
    public bzls e;
    public eygr f;
    public String g;
    public bzlv h;
    public long i;
    public boolean j;
    public bzlq k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public int p;

    static {
        bzma bzmaVar = new bzma();
        a = bzmaVar;
        eyfy.registerDefaultInstance(bzma.class, bzmaVar);
    }

    private bzma() {
        eyfy.emptyProtobufList();
        this.d = eyfy.emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0002\u0000\u0001\f\u0005Ț\u0006ဉ\u0000\u0007\u001b\bȈ\tဉ\u0001\n\u0002\u000b\u0007\fဉ\u0002\r\u0007\u000e\u0004\u000f\u0007\u0010\u0004\u0011\u0004", new Object[]{"b", "c", "d", "e", "f", bzls.class, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (ordinal == 3) {
            return new bzma();
        }
        if (ordinal == 4) {
            return new bzly();
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
        synchronized (bzma.class) {
            eyhzVar = q;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                q = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
