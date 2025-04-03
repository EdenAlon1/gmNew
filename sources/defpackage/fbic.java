package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbic extends eyfy implements eyht {
    public static final fbic a;
    private static volatile eyhz c;
    public eygl b = emptyLongList();

    static {
        fbic fbicVar = new fbic();
        a = fbicVar;
        eyfy.registerDefaultInstance(fbic.class, fbicVar);
    }

    private fbic() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fbic();
        }
        if (ordinal == 4) {
            return new fbib();
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
        synchronized (fbic.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
