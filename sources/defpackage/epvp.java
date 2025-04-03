package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epvp extends eyfy implements eyht {
    public static final epvp a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public int d;
    public int e;
    public epvj f;
    public epvj g;
    public epvj h;
    public eygr i;

    static {
        epvp epvpVar = new epvp();
        a = epvpVar;
        eyfy.registerDefaultInstance(epvp.class, epvpVar);
    }

    private epvp() {
        emptyProtobufList();
        this.i = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0006\b\u001b\tဉ\u0005", new Object[]{"b", "c", epvn.a, "d", epvl.a, "e", epvm.a, "f", "h", "i", epvd.class, "g"});
        }
        if (ordinal == 3) {
            return new epvp();
        }
        if (ordinal == 4) {
            return new epvk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epvp.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
