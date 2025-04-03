package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcj extends pca {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public pch b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public pcj() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new pch();
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static pcj b(Resources resources, int i, Resources.Theme theme) {
        pcj pcjVar = new pcj();
        WeakHashMap weakHashMap = kpp.a;
        pcjVar.e = resources.getDrawable(i, theme);
        return pcjVar;
    }

    final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float abs = Math.abs(this.h[0]);
        float abs2 = Math.abs(this.h[4]);
        float abs3 = Math.abs(this.h[1]);
        float abs4 = Math.abs(this.h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.j.width() * abs));
        int min2 = Math.min(2048, (int) (this.j.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.j.left, this.j.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        pch pchVar = this.b;
        Bitmap bitmap = pchVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != pchVar.f.getHeight()) {
            pchVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            pchVar.k = true;
        }
        if (this.c) {
            pch pchVar2 = this.b;
            if (pchVar2.k || pchVar2.g != pchVar2.c || pchVar2.h != pchVar2.d || pchVar2.j != pchVar2.e || pchVar2.i != pchVar2.b.getRootAlpha()) {
                this.b.a(min, min2);
                pch pchVar3 = this.b;
                pchVar3.g = pchVar3.c;
                pchVar3.h = pchVar3.d;
                pchVar3.i = pchVar3.b.getRootAlpha();
                pchVar3.j = pchVar3.e;
                pchVar3.k = false;
            }
        } else {
            this.b.a(min, min2);
        }
        pch pchVar4 = this.b;
        Rect rect = this.j;
        if (pchVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (pchVar4.l == null) {
                pchVar4.l = new Paint();
                pchVar4.l.setFilterBitmap(true);
            }
            pchVar4.l.setAlpha(pchVar4.b.getRootAlpha());
            pchVar4.l.setColorFilter(colorFilter);
            paint = pchVar4.l;
        }
        canvas.drawBitmap(pchVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new pci(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        pch pchVar = this.b;
        if (pchVar == null) {
            return false;
        }
        if (pchVar.b()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new pch(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.pca, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        pch pchVar = this.b;
        ColorStateList colorStateList = pchVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = pchVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (pchVar.b()) {
            boolean c = pchVar.b.d.c(iArr);
            pchVar.k |= c;
            if (c) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        pch pchVar = this.b;
        if (pchVar.c != colorStateList) {
            pchVar.c = colorStateList;
            this.d = c(colorStateList, pchVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        pch pchVar = this.b;
        if (pchVar.d != mode) {
            pchVar.d = mode;
            this.d = c(pchVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        boolean z;
        int i3;
        Resources resources2 = resources;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        pch pchVar = this.b;
        pchVar.b = new pcg();
        TypedArray e = kpq.e(resources2, theme, attributeSet, pbr.a);
        pch pchVar2 = this.b;
        pcg pcgVar = pchVar2.b;
        int c = kpq.c(e, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i4 = 3;
        if (c == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (c == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (c != 9) {
            switch (c) {
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        pchVar2.d = mode;
        ColorStateList n = kpq.n(e, xmlPullParser, theme);
        if (n != null) {
            pchVar2.c = n;
        }
        pchVar2.e = kpq.l(e, xmlPullParser, pchVar2.e);
        pcgVar.g = kpq.a(e, xmlPullParser, "viewportWidth", 7, pcgVar.g);
        float a2 = kpq.a(e, xmlPullParser, "viewportHeight", 8, pcgVar.h);
        pcgVar.h = a2;
        if (pcgVar.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(e.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (a2 > 0.0f) {
            pcgVar.e = e.getDimension(3, pcgVar.e);
            int i5 = 2;
            float dimension = e.getDimension(2, pcgVar.f);
            pcgVar.f = dimension;
            if (pcgVar.e <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(e.getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            if (dimension > 0.0f) {
                pcgVar.setAlpha(kpq.a(e, xmlPullParser, "alpha", 4, pcgVar.getAlpha()));
                boolean z2 = false;
                String string = e.getString(0);
                if (string != null) {
                    pcgVar.j = string;
                    pcgVar.l.put(string, pcgVar);
                }
                e.recycle();
                pchVar.a = getChangingConfigurations();
                pchVar.k = true;
                pch pchVar3 = this.b;
                pcg pcgVar2 = pchVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(pcgVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                for (int i6 = 1; eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i4); i6 = 1) {
                    if (eventType == i5) {
                        String name = xmlPullParser.getName();
                        pcd pcdVar = (pcd) arrayDeque.peek();
                        if (pcdVar != null) {
                            if ("path".equals(name)) {
                                pcc pccVar = new pcc();
                                TypedArray e2 = kpq.e(resources2, theme, attributeSet, pbr.c);
                                pccVar.a = null;
                                if (kpq.i(xmlPullParser, "pathData")) {
                                    String string2 = e2.getString(0);
                                    if (string2 != null) {
                                        pccVar.n = string2;
                                    }
                                    String string3 = e2.getString(2);
                                    if (string3 != null) {
                                        pccVar.m = kpw.b(string3);
                                    }
                                    pccVar.d = kpq.o(e2, xmlPullParser, theme, "fillColor", 1);
                                    i2 = depth;
                                    pccVar.f = kpq.a(e2, xmlPullParser, "fillAlpha", 12, pccVar.f);
                                    int c2 = kpq.c(e2, xmlPullParser, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = pccVar.j;
                                    if (c2 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (c2 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (c2 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    pccVar.j = cap;
                                    int c3 = kpq.c(e2, xmlPullParser, "strokeLineJoin", 9, -1);
                                    Paint.Join join = pccVar.k;
                                    if (c3 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (c3 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (c3 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    pccVar.k = join;
                                    pccVar.l = kpq.a(e2, xmlPullParser, "strokeMiterLimit", 10, pccVar.l);
                                    pccVar.b = kpq.o(e2, xmlPullParser, theme, "strokeColor", 3);
                                    pccVar.e = kpq.a(e2, xmlPullParser, "strokeAlpha", 11, pccVar.e);
                                    pccVar.c = kpq.a(e2, xmlPullParser, "strokeWidth", 4, pccVar.c);
                                    pccVar.h = kpq.a(e2, xmlPullParser, "trimPathEnd", 6, pccVar.h);
                                    pccVar.i = kpq.a(e2, xmlPullParser, "trimPathOffset", 7, pccVar.i);
                                    pccVar.g = kpq.a(e2, xmlPullParser, "trimPathStart", 5, pccVar.g);
                                    pccVar.o = kpq.c(e2, xmlPullParser, "fillType", 13, pccVar.o);
                                } else {
                                    i2 = depth;
                                }
                                e2.recycle();
                                pcdVar.b.add(pccVar);
                                if (pccVar.getPathName() != null) {
                                    pcgVar2.l.put(pccVar.getPathName(), pccVar);
                                }
                                int i7 = pchVar3.a;
                                i3 = 3;
                                z = false;
                                z3 = false;
                            } else {
                                i2 = depth;
                                if ("clip-path".equals(name)) {
                                    pcb pcbVar = new pcb();
                                    if (kpq.i(xmlPullParser, "pathData")) {
                                        TypedArray e3 = kpq.e(resources2, theme, attributeSet, pbr.d);
                                        String string4 = e3.getString(0);
                                        if (string4 != null) {
                                            pcbVar.n = string4;
                                        }
                                        String string5 = e3.getString(1);
                                        if (string5 != null) {
                                            pcbVar.m = kpw.b(string5);
                                        }
                                        pcbVar.o = kpq.c(e3, xmlPullParser, "fillType", 2, 0);
                                        e3.recycle();
                                    }
                                    pcdVar.b.add(pcbVar);
                                    if (pcbVar.getPathName() != null) {
                                        pcgVar2.l.put(pcbVar.getPathName(), pcbVar);
                                    }
                                    int i8 = pchVar3.a;
                                    i3 = 3;
                                    z = false;
                                } else if ("group".equals(name)) {
                                    pcd pcdVar2 = new pcd();
                                    TypedArray e4 = kpq.e(resources2, theme, attributeSet, pbr.b);
                                    pcdVar2.l = null;
                                    pcdVar2.c = kpq.a(e4, xmlPullParser, "rotation", 5, pcdVar2.c);
                                    pcdVar2.d = e4.getFloat(1, pcdVar2.d);
                                    pcdVar2.e = e4.getFloat(2, pcdVar2.e);
                                    pcdVar2.f = kpq.a(e4, xmlPullParser, "scaleX", 3, pcdVar2.f);
                                    pcdVar2.g = kpq.a(e4, xmlPullParser, "scaleY", 4, pcdVar2.g);
                                    pcdVar2.h = kpq.a(e4, xmlPullParser, "translateX", 6, pcdVar2.h);
                                    pcdVar2.i = kpq.a(e4, xmlPullParser, "translateY", 7, pcdVar2.i);
                                    z = false;
                                    String string6 = e4.getString(0);
                                    if (string6 != null) {
                                        pcdVar2.m = string6;
                                    }
                                    pcdVar2.a();
                                    e4.recycle();
                                    pcdVar.b.add(pcdVar2);
                                    arrayDeque.push(pcdVar2);
                                    if (pcdVar2.getGroupName() != null) {
                                        pcgVar2.l.put(pcdVar2.getGroupName(), pcdVar2);
                                    }
                                    int i9 = pchVar3.a;
                                    i = 2;
                                    i3 = 3;
                                } else {
                                    z = false;
                                    i3 = 3;
                                }
                            }
                            i = 2;
                        } else {
                            i2 = depth;
                            z = z2;
                            i = i5;
                            i3 = 3;
                        }
                    } else {
                        i = i5;
                        i2 = depth;
                        z = z2;
                        i3 = i4;
                        if (eventType == i3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    resources2 = resources;
                    i4 = i3;
                    z2 = z;
                    i5 = i;
                    depth = i2;
                }
                if (!z3) {
                    this.d = c(pchVar.c, pchVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(String.valueOf(e.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        throw new XmlPullParserException(String.valueOf(e.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
    }

    public pcj(pch pchVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = pchVar;
        this.d = c(pchVar.c, pchVar.d);
    }
}
