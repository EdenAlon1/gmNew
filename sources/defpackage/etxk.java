package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxk extends eyfy implements eyht {
    public static final etxk a;
    private static volatile eyhz d;
    public int b;
    public eyee c = eyee.b;

    static {
        etxk etxkVar = new etxk();
        a = etxkVar;
        eyfy.registerDefaultInstance(etxk.class, etxkVar);
    }

    private etxk() {
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
            return new etxk();
        }
        if (ordinal == 4) {
            return new etxj();
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
        synchronized (etxk.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
