package defpackage;

import android.view.inputmethod.ExtractedText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juz {
    public static final ExtractedText a(jvu jvuVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = jvuVar.a();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = jvuVar.a().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = jpm.d(jvuVar.c);
        extractedText.selectionEnd = jpm.c(jvuVar.c);
        extractedText.flags = !ffpc.L(jvuVar.a(), '\n') ? 1 : 0;
        return extractedText;
    }
}
