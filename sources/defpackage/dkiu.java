package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkiu extends dkiz {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public int e = 1;
    public int c = 0;
    public boolean d = false;

    private dkiu() {
    }

    public static dkiu a(int i, InputStream inputStream) {
        String attributeValue;
        dkiu dkiuVar = new dkiu();
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(inputStream, "utf-8");
            newPullParser.nextTag();
            String attributeValue2 = newPullParser.getAttributeValue(null, "id");
            attributeValue2.getClass();
            dkiuVar.f = attributeValue2;
            String attributeValue3 = newPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
            if (attributeValue3 != null && !attributeValue3.equals("volatile")) {
                dkiuVar.e = 2;
            }
            if (dkiuVar.e == 1) {
                dkiuVar.c = i;
                String attributeValue4 = newPullParser.getAttributeValue(null, "timeout");
                if (attributeValue4 != null) {
                    try {
                        dkiuVar.c = Integer.parseInt(attributeValue4);
                    } catch (NumberFormatException unused) {
                        dkty.q("Invalid number format for timeout %s failling back to default value", attributeValue4);
                    }
                }
            }
            String attributeValue5 = newPullParser.getAttributeValue(null, "pin");
            if (attributeValue5 != null && attributeValue5.equals("true")) {
                dkiuVar.d = true;
            }
            String attributeValue6 = newPullParser.getAttributeValue(null, "externalEUCR");
            if (attributeValue6 != null) {
                attributeValue6.equals("true");
            }
            int nextTag = newPullParser.nextTag();
            String name = newPullParser.getName();
            while (nextTag != 3) {
                if (name.equals("EndUserConfirmationRequest")) {
                    break;
                }
                if (name.equals("Subject")) {
                    String attributeValue7 = newPullParser.getAttributeValue(null, "lang");
                    if (attributeValue7 != null) {
                        dkiuVar.g.put(attributeValue7, newPullParser.nextText());
                    }
                } else if (name.equals("Text")) {
                    String attributeValue8 = newPullParser.getAttributeValue(null, "lang");
                    if (attributeValue8 != null) {
                        dkiuVar.h.put(attributeValue8, newPullParser.nextText());
                    }
                } else if (name.equals("ButtonAccept")) {
                    String attributeValue9 = newPullParser.getAttributeValue(null, "lang");
                    if (attributeValue9 != null) {
                        dkiuVar.a.put(attributeValue9, newPullParser.nextText());
                    }
                } else if (name.equals("ButtonReject") && (attributeValue = newPullParser.getAttributeValue(null, "lang")) != null) {
                    dkiuVar.b.put(attributeValue, newPullParser.nextText());
                }
                nextTag = newPullParser.nextTag();
                name = newPullParser.getName();
            }
            return dkiuVar;
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }
}
