package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmn extends eyfy implements eyht {
    public static final fbmn a;
    private static volatile eyhz e;
    public eygr b = emptyProtobufList();
    public int c;
    public int d;

    static {
        fbmn fbmnVar = new fbmn();
        a = fbmnVar;
        eyfy.registerDefaultInstance(fbmn.class, fbmnVar);
    }

    private fbmn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003\f", new Object[]{"b", fbml.class, "c", "d"});
        }
        if (ordinal == 3) {
            return new fbmn();
        }
        if (ordinal == 4) {
            return new fbmm();
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
        synchronized (fbmn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
