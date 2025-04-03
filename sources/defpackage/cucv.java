package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cucv extends eyfy implements eyht {
    public static final cucv a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public String d = "";

    static {
        cucv cucvVar = new cucv();
        a = cucvVar;
        eyfy.registerDefaultInstance(cucv.class, cucvVar);
    }

    private cucv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003Ȉ", new Object[]{"b", "c", cudj.class, "d"});
        }
        if (ordinal == 3) {
            return new cucv();
        }
        if (ordinal == 4) {
            return new cucu();
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
        synchronized (cucv.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
