package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.message.ClickFixingEmojiAppCompatTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czhi implements fbba {
    public static void a(View view) {
        if (!(view instanceof ClickFixingEmojiAppCompatTextView)) {
            throw new IllegalStateException(a.I(view, czhe.class, "Attempt to inject a View wrapper of type "));
        }
        ((ClickFixingEmojiAppCompatTextView) view).getClass();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
