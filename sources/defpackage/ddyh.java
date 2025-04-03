package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyh extends ClickableSpan {
    final /* synthetic */ View.OnClickListener a;

    public ddyh(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.onClick(view);
    }
}
