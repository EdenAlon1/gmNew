package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efok extends ClickableSpan {
    final /* synthetic */ efon a;

    public efok(efon efonVar) {
        this.a = efonVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a();
    }
}
