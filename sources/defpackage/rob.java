package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.chromium.net.PrivateKeyType;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rob extends DefaultHandler2 {
    private int d;
    private rnh a = null;
    private rml b = null;
    private boolean c = false;
    private boolean e = false;
    private rnz f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;

    private static final void A(rmn rmnVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                rmnVar.o = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    rmnVar.p = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new SAXException("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(trim)));
                    }
                    rmnVar.p = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    private static final void B(rmb rmbVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (rny.a(attributes.getLocalName(i)) == rny.points) {
                roa roaVar = new roa(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                roaVar.l();
                while (!roaVar.o()) {
                    float c = roaVar.c();
                    if (Float.isNaN(c)) {
                        throw new SAXException(a.a(str, "Invalid <", "> points attribute. Non-coordinate content found in list."));
                    }
                    roaVar.q();
                    float c2 = roaVar.c();
                    if (Float.isNaN(c2)) {
                        throw new SAXException(a.a(str, "Invalid <", "> points attribute. There should be an even number of coordinates."));
                    }
                    roaVar.q();
                    arrayList.add(Float.valueOf(c));
                    arrayList.add(Float.valueOf(c2));
                }
                rmbVar.a = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    rmbVar.a[i3] = ((Float) arrayList.get(i2)).floatValue();
                    i2++;
                    i3++;
                }
            }
        }
    }

    private static final void C(rmn rmnVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int ordinal = rny.a(attributes.getLocalName(i)).ordinal();
                if (ordinal == 0) {
                    rkt rktVar = new rkt(trim);
                    ArrayList arrayList = null;
                    while (!rktVar.o()) {
                        String a = rktVar.a();
                        if (a == null) {
                            throw new SAXException("Invalid value for \"class\" attribute: ".concat(String.valueOf(trim)));
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(a);
                        rktVar.l();
                    }
                    rmnVar.s = arrayList;
                } else if (ordinal != 72) {
                    if (rmnVar.q == null) {
                        rmnVar.q = new rmg();
                    }
                    c(rmnVar.q, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    roa roaVar = new roa(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String k = roaVar.k(':');
                        roaVar.l();
                        if (roaVar.m(':')) {
                            roaVar.l();
                            String k2 = roaVar.k(';');
                            if (k2 != null) {
                                roaVar.l();
                                if (roaVar.o() || roaVar.m(';')) {
                                    if (rmnVar.r == null) {
                                        rmnVar.r = new rmg();
                                    }
                                    c(rmnVar.r, k, k2);
                                    roaVar.l();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static final void D(rnc rncVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = rny.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                rncVar.d = n(trim);
            } else if (ordinal == 10) {
                rncVar.e = n(trim);
            } else if (ordinal == 82) {
                rncVar.b = n(trim);
            } else if (ordinal == 83) {
                rncVar.c = n(trim);
            }
        }
    }

    private static final void E(rmt rmtVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = rny.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 48) {
                w(rmtVar, trim);
            } else if (ordinal != 80) {
                continue;
            } else {
                roa roaVar = new roa(trim);
                roaVar.l();
                float c = roaVar.c();
                roaVar.q();
                float c2 = roaVar.c();
                roaVar.q();
                float c3 = roaVar.c();
                roaVar.q();
                float c4 = roaVar.c();
                if (Float.isNaN(c) || Float.isNaN(c2) || Float.isNaN(c3) || Float.isNaN(c4)) {
                    throw new SAXException("Invalid viewBox definition - should have four numbers");
                }
                if (c3 < 0.0f) {
                    throw new SAXException("Invalid viewBox. width cannot be negative");
                }
                if (c4 < 0.0f) {
                    throw new SAXException("Invalid viewBox. height cannot be negative");
                }
                rmtVar.w = new rle(c, c2, c3, c4);
            }
        }
    }

    private static float F(String str, int i) {
        float a = new rlb().a(str, 0, i);
        if (Float.isNaN(a)) {
            throw new SAXException("Invalid float value: ".concat(String.valueOf(str)));
        }
        return a;
    }

    private static final Matrix G(String str) {
        Matrix matrix = new Matrix();
        roa roaVar = new roa(str);
        roaVar.l();
        while (!roaVar.o()) {
            String str2 = null;
            if (!roaVar.o()) {
                int i = roaVar.b;
                int charAt = roaVar.a.charAt(i);
                while (true) {
                    if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                        break;
                    }
                    charAt = roaVar.e();
                }
                int i2 = roaVar.b;
                while (roa.s(charAt)) {
                    charAt = roaVar.e();
                }
                if (charAt == 40) {
                    roaVar.b++;
                    str2 = roaVar.a.substring(i, i2);
                } else {
                    roaVar.b = i;
                }
            }
            if (str2 == null) {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
            if (str2.equals("matrix")) {
                roaVar.l();
                float c = roaVar.c();
                roaVar.q();
                float c2 = roaVar.c();
                roaVar.q();
                float c3 = roaVar.c();
                roaVar.q();
                float c4 = roaVar.c();
                roaVar.q();
                float c5 = roaVar.c();
                roaVar.q();
                float c6 = roaVar.c();
                roaVar.l();
                if (Float.isNaN(c6) || !roaVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{c, c3, c5, c2, c4, c6, 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            } else if (str2.equals("translate")) {
                roaVar.l();
                float c7 = roaVar.c();
                float d = roaVar.d();
                roaVar.l();
                if (Float.isNaN(c7) || !roaVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(d)) {
                    matrix.preTranslate(c7, 0.0f);
                } else {
                    matrix.preTranslate(c7, d);
                }
            } else if (str2.equals("scale")) {
                roaVar.l();
                float c8 = roaVar.c();
                float d2 = roaVar.d();
                roaVar.l();
                if (Float.isNaN(c8) || !roaVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(d2)) {
                    matrix.preScale(c8, c8);
                } else {
                    matrix.preScale(c8, d2);
                }
            } else if (str2.equals("rotate")) {
                roaVar.l();
                float c9 = roaVar.c();
                float d3 = roaVar.d();
                float d4 = roaVar.d();
                roaVar.l();
                if (Float.isNaN(c9) || !roaVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(d3)) {
                    matrix.preRotate(c9);
                } else {
                    if (Float.isNaN(d4)) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    matrix.preRotate(c9, d3, d4);
                }
            } else if (str2.equals("skewX")) {
                roaVar.l();
                float c10 = roaVar.c();
                roaVar.l();
                if (Float.isNaN(c10) || !roaVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                matrix.preSkew((float) Math.tan(Math.toRadians(c10)), 0.0f);
            } else {
                if (!str2.equals("skewY")) {
                    throw new SAXException(a.a(str2, "Invalid transform list fn: ", ")"));
                }
                roaVar.l();
                float c11 = roaVar.c();
                roaVar.l();
                if (Float.isNaN(c11) || !roaVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(c11)));
            }
            if (roaVar.o()) {
                break;
            }
            roaVar.q();
        }
        return matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void H(defpackage.rlm r7, org.xml.sax.Attributes r8) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.getLength()
            if (r1 >= r2) goto Lc2
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r8.getLocalName(r1)
            rny r3 = defpackage.rny.a(r3)
            int r3 = r3.ordinal()
            r4 = 23
            if (r3 == r4) goto Lb8
            r4 = 24
            r5 = 1
            if (r3 == r4) goto L92
            r4 = 26
            if (r3 == r4) goto L83
            r4 = 60
            if (r3 == r4) goto L2f
            goto Lbe
        L2f:
            int r3 = r2.hashCode()     // Catch: java.lang.IllegalArgumentException -> L75
            r4 = -934531685(0xffffffffc84c2d9b, float:-209078.42)
            r6 = 2
            if (r3 == r4) goto L58
            r4 = 110739(0x1b093, float:1.55178E-40)
            if (r3 == r4) goto L4e
            r4 = 1085265597(0x40afd6bd, float:5.494963)
            if (r3 == r4) goto L44
            goto L62
        L44:
            java.lang.String r3 = "reflect"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L62
            r3 = r5
            goto L63
        L4e:
            java.lang.String r3 = "pad"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L62
            r3 = r0
            goto L63
        L58:
            java.lang.String r3 = "repeat"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L62
            r3 = r6
            goto L63
        L62:
            r3 = -1
        L63:
            if (r3 == 0) goto L72
            if (r3 == r5) goto L71
            if (r3 != r6) goto L6b
            r5 = 3
            goto L72
        L6b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L75
            r7.<init>()     // Catch: java.lang.IllegalArgumentException -> L75
            throw r7     // Catch: java.lang.IllegalArgumentException -> L75
        L71:
            r5 = r6
        L72:
            r7.e = r5     // Catch: java.lang.IllegalArgumentException -> L75
            goto Lbe
        L75:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid spreadMethod attribute. \""
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r8 = defpackage.a.a(r2, r8, r0)
            r7.<init>(r8)
            throw r7
        L83:
            java.lang.String r3 = r8.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lbe
            r7.d = r2
            goto Lbe
        L92:
            java.lang.String r3 = "objectBoundingBox"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto La1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r7.b = r2
            goto Lbe
        La1:
            java.lang.String r3 = "userSpaceOnUse"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r7.b = r2
            goto Lbe
        Lb0:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid value for attribute gradientUnits"
            r7.<init>(r8)
            throw r7
        Lb8:
            android.graphics.Matrix r2 = G(r2)
            r7.c = r2
        Lbe:
            int r1 = r1 + 1
            goto L2
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.H(rlm, org.xml.sax.Attributes):void");
    }

    private static final void I(rlp rlpVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (rny.a(attributes.getLocalName(i)) == rny.transform) {
                rlpVar.a(G(attributes.getValue(i)));
            }
        }
    }

    protected static rlr a(String str) {
        int i;
        int a;
        if (str.length() == 0) {
            throw new SAXException("Invalid length value (empty string)");
        }
        int length = str.length();
        int i2 = length - 1;
        char charAt = str.charAt(i2);
        try {
            if (charAt != '%') {
                i = 1;
                if (length > 2 && Character.isLetter(charAt)) {
                    i2 = length - 2;
                    if (Character.isLetter(str.charAt(i2))) {
                        try {
                            a = rne.a(str.substring(i2).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                            throw new SAXException("Invalid length unit specifier: ".concat(String.valueOf(str)));
                        }
                    }
                }
                return new rlr(F(str, length), i);
            }
            a = 9;
            return new rlr(F(str, length), i);
        } catch (NumberFormatException e) {
            throw new SAXException("Invalid length value: ".concat(String.valueOf(str)), e);
        }
        i = a;
        length = i2;
    }

    protected static void c(rmg rmgVar, String str, String str2) {
        Boolean bool;
        String k;
        int i;
        rlr f;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int ordinal = rny.a(str).ordinal();
        int i2 = 5;
        rlf rlfVar = null;
        r3 = null;
        r3 = null;
        rlr[] rlrVarArr = null;
        String str3 = null;
        if (ordinal == 1) {
            if (!"auto".equals(str2)) {
                if (!str2.toLowerCase(Locale.US).startsWith("rect(")) {
                    throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
                }
                roa roaVar = new roa(str2.substring(5));
                roaVar.l();
                rlr i3 = i(roaVar);
                roaVar.q();
                rlr i4 = i(roaVar);
                roaVar.q();
                rlr i5 = i(roaVar);
                roaVar.q();
                rlr i6 = i(roaVar);
                roaVar.l();
                if (!roaVar.m(')')) {
                    throw new SAXException("Bad rect() clip definition: ".concat(String.valueOf(str2)));
                }
                rlfVar = new rlf(i3, i4, i5, i6);
            }
            rmgVar.p = rlfVar;
            rmgVar.a |= 1048576;
            return;
        }
        if (ordinal == 2) {
            rmgVar.x = l(str2, str);
            rmgVar.a |= 268435456;
            return;
        }
        if (ordinal == 4) {
            rmgVar.K = x(str2);
            rmgVar.a |= 536870912;
            return;
        }
        if (ordinal == 5) {
            rmgVar.k = g(str2);
            rmgVar.a |= 4096;
            return;
        }
        if (ordinal == 8) {
            if (!"ltr".equals(str2)) {
                if (!"rtl".equals(str2)) {
                    throw new SAXException("Invalid direction property: ".concat(String.valueOf(str2)));
                }
                r4 = 2;
            }
            rmgVar.I = r4;
            rmgVar.a |= 68719476736L;
            return;
        }
        if (ordinal == 35) {
            rmgVar.y = l(str2, str);
            rmgVar.a |= 1073741824;
            return;
        }
        if (ordinal == 40) {
            rmgVar.j = Float.valueOf(e(str2));
            rmgVar.a |= 2048;
            return;
        }
        if (ordinal == 42) {
            if ("visible".equals(str2) || "auto".equals(str2)) {
                bool = Boolean.TRUE;
            } else {
                if (!"hidden".equals(str2) && !"scroll".equals(str2)) {
                    throw new SAXException("Invalid toverflow property: ".concat(String.valueOf(str2)));
                }
                bool = Boolean.FALSE;
            }
            rmgVar.o = bool;
            rmgVar.a |= 524288;
            return;
        }
        if (ordinal == 78) {
            if (!"none".equals(str2)) {
                if (!"non-scaling-stroke".equals(str2)) {
                    throw new SAXException("Invalid vector-effect property: ".concat(String.valueOf(str2)));
                }
                r4 = 2;
            }
            rmgVar.L = r4;
            rmgVar.a |= 34359738368L;
            return;
        }
        if (ordinal == 58) {
            if (str2.equals("currentColor")) {
                rmgVar.z = rlj.a;
            } else {
                rmgVar.z = g(str2);
            }
            rmgVar.a |= 2147483648L;
            return;
        }
        if (ordinal == 59) {
            rmgVar.A = Float.valueOf(e(str2));
            rmgVar.a |= 4294967296L;
            return;
        }
        if (ordinal == 74) {
            if (!ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME.equals(str2)) {
                if ("middle".equals(str2)) {
                    r4 = 2;
                } else {
                    if (!ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME.equals(str2)) {
                        throw new SAXException("Invalid text-anchor property: ".concat(String.valueOf(str2)));
                    }
                    r4 = 3;
                }
            }
            rmgVar.J = r4;
            rmgVar.a |= 262144;
            return;
        }
        if (ordinal == 75) {
            if ("none".equals(str2)) {
                i2 = 1;
            } else if ("underline".equals(str2)) {
                i2 = 2;
            } else if ("overline".equals(str2)) {
                i2 = 3;
            } else if ("line-through".equals(str2)) {
                i2 = 4;
            } else if (!"blink".equals(str2)) {
                throw new SAXException("Invalid text-decoration property: ".concat(String.valueOf(str2)));
            }
            rmgVar.H = i2;
            rmgVar.a |= 131072;
            return;
        }
        switch (ordinal) {
            case 14:
                if (str2.indexOf(124) >= 0 || "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf(a.a(str2, "|", "|")) == -1) {
                    throw new SAXException("Invalid value for \"display\" attribute: ".concat(String.valueOf(str2)));
                }
                rmgVar.t = Boolean.valueOf(!str2.equals("none"));
                rmgVar.a |= 16777216;
                return;
            case 15:
                rmgVar.b = k(str2, "fill");
                rmgVar.a |= 1;
                return;
            case 16:
                rmgVar.D = x(str2);
                rmgVar.a |= 2;
                return;
            case 17:
                rmgVar.c = Float.valueOf(e(str2));
                rmgVar.a |= 4;
                return;
            case 18:
                if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf(a.a(str2, "|", "|")) == -1) {
                    roa roaVar2 = new roa(str2);
                    int i7 = 0;
                    Integer num = null;
                    String str4 = null;
                    while (true) {
                        k = roaVar2.k('/');
                        roaVar2.l();
                        if (k == null) {
                            throw new SAXException("Invalid font style attribute: missing font size and family");
                        }
                        if (num == null) {
                            i = i7;
                        } else if (i7 == 0) {
                            i = 0;
                        }
                        if (!k.equals("normal") && (num != null || (num = rnx.a(k)) == null)) {
                            if (i == 0) {
                                i7 = y(k);
                                if (i7 != 0) {
                                    continue;
                                }
                            } else {
                                i7 = i;
                            }
                            if (str4 == null && k.equals("small-caps")) {
                                str4 = k;
                            }
                        }
                    }
                    rlr h = h(k);
                    if (roaVar2.m('/')) {
                        roaVar2.l();
                        String j = roaVar2.j();
                        if (j == null) {
                            throw new SAXException("Invalid font style attribute: missing line-height");
                        }
                        a(j);
                        roaVar2.l();
                    }
                    if (!roaVar2.o()) {
                        int i8 = roaVar2.b;
                        roaVar2.b = roaVar2.c;
                        str3 = roaVar2.a.substring(i8);
                    }
                    rmgVar.l = m(str3);
                    rmgVar.m = h;
                    rmgVar.n = Integer.valueOf(num == null ? 400 : num.intValue());
                    rmgVar.G = i7 != 0 ? i7 : 1;
                    rmgVar.a |= 122880;
                    return;
                }
                return;
            case 19:
                rmgVar.l = m(str2);
                rmgVar.a |= 8192;
                return;
            case 20:
                rmgVar.m = h(str2);
                rmgVar.a |= 16384;
                return;
            case 21:
                Integer a = rnx.a(str2);
                if (a == null) {
                    throw new SAXException("Invalid font-weight property: ".concat(String.valueOf(str2)));
                }
                rmgVar.n = a;
                rmgVar.a |= 32768;
                return;
            case 22:
                int y = y(str2);
                if (y == 0) {
                    throw new SAXException("Invalid font-style property: ".concat(String.valueOf(str2)));
                }
                rmgVar.G = y;
                rmgVar.a |= 65536;
                return;
            default:
                switch (ordinal) {
                    case 28:
                        rmgVar.q = l(str2, str);
                        String str5 = rmgVar.q;
                        rmgVar.r = str5;
                        rmgVar.s = str5;
                        rmgVar.a |= 14680064;
                        return;
                    case 29:
                        rmgVar.q = l(str2, str);
                        rmgVar.a |= 2097152;
                        return;
                    case 30:
                        rmgVar.r = l(str2, str);
                        rmgVar.a |= 4194304;
                        return;
                    case 31:
                        rmgVar.s = l(str2, str);
                        rmgVar.a |= 8388608;
                        return;
                    default:
                        switch (ordinal) {
                            case 62:
                                if (str2.equals("currentColor")) {
                                    rmgVar.v = rlj.a;
                                } else {
                                    rmgVar.v = g(str2);
                                }
                                rmgVar.a |= 67108864;
                                return;
                            case 63:
                                rmgVar.w = Float.valueOf(e(str2));
                                rmgVar.a |= 134217728;
                                return;
                            case 64:
                                rmgVar.d = k(str2, "stroke");
                                rmgVar.a |= 8;
                                return;
                            case 65:
                                if ("none".equals(str2)) {
                                    rmgVar.h = null;
                                } else {
                                    roa roaVar3 = new roa(str2);
                                    roaVar3.l();
                                    if (!roaVar3.o() && (f = roaVar3.f()) != null) {
                                        if (f.e()) {
                                            throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                        }
                                        float f2 = f.a;
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(f);
                                        while (!roaVar3.o()) {
                                            roaVar3.q();
                                            rlr f3 = roaVar3.f();
                                            if (f3 == null) {
                                                throw new SAXException("Invalid stroke-dasharray. Non-Length content found: ".concat(String.valueOf(str2)));
                                            }
                                            if (f3.e()) {
                                                throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                            }
                                            arrayList.add(f3);
                                            f2 += f3.a;
                                        }
                                        if (f2 != 0.0f) {
                                            rlrVarArr = (rlr[]) arrayList.toArray(new rlr[arrayList.size()]);
                                        }
                                    }
                                    rmgVar.h = rlrVarArr;
                                }
                                rmgVar.a |= 512;
                                return;
                            case 66:
                                rmgVar.i = a(str2);
                                rmgVar.a |= 1024;
                                return;
                            case 67:
                                if (!"butt".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        r4 = 2;
                                    } else {
                                        if (!"square".equals(str2)) {
                                            throw new SAXException("Invalid stroke-linecap property: ".concat(String.valueOf(str2)));
                                        }
                                        r4 = 3;
                                    }
                                }
                                rmgVar.E = r4;
                                rmgVar.a |= 64;
                                return;
                            case 68:
                                if (!"miter".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        r4 = 2;
                                    } else {
                                        if (!"bevel".equals(str2)) {
                                            throw new SAXException("Invalid stroke-linejoin property: ".concat(String.valueOf(str2)));
                                        }
                                        r4 = 3;
                                    }
                                }
                                rmgVar.F = r4;
                                rmgVar.a |= 128;
                                return;
                            case 69:
                                rmgVar.g = Float.valueOf(d(str2));
                                rmgVar.a |= 256;
                                return;
                            case 70:
                                rmgVar.e = Float.valueOf(e(str2));
                                rmgVar.a |= 16;
                                return;
                            case 71:
                                rmgVar.f = a(str2);
                                rmgVar.a |= 32;
                                return;
                            default:
                                switch (ordinal) {
                                    case 88:
                                        if (str2.equals("currentColor")) {
                                            rmgVar.B = rlj.a;
                                        } else {
                                            rmgVar.B = g(str2);
                                        }
                                        rmgVar.a |= 8589934592L;
                                        return;
                                    case 89:
                                        rmgVar.C = Float.valueOf(e(str2));
                                        rmgVar.a |= 17179869184L;
                                        return;
                                    case 90:
                                        if (str2.indexOf(124) >= 0 || "|visible|hidden|collapse|".indexOf(a.a(str2, "|", "|")) == -1) {
                                            throw new SAXException("Invalid value for \"visibility\" attribute: ".concat(String.valueOf(str2)));
                                        }
                                        rmgVar.u = Boolean.valueOf(str2.equals("visible"));
                                        rmgVar.a |= 33554432;
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
        }
    }

    private static float d(String str) {
        int length = str.length();
        if (length != 0) {
            return F(str, length);
        }
        throw new SAXException("Invalid float value (empty string)");
    }

    private static float e(String str) {
        float d = d(str);
        if (d < 0.0f) {
            return 0.0f;
        }
        if (d > 1.0f) {
            return 1.0f;
        }
        return d;
    }

    private static int f(float f) {
        if (f < 0.0f) {
            return 0;
        }
        return f > 255.0f ? PrivateKeyType.INVALID : Math.round(f);
    }

    private static rli g(String str) {
        long j;
        int i;
        if (str.charAt(0) != '#') {
            if (!str.toLowerCase(Locale.US).startsWith("rgb(")) {
                Integer num = (Integer) rnv.a.get(str.toLowerCase(Locale.US));
                if (num != null) {
                    return new rli(num.intValue());
                }
                throw new SAXException("Invalid colour keyword: ".concat(String.valueOf(str)));
            }
            roa roaVar = new roa(str.substring(4));
            roaVar.l();
            float c = roaVar.c();
            if (!Float.isNaN(c) && roaVar.m('%')) {
                c = (c * 256.0f) / 100.0f;
            }
            float b = roaVar.b(c);
            if (!Float.isNaN(b) && roaVar.m('%')) {
                b = (b * 256.0f) / 100.0f;
            }
            float b2 = roaVar.b(b);
            if (!Float.isNaN(b2) && roaVar.m('%')) {
                b2 = (b2 * 256.0f) / 100.0f;
            }
            roaVar.l();
            if (Float.isNaN(b2) || !roaVar.m(')')) {
                throw new SAXException("Bad rgb() colour value: ".concat(String.valueOf(str)));
            }
            return new rli((f(c) << 16) | (f(b) << 8) | f(b2));
        }
        int length = str.length();
        rla rlaVar = null;
        if (length > 1) {
            long j2 = 0;
            int i2 = 1;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt < '0' || charAt > '9') {
                    if (charAt >= 'A' && charAt <= 'F') {
                        j = j2 * 16;
                        i = charAt - 'A';
                    } else {
                        if (charAt < 'a' || charAt > 'f') {
                            break;
                        }
                        j = j2 * 16;
                        i = charAt - 'a';
                    }
                    j2 = j + i + 10;
                } else {
                    j2 = (j2 * 16) + (charAt - '0');
                }
                if (j2 > 4294967295L) {
                    break;
                }
                i2++;
            }
            if (i2 != 1) {
                rlaVar = new rla(j2, i2);
            }
        }
        if (rlaVar == null) {
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        }
        int i3 = rlaVar.a;
        if (i3 == 7) {
            return new rli(rlaVar.a());
        }
        if (i3 != 4) {
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        }
        int a = rlaVar.a();
        int i4 = a & 3840;
        int i5 = a & 240;
        int i6 = a & 15;
        return new rli(i6 | (i4 << 8) | (i4 << 12) | (-16777216) | (i5 << 8) | (i5 << 4) | (i6 << 4));
    }

    private static rlr h(String str) {
        rlr rlrVar = (rlr) rnw.a.get(str);
        return rlrVar == null ? a(str) : rlrVar;
    }

    private static rlr i(roa roaVar) {
        return roaVar.n("auto") ? new rlr(0.0f) : roaVar.f();
    }

    private static rmq j(String str) {
        if (str.equals("none")) {
            return null;
        }
        return str.equals("currentColor") ? rlj.a : g(str);
    }

    private static rmq k(String str, String str2) {
        if (!str.startsWith("url(")) {
            return j(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            throw new SAXException(a.a(str2, "Bad ", " attribute. Unterminated url() reference"));
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        return new rlw(trim, trim2.length() > 0 ? j(trim2) : null);
    }

    private static String l(String str, String str2) {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        throw new SAXException(a.a(str2, "Bad ", " attribute. Expected \"none\" or \"url()\" format"));
    }

    private static List m(String str) {
        roa roaVar = new roa(str);
        ArrayList arrayList = null;
        do {
            String i = roaVar.i();
            if (i == null) {
                i = roaVar.k(',');
            }
            if (i == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(i);
            roaVar.q();
        } while (!roaVar.o());
        return arrayList;
    }

    private static List n(String str) {
        if (str.length() == 0) {
            throw new SAXException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        roa roaVar = new roa(str);
        roaVar.l();
        while (!roaVar.o()) {
            float c = roaVar.c();
            if (Float.isNaN(c)) {
                int i = roaVar.b;
                while (!roaVar.o() && !roa.s(roaVar.a.charAt(roaVar.b))) {
                    roaVar.b++;
                }
                String substring = roaVar.a.substring(i, roaVar.b);
                roaVar.b = i;
                throw new SAXException("Invalid length list value: ".concat(String.valueOf(substring)));
            }
            int r = roaVar.r();
            if (r == 0) {
                r = 1;
            }
            arrayList.add(new rlr(c, r));
            roaVar.q();
        }
        return arrayList;
    }

    private final void o(Attributes attributes) {
        rml rmlVar = this.b;
        if (rmlVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rlg rlgVar = new rlg();
        rlgVar.t = this.a;
        rlgVar.u = rmlVar;
        A(rlgVar, attributes);
        C(rlgVar, attributes);
        I(rlgVar, attributes);
        z(rlgVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = rny.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                rlgVar.a = a(trim);
            } else if (ordinal == 7) {
                rlgVar.b = a(trim);
            } else if (ordinal != 49) {
                continue;
            } else {
                rlgVar.c = a(trim);
                if (rlgVar.c.e()) {
                    throw new SAXException("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.b.b(rlgVar);
    }

    private final void p(Attributes attributes) {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rlh rlhVar = new rlh();
        rlhVar.t = this.a;
        rlhVar.u = this.b;
        A(rlhVar, attributes);
        C(rlhVar, attributes);
        I(rlhVar, attributes);
        z(rlhVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (rny.a(attributes.getLocalName(i)).ordinal() == 3) {
                if ("objectBoundingBox".equals(trim)) {
                    rlhVar.a = false;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new SAXException("Invalid value for attribute clipPathUnits");
                    }
                    rlhVar.a = true;
                }
            }
        }
        this.b.b(rlhVar);
        this.b = rlhVar;
    }

    private final void q(Attributes attributes) {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rlk rlkVar = new rlk();
        rlkVar.t = this.a;
        rlkVar.u = this.b;
        A(rlkVar, attributes);
        C(rlkVar, attributes);
        I(rlkVar, attributes);
        this.b.b(rlkVar);
        this.b = rlkVar;
    }

    private final void r(Attributes attributes) {
        rml rmlVar = this.b;
        if (rmlVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rll rllVar = new rll();
        rllVar.t = this.a;
        rllVar.u = rmlVar;
        A(rllVar, attributes);
        C(rllVar, attributes);
        I(rllVar, attributes);
        z(rllVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = rny.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                rllVar.a = a(trim);
            } else if (ordinal == 7) {
                rllVar.b = a(trim);
            } else if (ordinal == 56) {
                rllVar.c = a(trim);
                if (rllVar.c.e()) {
                    throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (ordinal != 57) {
                continue;
            } else {
                rllVar.d = a(trim);
                if (rllVar.d.e()) {
                    throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                }
            }
        }
        this.b.b(rllVar);
    }

    private final void s(Attributes attributes) {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rlo rloVar = new rlo();
        rloVar.t = this.a;
        rloVar.u = this.b;
        A(rloVar, attributes);
        C(rloVar, attributes);
        I(rloVar, attributes);
        z(rloVar, attributes);
        this.b.b(rloVar);
        this.b = rloVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t(org.xml.sax.Attributes r6) {
        /*
            r5 = this;
            rml r0 = r5.b
            if (r0 == 0) goto La1
            rlq r0 = new rlq
            r0.<init>()
            rnh r1 = r5.a
            r0.t = r1
            rml r1 = r5.b
            r0.u = r1
            A(r0, r6)
            C(r0, r6)
            I(r0, r6)
            z(r0, r6)
            r1 = 0
        L1e:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L99
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r6.getLocalName(r1)
            rny r3 = defpackage.rny.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L80
            r4 = 26
            if (r3 == r4) goto L71
            r4 = 48
            if (r3 == r4) goto L6d
            switch(r3) {
                case 81: goto L56;
                case 82: goto L4f;
                case 83: goto L48;
                default: goto L47;
            }
        L47:
            goto L8e
        L48:
            rlr r2 = a(r2)
            r0.c = r2
            goto L8e
        L4f:
            rlr r2 = a(r2)
            r0.b = r2
            goto L8e
        L56:
            rlr r2 = a(r2)
            r0.d = r2
            rlr r2 = r0.d
            boolean r2 = r2.e()
            if (r2 != 0) goto L65
            goto L8e
        L65:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            r6.<init>(r0)
            throw r6
        L6d:
            w(r0, r2)
            goto L8e
        L71:
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L8e
            r0.a = r2
            goto L8e
        L80:
            rlr r2 = a(r2)
            r0.e = r2
            rlr r2 = r0.e
            boolean r2 = r2.e()
            if (r2 != 0) goto L91
        L8e:
            int r1 = r1 + 1
            goto L1e
        L91:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            r6.<init>(r0)
            throw r6
        L99:
            rml r6 = r5.b
            r6.b(r0)
            r5.b = r0
            return
        La1:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.t(org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(org.xml.sax.Attributes r7) {
        /*
            r6 = this;
            rml r0 = r6.b
            if (r0 == 0) goto Lcc
            rlt r0 = new rlt
            r0.<init>()
            rnh r1 = r6.a
            r0.t = r1
            rml r1 = r6.b
            r0.u = r1
            A(r0, r7)
            C(r0, r7)
            z(r0, r7)
            E(r0, r7)
            r1 = 0
            r2 = r1
        L1f:
            int r3 = r7.getLength()
            if (r2 >= r3) goto Lc4
            java.lang.String r3 = r7.getValue(r2)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r7.getLocalName(r2)
            rny r4 = defpackage.rny.a(r4)
            int r4 = r4.ordinal()
            r5 = 41
            if (r4 == r5) goto La5
            r5 = 50
            if (r4 == r5) goto L9e
            r5 = 51
            if (r4 == r5) goto L97
            switch(r4) {
                case 32: goto L80;
                case 33: goto L61;
                case 34: goto L4a;
                default: goto L48;
            }
        L48:
            goto Lc0
        L4a:
            rlr r3 = a(r3)
            r0.d = r3
            rlr r3 = r0.d
            boolean r3 = r3.e()
            if (r3 != 0) goto L59
            goto Lc0
        L59:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerWidth cannot be negative"
            r7.<init>(r0)
            throw r7
        L61:
            java.lang.String r4 = "strokeWidth"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L6c
            r0.a = r1
            goto Lc0
        L6c:
            java.lang.String r4 = "userSpaceOnUse"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L78
            r3 = 1
            r0.a = r3
            goto Lc0
        L78:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute markerUnits"
            r7.<init>(r0)
            throw r7
        L80:
            rlr r3 = a(r3)
            r0.e = r3
            rlr r3 = r0.e
            boolean r3 = r3.e()
            if (r3 != 0) goto L8f
            goto Lc0
        L8f:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerHeight cannot be negative"
            r7.<init>(r0)
            throw r7
        L97:
            rlr r3 = a(r3)
            r0.c = r3
            goto Lc0
        L9e:
            rlr r3 = a(r3)
            r0.b = r3
            goto Lc0
        La5:
            java.lang.String r4 = "auto"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto Lb6
            r3 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
            goto Lc0
        Lb6:
            float r3 = d(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
        Lc0:
            int r2 = r2 + 1
            goto L1f
        Lc4:
            rml r7 = r6.b
            r7.b(r0)
            r6.b = r0
            return
        Lcc:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.u(org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(org.xml.sax.Attributes r8) {
        /*
            r7 = this;
            rml r0 = r7.b
            if (r0 == 0) goto Lb4
            rlu r0 = new rlu
            r0.<init>()
            rnh r1 = r7.a
            r0.t = r1
            rml r1 = r7.b
            r0.u = r1
            A(r0, r8)
            C(r0, r8)
            z(r0, r8)
            r1 = 0
        L1b:
            int r2 = r8.getLength()
            if (r1 >= r2) goto Lac
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r8.getLocalName(r1)
            rny r3 = defpackage.rny.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L92
            r4 = 36
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            if (r3 == r4) goto L7d
            r4 = 37
            if (r3 == r4) goto L68
            switch(r3) {
                case 81: goto L51;
                case 82: goto L4d;
                case 83: goto L49;
                default: goto L48;
            }
        L48:
            goto La0
        L49:
            a(r2)
            goto La0
        L4d:
            a(r2)
            goto La0
        L51:
            rlr r2 = a(r2)
            r0.a = r2
            rlr r2 = r0.a
            boolean r2 = r2.e()
            if (r2 != 0) goto L60
            goto La0
        L60:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            r8.<init>(r0)
            throw r8
        L68:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La0
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L75
            goto La0
        L75:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            r8.<init>(r0)
            throw r8
        L7d:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La0
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
            goto La0
        L8a:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            r8.<init>(r0)
            throw r8
        L92:
            rlr r2 = a(r2)
            r0.b = r2
            rlr r2 = r0.b
            boolean r2 = r2.e()
            if (r2 != 0) goto La4
        La0:
            int r1 = r1 + 1
            goto L1b
        La4:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            r8.<init>(r0)
            throw r8
        Lac:
            rml r8 = r7.b
            r8.b(r0)
            r7.b = r0
            return
        Lb4:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.v(org.xml.sax.Attributes):void");
    }

    private static void w(rmr rmrVar, String str) {
        int i;
        roa roaVar = new roa(str);
        roaVar.l();
        String j = roaVar.j();
        if ("defer".equals(j)) {
            roaVar.l();
            j = roaVar.j();
        }
        rlc rlcVar = (rlc) rnu.a.get(j);
        roaVar.l();
        if (roaVar.o()) {
            i = 0;
        } else {
            String j2 = roaVar.j();
            if (j2.equals("meet")) {
                i = 1;
            } else {
                if (!j2.equals("slice")) {
                    throw new SAXException("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
                }
                i = 2;
            }
        }
        rmrVar.v = new rld(rlcVar, i);
    }

    private static int x(String str) {
        if ("nonzero".equals(str)) {
            return 1;
        }
        if ("evenodd".equals(str)) {
            return 2;
        }
        throw new SAXException("Invalid fill-rule property: ".concat(String.valueOf(str)));
    }

    private static int y(String str) {
        if ("italic".equals(str)) {
            return 2;
        }
        if ("normal".equals(str)) {
            return 1;
        }
        return "oblique".equals(str) ? 3 : 0;
    }

    private static final void z(rmi rmiVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = rny.a(attributes.getLocalName(i)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        roa roaVar = new roa(trim);
                        HashSet hashSet = new HashSet();
                        while (!roaVar.o()) {
                            String j = roaVar.j();
                            if (j.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(j.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            roaVar.l();
                        }
                        rmiVar.i(hashSet);
                        break;
                    case 53:
                        rmiVar.h(trim);
                        break;
                    case 54:
                        roa roaVar2 = new roa(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!roaVar2.o()) {
                            hashSet2.add(roaVar2.j());
                            roaVar2.l();
                        }
                        rmiVar.k(hashSet2);
                        break;
                    case 55:
                        List m = m(trim);
                        rmiVar.j(m != null ? new HashSet(m) : new HashSet(0));
                        break;
                }
            } else {
                roa roaVar3 = new roa(trim);
                HashSet hashSet3 = new HashSet();
                while (!roaVar3.o()) {
                    String j2 = roaVar3.j();
                    int indexOf = j2.indexOf(45);
                    if (indexOf != -1) {
                        j2 = j2.substring(0, indexOf);
                    }
                    hashSet3.add(new Locale(j2, "", "").getLanguage());
                    roaVar3.l();
                }
                rmiVar.l(hashSet3);
            }
        }
    }

    public final rnh b(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new GZIPInputStream(inputStream);
            }
        } catch (IOException unused) {
        }
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        try {
            try {
                try {
                    try {
                        XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
                        xMLReader.setContentHandler(this);
                        xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
                        xMLReader.parse(new InputSource(inputStream));
                        return this.a;
                    } catch (SAXException e) {
                        throw new rnt("SVG parse error: " + e.getMessage(), e);
                    }
                } catch (ParserConfigurationException e2) {
                    throw new rnt("XML Parser problem", e2);
                }
            } catch (IOException e3) {
                throw new rnt("File error", e3);
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
            return;
        }
        if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
            return;
        }
        rml rmlVar = this.b;
        if (rmlVar instanceof rna) {
            rmj rmjVar = (rmj) rmlVar;
            int size = rmjVar.i.size();
            rmp rmpVar = size == 0 ? null : (rmp) rmjVar.i.get(size - 1);
            if (!(rmpVar instanceof rnd)) {
                ((rmj) this.b).b(new rnd(new String(cArr, i, i2)));
                return;
            }
            rnd rndVar = (rnd) rmpVar;
            rndVar.a = String.valueOf(rndVar.a).concat(new String(cArr, i, i2));
        }
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        if (!this.c && this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            switch (rnz.a(str2).ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.b = ((rmp) this.b).u;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    rnz rnzVar = this.f;
                    if (rnzVar == rnz.title) {
                        this.g.toString();
                    } else if (rnzVar == rnz.desc) {
                        this.g.toString();
                    }
                    this.g.setLength(0);
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String sb2 = sb.toString();
                        rkz rkzVar = new rkz(rku.screen);
                        rnh rnhVar = this.a;
                        rkt rktVar = new rkt(sb2);
                        rktVar.l();
                        rnhVar.c.a(rkzVar.a(rktVar));
                        this.i.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.a = new rnh();
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x0483, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x064a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0aaa, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:413:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x093c A[SYNTHETIC] */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startElement(java.lang.String r24, java.lang.String r25, java.lang.String r26, org.xml.sax.Attributes r27) {
        /*
            Method dump skipped, instructions count: 2978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }
}
