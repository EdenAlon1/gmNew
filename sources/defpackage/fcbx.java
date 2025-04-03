package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcbx extends eyfy implements eyht {
    public static final fcbx a;
    private static volatile eyhz g;
    public int b;
    public fcfo c;
    public fcek d;
    public fcbr e;
    public fbzp f;

    static {
        fcbx fcbxVar = new fcbx();
        a = fcbxVar;
        eyfy.registerDefaultInstance(fcbx.class, fcbxVar);
    }

    private fcbx() {
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
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0006\u001a\u0004\u0000\u0000\u0000\u0006ဉ\u0000\nဉ\u0001\u0012ဉ\u0002\u001aဉ\u0006", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fcbx();
        }
        if (ordinal == 4) {
            return new fcbw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcbx.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
