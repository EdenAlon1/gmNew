package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyp extends eyfy implements eyht {
    public static final awyp a;
    private static volatile eyhz e;
    public int b;
    public boolean c = true;
    public eyev d;

    static {
        awyp awypVar = new awyp();
        a = awypVar;
        eyfy.registerDefaultInstance(awyp.class, awypVar);
    }

    private awyp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new awyp();
        }
        if (ordinal == 4) {
            return new awyo();
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
        synchronized (awyp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
