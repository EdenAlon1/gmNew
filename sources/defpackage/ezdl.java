package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezdl extends eyfy implements eyht {
    public static final ezdl a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public String d = "";
    public eygr e = emptyProtobufList();
    public int f;
    public boolean g;

    static {
        ezdl ezdlVar = new ezdl();
        a = ezdlVar;
        eyfy.registerDefaultInstance(ezdl.class, ezdlVar);
    }

    private ezdl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဆ\u0002\u0005ဇ\u0003", new Object[]{"b", "c", ezdk.a, "d", "e", ezdi.class, "f", "g"});
        }
        if (ordinal == 3) {
            return new ezdl();
        }
        if (ordinal == 4) {
            return new ezdj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezdl.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
