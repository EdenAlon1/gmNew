package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemz {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = eels.a;
    private static final int c = eels.a.length;

    public static eelv a(InputStream inputStream) {
        eelv eelxVar;
        int i;
        if (!inputStream.markSupported()) {
            throw new IOException("SipMessageParser requires markable streams");
        }
        String a2 = dkth.a(inputStream);
        if (a2.length() == 0) {
            if (inputStream.available() == 0) {
                return new eels();
            }
            int i2 = c;
            inputStream.mark(i2);
            byte[] bArr = new byte[i2];
            inputStream.read(bArr, 0, i2);
            if (Arrays.equals(bArr, b)) {
                return new eelr();
            }
            inputStream.reset();
            return new eels();
        }
        if (a2.startsWith("SIP/2.0")) {
            String concat = a2.concat("\n");
            eemq eemqVar = new eemq();
            eemqVar.a = new eemn("status_lineLexer", concat);
            eemqVar.h();
            eemqVar.a.h();
            try {
                int parseInt = Integer.parseInt(eemqVar.a.d());
                eemqVar.a.h();
                String c2 = eemqVar.a.c();
                if (c2 == null) {
                    throw new eeje("Rest is null");
                }
                String trim = c2.trim();
                eemqVar.a.h();
                eelxVar = new eelx(new eelk(parseInt, trim));
            } catch (NumberFormatException e) {
                String str = eemqVar.a.f + ":" + e.getMessage();
                int i3 = eemqVar.a.g;
                throw new eeje(str);
            }
        } else {
            String concat2 = a2.concat("\n");
            eemq eemqVar2 = new eemq();
            eemqVar2.a = new eemn("method_keywordLexer", concat2);
            String g = eemqVar2.g();
            eemqVar2.a.h();
            eemqVar2.a.j("sip_urlLexer");
            eeit e2 = new eenb((eemn) eemqVar2.a).e();
            eemqVar2.a.h();
            eemqVar2.a.j("request_lineLexer");
            eemqVar2.h();
            eemqVar2.a.h();
            eemqVar2.a.a(10);
            eelxVar = new eelw(new eelf(g, e2));
        }
        String a3 = dkth.a(inputStream);
        while (a3.trim().length() > 0) {
            eemm a4 = eemr.a(a3.concat("\n"));
            if (a4 == null) {
                throw new eeje("Header Parser is null");
            }
            try {
                eelxVar.k(a4.b());
                a3 = dkth.a(inputStream);
            } catch (IllegalArgumentException | StringIndexOutOfBoundsException e3) {
                throw new eeje("Unable to parse SIP header:".concat(String.valueOf(e3.getMessage())));
            }
        }
        eekn eeknVar = eelxVar.i;
        if (eeknVar != null && (i = eeknVar.a) > 0) {
            byte[] bArr2 = new byte[i];
            int read = inputStream.read(bArr2);
            while (read < i) {
                try {
                    read += inputStream.read(bArr2, read, i - read);
                } catch (IndexOutOfBoundsException e4) {
                    throw new eeje(String.format("At byte:[%d] of [%d] Unable to read content from SIP message: %s", Integer.valueOf(read), Integer.valueOf(i), e4.getMessage()));
                }
            }
            eelxVar.n(bArr2);
        }
        return eelxVar;
    }
}
