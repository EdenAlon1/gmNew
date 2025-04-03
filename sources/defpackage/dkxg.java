package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxg implements dkxo, dkxh {
    private dkxy a;
    private dkxm b;
    private dkxm c;
    private dkxf d;
    private dkxf e;
    private String f = "urn:ogc:def:crs:EPSG::4326";

    @Override // defpackage.dkxh
    public final void a(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "base");
        this.f = null;
        c(xmlSerializer);
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "base");
    }

    @Override // defpackage.dkxh
    public final void b(XmlPullParser xmlPullParser) {
        this.f = xmlPullParser.getAttributeValue("", "srsName");
        int nextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        while (true) {
            if ((nextTag == 3) && name.equalsIgnoreCase("ArcBand")) {
                return;
            }
            if ("http://www.opengis.net/pidflo/1.0".equals(namespace)) {
                if (name.equalsIgnoreCase("outerRadius")) {
                    dkxm dkxmVar = new dkxm("outerRadius");
                    this.c = dkxmVar;
                    dkxmVar.b(xmlPullParser);
                }
                if (name.equalsIgnoreCase("innerRadius")) {
                    dkxm dkxmVar2 = new dkxm("innerRadius");
                    this.b = dkxmVar2;
                    dkxmVar2.b(xmlPullParser);
                }
                if (name.equalsIgnoreCase("startAngle")) {
                    dkxf dkxfVar = new dkxf("startAngle");
                    this.d = dkxfVar;
                    dkxfVar.b(xmlPullParser);
                }
                if (name.equalsIgnoreCase("openingAngle")) {
                    dkxf dkxfVar2 = new dkxf("openingAngle");
                    this.e = dkxfVar2;
                    dkxfVar2.b(xmlPullParser);
                }
            } else if ("http://www.opengis.net/gml".equals(namespace) && name.equalsIgnoreCase("pos")) {
                dkxy dkxyVar = new dkxy();
                this.a = dkxyVar;
                dkxyVar.d(xmlPullParser);
            }
            nextTag = xmlPullParser.nextTag();
            name = xmlPullParser.getName();
            namespace = xmlPullParser.getNamespace();
        }
    }

    @Override // defpackage.dkxo, defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "ArcBand");
        String str = this.f;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        dkxy dkxyVar = this.a;
        if (dkxyVar != null) {
            dkxyVar.c(xmlSerializer);
        }
        dkxm dkxmVar = this.b;
        if (dkxmVar != null) {
            dkxmVar.a(xmlSerializer);
        }
        dkxm dkxmVar2 = this.c;
        if (dkxmVar2 != null) {
            dkxmVar2.a(xmlSerializer);
        }
        dkxf dkxfVar = this.d;
        if (dkxfVar != null) {
            dkxfVar.a(xmlSerializer);
        }
        dkxf dkxfVar2 = this.e;
        if (dkxfVar2 != null) {
            dkxfVar2.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "ArcBand");
    }

    @Override // defpackage.dkxh
    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxg)) {
            return false;
        }
        dkxg dkxgVar = (dkxg) obj;
        return Objects.equals(this.b, dkxgVar.b) && Objects.equals(this.e, dkxgVar.e) && Objects.equals(this.c, dkxgVar.c) && this.a.equals(dkxgVar.a) && Objects.equals(this.d, dkxgVar.d) && Objects.equals(this.f, dkxgVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Objects.toString(this.b, ""), Objects.toString(this.e, ""), Objects.toString(this.c, ""), this.a, Objects.toString(this.d, ""), Objects.toString(this.f, "")});
    }
}
