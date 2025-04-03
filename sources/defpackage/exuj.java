package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exuj extends eyfy implements eyht {
    public static final exuj a;
    private static volatile eyhz i;
    public int b;
    public exvx d;
    public exvn f;
    public String c = "";
    public eygr e = eyfy.emptyProtobufList();
    public String g = "";
    public String h = "";

    static {
        exuj exujVar = new exuj();
        a = exujVar;
        eyfy.registerDefaultInstance(exuj.class, exujVar);
    }

    private exuj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဉ\u0002\u0005ဈ\u0004\u0006ဉ\u0001\u0007ဈ\u0005", new Object[]{"b", "c", "e", "f", "g", "d", "h"});
        }
        if (ordinal == 3) {
            return new exuj();
        }
        if (ordinal == 4) {
            return new exui();
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
        synchronized (exuj.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
