package defpackage;

import j$.util.Objects;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwj implements dkwb {
    private static final enip a = new enpx(new QName("urn:jibe:rcs:location-sharing", "preview"));
    private static final enip b = new enpx(dkwk.class);

    @Override // defpackage.dkwb
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        int i;
        byte[] bArr;
        dkwk dkwkVar = new dkwk();
        if (!"urn:jibe:rcs:location-sharing".equals(qName.getNamespaceURI()) || !"preview".equals(qName.getLocalPart())) {
            return dkwkVar;
        }
        if (Objects.isNull(xmlPullParser.getAttributeValue("", "content-type"))) {
            throw new XmlPullParserException("Preview is missing required content-type");
        }
        String nextText = xmlPullParser.nextText();
        char[] cArr = dkte.a;
        int length = nextText.length();
        int i2 = 0;
        if (length == 0) {
            bArr = new byte[0];
        } else {
            int i3 = length - 1;
            int i4 = 0;
            while (i4 < i3 && dkte.b[nextText.charAt(i4) & 255] < 0) {
                i4++;
            }
            while (i3 > 0 && dkte.b[nextText.charAt(i3) & 255] < 0) {
                i3--;
            }
            int i5 = nextText.charAt(i3) == '=' ? nextText.charAt(i3 + (-1)) == '=' ? 2 : 1 : 0;
            int i6 = (i3 - i4) + 1;
            if (length > 76) {
                int i7 = nextText.charAt(76) == '\r' ? i6 / 78 : 0;
                i = i7 + i7;
            } else {
                i = 0;
            }
            int i8 = (((i6 - i) * 6) >> 3) - i5;
            byte[] bArr2 = new byte[i8];
            int i9 = 0;
            int i10 = 0;
            while (i9 < (i8 / 3) * 3) {
                int i11 = i4 + 4;
                int i12 = (dkte.b[nextText.charAt(i4 + 1)] << 12) | (dkte.b[nextText.charAt(i4)] << 18) | (dkte.b[nextText.charAt(i4 + 2)] << 6) | dkte.b[nextText.charAt(i4 + 3)];
                bArr2[i9] = (byte) (i12 >> 16);
                int i13 = i9 + 2;
                bArr2[i9 + 1] = (byte) (i12 >> 8);
                i9 += 3;
                bArr2[i13] = (byte) i12;
                if (i <= 0 || (i10 = i10 + 1) != 19) {
                    i4 = i11;
                } else {
                    i4 += 6;
                    i10 = 0;
                }
            }
            if (i9 < i8) {
                int i14 = 0;
                while (i4 <= i3 - i5) {
                    i2 |= dkte.b[nextText.charAt(i4)] << (18 - (i14 * 6));
                    i14++;
                    i4++;
                }
                int i15 = 16;
                while (i9 < i8) {
                    bArr2[i9] = (byte) (i2 >> i15);
                    i15 -= 8;
                    i9++;
                }
            }
            bArr = bArr2;
        }
        dkwkVar.a = bArr;
        return dkwkVar;
    }

    @Override // defpackage.dkwb
    public final Set b() {
        return a;
    }

    @Override // defpackage.dkwb
    public final Set c() {
        return b;
    }

    @Override // defpackage.dkwb
    public final void d(Object obj, XmlSerializer xmlSerializer) {
        if (obj instanceof dkwk) {
            xmlSerializer.startTag("urn:jibe:rcs:location-sharing", "preview");
            ((dkwk) obj).c(xmlSerializer);
            xmlSerializer.endTag("urn:jibe:rcs:location-sharing", "preview");
        }
    }
}
