package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkws implements dkwb {
    private static final enip a = new enpx(new QName("urn:oma:xml:prs:pidf:oma-pres", "overriding-willingness"));
    private static final enip b = new enpx(dkwt.class);
    private final ffbr c;

    public dkws(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    @Override // defpackage.dkwb
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        if (!"overriding-willingness".equals(qName.getLocalPart())) {
            throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
        }
        dkwt dkwtVar = (dkwt) this.c.b();
        int nextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeValue("urn:oma:xml:pde:pidf:ext", "until") != null) {
            String attributeValue = xmlPullParser.getAttributeValue("urn:oma:xml:pde:pidf:ext", "until");
            if (!Objects.isNull(attributeValue)) {
                dkwtVar.c = dkwd.b(attributeValue);
            }
        }
        while (true) {
            if ((nextTag == 3) && name.equals("overriding-willingness")) {
                return dkwtVar;
            }
            if (!"urn:oma:xml:pde:pidf:ext".equals(namespace) && !"urn:oma:params:xml:ns:pidf:oma-pres".equals(namespace)) {
                if (dkwtVar.a == null) {
                    dkwtVar.a = new ArrayList();
                }
                dkwtVar.a.add(((dkwo) dkwtVar.d.b()).a(document, new QName(namespace, name), xmlPullParser));
            } else if (name.equals("basic")) {
                dkwtVar.b = dkww.a(xmlPullParser.nextText());
            }
            nextTag = xmlPullParser.nextTag();
            name = xmlPullParser.getName();
            namespace = xmlPullParser.getNamespace();
        }
    }

    @Override // defpackage.dkwb
    public final Set b() {
        return a;
    }

    @Override // defpackage.dkwb
    public final Set c() {
        return b;
    }

    @Override // defpackage.dkwb
    public final void d(Object obj, XmlSerializer xmlSerializer) {
        if (obj instanceof dkwt) {
            ((dkwt) obj).c(xmlSerializer);
        }
    }
}
