package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esio extends eyfy implements eyht {
    public static final esio a;
    private static volatile eyhz n;
    public eyee b = eyee.b;
    public eyee c;
    public String d;
    public long e;
    public int f;
    public String g;
    public String h;
    public eyee i;
    public int j;
    public long k;
    public long l;
    public long m;

    static {
        esio esioVar = new esio();
        a = esioVar;
        eyfy.registerDefaultInstance(esio.class, esioVar);
    }

    private esio() {
        eyee eyeeVar = eyee.b;
        this.c = eyeeVar;
        this.d = "";
        this.g = "";
        this.h = "";
        this.i = eyeeVar;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007\n\b\f\t\u0002\n\u0002\u000b\u0002\f\n", new Object[]{"b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "c"});
        }
        if (ordinal == 3) {
            return new esio();
        }
        if (ordinal == 4) {
            return new esin();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esio.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
