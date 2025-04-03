package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class fbek extends eyfy implements eyht {
    public static final fbek a;
    private static volatile eyhz c;
    public int b;

    static {
        fbek fbekVar = new fbek();
        a = fbekVar;
        eyfy.registerDefaultInstance(fbek.class, fbekVar);
    }

    private fbek() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u0004", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fbek();
        }
        if (ordinal == 4) {
            return new fbej();
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
        synchronized (fbek.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
