package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kyk extends InputConnectionWrapper {
    final /* synthetic */ kyl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyk(InputConnection inputConnection, kyl kylVar) {
        super(inputConnection, false);
        this.a = kylVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.a.a(inputContentInfo == null ? null : new kyo(new kyn(inputContentInfo)), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
