package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emae extends eyfy implements eyht {
    public static final emae a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        emae emaeVar = new emae();
        a = emaeVar;
        eyfy.registerDefaultInstance(emae.class, emaeVar);
    }

    private emae() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001:\u0000", new Object[]{"c", "b"});
        }
        if (ordinal == 3) {
            return new emae();
        }
        if (ordinal == 4) {
            return new emad();
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
        synchronized (emae.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
