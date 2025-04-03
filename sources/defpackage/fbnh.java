package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnh extends eyfy implements eyht {
    public static final fbnh a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();

    static {
        fbnh fbnhVar = new fbnh();
        a = fbnhVar;
        eyfy.registerDefaultInstance(fbnh.class, fbnhVar);
    }

    private fbnh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u001b", new Object[]{"b", "c", "d", fbnt.class});
        }
        if (ordinal == 3) {
            return new fbnh();
        }
        if (ordinal == 4) {
            return new fbng();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbnh.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
