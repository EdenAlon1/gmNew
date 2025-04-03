package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewdn extends eyfy implements eyht {
    public static final ewdn a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        ewdn ewdnVar = new ewdn();
        a = ewdnVar;
        eyfy.registerDefaultInstance(ewdn.class, ewdnVar);
    }

    private ewdn() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0002\u0007\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0007\f", new Object[]{"c", "b", ewdl.class, ewcd.class, ewdf.class, "d"});
        }
        if (ordinal == 3) {
            return new ewdn();
        }
        if (ordinal == 4) {
            return new ewdm();
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
        synchronized (ewdn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
