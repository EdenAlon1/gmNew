package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.messaging.R;
import defpackage.ehia;
import defpackage.ehiz;
import defpackage.ehto;
import defpackage.ehua;
import defpackage.qw;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextInputEditText extends qw {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    private final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean c(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout b = b();
        if (!c(b) || rect == null) {
            return;
        }
        b.getFocusedRect(this.a);
        rect.bottom = this.a.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout b = b();
        if (!c(b)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = b.getGlobalVisibleRect(rect, point);
        if (!globalVisibleRect || point == null) {
            return globalVisibleRect;
        }
        point.offset(-getScrollX(), -getScrollY());
        return true;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout b = b();
        return (b == null || !b.l) ? super.getHint() : b.d();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.l && super.getHint() == null && ehia.a()) {
            setHint("");
        }
    }

    @Override // defpackage.qw, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout b = b();
            editorInfo.hintText = b != null ? b.d() : null;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        b();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout b = b();
        if (!c(b) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.a.set(rect.left, rect.top, rect.right, rect.bottom + (b.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.a);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray a = ehiz.a(context, attributeSet, ehto.b, i, R.style.Widget_Design_TextInputEditText, new int[0]);
        this.b = a.getBoolean(0, false);
        a.recycle();
    }
}
