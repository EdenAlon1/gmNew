package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emtc extends eyfy implements eyht {
    public static final eygj a = new emsv();
    public static final emtc b;
    private static volatile eyhz s;
    public Object d;
    public int f;
    public int g;
    public int h;
    public long i;
    public long j;
    public int k;
    public int l;
    public long m;
    public eygi n;
    public eygl o;
    public int p;
    public int q;
    public int r;
    public int c = 0;
    public String e = "";

    static {
        emtc emtcVar = new emtc();
        b = emtcVar;
        eyfy.registerDefaultInstance(emtc.class, emtcVar);
    }

    private emtc() {
        emptyProtobufList();
        this.n = emptyIntList();
        this.o = emptyLongList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0000\u000f\u0001\u0000\u0001k\u000f\u0000\u0002\u0000\u0001Ȉ\u0002\u000b\u0003\f\u0011\f\u0013\f\u0016\u000b\u0017\u0002\u0018\u0002\u001a\u0003d,g\fh%i\fj\fk<\u0000", new Object[]{"d", "c", "e", "f", "g", "k", "l", "h", "i", "j", "m", "n", "p", "o", "q", "r", emtb.class});
        }
        if (ordinal == 3) {
            return new emtc();
        }
        if (ordinal == 4) {
            return new emsw();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = s;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emtc.class) {
            eyhzVar = s;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                s = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
