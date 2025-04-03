package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erfv extends eyfy implements eyht {
    public static final erfv a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public erfr f;
    public erfp g;
    public erhi h;

    static {
        erfv erfvVar = new erfv();
        a = erfvVar;
        eyfy.registerDefaultInstance(erfv.class, erfvVar);
    }

    private erfv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0006ဉ\u0005\bဉ\u0007\rဉ\f", new Object[]{"b", "c", erft.a, "d", erfu.a, "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new erfv();
        }
        if (ordinal == 4) {
            return new erfs();
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
        synchronized (erfv.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
