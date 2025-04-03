package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbku extends eyfy implements eyht {
    public static final fbku a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public eyee d = eyee.b;

    static {
        fbku fbkuVar = new fbku();
        a = fbkuVar;
        eyfy.registerDefaultInstance(fbku.class, fbkuVar);
    }

    private fbku() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0002\u000b\u0003\u0000\u0000\u0000\u0002\n\n<\u0000\u000bȻ\u0000", new Object[]{"c", "b", "d", fceo.class});
        }
        if (ordinal == 3) {
            return new fbku();
        }
        if (ordinal == 4) {
            return new fbkt();
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
        synchronized (fbku.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
