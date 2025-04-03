package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezab extends eyfy implements eyht {
    public static final ezab a;
    private static volatile eyhz m;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";
    public eygr h = eyfy.emptyProtobufList();
    public String i = "";
    public int j;
    public boolean k;
    public int l;

    static {
        ezab ezabVar = new ezab();
        a = ezabVar;
        eyfy.registerDefaultInstance(ezab.class, ezabVar);
    }

    private ezab() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0005\u0005ဈ\u0006\u0006᠌\u0003\t\u001a\nဇ\t\u000bင\u0007\f᠌\n", new Object[]{"b", "c", eyzu.a, "d", eyzz.a, "e", eyzx.a, "g", "i", "f", eyzv.a, "h", "k", "j", "l", eyzs.a});
        }
        if (ordinal == 3) {
            return new ezab();
        }
        if (ordinal == 4) {
            return new eyzr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezab.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
