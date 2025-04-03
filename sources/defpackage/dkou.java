package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkou {
    public final ffbr a;

    public dkou(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static void b(dkot dkotVar, OutputStream outputStream) {
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(outputStream, "utf-8");
            newSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:geolocation");
            newSerializer.setPrefix("rpid", "urn:ietf:params:xml:ns:pidf:rpid");
            newSerializer.setPrefix("gml", "http://www.opengis.net/gml");
            newSerializer.setPrefix("gp", "urn:ietf:params:xml:ns:pidf:geopriv10");
            newSerializer.setPrefix("gs", "http://www.opengis.net/pidflo/1.0");
            newSerializer.startDocument("utf-8", null);
            dkotVar.c(newSerializer);
            newSerializer.flush();
        } catch (XmlPullParserException e) {
            throw new IOException("XmlPullParserException during write(): ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final dkot a(InputStream inputStream) {
        try {
            Document c = dkwd.c();
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(inputStream, "utf-8");
            boolean z = true;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.nextTag();
            dkot dkotVar = (dkot) this.a.b();
            dkotVar.b = newPullParser.getAttributeValue("", "entity");
            int nextTag = newPullParser.nextTag();
            String namespace = newPullParser.getNamespace();
            String name = newPullParser.getName();
            while (true) {
                if ((nextTag == 3 ? z : false) && name.equals("rcsenvelope")) {
                    return dkotVar;
                }
                if (!"urn:ietf:params:xml:ns:pidf".equals(namespace) && !"urn:gsma:params:xml:ns:rcs:rcs:geolocation".equals(namespace)) {
                    dkotVar.b().add(((dkwo) dkotVar.c.b()).a(c, new QName(namespace, name), newPullParser));
                    nextTag = newPullParser.nextTag();
                    namespace = newPullParser.getNamespace();
                    name = newPullParser.getName();
                    z = true;
                }
                if (name.equals("rcspushlocation")) {
                    dkotVar.a = (dkov) dkotVar.d.b();
                    dkov dkovVar = dkotVar.a;
                    dkovVar.a = (String) Optional.ofNullable(newPullParser.getAttributeValue("", "id")).orElse("");
                    dkovVar.b = newPullParser.getAttributeValue("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                    int nextTag2 = newPullParser.nextTag();
                    String namespace2 = newPullParser.getNamespace();
                    String name2 = newPullParser.getName();
                    while (true) {
                        if (nextTag2 == 3 && name2.equals("rcspushlocation")) {
                            break;
                        }
                        if ("urn:ietf:params:xml:ns:pidf:rpid".equals(namespace2)) {
                            if (name2.equals("place-type")) {
                                dkyb dkybVar = (dkyb) dkovVar.h.b();
                                dkybVar.e(c, newPullParser);
                                if (dktk.d(dkovVar.b)) {
                                    dkovVar.b = dkybVar.a();
                                }
                            } else if (name2.equals("time-offset")) {
                                dkovVar.e = new dkye();
                                dkye dkyeVar = dkovVar.e;
                                dkyeVar.a = newPullParser.getAttributeValue("", "id");
                                String attributeValue = newPullParser.getAttributeValue("urn:ietf:params:xml:ns:pidf:rpid", "until");
                                if (Objects.isNull(attributeValue)) {
                                    dkty.g("Invalid until value", new Object[0]);
                                } else {
                                    dkyeVar.b = dkwd.b(attributeValue);
                                }
                                try {
                                    dkyeVar.c = Long.parseLong(newPullParser.nextText());
                                } catch (NumberFormatException e) {
                                    dkty.i(e, "Invalid timeOffset value", new Object[0]);
                                }
                            }
                        } else if ("urn:ietf:params:xml:ns:pidf:geopriv10".equals(namespace2)) {
                            if (name2.equals("geopriv")) {
                                dkovVar.d = (dkxl) dkovVar.i.b();
                                dkovVar.d.b(c, newPullParser);
                            }
                        } else if (!"urn:gsma:params:xml:ns:rcs:rcs:geolocation".equals(namespace2)) {
                            if (dkovVar.f == null) {
                                dkovVar.f = new ArrayList();
                            }
                            dkovVar.f.add(((dkwo) dkovVar.g.b()).a(c, new QName(namespace2, name2), newPullParser));
                        } else if (name2.equals("timestamp")) {
                            dkovVar.c = dkwd.b(newPullParser.nextText()).getTime();
                        }
                        nextTag2 = newPullParser.nextTag();
                        namespace2 = newPullParser.getNamespace();
                        name2 = newPullParser.getName();
                    }
                }
                nextTag = newPullParser.nextTag();
                namespace = newPullParser.getNamespace();
                name = newPullParser.getName();
                z = true;
            }
        } catch (ParserConfigurationException e2) {
            throw new IOException("ParserConfigurationException during read(): ".concat(String.valueOf(e2.getMessage())));
        } catch (XmlPullParserException e3) {
            throw new IOException("XmlPullParserException during read(): ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
