package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbxa extends eyfy implements eyht {
    public static final fbxa a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public fbwy e;
    public int f;

    static {
        fbxa fbxaVar = new fbxa();
        a = fbxaVar;
        eyfy.registerDefaultInstance(fbxa.class, fbxaVar);
    }

    private fbxa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u001f\u0001\u0001\u0002 \u001f\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bဉ\u0000\t<\u0000\n\f\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000", new Object[]{"d", "c", "b", fbxc.class, fbwp.class, fbvf.class, fbtw.class, fbsm.class, fbsd.class, "e", fbxg.class, "f", fbso.class, fbvx.class, fbtl.class, fbth.class, fbwh.class, fbwl.class, fbwn.class, fbva.class, fbsh.class, fbwr.class, fbxw.class, fbsf.class, fbuy.class, fbtp.class, fbwd.class, fbxi.class, fbwf.class, fbwj.class, fbsq.class, fbus.class, fbvd.class, fbvv.class});
        }
        if (ordinal == 3) {
            return new fbxa();
        }
        if (ordinal == 4) {
            return new fbwz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbxa.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
