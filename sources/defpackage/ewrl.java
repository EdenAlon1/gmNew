package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewrl extends eyfy implements eyht {
    public static final ewrl a;
    private static volatile eyhz c;
    public String b = "";

    static {
        ewrl ewrlVar = new ewrl();
        a = ewrlVar;
        eyfy.registerDefaultInstance(ewrl.class, ewrlVar);
    }

    private ewrl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new ewrl();
        }
        if (ordinal == 4) {
            return new ewrk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewrl.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
