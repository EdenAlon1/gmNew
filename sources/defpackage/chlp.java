package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chlp extends eyfy implements eyht {
    public static final chlp a;
    private static volatile eyhz h;
    public String b = "";
    public eyee c = eyee.b;
    public long d;
    public eyee e;
    public eyee f;
    public long g;

    static {
        chlp chlpVar = new chlp();
        a = chlpVar;
        eyfy.registerDefaultInstance(chlp.class, chlpVar);
    }

    private chlp() {
        eyee eyeeVar = eyee.b;
        this.e = eyeeVar;
        this.f = eyeeVar;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0002\u0004\n\u0005\n\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new chlp();
        }
        if (ordinal == 4) {
            return new chlo();
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
        synchronized (chlp.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
