package defpackage;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aegy extends ClickableSpan {
    final /* synthetic */ aegz a;

    public aegy(aegz aegzVar) {
        this.a = aegzVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        try {
            ((adtc) this.a.c.b()).h(this.a.b.G());
        } catch (ActivityNotFoundException e) {
            ensz enszVar = (ensz) aegz.a.j();
            enszVar.Y(csux.O, "GroupUpgradeBottomSheetFragmentPeer");
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
