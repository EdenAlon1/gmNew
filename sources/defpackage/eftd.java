package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eftd extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ efte b;

    public eftd(efte efteVar, String str) {
        this.a = str;
        this.b = efteVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.aQ(new Intent("android.intent.action.VIEW", Uri.parse(this.a)));
    }
}
