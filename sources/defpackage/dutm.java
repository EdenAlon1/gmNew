package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dutm implements View.OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ dutn b;

    public dutm(dutn dutnVar, Context context) {
        this.a = context;
        this.b = dutnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dutn dutnVar;
        dutn dutnVar2 = this.b;
        dutnVar2.j = !dutnVar2.j;
        dutnVar2.c.removeViews(1, dutnVar2.f);
        for (int i = 0; i < this.b.f; i++) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            int i2 = 0;
            while (true) {
                dutnVar = this.b;
                if (i2 < dutnVar.e) {
                    dutnVar.b(i, i2, dutnVar.j, linearLayout);
                    i2++;
                }
            }
            dutnVar.c.addView(linearLayout);
        }
    }
}
