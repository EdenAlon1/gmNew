package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elbs extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ ClickableSpan b;
    final /* synthetic */ elbx c;

    public elbs(elbx elbxVar, String str, ClickableSpan clickableSpan) {
        this.a = str;
        this.b = clickableSpan;
        this.c = elbxVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ekzm b = this.c.b(this.a);
        try {
            this.b.onClick(view);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.b.updateDrawState(textPaint);
    }
}
