package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxr {
    public static final kxr a;
    public static final kxr b;
    public static final kxr c;
    public static final kxr d;
    public static final kxr e;
    public static final kxr f;
    public static final kxr g;
    public static final kxr h;
    public static final kxr i;
    public static final kxr j;
    public static final kxr k;
    public static final kxr l;
    public static final kxr m;
    public static final kxr n;
    final Object o;
    public final int p;
    public final Class q;
    public final kyg r;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
        new kxr(1, (CharSequence) null);
        new kxr(2, (CharSequence) null);
        new kxr(4, (CharSequence) null);
        new kxr(8, (CharSequence) null);
        a = new kxr(16, (CharSequence) null);
        new kxr(32, (CharSequence) null);
        b = new kxr(64, (CharSequence) null);
        c = new kxr(128, (CharSequence) null);
        new kxr(256, kxz.class);
        new kxr(512, kxz.class);
        new kxr(1024, kya.class);
        new kxr(2048, kya.class);
        d = new kxr(4096, (CharSequence) null);
        e = new kxr(8192, (CharSequence) null);
        new kxr(16384, (CharSequence) null);
        new kxr(32768, (CharSequence) null);
        new kxr(65536, (CharSequence) null);
        new kxr(131072, kye.class);
        f = new kxr(262144, (CharSequence) null);
        g = new kxr(524288, (CharSequence) null);
        h = new kxr(1048576, (CharSequence) null);
        new kxr(2097152, kyf.class);
        new kxr(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        i = new kxr(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, kyc.class);
        j = new kxr(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        k = new kxr(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        l = new kxr(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        m = new kxr(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction26;
        } else {
            accessibilityAction = null;
        }
        new kxr(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction25;
        } else {
            accessibilityAction2 = null;
        }
        new kxr(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            accessibilityAction3 = accessibilityAction24;
        } else {
            accessibilityAction3 = null;
        }
        new kxr(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction23;
        } else {
            accessibilityAction4 = null;
        }
        new kxr(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new kxr(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        new kxr(accessibilityAction5, R.id.accessibilityActionSetProgress, null, null, kyd.class);
        accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        new kxr(accessibilityAction6, R.id.accessibilityActionMoveWindow, null, null, kyb.class);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction7 = accessibilityAction22;
        } else {
            accessibilityAction7 = null;
        }
        new kxr(accessibilityAction7, R.id.accessibilityActionShowTooltip, null, null, null);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction8 = accessibilityAction21;
        } else {
            accessibilityAction8 = null;
        }
        new kxr(accessibilityAction8, R.id.accessibilityActionHideTooltip, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction9 = accessibilityAction20;
        } else {
            accessibilityAction9 = null;
        }
        new kxr(accessibilityAction9, R.id.accessibilityActionPressAndHold, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction10 = accessibilityAction19;
        } else {
            accessibilityAction10 = null;
        }
        new kxr(accessibilityAction10, R.id.accessibilityActionImeEnter, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            accessibilityAction11 = accessibilityAction18;
        } else {
            accessibilityAction11 = null;
        }
        new kxr(accessibilityAction11, R.id.accessibilityActionDragStart, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction12 = accessibilityAction17;
        } else {
            accessibilityAction12 = null;
        }
        new kxr(accessibilityAction12, R.id.accessibilityActionDragDrop, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction13 = accessibilityAction16;
        } else {
            accessibilityAction13 = null;
        }
        new kxr(accessibilityAction13, R.id.accessibilityActionDragCancel, null, null, null);
        if (Build.VERSION.SDK_INT >= 33) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction14 = accessibilityAction15;
        } else {
            accessibilityAction14 = null;
        }
        new kxr(accessibilityAction14, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        n = new kxr(Build.VERSION.SDK_INT >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public kxr(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.o).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.o).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof kxr) && this.o.equals(((kxr) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String g2 = kxu.g(this.p);
        if (g2.equals("ACTION_UNKNOWN") && b() != null) {
            g2 = b().toString();
        }
        sb.append(g2);
        return sb.toString();
    }

    private kxr(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public kxr(Object obj, int i2, CharSequence charSequence, kyg kygVar, Class cls) {
        this.p = i2;
        this.r = kygVar;
        this.o = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.q = cls;
    }
}
