package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exir extends eyfy implements eyht {
    public static final exir a;
    private static volatile eyhz am;
    public int A;
    public int C;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public exii R;
    public fauw U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public exim ag;
    public exik ah;
    public exht aj;
    public exhh ak;
    public exhb al;
    public int b;
    public int c;
    public fauw f;
    public fauw i;
    public exio o;
    public fauu p;
    public evjs q;
    public double r;
    public exii v;
    public int w;
    public int z;
    public String d = "";
    public String e = "";
    public eygr g = eyfy.emptyProtobufList();
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public eygr n = emptyProtobufList();
    public String s = "";
    public String t = "";
    public eygr u = emptyProtobufList();
    public eygr x = emptyProtobufList();
    public String y = "";
    public eygr B = emptyProtobufList();
    public String D = "";
    public String E = "";
    public eygr S = emptyProtobufList();
    public eygr T = emptyProtobufList();
    public eygr ai = emptyProtobufList();

    static {
        exir exirVar = new exir();
        a = exirVar;
        eyfy.registerDefaultInstance(exir.class, exirVar);
    }

    private exir() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000=\u0000\u0002\u0001O=\u0000\b\u0000\u0001Ȉ\u0002Ȉ\u0005Ț\u0007Ȉ\bȈ\tȈ\n\u001b\u000bဉ\u0003\fဉ\u0004\rဉ\u0005\u000e\u0000\u000fȈ\u0010Ȉ\u0015ဉ\u0006\u0016င\u0007\u0018Ȉ\u0019\f\u001a\f\u001b\u001b\u001cင\t\u001dȈ\u001eȈ\u001fဉ\u0000 ဉ\u0001!ဇ\n\"ဇ\u000b#ဇ\f$ဇ\r&ဇ\u000e'ဇ\u000f(ဇ\u0010)ဇ\u0011*ဇ\u0012+ဇ\u0013,ဇ\u0014-ဇ\u0015.ဉ\u0016/\u001b1\u001b2Ȉ3Ȉ4ဉ\u00175\u001b6\u001b7ဇ\u00188ဇ\u00199ဇ\u001a:ဇ\u001b;ဇ\u001c<ဇ\u001d>ဇ\u001f?ဇ @ဇ!Aဇ\"Bဇ#Cဉ$Fဉ%G\u001bHဉ&Nဉ,Oဉ-", new Object[]{"b", "c", "d", "e", "g", "j", "k", "l", "n", exhv.class, "o", "p", "q", "r", "s", "t", "v", "w", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, exhx.class, "C", "D", "E", "f", "i", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N, "O", "P", "Q", "R", "S", exii.class, "T", exii.class, "h", "m", "U", "u", exix.class, "x", exhp.class, "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", exiq.class, "aj", "ak", "al"});
        }
        if (ordinal == 3) {
            return new exir();
        }
        if (ordinal == 4) {
            return new exhy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = am;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exir.class) {
            eyhzVar = am;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                am = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
