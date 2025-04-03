package defpackage;

import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtw {
    private static final Charset f = Charset.forName("UTF-8");
    public final fgzb a;
    protected fgum b;
    protected fgut c;
    protected fgut d;
    protected fgwo e;
    private final fgtx g;
    private final fgug h;
    private List i;

    public fgtw() {
        fgtx a = fgty.a.a();
        fgyv fgyvVar = new fgyv();
        fgwk fgwkVar = new fgwk();
        fgzb a2 = fgzc.a.a();
        this.g = a;
        this.a = a2;
        this.h = new fgtv(this, fguu.a, fgyvVar, fgwkVar);
    }

    public static final void b(fgwo fgwoVar) {
        if (fgwoVar == null) {
            throw new fgus("Expected property not initialised");
        }
    }

    private final void c() {
        fgza a;
        for (fgwo fgwoVar : this.i) {
            fgvi b = fgwoVar.b("TZID");
            if (b != null && (a = this.a.a(b.a())) != null) {
                String a2 = fgwoVar.a();
                if (fgwoVar instanceof fhck) {
                    ((fhck) fgwoVar).e(a);
                } else if (fgwoVar instanceof fhcj) {
                    ((fhcj) fgwoVar).d(a);
                }
                try {
                    fgwoVar.c(a2);
                } catch (URISyntaxException e) {
                    throw new fgus(e);
                } catch (ParseException e2) {
                    throw new fgus(e2);
                }
            }
        }
    }

    public final fgum a(InputStream inputStream) {
        fguj fgujVar = new fguj(new InputStreamReader(inputStream, f));
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.i = new ArrayList();
        StreamTokenizer streamTokenizer = new StreamTokenizer(fgujVar);
        fgug fgugVar = this.h;
        fgtx fgtxVar = this.g;
        try {
            streamTokenizer.resetSyntax();
            streamTokenizer.wordChars(32, PrivateKeyType.INVALID);
            streamTokenizer.whitespaceChars(0, 20);
            streamTokenizer.ordinaryChar(58);
            streamTokenizer.ordinaryChar(59);
            streamTokenizer.ordinaryChar(61);
            streamTokenizer.ordinaryChar(9);
            streamTokenizer.eolIsSignificant(true);
            streamTokenizer.whitespaceChars(0, 0);
            streamTokenizer.quoteChar(34);
            ((fguf) fgtxVar).c(streamTokenizer, fgujVar, VCardConstants.PROPERTY_BEGIN, true);
            ((fguf) fgtxVar).b(streamTokenizer, fgujVar, 58);
            ((fguf) fgtxVar).c(streamTokenizer, fgujVar, "VCALENDAR", true);
            ((fguf) fgtxVar).b(streamTokenizer, fgujVar, 10);
            ((fgtv) fgugVar).d.b = new fgum();
            ((fguf) fgtxVar).d.a(streamTokenizer, fgujVar, fgugVar);
            fgtz fgtzVar = ((fguf) fgtxVar).b;
            while (VCardConstants.PROPERTY_BEGIN.equalsIgnoreCase(streamTokenizer.sval)) {
                fgtzVar.a.c.a(streamTokenizer, fgujVar, fgugVar);
                fgtzVar.a.a(streamTokenizer, fgujVar);
            }
            ((fguf) fgtxVar).b(streamTokenizer, fgujVar, 58);
            ((fguf) fgtxVar).c(streamTokenizer, fgujVar, "VCALENDAR", true);
            if (this.i.size() > 0) {
                c();
            }
            return this.b;
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            if (e instanceof fgui) {
                throw ((fgui) e);
            }
            throw new fgui(e.getMessage(), fguf.d(streamTokenizer, fgujVar), e);
        }
    }
}
