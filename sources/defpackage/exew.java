package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exew extends eyfy implements eyht {
    public static final exew a;
    private static volatile eyhz b;

    static {
        exew exewVar = new exew();
        a = exewVar;
        eyfy.registerDefaultInstance(exew.class, exewVar);
    }

    private exew() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (ordinal == 3) {
            return new exew();
        }
        if (ordinal == 4) {
            return new exev();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exew.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
