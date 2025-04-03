package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fccr extends eyfy implements eyht {
    public static final fccr a;
    private static volatile eyhz f;
    public int b;
    public fcfo c;
    public eyee d = eyee.b;
    public fcek e;

    static {
        fccr fccrVar = new fccr();
        a = fccrVar;
        eyfy.registerDefaultInstance(fccr.class, fccrVar);
    }

    private fccr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fccr();
        }
        if (ordinal == 4) {
            return new fccq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fccr.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
