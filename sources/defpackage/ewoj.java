package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewoj extends eyfy implements eyht {
    public static final ewoj a;
    private static volatile eyhz d;
    public int b;
    public eyee c = eyee.b;

    static {
        ewoj ewojVar = new ewoj();
        a = ewojVar;
        eyfy.registerDefaultInstance(ewoj.class, ewojVar);
    }

    private ewoj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ewoj();
        }
        if (ordinal == 4) {
            return new ewoc();
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
        synchronized (ewoj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
