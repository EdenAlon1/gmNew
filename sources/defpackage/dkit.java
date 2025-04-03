package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkit extends dkiz {
    public dkit() {
        dkis dkisVar = dkis.OK;
    }

    private final void a(InputStream inputStream) {
        String attributeValue;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(inputStream, "utf-8");
            newPullParser.nextTag();
            String attributeValue2 = newPullParser.getAttributeValue("", "id");
            if (attributeValue2 == null) {
                throw new IOException("Parsing Request id failed");
            }
            this.f = attributeValue2;
            String attributeValue3 = newPullParser.getAttributeValue("", "status");
            if (attributeValue3 == null || !attributeValue3.equals("ok")) {
                dkis dkisVar = dkis.OK;
            } else {
                dkis dkisVar2 = dkis.OK;
            }
            int nextTag = newPullParser.nextTag();
            for (String name = newPullParser.getName(); nextTag != 3 && !name.equals("EndUserConfirmationAck"); name = newPullParser.getName()) {
                if (name.equals("Subject")) {
                    String attributeValue4 = newPullParser.getAttributeValue("", "lang");
                    if (attributeValue4 != null) {
                        this.g.put(attributeValue4, newPullParser.nextText());
                    }
                } else if (name.equals("Text") && (attributeValue = newPullParser.getAttributeValue("", "lang")) != null) {
                    this.h.put(attributeValue, newPullParser.nextText());
                }
                nextTag = newPullParser.nextTag();
            }
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }

    public dkit(InputStream inputStream) {
        dkis dkisVar = dkis.OK;
        a(inputStream);
    }
}
