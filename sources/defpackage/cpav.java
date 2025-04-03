package defpackage;

import android.content.ContentValues;
import android.util.ArrayMap;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpav {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor");
    private static final Map c;
    private final ctvb d;
    private final XmlPullParser f;
    private final StringBuilder e = new StringBuilder();
    public cpau a = null;

    static {
        ArrayMap arrayMap = new ArrayMap();
        c = arrayMap;
        arrayMap.put("mcc", "mcc");
        arrayMap.put("mnc", "mnc");
        arrayMap.put("carrier", "name");
        arrayMap.put("apn", "apn");
        arrayMap.put("mmsc", "mmsc");
        arrayMap.put("mmsproxy", "mmsproxy");
        arrayMap.put("mmsport", "mmsport");
        arrayMap.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        arrayMap.put("user", "user");
        arrayMap.put("password", "password");
        arrayMap.put("authtype", "authtype");
        arrayMap.put("mvno_match_data", "mvno_match_data");
        arrayMap.put("mvno_type", "mvno_type");
        arrayMap.put("protocol", "protocol");
        arrayMap.put("bearer", "bearer");
        arrayMap.put("server", "server");
        arrayMap.put("roaming_protocol", "roaming_protocol");
        arrayMap.put("proxy", "proxy");
        arrayMap.put("port", "port");
        arrayMap.put("carrier_enabled", "carrier_enabled");
    }

    private cpav(XmlPullParser xmlPullParser, ctvb ctvbVar) {
        this.f = xmlPullParser;
        this.d = ctvbVar;
    }

    public static cpav a(XmlPullParser xmlPullParser, ctvb ctvbVar) {
        csix.l(xmlPullParser);
        return new cpav(xmlPullParser, ctvbVar);
    }

    private final Integer c(String str, Integer num, String str2) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Exception unused) {
            ensk i = b.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "parseInt", 177, "ApnsXmlProcessor.java")).J("Invalid value %sfor%s @%s", str, str2, d());
            return num;
        }
    }

    private final String d() {
        this.e.setLength(0);
        XmlPullParser xmlPullParser = this.f;
        if (xmlPullParser == null) {
            return "Unknown";
        }
        try {
            int eventType = xmlPullParser.getEventType();
            this.e.append(eventType != 0 ? eventType != 1 ? eventType != 2 ? eventType != 3 ? eventType != 4 ? Integer.toString(eventType) : "TEXT" : "END_TAG" : "START_TAG" : "END_DOCUMENT" : "START_DOCUMENT");
            if (eventType == 2 || eventType == 3 || eventType == 4) {
                StringBuilder sb = this.e;
                sb.append('<');
                sb.append(this.f.getName());
                for (int i = 0; i < this.f.getAttributeCount(); i++) {
                    StringBuilder sb2 = this.e;
                    sb2.append(' ');
                    sb2.append(this.f.getAttributeName(i));
                    sb2.append('=');
                    sb2.append(this.f.getAttributeValue(i));
                }
                this.e.append("/>");
            }
            return this.e.toString();
        } catch (XmlPullParserException e) {
            ensk i2 = b.i();
            i2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i2).g(e)).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "xmlParserDebugContext", 232, "ApnsXmlProcessor.java")).t("xmlParserDebugContext: %s", e);
            return "Unknown";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e() {
        /*
            r11 = this;
            ctvb r0 = r11.d
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto L1b
        L7:
            org.xmlpull.v1.XmlPullParser r2 = r11.f
            java.lang.String r3 = "mcc"
            java.lang.String r2 = r2.getAttributeValue(r1, r3)
            org.xmlpull.v1.XmlPullParser r3 = r11.f
            java.lang.String r4 = "mnc"
            java.lang.String r3 = r3.getAttributeValue(r1, r4)
            java.lang.String r0 = r0.k(r2, r3)
        L1b:
            org.xmlpull.v1.XmlPullParser r2 = r11.f
            int r2 = r2.next()
            r3 = 4
            if (r2 == r3) goto L1b
            r4 = 3
            r5 = 2
            if (r2 != r5) goto La5
            org.xmlpull.v1.XmlPullParser r2 = r11.f
            java.lang.String r6 = "name"
            java.lang.String r6 = r2.getAttributeValue(r1, r6)
            java.lang.String r7 = r2.getName()
            int r2 = r2.next()
            if (r2 != r3) goto L45
            org.xmlpull.v1.XmlPullParser r2 = r11.f
            java.lang.String r8 = r2.getText()
            int r2 = r2.next()
            goto L46
        L45:
            r8 = r1
        L46:
            if (r2 != r4) goto L95
            cpau r2 = r11.a
            if (r2 == 0) goto L1b
            if (r0 == 0) goto L1b
            if (r6 == 0) goto L1b
            if (r8 == 0) goto L1b
            int r4 = r7.hashCode()
            r9 = -891985903(0xffffffffcad56011, float:-6991880.5)
            r10 = 1
            if (r4 == r9) goto L7b
            r9 = 104431(0x197ef, float:1.46339E-40)
            if (r4 == r9) goto L71
            r9 = 3029738(0x2e3aea, float:4.245567E-39)
            if (r4 == r9) goto L67
            goto L85
        L67:
            java.lang.String r4 = "bool"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L85
            r4 = r10
            goto L86
        L71:
            java.lang.String r4 = "int"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L85
            r4 = 0
            goto L86
        L7b:
            java.lang.String r4 = "string"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L85
            r4 = r5
            goto L86
        L85:
            r4 = -1
        L86:
            if (r4 == 0) goto L90
            if (r4 == r10) goto L8e
            if (r4 == r5) goto L91
            r3 = 7
            goto L91
        L8e:
            r3 = r5
            goto L91
        L90:
            r3 = r10
        L91:
            r2.a(r6, r8, r3)
            goto L1b
        L95:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r11.d()
            java.lang.String r2 = "ApnsXmlProcessor: expecting end tag @"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        La5:
            if (r2 != r4) goto La8
            return
        La8:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r11.d()
            java.lang.String r2 = "MmsConfig: expecting start or end tag @"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpav.e():void");
    }

    private final int f() {
        int next;
        do {
            next = this.f.next();
            if (next == 2) {
                return next;
            }
        } while (next != 1);
        return 1;
    }

    public final void b() {
        int i;
        Boolean bool;
        try {
            if (f() != 2) {
                throw new XmlPullParserException("ApnsXmlProcessor: expecting start tag @" + d());
            }
            ContentValues contentValues = new ContentValues();
            String name = this.f.getName();
            if (!"apns".equals(name)) {
                if (!"mms_config".equals(name) && !"motorola_config_override".equals(name) && !"huawei_config_override".equals(name) && !"lge_config_override".equals(name)) {
                    return;
                }
                e();
                return;
            }
            while (f() == 2) {
                String name2 = this.f.getName();
                if ("apn".equals(name2)) {
                    csix.l(contentValues);
                    contentValues.clear();
                    for (int i2 = 0; i2 < this.f.getAttributeCount(); i2++) {
                        String str = (String) c.get(this.f.getAttributeName(i2));
                        if (str != null) {
                            contentValues.put(str, this.f.getAttributeValue(i2));
                        }
                    }
                    contentValues.put("numeric", this.d.k(contentValues.getAsString("mcc"), contentValues.getAsString("mnc")));
                    String asString = contentValues.getAsString("authtype");
                    if (asString != null) {
                        contentValues.put("authtype", c(asString, -1, "apn authtype"));
                    }
                    String asString2 = contentValues.getAsString("carrier_enabled");
                    if (asString2 != null) {
                        try {
                            bool = Boolean.valueOf(Boolean.parseBoolean(asString2));
                            i = 0;
                        } catch (Exception unused) {
                            ensk i3 = b.i();
                            i3.Y(ente.a, "Bugle");
                            i = 0;
                            ((enrr) ((enrr) i3).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "parseBoolean", 188, "ApnsXmlProcessor.java")).J("Invalid value %sfor%s @%s", asString2, "apn carrierEnabled", d());
                            bool = null;
                        }
                        contentValues.put("carrier_enabled", bool);
                    } else {
                        i = 0;
                    }
                    String asString3 = contentValues.getAsString("bearer");
                    if (asString3 != null) {
                        contentValues.put("bearer", c(asString3, Integer.valueOf(i), "apn bearer"));
                    }
                    if (this.f.next() != 3) {
                        throw new XmlPullParserException("Apn: expecting end tag @".concat(d()));
                    }
                } else if ("mms_config".equals(name2)) {
                    e();
                }
            }
        } catch (IOException e) {
            ensk i4 = b.i();
            i4.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i4).g(e)).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "process", 166, "ApnsXmlProcessor.java")).t("ApnsXmlProcessor: I/O failure %s", e);
        } catch (XmlPullParserException e2) {
            ensk i5 = b.i();
            i5.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i5).g(e2)).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "process", 168, "ApnsXmlProcessor.java")).t("ApnsXmlProcessor: parsing failure %s", e2);
        }
    }
}
