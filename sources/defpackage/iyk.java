package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyk {
    public final ClipboardManager a;

    public iyk(ClipboardManager clipboardManager) {
        this.a = clipboardManager;
    }

    public final void a(jcq jcqVar) {
        if (jcqVar != null) {
            this.a.setPrimaryClip(jcqVar.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.a.clearPrimaryClip();
        } else {
            this.a.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
