package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyyn extends eyfy implements eyht {
    public static final eyyn a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public eyyt d;
    public int e;
    public int f;
    public int g;
    public String h = "";

    static {
        eyyn eyynVar = new eyyn();
        a = eyynVar;
        eyfy.registerDefaultInstance(eyyn.class, eyynVar);
    }

    private eyyn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဈ\u0005", new Object[]{"b", "c", eyyj.a, "d", "e", eyyg.a, "f", eyym.a, "g", eyyk.a, "h"});
        }
        if (ordinal == 3) {
            return new eyyn();
        }
        if (ordinal == 4) {
            return new eyyi();
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
        synchronized (eyyn.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
