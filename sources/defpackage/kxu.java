package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.vcard.VCardConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxu {
    public final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    public kxu(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private final List ag(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private final void ah(int i, boolean z) {
        Bundle a = a();
        if (a != null) {
            int i2 = a.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (true != z) {
                i = 0;
            }
            a.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private final boolean ai(int i) {
        Bundle a = a();
        return a != null && (a.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static kxu b() {
        return new kxu(AccessibilityNodeInfo.obtain());
    }

    static String g(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void A(boolean z) {
        this.a.setFocused(z);
    }

    public final void B(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            ah(2, z);
        }
    }

    public final void C(CharSequence charSequence) {
        this.a.setHintText(charSequence);
    }

    public final void D(View view) {
        this.a.setLabelFor(view);
    }

    public final void E(boolean z) {
        this.a.setLongClickable(z);
    }

    public final void F(int i) {
        this.a.setMaxTextLength(i);
    }

    public final void G(int i) {
        this.a.setMovementGranularities(i);
    }

    public final void H(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public final void I(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setPaneTitle(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final void J(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public final void K(View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public final void L(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final void M(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            ah(1, z);
        }
    }

    public final void N(boolean z) {
        this.a.setScrollable(z);
    }

    public final void O(boolean z) {
        this.a.setShowingHintText(z);
    }

    public final void P(View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public final void Q(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a.setStateDescription(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void R(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void S(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setTooltipText(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public final void T(View view) {
        this.a.setTraversalAfter(view);
    }

    public final void U(View view) {
        this.a.setTraversalBefore(view);
    }

    public final void V(View view, int i) {
        this.a.setTraversalBefore(view, i);
    }

    public final void W(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public final boolean X() {
        return this.a.isChecked();
    }

    public final boolean Y() {
        return this.a.isClickable();
    }

    public final boolean Z() {
        return this.a.isEnabled();
    }

    public final Bundle a() {
        return this.a.getExtras();
    }

    public final boolean aa() {
        return this.a.isFocusable();
    }

    public final boolean ab() {
        return this.a.isFocused();
    }

    public final boolean ac() {
        return this.a.isPassword();
    }

    public final boolean ad() {
        return this.a.isScrollable();
    }

    public final void ae(kxr kxrVar) {
        this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) kxrVar.o);
    }

    public final void af() {
        ah(VCardConfig.FLAG_APPEND_TYPE_PARAM, true);
    }

    public final CharSequence c() {
        return this.a.getClassName();
    }

    public final CharSequence d() {
        return this.a.getContentDescription();
    }

    public final CharSequence e() {
        if (ag("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.a.getText();
        }
        List ag = ag("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List ag2 = ag("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List ag3 = ag("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List ag4 = ag("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < ag.size(); i++) {
            spannableString.setSpan(new kxq(((Integer) ag4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) ag.get(i)).intValue(), ((Integer) ag2.get(i)).intValue(), ((Integer) ag3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kxu)) {
            return false;
        }
        kxu kxuVar = (kxu) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (kxuVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(kxuVar.a)) {
            return false;
        }
        return this.c == kxuVar.c && this.b == kxuVar.b;
    }

    public final CharSequence f() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.a.getTooltipText();
        return tooltipText;
    }

    public final void h(int i) {
        this.a.addAction(i);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(kxr kxrVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) kxrVar.o);
    }

    public final void j(View view, int i) {
        this.a.addChild(view, i);
    }

    @Deprecated
    public final void k(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void l(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void m(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    @Deprecated
    public final void n(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void o(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void p(boolean z) {
        this.a.setCheckable(z);
    }

    public final void q(boolean z) {
        this.a.setChecked(z);
    }

    public final void r(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void s(boolean z) {
        this.a.setClickable(z);
    }

    public final void t(Object obj) {
        this.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) (obj == null ? null : ((kxs) obj).a));
    }

    public final String toString() {
        boolean isImportantForAccessibility;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        rect.toString();
        sb.append("; boundsInParent: ".concat(rect.toString()));
        l(rect);
        rect.toString();
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        if (Build.VERSION.SDK_INT >= 34) {
            this.a.getBoundsInWindow(rect);
        } else {
            Rect rect2 = (Rect) this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        rect.toString();
        sb.append("; boundsInWindow: ".concat(rect.toString()));
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(c());
        sb.append("; text: ");
        sb.append(e());
        sb.append("; error: ");
        sb.append(this.a.getError());
        sb.append("; maxTextLength: ");
        sb.append(this.a.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(Build.VERSION.SDK_INT >= 30 ? this.a.getStateDescription() : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(d());
        sb.append("; tooltipText: ");
        sb.append(f());
        sb.append("; viewIdResName: ");
        sb.append(this.a.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(Build.VERSION.SDK_INT >= 33 ? this.a.getUniqueId() : this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(X());
        sb.append("; fieldRequired: ");
        sb.append(this.a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(aa());
        sb.append("; focused: ");
        sb.append(ab());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(Y());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(this.a.isContextClickable());
        sb.append("; enabled: ");
        sb.append(Z());
        sb.append("; password: ");
        sb.append(ac());
        sb.append("; scrollable: " + ad());
        sb.append("; containerTitle: ");
        sb.append(Build.VERSION.SDK_INT >= 34 ? this.a.getContainerTitle() : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(ai(VCardConfig.FLAG_APPEND_TYPE_PARAM));
        sb.append("; importantForAccessibility: ");
        isImportantForAccessibility = this.a.isImportantForAccessibility();
        sb.append(isImportantForAccessibility);
        sb.append("; visible: ");
        sb.append(this.a.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(Build.VERSION.SDK_INT >= 33 ? this.a.isTextSelectable() : ai(VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(Build.VERSION.SDK_INT >= 34 ? this.a.isAccessibilityDataSensitive() : ai(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new kxr(actionList.get(i), 0, null, null, null));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            kxr kxrVar = (kxr) arrayList.get(i2);
            String g = g(kxrVar.a());
            if (g.equals("ACTION_UNKNOWN") && kxrVar.b() != null) {
                g = kxrVar.b().toString();
            }
            sb.append(g);
            if (i2 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(Object obj) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((kxt) obj).a);
    }

    public final void v(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void w(boolean z) {
        this.a.setDismissable(z);
    }

    public final void x(boolean z) {
        this.a.setEnabled(z);
    }

    public final void y(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public final void z(boolean z) {
        this.a.setFocusable(z);
    }
}
