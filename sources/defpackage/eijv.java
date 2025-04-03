package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import j$.time.Instant;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijv implements eiko {
    public static final ContentType a = eijq.c;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x02c9, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b4, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.rcs.client.messaging.data.LocationInformation c(java.io.InputStream r22) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eijv.c(java.io.InputStream):com.google.android.rcs.client.messaging.data.LocationInformation");
    }

    private static String d(LocationInformation locationInformation) {
        return locationInformation.a() + " " + locationInformation.b();
    }

    private static String e(LocationInformation locationInformation) {
        StringWriter stringWriter;
        try {
            StringWriter stringWriter2 = new StringWriter();
            try {
                XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
                newSerializer.setOutput(stringWriter2);
                newSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:geolocation");
                stringWriter = stringWriter2;
                try {
                    newSerializer.setPrefix("rpid", "urn:ietf:params:xml:ns:pidf:rpid");
                    newSerializer.setPrefix("gml", "http://www.opengis.net/gml");
                    newSerializer.setPrefix("gp", "urn:ietf:params:xml:ns:pidf:geopriv10");
                    newSerializer.setPrefix("gs", "http://www.opengis.net/pidflo/1.0");
                    newSerializer.startDocument("UTF-8", true);
                    newSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
                    if (locationInformation.c().isPresent()) {
                        newSerializer.attribute("", "entity", (String) locationInformation.c().get());
                    }
                    newSerializer.startTag("", "rcspushlocation");
                    newSerializer.attribute("", "id", locationInformation.i());
                    if (locationInformation.e().isPresent()) {
                        newSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, (String) locationInformation.e().get());
                    }
                    newSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
                    newSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
                    if (locationInformation.g().isPresent()) {
                        newSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Circle");
                        newSerializer.attribute("", "srsName", "urn:ogc:def:crs:EPSG::4326");
                        eikn.f(newSerializer, "http://www.opengis.net/gml", "pos", d(locationInformation));
                        newSerializer.startTag("http://www.opengis.net/pidflo/1.0", "radius");
                        newSerializer.attribute("", "uom", "urn:ogc:def:uom:EPSG::9001");
                        newSerializer.text(locationInformation.g().get().toString());
                        newSerializer.endTag("http://www.opengis.net/pidflo/1.0", "radius");
                        newSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Circle");
                    } else {
                        newSerializer.startTag("http://www.opengis.net/gml", "Point");
                        newSerializer.attribute("", "srsName", "urn:ogc:def:crs:EPSG::4326");
                        eikn.f(newSerializer, "http://www.opengis.net/gml", "pos", d(locationInformation));
                        newSerializer.endTag("http://www.opengis.net/gml", "Point");
                    }
                    newSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
                    newSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
                    if (locationInformation.d().isPresent()) {
                        eikn.f(newSerializer, "urn:ietf:params:xml:ns:pidf:geopriv10", "retention-expiry", ((Instant) locationInformation.d().get()).toString());
                    }
                    newSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
                    newSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
                    if (locationInformation.h().isPresent()) {
                        eikn.f(newSerializer, "", "timestamp", ((Instant) locationInformation.h().get()).toString());
                    }
                    newSerializer.endTag("", "rcspushlocation");
                    newSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
                    newSerializer.endDocument();
                    String stringWriter3 = stringWriter.toString();
                    stringWriter.close();
                    return stringWriter3;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        stringWriter.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                stringWriter = stringWriter2;
            }
        } catch (IOException | XmlPullParserException e) {
            throw new eikm("Error serializing LocationInformation", e);
        }
    }

    private static void f(eigg eiggVar, String str) {
        try {
            String[] split = str.contains(",") ? str.split(",") : str.split("\\s");
            if (split.length >= 2) {
                eiggVar.f(Double.parseDouble(split[0]));
                eiggVar.g(Double.parseDouble(split[1]));
            }
        } catch (NumberFormatException e) {
            throw new eijt("pos", e);
        }
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eihn a(eijp eijpVar) {
        ContentType contentType = a;
        if (!contentType.f(eijpVar.a())) {
            throw new eikq(eijpVar.a(), "Supported type for this serializer is: ".concat(String.valueOf(String.valueOf(contentType))));
        }
        try {
            InputStream m = eijpVar.b().m();
            try {
                LocationInformation c = c(m);
                m.close();
                return c;
            } finally {
            }
        } catch (IOException e) {
            throw new eikm("Error deserializing LocationInformation", e);
        }
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eijp b(eihn eihnVar) {
        String e = e((LocationInformation) eihnVar);
        eijj eijjVar = new eijj();
        eijjVar.c(a);
        eijjVar.b(eyee.A(e));
        return eijjVar.a();
    }
}
