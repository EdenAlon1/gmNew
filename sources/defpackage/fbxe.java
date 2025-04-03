package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbxe extends eyfy implements eyht {
    public static final fbxe a;
    private static volatile eyhz d;
    public long b;
    public boolean c;

    static {
        fbxe fbxeVar = new fbxe();
        a = fbxeVar;
        eyfy.registerDefaultInstance(fbxe.class, fbxeVar);
    }

    private fbxe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fbxe();
        }
        if (ordinal == 4) {
            return new fbxd();
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
        synchronized (fbxe.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
