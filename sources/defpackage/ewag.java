package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewag extends eyfy implements eyht {
    public static final ewag a;
    private static volatile eyhz j;
    public int b;
    public evyp c;
    public int d;
    public boolean e;
    public boolean g;
    public int i;
    public eygr f = emptyProtobufList();
    public eygr h = emptyProtobufList();

    static {
        ewag ewagVar = new ewag();
        a = ewagVar;
        eyfy.registerDefaultInstance(ewag.class, ewagVar);
    }

    private ewag() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002င\u0001\u0003\u001b\u0005ဇ\u0004\u0006\u001b\u0007᠌\u0005\tဇ\u0002", new Object[]{"b", "c", "d", "f", evye.class, "g", "h", evzw.class, "i", ewad.a, "e"});
        }
        if (ordinal == 3) {
            return new ewag();
        }
        if (ordinal == 4) {
            return new ewaf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewag.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
