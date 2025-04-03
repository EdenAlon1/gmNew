package defpackage;

import j$.time.Instant;
import java.text.ParseException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eikn {
    static int a(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (RuntimeException e) {
            throw new eikm("Invalid reading tag in XML for FileTransferInformation", e);
        }
    }

    static int b(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (RuntimeException e) {
            throw new eikm("Invalid tag in XML for MessageReceipt", e);
        }
    }

    static Instant c(String str, String str2) {
        try {
            long a = dktd.a(str2);
            if (a >= 0) {
                return Instant.ofEpochMilli(a);
            }
            throw new eijt(str);
        } catch (ParseException e) {
            throw new eijt(str, e);
        }
    }

    static String d(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextText();
        } catch (RuntimeException e) {
            throw new eikm("Invalid reading value in XML for FileTransferInformation", e);
        }
    }

    static XmlPullParser e() {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        return newPullParser;
    }

    static void f(XmlSerializer xmlSerializer, String str, String str2, String str3) {
        xmlSerializer.startTag(str, str2);
        xmlSerializer.text(str3);
        xmlSerializer.endTag(str, str2);
    }

    static void g(String str, String str2) {
        if (str2 == null || str2.trim().isEmpty()) {
            throw new eijt(str);
        }
    }
}
