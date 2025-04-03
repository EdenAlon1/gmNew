package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awuw extends eyfy implements eyht {
    public static final awuw a;
    private static volatile eyhz k;
    public int b;
    public awui f;
    public awwj i;
    public axad j;
    public String c = "";
    public String d = "";
    public String e = "";
    public eygr g = emptyProtobufList();
    public eyee h = eyee.b;

    static {
        awuw awuwVar = new awuw();
        a = awuwVar;
        eyfy.registerDefaultInstance(awuw.class, awuwVar);
    }

    private awuw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004\u001b\u0005ည\u0004\u0006ဉ\u0005\u0007ဈ\u0002\bဉ\u0006", new Object[]{"b", "c", "d", "f", "g", awui.class, "h", "i", "e", "j"});
        }
        if (ordinal == 3) {
            return new awuw();
        }
        if (ordinal == 4) {
            return new awuv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awuw.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
