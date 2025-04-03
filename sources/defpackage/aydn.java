package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydn extends eyfy implements eyht {
    public static final aydn a;
    private static volatile eyhz g;
    public int b;
    public eygr c = emptyProtobufList();
    public int d;
    public int e;
    public int f;

    static {
        aydn aydnVar = new aydn();
        a = aydnVar;
        eyfy.registerDefaultInstance(aydn.class, aydnVar);
    }

    private aydn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0005ဌ\u0002", new Object[]{"b", "c", ayeb.class, "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new aydn();
        }
        if (ordinal == 4) {
            return new aydm();
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
        synchronized (aydn.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
