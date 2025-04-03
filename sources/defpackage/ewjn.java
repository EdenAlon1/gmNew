package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewjn extends eyfy implements eyht {
    public static final ewjn a;
    private static volatile eyhz e;
    public ewmd c;
    private int f;
    public String b = "";
    public eygr d = emptyProtobufList();

    static {
        ewjn ewjnVar = new ewjn();
        a = ewjnVar;
        eyfy.registerDefaultInstance(ewjn.class, ewjnVar);
    }

    private ewjn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"f", "b", "c", "d", ewkn.class});
        }
        if (ordinal == 3) {
            return new ewjn();
        }
        if (ordinal == 4) {
            return new ewjm();
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
        synchronized (ewjn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
