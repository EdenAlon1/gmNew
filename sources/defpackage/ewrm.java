package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewrm extends eyfy implements eyht {
    public static final ewrm a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        ewrm ewrmVar = new ewrm();
        a = ewrmVar;
        eyfy.registerDefaultInstance(ewrm.class, ewrmVar);
    }

    private ewrm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", ewrl.class, ewrj.class});
        }
        if (ordinal == 3) {
            return new ewrm();
        }
        if (ordinal == 4) {
            return new ewrh();
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
        synchronized (ewrm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
