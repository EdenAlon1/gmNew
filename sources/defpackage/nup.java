package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nup extends vk {
    public final String[] a;
    public final float[] d;
    public int e;
    final /* synthetic */ nva f;

    public nup(nva nvaVar, String[] strArr, float[] fArr) {
        this.f = nvaVar;
        this.a = strArr;
        this.d = fArr;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new nut(LayoutInflater.from(this.f.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, final int i) {
        String[] strArr = this.a;
        nut nutVar = (nut) wrVar;
        if (i < strArr.length) {
            nutVar.s.setText(strArr[i]);
        }
        if (i == this.e) {
            nutVar.a.setSelected(true);
            nutVar.t.setVisibility(0);
        } else {
            nutVar.a.setSelected(false);
            nutVar.t.setVisibility(4);
        }
        nutVar.a.setOnClickListener(new View.OnClickListener() { // from class: nuo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                nup nupVar = nup.this;
                if (i2 != nupVar.e) {
                    nva nvaVar = nupVar.f;
                    float f = nupVar.d[i2];
                    lro lroVar = nvaVar.D;
                    if (lroVar != null && lroVar.n(13)) {
                        lro lroVar2 = nvaVar.D;
                        lri a = lroVar2.G().a(f);
                        mgl mglVar = (mgl) lroVar2;
                        mglVar.au();
                        if (!mglVar.A.p.equals(a)) {
                            mhz e = mglVar.A.e(a);
                            mglVar.o++;
                            mglVar.g.e.d(4, a).b();
                            mglVar.as(e, 0, false, 5, -9223372036854775807L, -1, false);
                        }
                    }
                }
                nupVar.f.g.dismiss();
            }
        });
    }
}
