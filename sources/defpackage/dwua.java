package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwua extends eyfy implements eyht {
    public static final dwua a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        dwua dwuaVar = new dwua();
        a = dwuaVar;
        eyfy.registerDefaultInstance(dwua.class, dwuaVar);
    }

    private dwua() {
    }

    public final eyhm a() {
        eyhm eyhmVar = this.b;
        if (!eyhmVar.b) {
            this.b = eyhmVar.a();
        }
        return this.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dwtz.a});
        }
        if (ordinal == 3) {
            return new dwua();
        }
        if (ordinal == 4) {
            return new dwty();
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
        synchronized (dwua.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
