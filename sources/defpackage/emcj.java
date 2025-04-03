package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcj extends eyfy implements eyht {
    public static final emcj a;
    private static volatile eyhz h;
    public int b;
    public eyee c = eyee.b;
    public eyee d;
    public emch e;
    public emcc f;
    public eyee g;

    static {
        emcj emcjVar = new emcj();
        a = emcjVar;
        eyfy.registerDefaultInstance(emcj.class, emcjVar);
    }

    private emcj() {
        eyee eyeeVar = eyee.b;
        this.d = eyeeVar;
        this.g = eyeeVar;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ည\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new emcj();
        }
        if (ordinal == 4) {
            return new emci();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emcj.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
