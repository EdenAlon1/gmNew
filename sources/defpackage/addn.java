package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addn extends eyfy implements eyht {
    public static final addn a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public int d;

    static {
        addn addnVar = new addn();
        a = addnVar;
        eyfy.registerDefaultInstance(addn.class, addnVar);
    }

    private addn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0004", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new addn();
        }
        if (ordinal == 4) {
            return new addm();
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
        synchronized (addn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
