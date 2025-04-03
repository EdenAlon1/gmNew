package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emks extends eyfy implements eyht {
    public static final emks a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        emks emksVar = new emks();
        a = emksVar;
        eyfy.registerDefaultInstance(emks.class, emksVar);
    }

    private emks() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new emks();
        }
        if (ordinal == 4) {
            return new emkr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emks.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
