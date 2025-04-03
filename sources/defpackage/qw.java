package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qw extends EditText implements kuf {
    private final qo a;
    private final ry b;
    private final ru c;
    private final kze d;
    private final qx e;
    private qv f;

    public qw(Context context) {
        this(context, null);
    }

    private final qv b() {
        if (this.f == null) {
            this.f = new qv(this);
        }
        return this.f;
    }

    @Override // defpackage.kuf
    public final ktm a(ktm ktmVar) {
        return this.d.a(this, ktmVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.a();
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kzd.a(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        ru ruVar;
        return (Build.VERSION.SDK_INT >= 28 || (ruVar = this.c) == null) ? super.getTextClassifier() : ruVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] x;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ry.r(this, onCreateInputConnection, editorInfo);
        qz.a(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (x = kvo.x(this)) != null) {
            editorInfo.contentMimeTypes = x;
            onCreateInputConnection = kym.a(onCreateInputConnection, editorInfo, new kyl() { // from class: kyj
                @Override // defpackage.kyl
                public final boolean a(kyo kyoVar, int i, Bundle bundle) {
                    Uri linkUri;
                    if ((i & 1) != 0) {
                        try {
                            kyoVar.c();
                            InputContentInfo inputContentInfo = kyoVar.a.a;
                            bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                            bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                        } catch (Exception e) {
                            Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                            return false;
                        }
                    }
                    ClipData clipData = new ClipData(kyoVar.a(), new ClipData.Item(kyoVar.b()));
                    kth ktgVar = Build.VERSION.SDK_INT >= 31 ? new ktg(clipData, 2) : new kti(clipData, 2);
                    View view = this;
                    linkUri = kyoVar.a.a.getLinkUri();
                    ktgVar.e(linkUri);
                    ktgVar.c(bundle);
                    return kvo.d(view, ktf.a(ktgVar)) == null;
                }
            });
        }
        return this.e.a(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && kvo.x(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=".concat(toString()));
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    kvo.d(this, ktf.a(Build.VERSION.SDK_INT >= 31 ? new ktg(clipData, 3) : new kti(clipData, 3)));
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && kvo.x(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                kth ktgVar = Build.VERSION.SDK_INT >= 31 ? new ktg(primaryClip, 1) : new kti(primaryClip, 1);
                ktgVar.d(i == 16908322 ? 0 : 1);
                kvo.d(this, ktf.a(ktgVar));
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kzd.b(this, callback));
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(qx.d(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        ru ruVar;
        if (Build.VERSION.SDK_INT >= 28 || (ruVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            ruVar.a = textClassifier;
        }
    }

    public qw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yq.a(context);
        yo.d(this, getContext());
        qo qoVar = new qo(this);
        this.a = qoVar;
        qoVar.b(attributeSet, i);
        ry ryVar = new ry(this);
        this.b = ryVar;
        ryVar.h(attributeSet, i);
        ryVar.e();
        this.c = new ru(this);
        this.d = new kze();
        qx qxVar = new qx(this);
        this.e = qxVar;
        qxVar.b(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (qx.c(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener d = qx.d(keyListener);
            if (d == keyListener) {
                return;
            }
            super.setKeyListener(d);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }
}
