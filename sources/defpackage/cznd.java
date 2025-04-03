package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.message.transferview.TransferView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cznd implements fbba {
    public static TransferView a(View view) {
        if (!(view instanceof TransferView)) {
            throw new IllegalStateException(a.I(view, czna.class, "Attempt to inject a View wrapper of type "));
        }
        TransferView transferView = (TransferView) view;
        transferView.getClass();
        return transferView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
