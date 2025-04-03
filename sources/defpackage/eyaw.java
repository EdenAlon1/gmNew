package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyaw extends eyfy implements eyht {
    public static final eyaw a;
    private static volatile eyhz i;
    public int b;
    public eyas c;
    public exzp d;
    public exzp e;
    public int f;
    public float g = 1.0f;
    public boolean h;

    static {
        eyaw eyawVar = new eyaw();
        a = eyawVar;
        eyfy.registerDefaultInstance(eyaw.class, eyawVar);
    }

    private eyaw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0006ခ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", eyau.a, "g", "h"});
        }
        if (ordinal == 3) {
            return new eyaw();
        }
        if (ordinal == 4) {
            return new eyat();
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
        synchronized (eyaw.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
