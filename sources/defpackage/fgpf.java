package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpf extends eyfy<fgpf, fgpc> implements eyht {
    public static final fgpf a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public int d;

    static {
        fgpf fgpfVar = new fgpf();
        a = fgpfVar;
        eyfy.registerDefaultInstance(fgpf.class, fgpfVar);
    }

    private fgpf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", fgpd.a});
        }
        if (ordinal == 3) {
            return new fgpf();
        }
        if (ordinal == 4) {
            return new fgpc();
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
        synchronized (fgpf.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
