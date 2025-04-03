package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblz extends eyfy implements eyht {
    public static final fblz a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        fblz fblzVar = new fblz();
        a = fblzVar;
        eyfy.registerDefaultInstance(fblz.class, fblzVar);
    }

    private fblz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", fbnb.class});
        }
        if (ordinal == 3) {
            return new fblz();
        }
        if (ordinal == 4) {
            return new fbly();
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
        synchronized (fblz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
