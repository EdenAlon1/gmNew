package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxl implements dkwc {
    public dkxt a = new dkxt();
    private dkxn b;
    private String c;
    private dkxr d;
    private final ffbr e;
    private final ffbr f;

    public dkxl(ffbr ffbrVar, ffbr ffbrVar2) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.b = (dkxn) ffbrVar.b();
    }

    public final dkxn a() {
        if (this.b == null) {
            this.b = (dkxn) this.e.b();
        }
        return this.b;
    }

    public final void b(Document document, XmlPullParser xmlPullParser) {
        dkxl dkxlVar;
        String str;
        String str2;
        String str3;
        dkxn dkxnVar;
        String str4;
        String str5;
        dkxl dkxlVar2 = this;
        int nextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        while (true) {
            int i = 3;
            if ((nextTag == 3) && name.equalsIgnoreCase("geopriv")) {
                return;
            }
            String str6 = "urn:ietf:params:xml:ns:pidf:geopriv10";
            if ("urn:ietf:params:xml:ns:pidf:geopriv10".equals(namespace)) {
                String str7 = "location-info";
                if (name.equalsIgnoreCase("location-info")) {
                    dkxn dkxnVar2 = (dkxn) dkxlVar2.e.b();
                    dkxlVar2.b = dkxnVar2;
                    int nextTag2 = xmlPullParser.nextTag();
                    String name2 = xmlPullParser.getName();
                    String namespace2 = xmlPullParser.getNamespace();
                    while (true) {
                        if ((nextTag2 == i) && name2.equalsIgnoreCase(str7)) {
                            break;
                        }
                        if ("http://www.opengis.net/gml".equals(namespace2)) {
                            if (name2.equalsIgnoreCase("Point")) {
                                dkxw dkxwVar = new dkxw();
                                dkxwVar.b = xmlPullParser.getAttributeValue("", "srsName");
                                int nextTag3 = xmlPullParser.nextTag();
                                String namespace3 = xmlPullParser.getNamespace();
                                str = str7;
                                String name3 = xmlPullParser.getName();
                                while (true) {
                                    if ((nextTag3 == i) && name3.equalsIgnoreCase("point")) {
                                        break;
                                    }
                                    if ("http://www.opengis.net/gml".equals(namespace3) && name3.equalsIgnoreCase("pos")) {
                                        dkxwVar.a = new dkxy();
                                        dkxwVar.a.d(xmlPullParser);
                                    }
                                    nextTag3 = xmlPullParser.nextTag();
                                    namespace3 = xmlPullParser.getNamespace();
                                    name3 = xmlPullParser.getName();
                                    i = 3;
                                }
                                dkxnVar2.a().add(dkxwVar);
                            } else {
                                str = str7;
                            }
                            if (name2.equalsIgnoreCase("Polygon")) {
                                dkxx dkxxVar = new dkxx();
                                dkxxVar.b(xmlPullParser);
                                dkxnVar2.a().add(dkxxVar);
                            }
                            str2 = str6;
                            str3 = name;
                        } else {
                            str = str7;
                            if ("http://www.opengis.net/pidflo/1.0".equals(namespace2)) {
                                if (name2.equalsIgnoreCase("Circle")) {
                                    dkxi dkxiVar = new dkxi();
                                    xmlPullParser.getAttributeValue("", "srsName");
                                    str2 = str6;
                                    int nextTag4 = xmlPullParser.nextTag();
                                    String name4 = xmlPullParser.getName();
                                    str3 = name;
                                    while (true) {
                                        if ((nextTag4 == 3) && name4.equalsIgnoreCase("Circle")) {
                                            break;
                                        }
                                        if (name4.equalsIgnoreCase("radius")) {
                                            dkxiVar.b = new dkxm("radius");
                                            dkxiVar.b.b(xmlPullParser);
                                        }
                                        if (name4.equalsIgnoreCase("pos")) {
                                            dkxiVar.a = new dkxy();
                                            dkxiVar.a.d(xmlPullParser);
                                        }
                                        nextTag4 = xmlPullParser.nextTag();
                                        name4 = xmlPullParser.getName();
                                    }
                                    dkxnVar2.a().add(dkxiVar);
                                } else {
                                    str2 = str6;
                                    str3 = name;
                                }
                                if (name2.equalsIgnoreCase("Prism")) {
                                    dkxq dkxqVar = new dkxq();
                                    dkxqVar.a = xmlPullParser.getAttributeValue("", "srsName");
                                    int nextTag5 = xmlPullParser.nextTag();
                                    String name5 = xmlPullParser.getName();
                                    String namespace4 = xmlPullParser.getNamespace();
                                    while (true) {
                                        if ((nextTag5 == 3) && name5.equalsIgnoreCase("Prism")) {
                                            break;
                                        }
                                        if ("http://www.opengis.net/pidflo/1.0".equals(namespace4)) {
                                            if (name5.equalsIgnoreCase("height")) {
                                                dkxqVar.c = new dkxm("height");
                                                dkxqVar.c.b(xmlPullParser);
                                            }
                                            if (name5.equalsIgnoreCase("base")) {
                                                String name6 = xmlPullParser.getName();
                                                xmlPullParser.getNamespace();
                                                while (true) {
                                                    if (!(name6.equalsIgnoreCase("base") & (nextTag5 == 3))) {
                                                        xmlPullParser.nextTag();
                                                        String name7 = xmlPullParser.getName();
                                                        xmlPullParser.getNamespace();
                                                        if (name7.equals("Polygon")) {
                                                            dkxqVar.b = new dkxx();
                                                        }
                                                        if (name7.equals("ArcBand")) {
                                                            dkxqVar.b = new dkxg();
                                                        }
                                                        dkxqVar.b.b(xmlPullParser);
                                                        nextTag5 = xmlPullParser.nextTag();
                                                        name6 = xmlPullParser.getName();
                                                        xmlPullParser.getNamespace();
                                                    }
                                                }
                                            }
                                        }
                                        nextTag5 = xmlPullParser.nextTag();
                                        name5 = xmlPullParser.getName();
                                        namespace4 = xmlPullParser.getNamespace();
                                    }
                                    dkxnVar2.a().add(dkxqVar);
                                }
                                if (name2.equalsIgnoreCase("Ellipsoid")) {
                                    dkxk dkxkVar = new dkxk();
                                    dkxkVar.a = xmlPullParser.getAttributeValue("", "srsName");
                                    int nextTag6 = xmlPullParser.nextTag();
                                    String name8 = xmlPullParser.getName();
                                    dkxnVar = dkxnVar2;
                                    String namespace5 = xmlPullParser.getNamespace();
                                    str4 = "radius";
                                    while (true) {
                                        if ((nextTag6 == 3) && name8.equalsIgnoreCase("Ellipsoid")) {
                                            break;
                                        }
                                        if ("http://www.opengis.net/gml".equals(namespace5)) {
                                            if (name8.equalsIgnoreCase("pos")) {
                                                dkxkVar.b = new dkxy();
                                                dkxkVar.b.d(xmlPullParser);
                                            }
                                        } else if ("http://www.opengis.net/pidflo/1.0".equals(namespace5)) {
                                            if (name8.equalsIgnoreCase("semiMajorAxis")) {
                                                dkxkVar.c = new dkxm("semiMajorAxis");
                                                dkxkVar.c.b(xmlPullParser);
                                            }
                                            if (name8.equalsIgnoreCase("semiMinorAxis")) {
                                                dkxkVar.d = new dkxm("semiMinorAxis");
                                                dkxkVar.d.b(xmlPullParser);
                                            }
                                            if (name8.equalsIgnoreCase("verticalAxis")) {
                                                dkxkVar.e = new dkxm("verticalAxis");
                                                dkxkVar.e.b(xmlPullParser);
                                            }
                                            if (name8.equalsIgnoreCase("orientation")) {
                                                dkxkVar.f = new dkxf("orientation");
                                                dkxkVar.f.b(xmlPullParser);
                                            }
                                        }
                                        nextTag6 = xmlPullParser.nextTag();
                                        name8 = xmlPullParser.getName();
                                        namespace5 = xmlPullParser.getNamespace();
                                    }
                                    dkxnVar.a().add(dkxkVar);
                                } else {
                                    dkxnVar = dkxnVar2;
                                    str4 = "radius";
                                }
                                if (name2.equalsIgnoreCase("Sphere")) {
                                    dkxs dkxsVar = new dkxs();
                                    dkxsVar.c = xmlPullParser.getAttributeValue("", "srsName");
                                    int nextTag7 = xmlPullParser.nextTag();
                                    String name9 = xmlPullParser.getName();
                                    String namespace6 = xmlPullParser.getNamespace();
                                    while (true) {
                                        if ((nextTag7 == 3) && name9.equalsIgnoreCase("Sphere")) {
                                            break;
                                        }
                                        if ("http://www.opengis.net/gml".equals(namespace6)) {
                                            if (name9.equalsIgnoreCase("pos")) {
                                                dkxsVar.a = new dkxy();
                                                dkxsVar.a.d(xmlPullParser);
                                            }
                                        } else if ("http://www.opengis.net/pidflo/1.0".equals(namespace6)) {
                                            str5 = str4;
                                            if (name9.equalsIgnoreCase(str5)) {
                                                dkxsVar.b = new dkxm(str5);
                                                dkxsVar.b.b(xmlPullParser);
                                            }
                                            str4 = str5;
                                            nextTag7 = xmlPullParser.nextTag();
                                            name9 = xmlPullParser.getName();
                                            namespace6 = xmlPullParser.getNamespace();
                                        }
                                        str5 = str4;
                                        str4 = str5;
                                        nextTag7 = xmlPullParser.nextTag();
                                        name9 = xmlPullParser.getName();
                                        namespace6 = xmlPullParser.getNamespace();
                                    }
                                    dkxnVar.a().add(dkxsVar);
                                }
                                if (name2.equalsIgnoreCase("Ellipse")) {
                                    dkxj dkxjVar = new dkxj();
                                    dkxjVar.e = xmlPullParser.getAttributeValue("", "srsName");
                                    int nextTag8 = xmlPullParser.nextTag();
                                    String name10 = xmlPullParser.getName();
                                    String namespace7 = xmlPullParser.getNamespace();
                                    while (true) {
                                        if ((nextTag8 == 3) && name10.equalsIgnoreCase("Ellipse")) {
                                            break;
                                        }
                                        if ("http://www.opengis.net/gml".equals(namespace7)) {
                                            if (name10.equalsIgnoreCase("pos")) {
                                                dkxjVar.a = new dkxy();
                                                dkxjVar.a.d(xmlPullParser);
                                            }
                                        } else if ("http://www.opengis.net/pidflo/1.0".equals(namespace7)) {
                                            if (name10.equalsIgnoreCase("semiMajorAxis")) {
                                                dkxjVar.b = new dkxm("semiMajorAxis");
                                                dkxjVar.b.b(xmlPullParser);
                                            }
                                            if (name10.equalsIgnoreCase("semiMinorAxis")) {
                                                dkxjVar.c = new dkxm("semiMinorAxis");
                                                dkxjVar.c.b(xmlPullParser);
                                            }
                                            if (name10.equalsIgnoreCase("orientation")) {
                                                dkxjVar.d = new dkxf("orientation");
                                                dkxjVar.d.b(xmlPullParser);
                                            }
                                        }
                                        nextTag8 = xmlPullParser.nextTag();
                                        name10 = xmlPullParser.getName();
                                        namespace7 = xmlPullParser.getNamespace();
                                    }
                                    dkxnVar.a().add(dkxjVar);
                                }
                                if (name2.equalsIgnoreCase("ArcBand")) {
                                    dkxg dkxgVar = new dkxg();
                                    dkxgVar.b(xmlPullParser);
                                    dkxnVar.a().add(dkxgVar);
                                }
                                dkxnVar2 = dkxnVar;
                            } else {
                                str2 = str6;
                                str3 = name;
                                if (dkxnVar2.a == null) {
                                    dkxnVar2.a = new ArrayList();
                                }
                                dkxnVar2.a.add(((dkwo) dkxnVar2.b.b()).a(document, new QName(namespace2, name2), xmlPullParser));
                            }
                        }
                        nextTag2 = xmlPullParser.nextTag();
                        name2 = xmlPullParser.getName();
                        namespace2 = xmlPullParser.getNamespace();
                        str7 = str;
                        name = str3;
                        str6 = str2;
                        i = 3;
                    }
                }
                String str8 = str6;
                String str9 = name;
                if (str9.equalsIgnoreCase("usage-rules")) {
                    dkxt dkxtVar = new dkxt();
                    dkxlVar = this;
                    dkxlVar.a = dkxtVar;
                    String namespace8 = xmlPullParser.getNamespace();
                    int nextTag9 = xmlPullParser.nextTag();
                    String name11 = xmlPullParser.getName();
                    while (true) {
                        if ((nextTag9 == 3) && name11.equals("usage-rules")) {
                            break;
                        }
                        String str10 = str8;
                        if (str10.equals(namespace8)) {
                            if (name11.equalsIgnoreCase("retransmission-allowed")) {
                                String nextText = xmlPullParser.nextText();
                                if (nextText.equals("yes") || nextText.equalsIgnoreCase("true")) {
                                    dkxtVar.a = Boolean.TRUE;
                                }
                                if (nextText.equalsIgnoreCase("no") || nextText.equalsIgnoreCase("false")) {
                                    dkxtVar.a = Boolean.FALSE;
                                }
                            } else if (name11.equalsIgnoreCase("ruleset-reference")) {
                                dkxtVar.c = xmlPullParser.nextText();
                            } else if (name11.equalsIgnoreCase("retention-expiry")) {
                                dkxtVar.d = dkwd.b(xmlPullParser.nextText());
                            } else if (name11.equalsIgnoreCase("note-well")) {
                                dkxtVar.e = xmlPullParser.getAttributeValue("", "xml:lang");
                                dkxtVar.b = xmlPullParser.nextText();
                            }
                        }
                        str8 = str10;
                        nextTag9 = xmlPullParser.nextTag();
                        namespace8 = xmlPullParser.getNamespace();
                        name11 = xmlPullParser.getName();
                    }
                } else {
                    dkxlVar = this;
                }
                if (str9.equalsIgnoreCase("method")) {
                    dkxlVar.c = xmlPullParser.nextText();
                }
                if (str9.equalsIgnoreCase("provided-by")) {
                    dkxr dkxrVar = (dkxr) dkxlVar.f.b();
                    dkxlVar.d = dkxrVar;
                    int nextTag10 = xmlPullParser.nextTag();
                    String name12 = xmlPullParser.getName();
                    String namespace9 = xmlPullParser.getNamespace();
                    while (true) {
                        if (!((nextTag10 == 3) & name12.equalsIgnoreCase("provided-by"))) {
                            dkxrVar.a().add(((dkwo) dkxrVar.a.b()).a(document, new QName(namespace9, name12), xmlPullParser));
                            nextTag10 = xmlPullParser.nextTag();
                            name12 = xmlPullParser.getName();
                            namespace9 = xmlPullParser.getNamespace();
                        }
                    }
                }
            } else {
                dkxlVar = dkxlVar2;
            }
            nextTag = xmlPullParser.nextTag();
            name = xmlPullParser.getName();
            dkxlVar2 = dkxlVar;
            namespace = xmlPullParser.getNamespace();
        }
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
        dkxn dkxnVar = this.b;
        if (dkxnVar != null) {
            dkxnVar.c(xmlSerializer);
        }
        dkxt dkxtVar = this.a;
        if (dkxtVar != null) {
            dkxtVar.c(xmlSerializer);
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "method");
            xmlSerializer.text(this.c);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "method");
        }
        dkxr dkxrVar = this.d;
        if (dkxrVar != null) {
            dkxrVar.c(xmlSerializer);
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxl)) {
            return false;
        }
        dkxl dkxlVar = (dkxl) obj;
        return Objects.equals(this.b, dkxlVar.a()) && Objects.equals(this.a, dkxlVar.a) && Objects.equals(this.c, dkxlVar.c) && Objects.equals(this.d, dkxlVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d);
    }
}
