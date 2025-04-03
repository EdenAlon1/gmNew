package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czlk extends ClickableSpan {
    final /* synthetic */ bcse a;

    public czlk(bcse bcseVar) {
        this.a = bcseVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ellj.g(new czhc(this.a), view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
