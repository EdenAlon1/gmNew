package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewne extends eyfy implements eyht {
    public static final ewne a;
    private static volatile eyhz d;
    public String b = "";
    public boolean c;

    static {
        ewne ewneVar = new ewne();
        a = ewneVar;
        eyfy.registerDefaultInstance(ewne.class, ewneVar);
    }

    private ewne() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ewne();
        }
        if (ordinal == 4) {
            return new ewnd();
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
        synchronized (ewne.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
