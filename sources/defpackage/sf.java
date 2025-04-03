package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sf {
    private static final RectF j = new RectF();
    private static final ConcurrentHashMap k = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final TextView h;
    public final Context i;
    private TextPaint l;
    private final se m;

    public sf(TextView textView) {
        this.h = textView;
        this.i = textView.getContext();
        this.m = Build.VERSION.SDK_INT >= 29 ? new sd() : new sc();
    }

    static Object d(Object obj, String str, Object obj2) {
        try {
            Object invoke = m(str).invoke(obj, new Object[0]);
            if (invoke == null) {
                return null;
            }
            return invoke;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", a.a(str, "Failed to invoke TextView#", "() method"), e);
            return obj2;
        }
    }

    public static final int[] l(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0) {
                    Integer valueOf = Integer.valueOf(i);
                    if (Collections.binarySearch(arrayList, valueOf) < 0) {
                        arrayList.add(valueOf);
                    }
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private static Method m(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = k;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", a.a(str, "Failed to retrieve TextView#", "() method"), e);
            return null;
        }
    }

    final int a() {
        return Math.round(this.e);
    }

    final int b() {
        return Math.round(this.d);
    }

    final int c() {
        return Math.round(this.c);
    }

    final void e() {
        int measuredWidth;
        CharSequence transformation;
        if (h()) {
            if (this.b) {
                if (this.h.getMeasuredHeight() <= 0 || this.h.getMeasuredWidth() <= 0) {
                    return;
                }
                if (this.m.b(this.h)) {
                    measuredWidth = 1048576;
                } else {
                    TextView textView = this.h;
                    measuredWidth = (textView.getMeasuredWidth() - textView.getTotalPaddingLeft()) - this.h.getTotalPaddingRight();
                }
                TextView textView2 = this.h;
                int height = (textView2.getHeight() - textView2.getCompoundPaddingBottom()) - this.h.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = j;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    int length = this.f.length;
                    if (length == 0) {
                        throw new IllegalStateException("No available text sizes to choose from.");
                    }
                    int i = length - 1;
                    int i2 = 1;
                    int i3 = 0;
                    while (i2 <= i) {
                        int i4 = (i2 + i) / 2;
                        int i5 = this.f[i4];
                        CharSequence text = this.h.getText();
                        TransformationMethod transformationMethod = this.h.getTransformationMethod();
                        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.h)) != null) {
                            text = transformation;
                        }
                        int maxLines = this.h.getMaxLines();
                        TextPaint textPaint = this.l;
                        if (textPaint == null) {
                            this.l = new TextPaint();
                        } else {
                            textPaint.reset();
                        }
                        this.l.set(this.h.getPaint());
                        this.l.setTextSize(i5);
                        Layout.Alignment alignment = (Layout.Alignment) d(this.h, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                        int round = Math.round(rectF.right);
                        TextView textView3 = this.h;
                        TextPaint textPaint2 = this.l;
                        se seVar = this.m;
                        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint2, round);
                        obtain.setAlignment(alignment).setLineSpacing(textView3.getLineSpacingExtra(), textView3.getLineSpacingMultiplier()).setIncludePad(textView3.getIncludeFontPadding()).setBreakStrategy(textView3.getBreakStrategy()).setHyphenationFrequency(textView3.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Alert.DURATION_SHOW_INDEFINITELY : maxLines);
                        try {
                            seVar.a(obtain, textView3);
                        } catch (ClassCastException unused) {
                            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                        }
                        StaticLayout build = obtain.build();
                        if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                            int i6 = i4 + 1;
                            i3 = i2;
                            i2 = i6;
                        }
                        i3 = i4 - 1;
                        i = i3;
                    }
                    float f = this.f[i3];
                    if (f != this.h.getTextSize()) {
                        f(0, f);
                    }
                }
            }
            this.b = true;
        }
    }

    final void f(int i, float f) {
        Context context = this.i;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.h.getPaint().getTextSize()) {
            this.h.getPaint().setTextSize(applyDimension);
            TextView textView = this.h;
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.b = false;
                try {
                    Method m = m("nullLayouts");
                    if (m != null) {
                        m.invoke(this.h, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.h.forceLayout();
                } else {
                    this.h.requestLayout();
                }
                this.h.invalidate();
            }
        }
    }

    public final void g(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.a = 1;
        this.d = f;
        this.e = f2;
        this.c = f3;
        this.g = false;
    }

    final boolean h() {
        return k() && this.a != 0;
    }

    public final boolean i() {
        boolean z = false;
        z = false;
        if (k() && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.d + (i * this.c));
                }
                this.f = l(iArr);
            }
            z = true;
        }
        this.b = z;
        return z;
    }

    public final boolean j() {
        boolean z = this.f.length > 0;
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = r0[0];
            this.e = r0[r1 - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean k() {
        return !(this.h instanceof qw);
    }
}
