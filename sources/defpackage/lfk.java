package defpackage;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfk {
    private final EditText a;
    private final lft b;

    public lfk(EditText editText) {
        this.a = editText;
        lft lftVar = new lft(editText);
        this.b = lftVar;
        editText.addTextChangedListener(lftVar);
        editText.setEditableFactory(lfl.a());
    }

    public static final KeyListener c(KeyListener keyListener) {
        return keyListener instanceof lfp ? keyListener : new lfp(keyListener);
    }

    public final InputConnection a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof lfm ? inputConnection : new lfm(this.a, inputConnection, editorInfo);
    }

    public final void b(int i) {
        ksw.g(i, "maxEmojiCount should be greater than 0");
        this.b.a = i;
    }
}
