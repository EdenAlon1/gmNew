package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exwr extends eyfy implements eyht {
    public static final exwr a;
    private static volatile eyhz d;
    public String b;
    public exwq c;
    private int e;

    static {
        exwr exwrVar = new exwr();
        a = exwrVar;
        eyfy.registerDefaultInstance(exwr.class, exwrVar);
    }

    private exwr() {
        emptyProtobufList();
        this.b = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\f\r\u0002\u0000\u0000\u0000\fဈ\n\rဉ\u000b", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new exwr();
        }
        if (ordinal == 4) {
            return new exwo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exwr.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
