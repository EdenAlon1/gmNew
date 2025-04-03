package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dilu {
    public final long b;
    public final String c;
    public final String d;

    public dilu(long j, String str, String str2) {
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public static dilu a(XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name2 = xmlPullParser.getName();
        String str = null;
        long j = 0;
        String str2 = null;
        while (true) {
            if (nextTag == 3 && name2.equals(name)) {
                return new dilu(j, str, str2);
            }
            if ("urn:ietf:params:xml:ns:conference-info".equals(namespace)) {
                if (name2.equals("when")) {
                    j = dktd.b(xmlPullParser.nextText());
                } else if (name2.equals("reason")) {
                    str = xmlPullParser.nextText();
                } else if (name2.equals("by")) {
                    str2 = xmlPullParser.nextText();
                }
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name2 = xmlPullParser.getName();
        }
    }

    public final void b(XmlSerializer xmlSerializer, String str) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", str);
        if (this.b > 0) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "when");
            xmlSerializer.text(dktd.c(this.b));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "when");
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "reason");
            xmlSerializer.text(this.c);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "reason");
        }
        if (this.d != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "by");
            xmlSerializer.text(this.d);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "by");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dilu)) {
            return false;
        }
        dilu diluVar = (dilu) obj;
        return TextUtils.equals(this.c, diluVar.c) && TextUtils.equals(this.d, diluVar.d) && this.b == diluVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, Long.valueOf(this.b)});
    }

    public final String toString() {
        return "By: " + dktx.USER_ID.c(this.d) + ", when: " + this.b + ", reason: " + this.c;
    }
}
