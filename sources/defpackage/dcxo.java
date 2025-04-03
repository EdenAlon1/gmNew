package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcxo extends ClickableSpan {
    final /* synthetic */ dcxs a;

    public dcxo(dcxs dcxsVar) {
        this.a = dcxsVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.h();
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(dcxs.b(ctid.c(context))));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            eldl.p(context, intent);
        } catch (ActivityNotFoundException unused) {
            dcxs.c.r("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}
