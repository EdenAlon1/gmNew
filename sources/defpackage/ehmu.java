package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmu {
    public final ColorStateList a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final ColorStateList k;
    public float l;
    public Typeface m;
    private final int n;
    private boolean o = false;
    private boolean p = false;

    public ehmu(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ehmr.b);
        this.l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.k = ehmq.c(context, obtainStyledAttributes, 3);
        ehmq.c(context, obtainStyledAttributes, 4);
        ehmq.c(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int b = ehmq.b(obtainStyledAttributes, 12, 10);
        this.n = obtainStyledAttributes.getResourceId(b, 0);
        this.b = obtainStyledAttributes.getString(b);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = ehmq.c(context, obtainStyledAttributes, 6);
        this.f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, ehmr.a);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, 0.0f);
        this.c = obtainStyledAttributes2.getString(ehmq.b(obtainStyledAttributes2, 3, 1));
        obtainStyledAttributes2.recycle();
    }

    private final void g() {
        Typeface typeface;
        String str;
        if (this.m == null && (str = this.b) != null) {
            this.m = Typeface.create(str, this.d);
        }
        if (this.m == null) {
            int i = this.e;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else {
                if (i != 3) {
                    this.m = Typeface.DEFAULT;
                    this.m = Typeface.create(this.m, this.d);
                }
                typeface = Typeface.MONOSPACE;
            }
            this.m = typeface;
            this.m = Typeface.create(this.m, this.d);
        }
    }

    private final boolean h(Context context) {
        Context context2;
        Typeface e;
        String str;
        Typeface create;
        if (this.o) {
            return true;
        }
        int i = this.n;
        if (i == 0) {
            return false;
        }
        WeakHashMap weakHashMap = kpp.a;
        Typeface typeface = null;
        if (context.isRestricted()) {
            context2 = context;
            e = null;
        } else {
            context2 = context;
            e = kpp.e(context2, i, new TypedValue(), 0, null, false, true);
        }
        if (e == null) {
            if (!this.p) {
                this.p = true;
                int i2 = this.n;
                Resources resources = context2.getResources();
                if (i2 != 0 && resources.getResourceTypeName(i2).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i2);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), kld.b);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.d);
                }
            }
            if (typeface == null) {
                return false;
            }
            e = typeface;
        }
        this.m = e;
        this.o = true;
        return true;
    }

    public final Typeface a() {
        g();
        return this.m;
    }

    public final void b(Context context, ehmv ehmvVar) {
        if (!h(context)) {
            g();
        }
        int i = this.n;
        if (i == 0) {
            this.o = true;
            i = 0;
        }
        if (this.o) {
            ehmvVar.b(this.m, true);
            return;
        }
        try {
            kpp.d(context, i, new ehms(this, ehmvVar));
        } catch (Resources.NotFoundException unused) {
            this.o = true;
            ehmvVar.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font ".concat(String.valueOf(this.b)), e);
            this.o = true;
            ehmvVar.a(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, ehmv ehmvVar) {
        d(context, textPaint, ehmvVar);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.k.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.a.getDefaultColor()) : 0);
    }

    public final void d(Context context, TextPaint textPaint, ehmv ehmvVar) {
        Typeface typeface;
        if (h(context) && this.o && (typeface = this.m) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new ehmt(this, context, textPaint, ehmvVar));
        }
    }

    public final void e(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a = ehmw.a(context.getResources().getConfiguration(), typeface);
        if (a != null) {
            typeface = a;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText(1 == (i & 1));
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
