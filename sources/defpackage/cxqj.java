package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxqj implements View.OnClickListener {
    private final cqoh a;
    private final View.OnClickListener b;
    private long c = -500;

    public cxqj(cqoh cqohVar, View.OnClickListener onClickListener) {
        this.a = cqohVar;
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.f().toEpochMilli() - this.c >= 500) {
            this.c = this.a.f().toEpochMilli();
            this.b.onClick(view);
        }
    }
}
