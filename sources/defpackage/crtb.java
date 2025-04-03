package defpackage;

import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class crtb {
    public static final Charset a = Charset.forName("UTF-8");
    public final fgtx b;
    public final fgug c;
    public final fgzb d;
    public List e;
    protected fgum f;
    protected fgut g;
    protected fgut h;
    protected fgwo i;

    public crtb(fgtx fgtxVar, fgyv fgyvVar, fgwk fgwkVar, fgzb fgzbVar) {
        this.b = fgtxVar;
        this.d = fgzbVar;
        this.c = new crta(this, fguu.a, fgyvVar, fgwkVar);
    }

    public static void a(fgwo fgwoVar) {
        if (fgwoVar == null) {
            throw new fgus("Expected property not initialised");
        }
    }

    public final void b() {
        fgza a2;
        for (fgwo fgwoVar : this.e) {
            fgvi b = fgwoVar.b("TZID");
            if (b != null && (a2 = this.d.a(b.a())) != null) {
                String a3 = fgwoVar.a();
                if (fgwoVar instanceof fhck) {
                    ((fhck) fgwoVar).e(a2);
                } else if (fgwoVar instanceof fhcj) {
                    ((fhcj) fgwoVar).d(a2);
                }
                try {
                    fgwoVar.c(a3);
                } catch (URISyntaxException | ParseException e) {
                    throw new fgus(e);
                }
            }
        }
    }
}
