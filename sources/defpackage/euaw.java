package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euaw extends eyfy implements eyht {
    public static final euaw a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public euay d;
    public eyee e = eyee.b;
    public eyee f;
    public eyee g;
    public eyee h;
    public eyee i;
    public eyee j;

    static {
        euaw euawVar = new euaw();
        a = euawVar;
        eyfy.registerDefaultInstance(euaw.class, euawVar);
    }

    private euaw() {
        eyee eyeeVar = eyee.b;
        this.f = eyeeVar;
        this.g = eyeeVar;
        this.h = eyeeVar;
        this.i = eyeeVar;
        this.j = eyeeVar;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new euaw();
        }
        if (ordinal == 4) {
            return new euav();
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
        synchronized (euaw.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
