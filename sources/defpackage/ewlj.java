package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewlj extends eyfy implements eyht {
    public static final ewlj a;
    private static volatile eyhz h;
    public int b;
    public Object d;
    public ewjg e;
    public ewlr g;
    public int c = 0;
    public String f = "";

    static {
        ewlj ewljVar = new ewlj();
        a = ewljVar;
        eyfy.registerDefaultInstance(ewlj.class, ewljVar);
    }

    private ewlj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003;\u0000\u0004:\u0000\u0005ဉ\u0002", new Object[]{"d", "c", "b", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ewlj();
        }
        if (ordinal == 4) {
            return new ewli();
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
        synchronized (ewlj.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
