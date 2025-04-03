package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cucl extends eyfy implements eyht {
    public static final cucl a;
    private static volatile eyhz e;
    public int b;
    public float c;
    public int d;

    static {
        cucl cuclVar = new cucl();
        a = cuclVar;
        eyfy.registerDefaultInstance(cucl.class, cuclVar);
    }

    private cucl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cucl();
        }
        if (ordinal == 4) {
            return new cucj();
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
        synchronized (cucl.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
