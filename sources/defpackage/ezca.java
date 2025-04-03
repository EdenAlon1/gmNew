package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezca extends eyfy implements eyht {
    public static final ezca a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public ezfe i;
    public boolean j;

    static {
        ezca ezcaVar = new ezca();
        a = ezcaVar;
        eyfy.registerDefaultInstance(ezca.class, ezcaVar);
    }

    private ezca() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0006᠌\u0005\bဇ\u0007\t᠌\b\n᠌\t\u000bဉ\n\fဇ\u000b", new Object[]{"b", "c", ezbz.a, "d", "e", ezby.a, "f", "g", ezer.a, "h", ezfb.a, "i", "j"});
        }
        if (ordinal == 3) {
            return new ezca();
        }
        if (ordinal == 4) {
            return new ezbx();
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
        synchronized (ezca.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
