package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezzt extends eyfy implements eyht {
    public static final ezzt a;
    private static volatile eyhz i;
    public int b;
    public ezyz c;
    public ezxv d;
    public ezxz e;
    public ezzv f;
    public eygr g = emptyProtobufList();
    public eygi h = emptyIntList();

    static {
        ezzt ezztVar = new ezzt();
        a = ezztVar;
        eyfy.registerDefaultInstance(ezzt.class, ezztVar);
    }

    private ezzt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0007,", new Object[]{"b", "c", "d", "e", "f", "g", faab.class, "h"});
        }
        if (ordinal == 3) {
            return new ezzt();
        }
        if (ordinal == 4) {
            return new ezzs();
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
        synchronized (ezzt.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
