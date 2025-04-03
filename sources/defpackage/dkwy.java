package defpackage;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwy {
    public String a;
    private String b;

    public dkwy() {
    }

    public final void a(XmlSerializer xmlSerializer, String str) {
        xmlSerializer.startTag(str, "note");
        String str2 = this.b;
        if (str2 != null) {
            xmlSerializer.attribute("http://www.w3.org/XML/1998/namespace", "lang", str2);
        }
        xmlSerializer.text(this.a);
        xmlSerializer.endTag(str, "note");
    }

    public final void b(XmlPullParser xmlPullParser) {
        this.b = xmlPullParser.getAttributeValue("http://www.w3.org/XML/1998/namespace", "lang");
        this.a = xmlPullParser.nextText();
    }

    public dkwy(String str) {
        if (str == null) {
            throw new IllegalArgumentException("value MUST NOT be null");
        }
        this.a = str;
    }
}
