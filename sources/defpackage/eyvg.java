package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyvg extends eyfy implements eyht {
    public static final eyvg a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public eygr h = eyfy.emptyProtobufList();

    static {
        eyvg eyvgVar = new eyvg();
        a = eyvgVar;
        eyfy.registerDefaultInstance(eyvg.class, eyvgVar);
    }

    private eyvg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006\u001a", new Object[]{"b", "c", "d", eyvf.a, "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new eyvg();
        }
        if (ordinal == 4) {
            return new eyve();
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
        synchronized (eyvg.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
