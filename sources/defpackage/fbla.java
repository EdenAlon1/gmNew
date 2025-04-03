package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbla extends eyfy implements eyht {
    public static final fbla a;
    private static volatile eyhz f;
    public boolean c;
    public boolean d;
    public eyee b = eyee.b;
    public eygi e = emptyIntList();

    static {
        fbla fblaVar = new fbla();
        a = fblaVar;
        eyfy.registerDefaultInstance(fbla.class, fblaVar);
    }

    private fbla() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\n\u0002\u0007\u0003\u0007\u0004,", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fbla();
        }
        if (ordinal == 4) {
            return new fbkz();
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
        synchronized (fbla.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
