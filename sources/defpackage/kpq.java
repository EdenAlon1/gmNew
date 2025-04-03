package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.car.app.model.Alert;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpq {
    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !i(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int b(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !i(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int d(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence f(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String g(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean h(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] j(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int k(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Alert.DURATION_SHOW_INDEFINITELY));
    }

    public static boolean l(TypedArray typedArray, XmlPullParser xmlPullParser, boolean z) {
        return !i(xmlPullParser, "autoMirrored") ? z : typedArray.getBoolean(5, z);
    }

    public static int m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (i(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static ColorStateList n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!i(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        if (typedValue.type == 2) {
            typedValue.toString();
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        int i = kpa.a;
        try {
            return kpa.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0179, code lost:
    
        if (r12.size() <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017b, code lost:
    
        r0 = new defpackage.kpg(r12, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0182, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0194, code lost:
    
        if (r13 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0197, code lost:
    
        if (r13 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0199, code lost:
    
        r13 = new android.graphics.LinearGradient(r22, r23, r16, r17, r0.a, r0.b, defpackage.kph.a(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d6, code lost:
    
        r0 = new defpackage.kpb(r13, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01af, code lost:
    
        r13 = new android.graphics.SweepGradient(r10, r5, r0.a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bd, code lost:
    
        if (r21 <= 0.0f) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bf, code lost:
    
        r13 = new android.graphics.RadialGradient(r10, r5, r21, r0.a, r0.b, defpackage.kph.a(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e5, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0186, code lost:
    
        if (r18 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
    
        r0 = new defpackage.kpg(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018e, code lost:
    
        r0 = new defpackage.kpg(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0181, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kpb o(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpq.o(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):kpb");
    }
}
