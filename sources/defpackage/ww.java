package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ww {
    private static ww b;
    private WeakHashMap d;
    private final WeakHashMap e = new WeakHashMap(0);
    private TypedValue f;
    private boolean g;
    private wv h;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final wu c = new wu();

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        synchronized (ww.class) {
            wu wuVar = c;
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) wuVar.c(Integer.valueOf(wu.a(i, mode)));
            if (porterDuffColorFilter != null) {
                return porterDuffColorFilter;
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
            return porterDuffColorFilter2;
        }
    }

    public static synchronized ww e() {
        ww wwVar;
        synchronized (ww.class) {
            if (b == null) {
                b = new ww();
            }
            wwVar = b;
        }
        return wwVar;
    }

    static void h(Drawable drawable, yr yrVar, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (yrVar.d) {
            colorStateList = yrVar.a;
        } else {
            if (!yrVar.c) {
                drawable.clearColorFilter();
                return;
            }
            colorStateList = null;
        }
        PorterDuff.Mode mode = yrVar.c ? yrVar.b : a;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = b(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    private final synchronized Drawable i(Context context, long j) {
        WeakReference weakReference;
        cno cnoVar = (cno) this.e.get(context);
        if (cnoVar != null && (weakReference = (WeakReference) cnoVar.d(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            cnoVar.i(j);
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            cno cnoVar = (cno) this.e.get(context);
            if (cnoVar == null) {
                cnoVar = new cno();
                this.e.put(context, cnoVar);
            }
            cnoVar.h(j, new WeakReference(constantState));
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        cpo cpoVar;
        WeakHashMap weakHashMap = this.d;
        ColorStateList colorStateList = null;
        ColorStateList colorStateList2 = (weakHashMap == null || (cpoVar = (cpo) weakHashMap.get(context)) == null) ? null : (ColorStateList) cpp.a(cpoVar, i);
        if (colorStateList2 == null) {
            wv wvVar = this.h;
            if (wvVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateList = koa.d(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateList = koa.d(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList c2 = yo.c(context, R.attr.colorSwitchThumbNormal);
                    if (c2 == null || !c2.isStateful()) {
                        iArr[0] = yo.a;
                        iArr2[0] = yo.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = yo.d;
                        iArr2[1] = yo.b(context, R.attr.colorControlActivated);
                        iArr[2] = yo.e;
                        iArr2[2] = yo.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = yo.a;
                        iArr[0] = iArr3;
                        iArr2[0] = c2.getColorForState(iArr3, 0);
                        iArr[1] = yo.d;
                        iArr2[1] = yo.b(context, R.attr.colorControlActivated);
                        iArr[2] = yo.e;
                        iArr2[2] = c2.getDefaultColor();
                    }
                    colorStateList = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateList = qt.b(context, yo.b(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateList = qt.b(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateList = qt.b(context, yo.b(context, R.attr.colorAccent));
                } else {
                    if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                        if (qt.a(((qt) wvVar).b, i)) {
                            colorStateList = yo.c(context, R.attr.colorControlNormal);
                        } else if (qt.a(((qt) wvVar).e, i)) {
                            colorStateList = koa.d(context, R.color.abc_tint_default);
                        } else if (qt.a(((qt) wvVar).f, i)) {
                            colorStateList = koa.d(context, R.color.abc_tint_btn_checkable);
                        } else if (i == R.drawable.abc_seekbar_thumb_material) {
                            colorStateList = koa.d(context, R.color.abc_tint_seek_thumb);
                            i = R.drawable.abc_seekbar_thumb_material;
                        }
                    }
                    colorStateList = koa.d(context, R.color.abc_tint_spinner);
                }
            }
            if (colorStateList != null) {
                if (this.d == null) {
                    this.d = new WeakHashMap();
                }
                cpo cpoVar2 = (cpo) this.d.get(context);
                if (cpoVar2 == null) {
                    cpoVar2 = new cpo();
                    this.d.put(context, cpoVar2);
                }
                int i2 = cpoVar2.d;
                if (i2 == 0 || i > cpoVar2.b[i2 - 1]) {
                    if (cpoVar2.a && i2 >= cpoVar2.b.length) {
                        cpp.b(cpoVar2);
                    }
                    int i3 = cpoVar2.d;
                    int[] iArr4 = cpoVar2.b;
                    if (i3 >= iArr4.length) {
                        int d = cpu.d(i3 + 1);
                        int[] copyOf = Arrays.copyOf(iArr4, d);
                        copyOf.getClass();
                        cpoVar2.b = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(cpoVar2.c, d);
                        copyOf2.getClass();
                        cpoVar2.c = copyOf2;
                    }
                    cpoVar2.b[i3] = i;
                    cpoVar2.c[i3] = colorStateList;
                    cpoVar2.d = i3 + 1;
                } else {
                    cpoVar2.f(i, colorStateList);
                }
                return colorStateList;
            }
            colorStateList2 = colorStateList;
        }
        return colorStateList2;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        r0.setTintMode(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b0 A[Catch: all -> 0x01bf, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0031, B:10:0x0038, B:14:0x00ad, B:16:0x00b3, B:18:0x00b9, B:22:0x00ce, B:25:0x01b0, B:31:0x00ca, B:32:0x00d4, B:36:0x00eb, B:40:0x011d, B:42:0x014b, B:48:0x0195, B:50:0x01a6, B:51:0x015d, B:54:0x016a, B:56:0x0177, B:59:0x017f, B:67:0x005c, B:71:0x00a3, B:74:0x0067, B:76:0x0084, B:78:0x008e, B:80:0x0098, B:81:0x000e, B:83:0x0019, B:85:0x001d, B:87:0x01b5, B:88:0x01be), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0195 A[Catch: all -> 0x01bf, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0031, B:10:0x0038, B:14:0x00ad, B:16:0x00b3, B:18:0x00b9, B:22:0x00ce, B:25:0x01b0, B:31:0x00ca, B:32:0x00d4, B:36:0x00eb, B:40:0x011d, B:42:0x014b, B:48:0x0195, B:50:0x01a6, B:51:0x015d, B:54:0x016a, B:56:0x0177, B:59:0x017f, B:67:0x005c, B:71:0x00a3, B:74:0x0067, B:76:0x0084, B:78:0x008e, B:80:0x0098, B:81:0x000e, B:83:0x0019, B:85:0x001d, B:87:0x01b5, B:88:0x01be), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a3 A[Catch: all -> 0x01bf, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0031, B:10:0x0038, B:14:0x00ad, B:16:0x00b3, B:18:0x00b9, B:22:0x00ce, B:25:0x01b0, B:31:0x00ca, B:32:0x00d4, B:36:0x00eb, B:40:0x011d, B:42:0x014b, B:48:0x0195, B:50:0x01a6, B:51:0x015d, B:54:0x016a, B:56:0x0177, B:59:0x017f, B:67:0x005c, B:71:0x00a3, B:74:0x0067, B:76:0x0084, B:78:0x008e, B:80:0x0098, B:81:0x000e, B:83:0x0019, B:85:0x001d, B:87:0x01b5, B:88:0x01be), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        cno cnoVar = (cno) this.e.get(context);
        if (cnoVar != null) {
            cnoVar.g();
        }
    }

    public final synchronized void g(wv wvVar) {
        this.h = wvVar;
    }
}
