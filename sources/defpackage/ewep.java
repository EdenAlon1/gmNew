package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewep extends eyfy implements eyht {
    public static final ewep a;
    private static volatile eyhz c;
    public eyee b = eyee.b;

    static {
        ewep ewepVar = new ewep();
        a = ewepVar;
        eyfy.registerDefaultInstance(ewep.class, ewepVar);
    }

    private ewep() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new ewep();
        }
        if (ordinal == 4) {
            return new eweo();
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
        synchronized (ewep.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
