package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeqx implements View.OnClickListener {
    final /* synthetic */ aerc a;
    final /* synthetic */ aeqk b;

    public aeqx(aerc aercVar, aeqk aeqkVar) {
        this.a = aercVar;
        this.b = aeqkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.e(this.b);
    }
}
