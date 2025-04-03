package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvo {
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final kuz e = new kuz();

    private static void A(int i, View view) {
        List i2 = i(view);
        for (int i3 = 0; i3 < i2.size(); i3++) {
            if (((kxr) i2.get(i3)).a() == i) {
                i2.remove(i3);
                return;
            }
        }
    }

    private static void B(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return kvi.a(view);
        }
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        Object obj = c.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static View b(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) kvh.b(view, i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static ktb c(View view) {
        View.AccessibilityDelegate a2 = a(view);
        if (a2 == null) {
            return null;
        }
        return a2 instanceof kta ? ((kta) a2).a : new ktb(a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ktm d(View view, ktm ktmVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + ktmVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return kvk.a(view, ktmVar);
        }
        kue kueVar = (kue) view.getTag(R.id.tag_on_receive_content_listener);
        if (kueVar == null) {
            return view.a(ktmVar);
        }
        ktm a2 = kueVar.a(view, ktmVar);
        if (a2 == null) {
            return null;
        }
        return view.a(a2);
    }

    @Deprecated
    public static kwd e(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        kwd kwdVar = (kwd) b.get(view);
        if (kwdVar != null) {
            return kwdVar;
        }
        kwd kwdVar2 = new kwd(view);
        b.put(view, kwdVar2);
        return kwdVar2;
    }

    public static kxh f(View view, kxh kxhVar) {
        WindowInsets e2 = kxhVar.e();
        if (e2 != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? kvj.a(view, e2) : kvb.a(view, e2);
            if (!a2.equals(e2)) {
                return kxh.p(a2, view);
            }
        }
        return kxhVar;
    }

    public static kxh g(View view, kxh kxhVar) {
        WindowInsets e2 = kxhVar.e();
        if (e2 != null) {
            WindowInsets b2 = kvb.b(view, e2);
            if (!b2.equals(e2)) {
                return kxh.p(b2, view);
            }
        }
        return kxhVar;
    }

    public static CharSequence h(View view) {
        return (CharSequence) new kuw(CharSequence.class).d(view);
    }

    public static List i(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void j(View view, kxr kxrVar) {
        l(view);
        A(kxrVar.a(), view);
        i(view).add(kxrVar);
        m(view, 0);
    }

    public static void k(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static void l(View view) {
        ktb c2 = c(view);
        if (c2 == null) {
            c2 = new ktb();
        }
        p(view, c2);
    }

    static void m(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (h(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                int i2 = true != z ? 2048 : 32;
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(h(view));
                    B(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(32);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(h(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static void n(View view, int i) {
        A(i, view);
        m(view, 0);
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            kvi.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void p(View view, ktb ktbVar) {
        if (ktbVar == null && (a(view) instanceof kta)) {
            ktbVar = new ktb();
        }
        B(view);
        view.setAccessibilityDelegate(ktbVar == null ? null : ktbVar.F);
    }

    public static void q(View view, boolean z) {
        new kuy(Boolean.class).e(view, Boolean.valueOf(z));
    }

    public static void r(View view, CharSequence charSequence) {
        new kuw(CharSequence.class).e(view, charSequence);
        if (charSequence == null) {
            kuz kuzVar = e;
            kuzVar.a.remove(view);
            view.removeOnAttachStateChangeListener(kuzVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(kuzVar);
            return;
        }
        kuz kuzVar2 = e;
        WeakHashMap weakHashMap = kuzVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(kuzVar2);
        if (view.isAttachedToWindow()) {
            kuzVar2.a(view);
        }
    }

    public static void s(View view, String[] strArr, kue kueVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            kvk.b(view, strArr, kueVar);
            return;
        }
        String[] strArr2 = null;
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = true;
        if (kueVar != null) {
            ksw.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].startsWith("*")) {
                    z = false;
                    break;
                }
                i++;
            }
            ksw.b(z, "A MIME type set here must not start with *: ".concat(String.valueOf(Arrays.toString(strArr))));
            strArr2 = strArr;
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr2);
        view.setTag(R.id.tag_on_receive_content_listener, kueVar);
    }

    public static void t(View view, kuh kuhVar) {
        kvf.a(view, kuhVar.a);
    }

    public static void u(View view, CharSequence charSequence) {
        new kux(CharSequence.class).e(view, charSequence);
    }

    static boolean v(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        kvn c2 = kvn.c(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c2.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!kvn.a.isEmpty()) {
                synchronized (kvn.a) {
                    if (c2.b == null) {
                        c2.b = new WeakHashMap();
                    }
                    int size = kvn.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) kvn.a.get(size)).get();
                        if (view2 == null) {
                            kvn.a.remove(size);
                        } else {
                            c2.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c2.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View b2 = c2.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                c2.a().put(keyCode, new WeakReference(b2));
            }
        }
        return b2 != null;
    }

    public static boolean w(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        kvn c2 = kvn.c(view);
        WeakReference weakReference = c2.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        c2.c = new WeakReference(keyEvent);
        SparseArray a2 = c2.a();
        WeakReference weakReference2 = null;
        if (keyEvent.getAction() == 1 && (indexOfKey = a2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = (WeakReference) a2.valueAt(indexOfKey);
            a2.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = (WeakReference) a2.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 == null || !view2.isAttachedToWindow()) {
            return true;
        }
        kvn.d(view2);
        return true;
    }

    public static String[] x(View view) {
        return Build.VERSION.SDK_INT >= 31 ? kvk.c(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void y(View view, kxr kxrVar, kyg kygVar) {
        if (kygVar == null) {
            n(view, kxrVar.a());
        } else {
            j(view, new kxr(null, kxrVar.p, null, kygVar, kxrVar.q));
        }
    }

    @Deprecated
    public static void z(View view) {
        view.setAccessibilityLiveRegion(1);
    }
}
