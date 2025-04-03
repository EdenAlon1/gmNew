package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcyl extends ClickableSpan {
    final /* synthetic */ dcyn a;
    final /* synthetic */ Context b;

    public dcyl(dcyn dcynVar, Context context) {
        this.a = dcynVar;
        this.b = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        ((cmfb) this.a.d.b()).c(epgr.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_LEARN_MORE_CLICKED);
        Intent intent = new Intent(this.b, (Class<?>) RcsSettingsActivity.class);
        try {
            eldl.p(this.b, intent);
        } catch (ActivityNotFoundException e) {
            ensz enszVar = (ensz) dcyn.a.j();
            enszVar.Y(csux.O, "RcsDefaultOnBottomSheetFragmentPeer");
            ((ensz) enszVar.g(e)).t("Activity was not found for intent, %s", intent);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
