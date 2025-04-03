package defpackage;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nfg {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static nfc a(String str) {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!lvg.c(newPullParser, "x:xmpmeta")) {
                throw new lrg("Couldn't find xmp metadata", null, true, 1);
            }
            int i = engw.d;
            engw engwVar = enou.a;
            long j2 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (lvg.c(newPullParser, "rdf:Description")) {
                    String[] strArr = a;
                    int i2 = 0;
                    for (int i3 = 0; i3 < 4; i3++) {
                        String a2 = lvg.a(newPullParser, strArr[i3]);
                        if (a2 != null) {
                            if (Integer.parseInt(a2) != 1) {
                                return null;
                            }
                            String[] strArr2 = b;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= 4) {
                                    break;
                                }
                                String a3 = lvg.a(newPullParser, strArr2[i4]);
                                if (a3 != null) {
                                    j = Long.parseLong(a3);
                                    if (j == -1) {
                                    }
                                } else {
                                    i4++;
                                }
                            }
                            j = -9223372036854775807L;
                            String[] strArr3 = c;
                            while (true) {
                                if (i2 >= 2) {
                                    engwVar = enou.a;
                                    break;
                                }
                                String a4 = lvg.a(newPullParser, strArr3[i2]);
                                if (a4 != null) {
                                    engwVar = engw.s(new nfb("image/jpeg", 0L, 0L), new nfb("video/mp4", Long.parseLong(a4), 0L));
                                    break;
                                }
                                i2++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (lvg.c(newPullParser, "Container:Directory")) {
                    engwVar = b(newPullParser, "Container", "Item");
                } else if (lvg.c(newPullParser, "GContainer:Directory")) {
                    engwVar = b(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!lvg.b(newPullParser, "x:xmpmeta"));
            if (engwVar.isEmpty()) {
                return null;
            }
            return new nfc(j2, engwVar);
        } catch (NumberFormatException | lrg | XmlPullParserException unused) {
            luj.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static engw b(XmlPullParser xmlPullParser, String str, String str2) {
        int i = engw.d;
        engr engrVar = new engr();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (lvg.c(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String a2 = lvg.a(xmlPullParser, concat2);
                String a3 = lvg.a(xmlPullParser, concat3);
                String a4 = lvg.a(xmlPullParser, concat4);
                String a5 = lvg.a(xmlPullParser, concat5);
                if (a2 == null || a3 == null) {
                    return enou.a;
                }
                engrVar.h(new nfb(a2, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
            }
        } while (!lvg.b(xmlPullParser, str.concat(":Directory")));
        return engrVar.g();
    }
}
