package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbho extends eyfy implements eyht {
    public static final fbho a;
    private static volatile eyhz d;
    public eygr b = eyfy.emptyProtobufList();
    public eygr c = eyfy.emptyProtobufList();

    static {
        fbho fbhoVar = new fbho();
        a = fbhoVar;
        eyfy.registerDefaultInstance(fbho.class, fbhoVar);
    }

    private fbho() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fbho();
        }
        if (ordinal == 4) {
            return new fbhn();
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
        synchronized (fbho.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
