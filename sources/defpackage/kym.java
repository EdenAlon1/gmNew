package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kym {
    @Deprecated
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, kyl kylVar) {
        ksq.b(inputConnection, "inputConnection must be non-null");
        ksq.b(editorInfo, "editorInfo must be non-null");
        return new kyk(inputConnection, kylVar);
    }
}
