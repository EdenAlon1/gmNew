package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcxp extends ClickableSpan {
    final /* synthetic */ dcxs a;

    public dcxp(dcxs dcxsVar) {
        this.a = dcxsVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        dcxs dcxsVar = this.a;
        int i = dcxsVar.r - 1;
        if (i == 0) {
            str = "Bugle.FastTrack.ConversationList.Prompt.Privacy.Clicked";
        } else if (i == 1) {
            str = "Bugle.FastTrack.Settings.Dialog.Privacy.Clicked";
        } else {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("There is no 'Privacy Policy' UMA metric for the PhoneNumberInput UI.");
                }
                throw new IllegalStateException("There is no 'Privacy Policy' UMA metric for the Legal FYI UI.");
            }
            str = "Bugle.Welcome.PrivacyPolicy.Clicked";
        }
        dcxsVar.e.c(str);
        ((altk) dcxsVar.h.b()).U(epgr.RCS_PROVISIONING_PROMPT_PRIVACY_AND_POLICY_CLICKED, dcxsVar.g);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.a.i.a()));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            eldl.p(context, intent);
        } catch (ActivityNotFoundException unused) {
            dcxs.c.r("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}
