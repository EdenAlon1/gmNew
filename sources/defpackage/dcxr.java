package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxr extends ClickableSpan {
    final /* synthetic */ dcxs a;

    public dcxr(dcxs dcxsVar) {
        this.a = dcxsVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.h();
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "https://www.gstatic.com/policies/termssummary/rcs.pdf?hl=%1$s", ctid.c(this.a.i.c).getLanguage())));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            eldl.p(context, intent);
        } catch (ActivityNotFoundException unused) {
            dcxs.c.r("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}
