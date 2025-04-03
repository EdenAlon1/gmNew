package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeqz implements View.OnClickListener {
    final /* synthetic */ aeqk a;
    final /* synthetic */ aerc b;

    public aeqz(aeqk aeqkVar, aerc aercVar) {
        this.a = aeqkVar;
        this.b = aercVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((aeqg) this.a).e();
        aerc aercVar = this.b;
        axol.k(lks.a(aercVar.c), null, new aeqy(aercVar, null), 3);
    }
}
