package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eynk extends eyfy implements eyht {
    public static final eynk a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public eyos d;

    static {
        eynk eynkVar = new eynk();
        a = eynkVar;
        eyfy.registerDefaultInstance(eynk.class, eynkVar);
    }

    private eynk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", eyni.class, "d"});
        }
        if (ordinal == 3) {
            return new eynk();
        }
        if (ordinal == 4) {
            return new eynj();
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
        synchronized (eynk.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
