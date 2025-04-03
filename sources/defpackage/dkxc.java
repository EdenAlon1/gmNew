package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
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
public final class dkxc {
    private final ffbr a;

    public dkxc(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static void b(dkwz dkwzVar, OutputStream outputStream) {
        d(dkwzVar, new dkxa(outputStream));
    }

    private final dkwz c(dkxb dkxbVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "urn:ietf:params:xml:ns:pidf";
        String str7 = "";
        try {
            Document c = dkwd.c();
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(dkxbVar.a, "utf-8");
            newPullParser.next();
            dkwz dkwzVar = (dkwz) this.a.b();
            dkwzVar.a = newPullParser.getAttributeValue("", "entity");
            String name = newPullParser.getName();
            int nextTag = newPullParser.nextTag();
            String namespace = newPullParser.getNamespace();
            String name2 = newPullParser.getName();
            while (true) {
                int i = 3;
                if (nextTag == 3) {
                    if (name2.equals(name)) {
                        return dkwzVar;
                    }
                }
                if (!str6.equals(namespace)) {
                    str = str6;
                    str2 = str7;
                    dkwzVar.a().add(((dkwo) dkwzVar.d.b()).a(c, new QName(namespace, name2), newPullParser));
                } else if (name2.equals("tuple")) {
                    dkxe dkxeVar = (dkxe) dkwzVar.e.b();
                    dkwzVar.b().add(dkxeVar);
                    dkxeVar.a = newPullParser.getAttributeValue(str7, "id");
                    String name3 = newPullParser.getName();
                    int nextTag2 = newPullParser.nextTag();
                    String name4 = newPullParser.getName();
                    String namespace2 = newPullParser.getNamespace();
                    while (true) {
                        if (nextTag2 == i && name4.equals(name3)) {
                            break;
                        }
                        if (!str6.equals(namespace2)) {
                            str3 = str6;
                            str4 = str7;
                            if ("urn:oma:xml:prs:pidf:oma-pres".equals(namespace2)) {
                                if (name4.equals("service-description")) {
                                    dkxeVar.c = dkxeVar.h.a(null, null, null);
                                    dkwu dkwuVar = dkxeVar.c;
                                    int nextTag3 = newPullParser.nextTag();
                                    String name5 = newPullParser.getName();
                                    String namespace3 = newPullParser.getNamespace();
                                    i = 3;
                                    while (true) {
                                        if (nextTag3 != 3 || !name5.equals("service-description")) {
                                            if (name5.equals(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION) && "urn:oma:xml:prs:pidf:oma-pres".equals(namespace3)) {
                                                dkwuVar.c = newPullParser.nextText();
                                            } else if (name5.equals("description") && "urn:oma:xml:prs:pidf:oma-pres".equals(namespace3)) {
                                                dkwuVar.d = newPullParser.nextText();
                                            } else if (name5.equals("service-id") && "urn:oma:xml:prs:pidf:oma-pres".equals(namespace3)) {
                                                dkwuVar.b = newPullParser.nextText();
                                            } else {
                                                Object a = dkwuVar.e.a(c, new QName(namespace3, name5), newPullParser);
                                                if (dkwuVar.a == null) {
                                                    dkwuVar.a = new ArrayList();
                                                }
                                                dkwuVar.a.add(a);
                                            }
                                            nextTag3 = newPullParser.nextTag();
                                            name5 = newPullParser.getName();
                                            namespace3 = newPullParser.getNamespace();
                                        }
                                    }
                                }
                                i = 3;
                            } else {
                                i = 3;
                                dkxeVar.a().add(((dkwo) dkxeVar.j.b()).a(c, new QName(namespace2, name4), newPullParser));
                            }
                        } else if (name4.equals("contact")) {
                            dkxeVar.d = new dkwx();
                            dkwx dkwxVar = dkxeVar.d;
                            String attributeValue = newPullParser.getAttributeValue(str7, "priority");
                            if (attributeValue != null) {
                                dkwxVar.a = Double.valueOf(Double.parseDouble(attributeValue));
                            }
                            dkwxVar.b = newPullParser.nextText();
                            str3 = str6;
                            str4 = str7;
                        } else if (name4.equals("status")) {
                            dkxeVar.b = (dkxd) dkxeVar.i.b();
                            dkxd dkxdVar = dkxeVar.b;
                            String name6 = newPullParser.getName();
                            int nextTag4 = newPullParser.nextTag();
                            str4 = str7;
                            String name7 = newPullParser.getName();
                            String namespace4 = newPullParser.getNamespace();
                            while (true) {
                                if (nextTag4 == i && name7.equals(name6)) {
                                    break;
                                }
                                if (str6.equals(namespace4) && name7.equals("basic")) {
                                    String trim = newPullParser.nextText().trim();
                                    if (!Objects.isNull(trim)) {
                                        dkxdVar.a = dkww.a(trim);
                                    }
                                    str5 = str6;
                                } else {
                                    if (dkxdVar.b == null) {
                                        dkxdVar.b = new ArrayList();
                                    }
                                    str5 = str6;
                                    dkxdVar.b.add(((dkwo) dkxdVar.c.b()).a(c, new QName(namespace4, name7), newPullParser));
                                }
                                nextTag4 = newPullParser.nextTag();
                                name7 = newPullParser.getName();
                                namespace4 = newPullParser.getNamespace();
                                str6 = str5;
                                i = 3;
                            }
                            str3 = str6;
                        } else {
                            str3 = str6;
                            str4 = str7;
                            if (name4.equals("note")) {
                                dkwy dkwyVar = new dkwy();
                                dkwyVar.b(newPullParser);
                                if (dkxeVar.e == null) {
                                    dkxeVar.e = new ArrayList();
                                }
                                dkxeVar.e.add(dkwyVar);
                            } else if (name4.equals("timestamp")) {
                                dkxeVar.f = dktc.b(newPullParser.nextText());
                            } else {
                                dkxeVar.a().add(((dkwo) dkxeVar.j.b()).a(c, new QName(namespace2, name4), newPullParser));
                            }
                            i = 3;
                        }
                        nextTag2 = newPullParser.nextTag();
                        name4 = newPullParser.getName();
                        namespace2 = newPullParser.getNamespace();
                        str7 = str4;
                        str6 = str3;
                    }
                    str = str6;
                    str2 = str7;
                } else {
                    str = str6;
                    str2 = str7;
                    if ("note".equals(name2)) {
                        dkwy dkwyVar2 = new dkwy();
                        dkwyVar2.b(newPullParser);
                        if (dkwzVar.c == null) {
                            dkwzVar.c = new ArrayList();
                        }
                        dkwzVar.c.add(dkwyVar2);
                    } else {
                        dkwzVar.a().add(((dkwo) dkwzVar.d.b()).a(c, new QName(namespace, name2), newPullParser));
                    }
                }
                nextTag = newPullParser.nextTag();
                namespace = newPullParser.getNamespace();
                name2 = newPullParser.getName();
                str7 = str2;
                str6 = str;
            }
        } catch (IllegalArgumentException | ParserConfigurationException | XmlPullParserException e) {
            throw new IOException(e);
        }
    }

    private static void d(dkwz dkwzVar, dkxa dkxaVar) {
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(dkxaVar.a, "utf-8");
            newSerializer.setPrefix("", "urn:ietf:params:xml:ns:pidf");
            newSerializer.setPrefix("rpid", "urn:ietf:params:xml:ns:pidf:rpid");
            newSerializer.setPrefix("cipid", "urn:ietf:params:xml:ns:pidf:cipid");
            newSerializer.setPrefix("pde", "urn:oma:xml:pde:pidf:ext");
            newSerializer.setPrefix("op", "urn:oma:xml:prs:pidf:oma-pres");
            newSerializer.setPrefix("caps", "urn:ietf:params:xml:ns:pidf:caps");
            newSerializer.startDocument("utf-8", true);
            dkwzVar.c(newSerializer);
            newSerializer.endDocument();
            newSerializer.flush();
        } catch (IllegalArgumentException | XmlPullParserException e) {
            throw new IOException(e);
        }
    }

    public final dkwz a(InputStream inputStream) {
        return c(new dkxb(inputStream));
    }
}
