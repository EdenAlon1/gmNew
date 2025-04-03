package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxg extends eyfy implements eyht {
    public static final etxg a;
    private static volatile eyhz d;
    public int b;
    public eyee c = eyee.b;

    static {
        etxg etxgVar = new etxg();
        a = etxgVar;
        eyfy.registerDefaultInstance(etxg.class, etxgVar);
    }

    private etxg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new etxg();
        }
        if (ordinal == 4) {
            return new etxf();
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
        synchronized (etxg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
