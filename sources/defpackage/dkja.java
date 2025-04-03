package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkja {
    public int a;

    private dkja() {
    }

    public static dkja a(InputStream inputStream) {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(inputStream, "utf-8");
            newPullParser.nextTag();
            dkja dkjaVar = new dkja();
            if (newPullParser.getAttributeValue(null, "id") == null) {
                throw new IllegalArgumentException("No id attribute found in XML document");
            }
            String attributeValue = newPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
            if ("urn:gsma:rcs:http-configuration:reconfigure".equalsIgnoreCase(attributeValue)) {
                dkjaVar.a = 1;
                return dkjaVar;
            }
            if (!"urn:gsma:rcs:extension:control".equalsIgnoreCase(attributeValue)) {
                throw new IOException(a.t(attributeValue, "Unexpected type: "));
            }
            dkjaVar.a = 2;
            newPullParser.getAttributeValue(null, GroupManagementRequest.DATA_TAG);
            return dkjaVar;
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }
}
