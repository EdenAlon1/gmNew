package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkiy extends dkiz {
    public final LinkedHashMap a = new LinkedHashMap();

    private dkiy() {
    }

    public static dkiy a(InputStream inputStream) {
        String attributeValue;
        dkiy dkiyVar = new dkiy();
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(inputStream, "utf-8");
            newPullParser.nextTag();
            String attributeValue2 = newPullParser.getAttributeValue(null, "id");
            attributeValue2.getClass();
            dkiyVar.f = attributeValue2;
            int nextTag = newPullParser.nextTag();
            String name = newPullParser.getName();
            while (nextTag != 3) {
                if (name.equals("EndUserNotification")) {
                    break;
                }
                if (name.equals("Subject")) {
                    String attributeValue3 = newPullParser.getAttributeValue(null, "lang");
                    if (attributeValue3 != null) {
                        dkiyVar.g.put(attributeValue3, newPullParser.nextText());
                    }
                } else if (name.equals("Text")) {
                    String attributeValue4 = newPullParser.getAttributeValue(null, "lang");
                    if (attributeValue4 != null) {
                        dkiyVar.h.put(attributeValue4, newPullParser.nextText());
                    }
                } else if (name.equals("ButtonOK") && (attributeValue = newPullParser.getAttributeValue(null, "lang")) != null) {
                    dkiyVar.a.put(attributeValue, newPullParser.nextText());
                }
                nextTag = newPullParser.nextTag();
                name = newPullParser.getName();
            }
            return dkiyVar;
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }
}
