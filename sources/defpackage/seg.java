package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seg extends eyfy implements eyht {
    public static final seg a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public float e;
    public sec f;

    static {
        seg segVar = new seg();
        a = segVar;
        eyfy.registerDefaultInstance(seg.class, segVar);
    }

    private seg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u000b\u0003\u000b\u0004\u0001\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new seg();
        }
        if (ordinal == 4) {
            return new sef();
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
        synchronized (seg.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
