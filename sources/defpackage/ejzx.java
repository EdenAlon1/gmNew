package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzx extends eyfy implements eyht {
    public static final ejzx a;
    private static volatile eyhz j;
    public int b;
    public String c = "";
    public String d = "";
    public eyee e = eyee.b;
    public eygr f = emptyProtobufList();
    public eygr g = eyfy.emptyProtobufList();
    public int h;
    public long i;

    static {
        ejzx ejzxVar = new ejzx();
        a = ejzxVar;
        eyfy.registerDefaultInstance(ejzx.class, ejzxVar);
    }

    private ejzx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004\u001b\u0005\u001a\u0006ဆ\u0003\u0007စ\u0004", new Object[]{"b", "c", "d", "e", "f", ekab.class, "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new ejzx();
        }
        if (ordinal == 4) {
            return new ejzw();
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
        synchronized (ejzx.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
