package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewez extends eyfy implements eyht {
    public static final ewez a;
    private static volatile eyhz d;
    public eyee b = eyee.b;
    public int c;

    static {
        ewez ewezVar = new ewez();
        a = ewezVar;
        eyfy.registerDefaultInstance(ewez.class, ewezVar);
    }

    private ewez() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\n\u0003\f", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ewez();
        }
        if (ordinal == 4) {
            return new ewey();
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
        synchronized (ewez.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
