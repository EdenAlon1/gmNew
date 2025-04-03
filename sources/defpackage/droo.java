package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class droo extends eyfy implements eyht {
    public static final droo a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public doyy e;
    public doyi f;
    public drqs g;

    static {
        droo drooVar = new droo();
        a = drooVar;
        eyfy.registerDefaultInstance(droo.class, drooVar);
    }

    private droo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001dË\u0007\u0000\u0000\u0000dဉ\u0000eဉ\u0001fဉ\u0002È<\u0000É<\u0000Ê<\u0000Ë<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", drog.class, drol.class, dron.class, droa.class});
        }
        if (ordinal == 3) {
            return new droo();
        }
        if (ordinal == 4) {
            return new drnu();
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
        synchronized (droo.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
