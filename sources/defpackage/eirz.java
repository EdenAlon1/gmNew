package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eirz extends eyfy implements eyht {
    public static final eirz a;
    private static volatile eyhz c;
    public int b = 1;
    private int d;

    static {
        eirz eirzVar = new eirz();
        a = eirzVar;
        eyfy.registerDefaultInstance(eirz.class, eirzVar);
    }

    private eirz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0003", new Object[]{"d", "b", eirw.a});
        }
        if (ordinal == 3) {
            return new eirz();
        }
        if (ordinal == 4) {
            return new eiry();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eirz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
