package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwti extends eyfy implements eyht {
    public static final dwti a;
    private static volatile eyhz e;
    public eyhm b = eyhm.a;
    public eyhm c = eyhm.a;
    public eygr d = emptyProtobufList();

    static {
        dwti dwtiVar = new dwti();
        a = dwtiVar;
        eyfy.registerDefaultInstance(dwti.class, dwtiVar);
    }

    private dwti() {
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
            return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"b", dwtg.a, "c", dwth.a, "d", dwso.class});
        }
        if (ordinal == 3) {
            return new dwti();
        }
        if (ordinal == 4) {
            return new dwtf();
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
        synchronized (dwti.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
