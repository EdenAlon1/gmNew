package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emiu extends eyfy implements eyht {
    public static final emiu a;
    private static volatile eyhz g;
    public int b;
    public emhv c;
    public int e;
    public eygr d = emptyProtobufList();
    public int f = 1;

    static {
        emiu emiuVar = new emiu();
        a = emiuVar;
        eyfy.registerDefaultInstance(emiu.class, emiuVar);
    }

    private emiu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0001\u0000\u0005\u001b\u0006င\u0001\u0007ဉ\u0000\b᠌\u0002", new Object[]{"b", "d", emit.class, "e", "c", "f", emjf.a});
        }
        if (ordinal == 3) {
            return new emiu();
        }
        if (ordinal == 4) {
            return new emir();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emiu.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
