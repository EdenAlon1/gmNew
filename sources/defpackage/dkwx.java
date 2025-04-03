package defpackage;

import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwx implements dkwc {
    public Double a;
    public String b;

    public dkwx() {
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "contact");
        Double d = this.a;
        if (d != null) {
            xmlSerializer.attribute("", "priority", d.toString());
        }
        xmlSerializer.text(this.b);
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "contact");
    }

    public dkwx(String str) {
        this.b = str;
    }
}
