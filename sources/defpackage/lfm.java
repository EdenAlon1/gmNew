package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfm extends InputConnectionWrapper {
    private final TextView a;

    public lfm(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.a = textView;
        lew b = lew.b();
        if (!b.g() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        lep lepVar = b.e;
        Bundle bundle = editorInfo.extras;
        ozc ozcVar = lepVar.b.a;
        int b2 = ozcVar.b(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", b2 != 0 ? ozcVar.b.getInt(b2 + ozcVar.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", lepVar.c.g);
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return lfa.c(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return lfa.c(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
