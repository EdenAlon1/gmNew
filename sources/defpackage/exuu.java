package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exuu extends eyfy implements eyht {
    public static final exuu a;
    private static volatile eyhz j;
    public int b;
    public String c = "";
    public exvt d;
    public eygr e;
    public exvn f;
    public int g;
    public eygi h;
    public int i;

    static {
        exuu exuuVar = new exuu();
        a = exuuVar;
        eyfy.registerDefaultInstance(exuu.class, exuuVar);
    }

    private exuu() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.h = emptyIntList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0012\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဉ\u0001\bဉ\u0004\t᠌\u0005\u000bࠬ\u000f᠌\t\u0012\u001b", new Object[]{"b", "c", "d", "f", "g", exxh.a, "h", exxv.a, "i", exye.a, "e", exvv.class});
        }
        if (ordinal == 3) {
            return new exuu();
        }
        if (ordinal == 4) {
            return new exut();
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
        synchronized (exuu.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
