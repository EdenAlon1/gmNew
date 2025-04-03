package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezuc extends eyfy implements eyht {
    public static final ezuc a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public long e;
    private Object h;
    public int c = 0;
    private int g = 0;
    private byte i = 2;

    static {
        ezuc ezucVar = new ezuc();
        a = ezucVar;
        eyfy.registerDefaultInstance(ezuc.class, ezucVar);
    }

    private ezuc() {
    }

    public static /* synthetic */ void a(ezuc ezucVar) {
        ezucVar.g = 10;
        ezucVar.h = 1;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001T\u0002\u0001\u0001΄T\u0000\u0000\u0004\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bဃ\u0000\t<\u0000\n>\u0001\u000bм\u0000!<\u0000\"<\u0000#<\u0000$=\u0000%<\u0000&<\u0000'<\u0000(<\u0000+<\u0000,<\u0000-<\u0000.<\u0000/<\u00000<\u00001<\u00002=\u00003<\u00004<\u00005м\u00006<\u00007<\u00008<\u00009<\u0000<<\u0000=<\u0000><\u0000?<\u0000@<\u0000A<\u0000B<\u0000C<\u0000D<\u0000E<\u0000F<\u0000G<\u0000Hм\u0000I<\u0000J<\u0000K<\u0000L<\u0000M<\u0000N<\u0000P<\u0000Q<\u0000R<\u0000S<\u0000T<\u0000V<\u0000X<\u0000Y<\u0000Z<\u0000[<\u0000\\<\u0000]<\u0000^<\u0000_<\u0000`<\u0000a<\u0000c<\u0000d<\u0000e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000k<\u0000m<\u0000n<\u0000o<\u0000pм\u0000q<\u0000r<\u0000s<\u0000΄<\u0000", new Object[]{"d", "c", "h", "g", "b", ezqq.class, ezsg.class, ezri.class, ezqa.class, ezqe.class, eztq.class, "e", ezse.class, ezun.class, ezty.class, ezqs.class, ezue.class, ezso.class, ezpo.class, ezpk.class, ezsa.class, ezsc.class, eztw.class, ezts.class, ezur.class, ezrs.class, ezpw.class, ezru.class, ezpy.class, ezqu.class, ezra.class, ezsu.class, ezsk.class, ezre.class, ezrc.class, ezuk.class, ezsi.class, ezvh.class, ezqw.class, ezqi.class, ezvf.class, ezsm.class, ezqg.class, ezti.class, ezui.class, ezrg.class, ezqy.class, ezqm.class, ezrm.class, ezsq.class, ezss.class, ezqo.class, ezpe.class, ezut.class, ezps.class, ezpu.class, ezup.class, ezpi.class, eztk.class, ezpm.class, ezrq.class, ezug.class, ezta.class, ezpg.class, ezro.class, eztm.class, ezto.class, ezqk.class, eztg.class, ezte.class, ezuz.class, ezux.class, ezvd.class, ezvb.class, ezuv.class, ezsw.class, ezsy.class, eztc.class, ezqc.class, ezrw.class, ezry.class, ezvj.class, ezur.class, ezpq.class, ezrk.class, eztu.class});
            case NEW_MUTABLE_INSTANCE:
                return new ezuc();
            case NEW_BUILDER:
                return new ezub();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezuc.class) {
                    eyhzVar = f;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        f = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
