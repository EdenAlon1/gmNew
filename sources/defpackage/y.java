package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class y extends Format {
    public static final /* synthetic */ int d = 0;
    private static final String[] e = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] f = {"", "currency", "percent", "integer"};
    private static final String[] g = {"", "short", "medium", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG, "full"};
    private static final Locale h = new Locale("");
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient aq b;
    public transient Map c;
    private transient DateFormat i;
    private transient NumberFormat j;
    private transient x k;
    private transient x l;

    public y(String str, Locale locale) {
        Cloneable decimalFormat;
        this.a = locale;
        try {
            aq aqVar = this.b;
            if (aqVar == null) {
                this.b = new aq(str);
            } else {
                aqVar.i(str);
            }
            Map map = this.c;
            if (map != null) {
                map.clear();
            }
            int b = this.b.b() - 2;
            int i = 1;
            while (i < b) {
                ap d2 = this.b.d(i);
                if (d2.e == 6 && d2.b() == 2) {
                    aq aqVar2 = this.b;
                    int i2 = i + 3;
                    String f2 = aqVar2.f(aqVar2.d(i + 2));
                    String str2 = "";
                    ap d3 = this.b.d(i2);
                    if (d3.e == 11) {
                        str2 = this.b.f(d3);
                        i2 = i + 4;
                    }
                    int c = c(f2, e);
                    if (c == 0) {
                        int c2 = c(str2, f);
                        decimalFormat = c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? new DecimalFormat(str2, new DecimalFormatSymbols(this.a)) : NumberFormat.getIntegerInstance(this.a) : NumberFormat.getPercentInstance(this.a) : NumberFormat.getCurrencyInstance(this.a) : NumberFormat.getInstance(this.a);
                    } else if (c == 1) {
                        int c3 = c(str2, g);
                        decimalFormat = c3 != 0 ? c3 != 1 ? c3 != 2 ? c3 != 3 ? c3 != 4 ? new SimpleDateFormat(str2, this.a) : DateFormat.getDateInstance(0, this.a) : DateFormat.getDateInstance(1, this.a) : DateFormat.getDateInstance(2, this.a) : DateFormat.getDateInstance(3, this.a) : DateFormat.getDateInstance(2, this.a);
                    } else {
                        if (c != 2) {
                            throw new IllegalArgumentException(a.a(f2, "Unknown format type \"", "\""));
                        }
                        int c4 = c(str2, g);
                        decimalFormat = c4 != 0 ? c4 != 1 ? c4 != 2 ? c4 != 3 ? c4 != 4 ? new SimpleDateFormat(str2, this.a) : DateFormat.getTimeInstance(0, this.a) : DateFormat.getTimeInstance(1, this.a) : DateFormat.getTimeInstance(2, this.a) : DateFormat.getTimeInstance(3, this.a) : DateFormat.getTimeInstance(2, this.a);
                    }
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(Integer.valueOf(i), decimalFormat);
                    i = i2;
                }
                i++;
            }
        } catch (RuntimeException e2) {
            aq aqVar3 = this.b;
            if (aqVar3 != null) {
                aqVar3.a = null;
                aqVar3.d = false;
                aqVar3.b.clear();
                ArrayList arrayList = aqVar3.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
            throw e2;
        }
    }

    private static final int c(String str, String[] strArr) {
        byte[] bArr = r.a;
        if (str.length() != 0 && (r.a(str.charAt(0)) || r.a(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i = 0;
            while (i < length && r.a(str.charAt(i))) {
                i++;
            }
            if (i < length) {
                while (true) {
                    int i2 = length - 1;
                    if (!r.a(str.charAt(i2))) {
                        break;
                    }
                    length = i2;
                }
            }
            str = str.substring(i, length);
        }
        String lowerCase = str.toLowerCase(h);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (lowerCase.equals(strArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    private final void d(Object obj, t tVar, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            e(null, (Map) obj, tVar, fieldPosition);
        } else {
            e((Object[]) obj, null, tVar, fieldPosition);
        }
    }

    private final void e(Object[] objArr, Map map, t tVar, FieldPosition fieldPosition) {
        if (objArr != null && this.b.d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        b(0, null, objArr, map, null, tVar, fieldPosition);
    }

    private final void f(int i, w wVar, Object[] objArr, Map map, Object[] objArr2, t tVar) {
        if (this.b.f == 2) {
            throw new UnsupportedOperationException("JDK apostrophe mode not supported");
        }
        b(i, wVar, objArr, map, objArr2, tVar, null);
    }

    private final void g(String str, ParsePosition parsePosition, Object[] objArr, Map map) {
        String str2;
        String f2;
        Object obj;
        short s;
        short s2;
        int indexOf;
        boolean z;
        Object obj2;
        Map map2;
        boolean z2;
        aq aqVar;
        int i;
        int i2;
        Format format;
        if (str == null) {
            return;
        }
        aq aqVar2 = this.b;
        String str3 = aqVar2.a;
        int a = aqVar2.d(0).a();
        int index = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        boolean z3 = true;
        int i3 = 1;
        while (true) {
            ap d2 = this.b.d(i3);
            int i4 = d2.e;
            int i5 = d2.a - a;
            if (i5 != 0 && !str3.regionMatches(a, str, index, i5)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            index += i5;
            if (i4 == 2) {
                parsePosition.setIndex(index);
                return;
            }
            if (i4 == 3 || i4 == 4) {
                str2 = str3;
                a = d2.a();
            } else {
                int c = this.b.c(i3);
                int b = d2.b();
                ap d3 = this.b.d(i3 + 1);
                if (objArr != null) {
                    s = d3.c;
                    obj = Integer.valueOf(s);
                    f2 = null;
                } else {
                    f2 = d3.e == 9 ? this.b.f(d3) : Integer.toString(d3.c);
                    obj = f2;
                    s = 0;
                }
                int i6 = i3 + 2;
                Map map3 = this.c;
                if (map3 != null && (format = (Format) map3.get(Integer.valueOf(i3))) != null) {
                    parsePosition2.setIndex(index);
                    obj2 = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    str2 = str3;
                    indexOf = parsePosition2.getIndex();
                    z = z3;
                    s2 = s;
                } else if (b == z3 || ((map2 = this.c) != null && map2.containsKey(Integer.valueOf(i3)))) {
                    str2 = str3;
                    boolean z4 = z3;
                    s2 = s;
                    StringBuilder sb = new StringBuilder();
                    aq aqVar3 = this.b;
                    String str4 = aqVar3.a;
                    int a2 = aqVar3.d(c).a();
                    int i7 = c + 1;
                    while (true) {
                        ap d4 = this.b.d(i7);
                        int i8 = d4.e;
                        sb.append((CharSequence) str4, a2, d4.a);
                        if (i8 == 6 || i8 == 2) {
                            break;
                        }
                        i7++;
                        a2 = d4.a();
                    }
                    String sb2 = sb.toString();
                    indexOf = sb2.length() != 0 ? str.indexOf(sb2, index) : str.length();
                    if (indexOf < 0) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    String substring = str.substring(index, indexOf);
                    boolean equals = substring.equals(a.b(obj, "{", "}"));
                    z = !equals;
                    obj2 = z4 == equals ? null : substring;
                } else {
                    if (b != 3) {
                        if (!an.b(b) && b != 5) {
                            throw new IllegalStateException("unexpected argType ".concat(an.a(b)));
                        }
                        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                    }
                    parsePosition2.setIndex(index);
                    aq aqVar4 = this.b;
                    int index2 = parsePosition2.getIndex();
                    double d5 = Double.NaN;
                    int i9 = index2;
                    int i10 = i6;
                    while (true) {
                        z2 = z3;
                        if (aqVar4.h(i10) == 7) {
                            str2 = str3;
                            s2 = s;
                            break;
                        }
                        double a3 = aqVar4.a(aqVar4.d(i10));
                        int i11 = i10 + 2;
                        int c2 = aqVar4.c(i11);
                        String str5 = aqVar4.a;
                        str2 = str3;
                        int a4 = aqVar4.d(i11).a();
                        int i12 = 0;
                        while (true) {
                            i11++;
                            s2 = s;
                            ap d6 = aqVar4.d(i11);
                            aqVar = aqVar4;
                            if (i11 != c2 && d6.e != 3) {
                                aqVar4 = aqVar;
                                s = s2;
                            }
                            int i13 = d6.a - a4;
                            if (i13 != 0 && !str.regionMatches(index2, str5, a4, i13)) {
                                i = -1;
                                break;
                            }
                            i12 += i13;
                            if (i11 == c2) {
                                i = i12;
                                break;
                            } else {
                                a4 = d6.a();
                                aqVar4 = aqVar;
                                s = s2;
                            }
                        }
                        if (i >= 0 && (i2 = i + index2) > i9) {
                            if (i2 == str.length()) {
                                i9 = i2;
                                d5 = a3;
                                break;
                            } else {
                                i9 = i2;
                                d5 = a3;
                            }
                        }
                        i10 = c2 + 1;
                        z3 = z2;
                        aqVar4 = aqVar;
                        str3 = str2;
                        s = s2;
                    }
                    if (i9 == index2) {
                        parsePosition2.setErrorIndex(index2);
                    } else {
                        parsePosition2.setIndex(i9);
                    }
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    } else {
                        obj2 = Double.valueOf(d5);
                        indexOf = parsePosition2.getIndex();
                        z = z2;
                    }
                }
                if (z) {
                    if (objArr != null) {
                        objArr[s2] = obj2;
                    } else if (map != null) {
                        map.put(f2, obj2);
                        a = this.b.d(c).a();
                        index = indexOf;
                        i3 = c;
                    }
                }
                a = this.b.d(c).a();
                index = indexOf;
                i3 = c;
            }
            i3++;
            z3 = true;
            str3 = str2;
        }
    }

    public final NumberFormat a() {
        if (this.j == null) {
            this.j = NumberFormat.getInstance(this.a);
        }
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x035c, code lost:
    
        if (r1 == 2) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0556, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04e4 A[LOOP:2: B:110:0x021c->B:121:0x04e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04f8 A[EDGE_INSN: B:122:0x04f8->B:123:0x04f8 BREAK  A[LOOP:2: B:110:0x021c->B:121:0x04e4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x05b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r37, defpackage.w r38, java.lang.Object[] r39, java.util.Map r40, java.lang.Object[] r41, defpackage.t r42, java.text.FieldPosition r43) {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y.b(int, w, java.lang.Object[], java.util.Map, java.lang.Object[], t, java.text.FieldPosition):void");
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        d(obj, new t(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    @Override // java.text.Format
    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        t tVar = new t(sb);
        tVar.c = new ArrayList();
        d(obj, tVar, null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (u uVar : tVar.c) {
            attributedString.addAttribute(uVar.a, uVar.b, uVar.c, uVar.d);
        }
        return attributedString.getIterator();
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        if (this.b.d) {
            HashMap hashMap = new HashMap();
            int index = parsePosition.getIndex();
            g(str, parsePosition, null, hashMap);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return hashMap;
        }
        int i = 0;
        short s = -1;
        while (true) {
            if (i != 0) {
                i = this.b.c(i);
            }
            while (true) {
                i++;
                int h2 = this.b.h(i);
                if (h2 == 6) {
                    break;
                }
                if (h2 == 2) {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                break;
            }
            short s2 = this.b.d(i + 1).c;
            if (s2 > s) {
                s = s2;
            }
        }
        Object[] objArr = new Object[s + 1];
        int index2 = parsePosition.getIndex();
        g(str, parsePosition, objArr, null);
        if (parsePosition.getIndex() == index2) {
            return null;
        }
        return objArr;
    }
}
