package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esdx extends eyfy implements eyht {
    public static final esdx a;
    private static volatile eyhz i;
    public int b;
    public Object d;
    public erur e;
    public int f;
    public esof h;
    public int c = 0;
    public String g = "";

    static {
        esdx esdxVar = new esdx();
        a = esdxVar;
        eyfy.registerDefaultInstance(esdx.class, esdxVar);
    }

    private esdx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003Ȉ\u0005<\u0000\u0006ဉ\u0001", new Object[]{"d", "c", "b", "e", "f", "g", escl.class, "h"});
        }
        if (ordinal == 3) {
            return new esdx();
        }
        if (ordinal == 4) {
            return new esdv();
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
        synchronized (esdx.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
