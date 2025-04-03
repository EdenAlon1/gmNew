package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jee {
    public static final jeb a = new jeb();
    public final Rect b = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final jed f = new jed();
    public final ArrayList c = new ArrayList();

    private final View b(ViewGroup viewGroup, View view, Rect rect, ArrayList arrayList, int i) {
        this.d.set(rect);
        if (i == 17) {
            this.d.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            this.d.offset(0, rect.height() + 1);
        } else if (i == 66) {
            this.d.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            this.d.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!ffkj.e(view3, view) && !ffkj.e(view3, viewGroup)) {
                view3.getFocusedRect(this.e);
                viewGroup.offsetDescendantRectToMyCoords(view3, this.e);
                Rect rect2 = this.e;
                Rect rect3 = this.d;
                iam d = icz.d(rect2);
                iam d2 = icz.d(rect3);
                iam d3 = icz.d(rect);
                hyh a2 = hyn.a(i);
                if (iac.c(d, d2, d3, a2 != null ? a2.a : 1)) {
                    this.d.set(this.e);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    public final View a(ViewGroup viewGroup, View view, int i) {
        ArrayList<View> arrayList;
        View view2;
        int i2;
        int i3;
        ViewGroup viewGroup2 = viewGroup;
        if (view != viewGroup2) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup2) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else if (viewGroup3 != null) {
                    viewGroup2 = viewGroup3;
                }
            }
        }
        View a2 = jeh.a(view, viewGroup2, i);
        View view3 = a2;
        boolean z = true;
        while (a2 != null) {
            if (a2.isFocusable() && a2.getVisibility() == 0 && (!a2.isInTouchMode() || a2.isFocusableInTouchMode())) {
                break;
            }
            a2 = jeh.a(a2, viewGroup2, i);
            boolean z2 = !z;
            if (!z) {
                view3 = view3 != null ? jeh.a(view3, viewGroup2, i) : null;
                if (view3 == a2) {
                    break;
                }
            }
            z = z2;
        }
        a2 = null;
        if (a2 != null) {
            return a2;
        }
        ArrayList<View> arrayList2 = this.c;
        try {
            arrayList2.clear();
            viewGroup2.addFocusables(arrayList2, i, viewGroup2.isInTouchMode() ? 1 : 0);
            if (arrayList2.isEmpty()) {
                arrayList = arrayList2;
                view2 = a2;
            } else {
                Rect rect = this.b;
                view.getFocusedRect(rect);
                viewGroup2.offsetDescendantRectToMyCoords(view, rect);
                try {
                    if (i == 1 || i == 2) {
                        ViewGroup viewGroup5 = viewGroup2;
                        arrayList = arrayList2;
                        try {
                            try {
                                jed jedVar = this.f;
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    jedVar.d.c(arrayList.get(i4), i4);
                                }
                                int i5 = -1;
                                int size2 = arrayList.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i6 = size2 - 1;
                                        View view4 = arrayList.get(size2);
                                        int nextFocusForwardId = view4.getNextFocusForwardId();
                                        View a3 = (nextFocusForwardId == 0 || nextFocusForwardId == i5) ? null : jeh.a(view4, viewGroup5, 2);
                                        if (a3 != null) {
                                            i3 = i5;
                                            if (jedVar.d.h(a3)) {
                                                jedVar.a.e(view4, a3);
                                                jedVar.b.g(a3);
                                            }
                                        } else {
                                            i3 = i5;
                                        }
                                        if (i6 < 0) {
                                            break;
                                        }
                                        size2 = i6;
                                        i5 = i3;
                                    }
                                }
                                int size3 = arrayList.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i7 = size3 - 1;
                                        View view5 = arrayList.get(size3);
                                        if (((View) jedVar.a.f(view5)) != null && !jedVar.b.j(view5)) {
                                            View view6 = view5;
                                            while (view5 != null) {
                                                View view7 = (View) jedVar.c.f(view5);
                                                if (view7 != null) {
                                                    if (view7 == view6) {
                                                        break;
                                                    }
                                                    view5 = view6;
                                                    view6 = view7;
                                                }
                                                jedVar.c.e(view5, view6);
                                                view5 = (View) jedVar.a.f(view5);
                                            }
                                        }
                                        if (i7 < 0) {
                                            break;
                                        }
                                        size3 = i7;
                                    }
                                }
                                Collections.sort(arrayList, this.f);
                                this.f.a();
                                int size4 = arrayList.size();
                                if (size4 < 2) {
                                    view2 = null;
                                } else {
                                    if (i == 1) {
                                        int indexOf = arrayList.indexOf(view);
                                        view2 = indexOf > 0 ? arrayList.get(indexOf - 1) : arrayList.get(size4 - 1);
                                    } else if (i == 2) {
                                        int lastIndexOf = arrayList.lastIndexOf(view);
                                        view2 = (lastIndexOf < 0 || (i2 = lastIndexOf + 1) >= size4) ? arrayList.get(0) : arrayList.get(i2);
                                    } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                                        view2 = b(viewGroup5, view, this.b, arrayList, i);
                                        arrayList = arrayList;
                                    } else {
                                        view2 = null;
                                    }
                                    if (view2 == null) {
                                        view2 = arrayList.get(size4 - 1);
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                arrayList.clear();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            this.f.a();
                            throw th2;
                        }
                    } else {
                        if (i != 17 && i != 33 && i != 66 && i != 130) {
                            throw new IllegalArgumentException(a.h(i, "Unknown direction: "));
                        }
                        view2 = b(viewGroup2, view, rect, arrayList2, i);
                        arrayList = arrayList2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = 1;
                }
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th4) {
            th = th4;
            arrayList = arrayList2;
        }
    }
}
