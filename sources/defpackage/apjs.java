package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apjs extends eyfy implements eyht {
    public static final apjs a;
    private static volatile eyhz i;
    public int b;
    public double c;
    public double d;
    public float e;
    public double f;
    public float g;
    public eyja h;

    static {
        apjs apjsVar = new apjs();
        a = apjsVar;
        eyfy.registerDefaultInstance(apjs.class, apjsVar);
    }

    private apjs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0001\u0004က\u0000\u0005ခ\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new apjs();
        }
        if (ordinal == 4) {
            return new apjr();
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
        synchronized (apjs.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
