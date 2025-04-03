package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esaj extends eyfy implements eyht {
    public static final esaj a;
    private static volatile eyhz e;
    public eyee b = eyee.b;
    public eyee c;
    public eyee d;

    static {
        esaj esajVar = new esaj();
        a = esajVar;
        eyfy.registerDefaultInstance(esaj.class, esajVar);
    }

    private esaj() {
        eyee eyeeVar = eyee.b;
        this.c = eyeeVar;
        this.d = eyeeVar;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new esaj();
        }
        if (ordinal == 4) {
            return new esai();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esaj.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
