package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyb implements dkwc {
    private List a;
    private List b;
    private dkwy c;
    private Date d;
    private Date e;
    private final ffbr f;

    public dkyb(ffbr ffbrVar) {
        this.f = ffbrVar;
    }

    public final String a() {
        dkwy dkwyVar = this.c;
        if (dkwyVar == null) {
            return null;
        }
        return dkwyVar.a;
    }

    public final List b() {
        if (this.a == null) {
            this.a = new ArrayList(3);
        }
        return this.a;
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:rpid", "place-type");
        Date date = this.e;
        if (date != null && this.d != null) {
            xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:rpid", "from", dkwd.a(date));
            xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:rpid", "until", dkwd.a(this.d));
        }
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dkwy) it.next()).a(xmlSerializer, "urn:ietf:params:xml:ns:pidf:rpid");
            }
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:rpid", "other");
            xmlSerializer.text(this.c.a);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:rpid", "other");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:rpid", "place-type");
    }

    public final List d() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    public final void e(Document document, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("urn:ietf:params:xml:ns:pidf:rpid", "from");
        if (attributeValue != null) {
            this.e = dkwd.b(attributeValue);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("urn:ietf:params:xml:ns:pidf:rpid", "until");
        if (attributeValue2 != null) {
            this.d = dkwd.b(attributeValue2);
        }
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        while (true) {
            if ((nextTag == 3) && name.equals("place-type")) {
                return;
            }
            if (!"urn:ietf:params:xml:ns:pidf:rpid".equals(namespace)) {
                b().add(((dkwo) this.f.b()).a(document, new QName(namespace, name), xmlPullParser));
            } else if ("note".equals(name)) {
                dkwy dkwyVar = new dkwy();
                dkwyVar.b(xmlPullParser);
                d().add(dkwyVar);
            } else if ("other".equals(name)) {
                this.c = new dkwy(xmlPullParser.nextText());
            } else {
                b().add(((dkwo) this.f.b()).a(document, new QName(namespace, name), xmlPullParser));
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
    }

    public final boolean equals(Object obj) {
        long j;
        if (!(obj instanceof dkyb)) {
            return false;
        }
        dkyb dkybVar = (dkyb) obj;
        if (this.b != null && dkybVar.d() != null && this.b.size() != dkybVar.d().size()) {
            return false;
        }
        long j2 = 0;
        if (this.d == null || dkybVar.d == null) {
            j = 0;
        } else {
            j2 = TimeUnit.MILLISECONDS.toSeconds(this.d.getTime());
            j = TimeUnit.MILLISECONDS.toSeconds(dkybVar.d.getTime());
        }
        return j2 == j && Objects.equals(a(), dkybVar.a());
    }
}
