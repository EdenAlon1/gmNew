package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esze extends eyfy implements eyht {
    public static final esze a;
    private static volatile eyhz c;
    public boolean b;
    private boolean d;
    private boolean e;

    static {
        esze eszeVar = new esze();
        a = eszeVar;
        eyfy.registerDefaultInstance(esze.class, eszeVar);
    }

    private esze() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"d", "e", "b"});
        }
        if (ordinal == 3) {
            return new esze();
        }
        if (ordinal == 4) {
            return new eszd();
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
        synchronized (esze.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
