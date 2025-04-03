package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbrg extends URLSpan {
    final /* synthetic */ dbri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbrg(dbri dbriVar, String str) {
        super(str);
        this.a = dbriVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a.c("Bugle.Ditto.Pairing.PrivacyPolicy.Seen");
        super.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
