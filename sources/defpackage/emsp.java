package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsp extends eyfy implements eyht {
    public static final emsp a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public emto h;

    static {
        emsp emspVar = new emsp();
        a = emspVar;
        eyfy.registerDefaultInstance(emsp.class, emspVar);
    }

    private emsp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005ဉ\u0000\u0007\u000b", new Object[]{"b", "c", "d", "e", "g", "h", "f"});
        }
        if (ordinal == 3) {
            return new emsp();
        }
        if (ordinal == 4) {
            return new emso();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emsp.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
