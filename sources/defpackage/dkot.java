package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkot implements dkwc {
    public dkov a;
    public String b;
    public final ffbr c;
    public final ffbr d;
    private List e;

    public dkot(ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    public final dkov a() {
        if (this.a == null) {
            this.a = (dkov) this.d.b();
        }
        return this.a;
    }

    public final List b() {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        return this.e;
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("", "entity", str);
        }
        dkov dkovVar = this.a;
        if (dkovVar != null) {
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcspushlocation");
            xmlSerializer.attribute("", "id", dkovVar.a);
            String str2 = dkovVar.b;
            if (str2 != null) {
                xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, str2);
            }
            dkxl dkxlVar = dkovVar.d;
            if (dkxlVar != null) {
                dkxlVar.c(xmlSerializer);
            }
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "timestamp");
            xmlSerializer.text(dkwd.a(new Date(dkovVar.c)));
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "timestamp");
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcspushlocation");
        }
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dkwo) this.c.b()).b(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
    }
}
