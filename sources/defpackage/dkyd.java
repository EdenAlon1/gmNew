package defpackage;

import java.util.Date;
import java.util.Map;
import javax.xml.namespace.QName;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyd implements dkwc {
    public Date a;
    public Date b;
    public String c;
    public String d;
    public Map e;

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:rpid", "status-icon");
        String str = this.c;
        if (str != null) {
            xmlSerializer.attribute("", "id", str);
        }
        Date date = this.a;
        if (date != null && this.b != null) {
            xmlSerializer.attribute("", "from", dkwd.a(date));
            xmlSerializer.attribute("", "until", dkwd.a(this.b));
        }
        Map map = this.e;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                xmlSerializer.attribute(((QName) entry.getKey()).getPrefix(), ((QName) entry.getKey()).getLocalPart(), (String) entry.getValue());
            }
        }
        String str2 = this.d;
        if (str2 != null) {
            xmlSerializer.text(str2);
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:rpid", "status-icon");
    }
}
