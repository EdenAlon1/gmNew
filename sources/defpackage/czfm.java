package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czfm extends ClickableSpan {
    final /* synthetic */ czfo a;

    public czfm(czfo czfoVar) {
        this.a = czfoVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        czfo czfoVar = this.a;
        czfoVar.ai.e(czfoVar.G(), "Messenger_main");
    }
}
