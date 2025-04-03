package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eydq extends eyfy implements eyht {
    public static final eydq a;
    private static volatile eyhz d;
    public String b = "";
    public eyee c = eyee.b;

    static {
        eydq eydqVar = new eydq();
        a = eydqVar;
        eyfy.registerDefaultInstance(eydq.class, eydqVar);
    }

    private eydq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new eydq();
        }
        if (ordinal == 4) {
            return new eydp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eydq.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
