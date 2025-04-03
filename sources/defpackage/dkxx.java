package defpackage;

import j$.util.Objects;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxx extends dkxu implements dkxo, dkxh {
    private dkxv a;
    private String b;

    @Override // defpackage.dkxh
    public final void a(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "base");
        c(xmlSerializer);
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "base");
    }

    @Override // defpackage.dkxh
    public final void b(XmlPullParser xmlPullParser) {
        this.b = xmlPullParser.getAttributeValue("", "srsName");
        int nextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        while (true) {
            if ((nextTag == 3) && name.equalsIgnoreCase("Polygon")) {
                return;
            }
            if ("http://www.opengis.net/gml".equals(namespace) && name.equalsIgnoreCase("exterior")) {
                int nextTag2 = xmlPullParser.nextTag();
                String name2 = xmlPullParser.getName();
                xmlPullParser.getNamespace();
                while (true) {
                    if (!((nextTag2 == 3) & name2.equalsIgnoreCase("exterior"))) {
                        dkxv dkxvVar = new dkxv();
                        this.a = dkxvVar;
                        int nextTag3 = xmlPullParser.nextTag();
                        String name3 = xmlPullParser.getName();
                        String namespace2 = xmlPullParser.getNamespace();
                        while (true) {
                            if (!((nextTag3 == 3) & name3.equalsIgnoreCase("LinearRing"))) {
                                if ("http://www.opengis.net/gml".equals(namespace2)) {
                                    if (name3.equalsIgnoreCase("pos")) {
                                        dkxy dkxyVar = new dkxy();
                                        dkxyVar.d(xmlPullParser);
                                        dkxvVar.a().add(dkxyVar);
                                    }
                                    if (name3.equalsIgnoreCase("posList")) {
                                        dkxvVar.b = new dkxz();
                                        dkxz dkxzVar = dkxvVar.b;
                                        String[] split = xmlPullParser.nextText().trim().split("\r\n|\n");
                                        for (int i = 0; i < split.length; i++) {
                                            if (split[i].length() != 0) {
                                                String[] split2 = split[i].contains(",") ? split[i].split(",") : split[i].split("\\s");
                                                dkxy dkxyVar2 = new dkxy(Double.valueOf(split2[0]), Double.valueOf(split2[1]));
                                                if (split2.length == 3) {
                                                    dkxyVar2.a = Double.valueOf(split2[2]);
                                                }
                                                dkxzVar.a().add(dkxyVar2);
                                            }
                                        }
                                    }
                                }
                                nextTag3 = xmlPullParser.nextTag();
                                name3 = xmlPullParser.getName();
                                namespace2 = xmlPullParser.getNamespace();
                            }
                        }
                        nextTag2 = xmlPullParser.nextTag();
                        name2 = xmlPullParser.getName();
                        xmlPullParser.getNamespace();
                    }
                }
            }
            nextTag = xmlPullParser.nextTag();
            name = xmlPullParser.getName();
            namespace = xmlPullParser.getNamespace();
        }
    }

    @Override // defpackage.dkxo, defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/gml", "Polygon");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        if (this.a != null) {
            xmlSerializer.startTag("http://www.opengis.net/gml", "exterior");
            this.a.c(xmlSerializer);
            xmlSerializer.endTag("http://www.opengis.net/gml", "exterior");
        }
        xmlSerializer.endTag("http://www.opengis.net/gml", "Polygon");
    }

    @Override // defpackage.dkxh
    public final boolean equals(Object obj) {
        dkxz dkxzVar;
        if (!(obj instanceof dkxx)) {
            return false;
        }
        dkxx dkxxVar = (dkxx) obj;
        dkxv dkxvVar = this.a;
        dkxv dkxvVar2 = dkxxVar.a;
        dkxz dkxzVar2 = dkxvVar.b;
        if (dkxzVar2 == null || ((dkxzVar = dkxvVar2.b) != null && dkxzVar.equals(dkxzVar2))) {
            if (dkxvVar.a != null && dkxvVar2.a() != null) {
                if (dkxvVar.a.size() == dkxvVar2.a.size()) {
                    for (int i = 0; i < dkxvVar.a.size(); i++) {
                        if (!((dkxy) dkxvVar.a.get(i)).equals(dkxvVar2.a.get(i))) {
                            break;
                        }
                    }
                }
            }
            List list = dkxvVar.a;
            if ((list == null || dkxvVar2.a != null) && (list != null || dkxvVar2.a == null)) {
                String str = this.b;
                return str != null ? str.equals(dkxxVar.b) : dkxxVar.b == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
