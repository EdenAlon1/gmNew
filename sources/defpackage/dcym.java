package defpackage;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcym extends ClickableSpan {
    final /* synthetic */ dcyn a;

    public dcym(dcyn dcynVar) {
        this.a = dcynVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        ((cmfb) this.a.d.b()).c(epgr.RCS_PROVISIONING_PROMPT_LEARN_MORE_CLICKED);
        try {
            ((adtc) this.a.c.b()).h(this.a.b.G());
        } catch (ActivityNotFoundException e) {
            ensz enszVar = (ensz) dcyn.a.j();
            enszVar.Y(csux.O, "RcsDefaultOnBottomSheetFragmentPeer");
            ((ensz) enszVar.g(e)).q("RCS Learn More Activity was not found.");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
