package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyl extends eyfy implements eyht {
    public static final awyl a;
    private static volatile eyhz h;
    public int b;
    public awwf c;
    public eygr d = emptyProtobufList();
    public eyee e = eyee.b;
    public awui f;
    public axad g;

    static {
        awyl awylVar = new awyl();
        a = awylVar;
        eyfy.registerDefaultInstance(awyl.class, awylVar);
    }

    private awyl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဉ\u0002\nဉ\u0003", new Object[]{"b", "c", "d", awui.class, "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new awyl();
        }
        if (ordinal == 4) {
            return new awyk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awyl.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
