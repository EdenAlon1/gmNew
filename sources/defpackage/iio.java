package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iio {
    public final XmlPullParser a;
    private int c = 0;
    public final ihz b = new ihz();

    public iio(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        float a = kpq.a(typedArray, this.a, str, i, f);
        e(typedArray.getChangingConfigurations());
        return a;
    }

    public final int b(TypedArray typedArray, String str, int i, int i2) {
        int c = kpq.c(typedArray, this.a, str, i, i2);
        e(typedArray.getChangingConfigurations());
        return c;
    }

    public final TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray e = kpq.e(resources, theme, attributeSet, iArr);
        e(e.getChangingConfigurations());
        return e;
    }

    public final String d(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        e(typedArray.getChangingConfigurations());
        return string;
    }

    public final void e(int i) {
        this.c = i | this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iio)) {
            return false;
        }
        iio iioVar = (iio) obj;
        return ffkj.e(this.a, iioVar.a) && this.c == iioVar.c;
    }

    public final float f(TypedArray typedArray, int i) {
        float dimension = typedArray.getDimension(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(TypedArray typedArray, int i) {
        float f = typedArray.getFloat(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final kpb h(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        kpb o = kpq.o(typedArray, this.a, theme, str, i);
        e(typedArray.getChangingConfigurations());
        return o;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c;
    }

    public final String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.c + ')';
    }
}
