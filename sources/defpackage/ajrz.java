package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajrz extends eyfy implements eyht {
    public static final ajrz a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        ajrz ajrzVar = new ajrz();
        a = ajrzVar;
        eyfy.registerDefaultInstance(ajrz.class, ajrzVar);
    }

    private ajrz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\f\u0003\u0000\u0000\u0000\u0001Ȉ\u000bȻ\u0000\f<\u0000", new Object[]{"c", "b", "d", ajrr.class});
        }
        if (ordinal == 3) {
            return new ajrz();
        }
        if (ordinal == 4) {
            return new ajry();
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
        synchronized (ajrz.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
