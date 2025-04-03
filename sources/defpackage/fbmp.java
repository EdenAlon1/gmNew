package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmp extends eyfy implements eyht {
    public static final fbmp a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public int c;

    static {
        fbmp fbmpVar = new fbmp();
        a = fbmpVar;
        eyfy.registerDefaultInstance(fbmp.class, fbmpVar);
    }

    private fbmp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"b", fbmx.class, "c"});
        }
        if (ordinal == 3) {
            return new fbmp();
        }
        if (ordinal == 4) {
            return new fbmo();
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
        synchronized (fbmp.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
