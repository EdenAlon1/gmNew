package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfjm extends eyfy implements eyht {
    public static final dfjm a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public eygr d = emptyProtobufList();

    static {
        dfjm dfjmVar = new dfjm();
        a = dfjmVar;
        eyfy.registerDefaultInstance(dfjm.class, dfjmVar);
    }

    private dfjm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"b", "c", "d", dfix.class});
        }
        if (ordinal == 3) {
            return new dfjm();
        }
        if (ordinal == 4) {
            return new dfjl();
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
        synchronized (dfjm.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
