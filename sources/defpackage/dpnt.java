package defpackage;

import android.view.View;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnt extends dpnn {
    public final dqkk u;
    public final dpnj v;
    private final Button w;

    public dpnt(dqkk dqkkVar, View view, dpnj dpnjVar) {
        super(view);
        this.u = dqkkVar;
        this.v = dpnjVar;
        this.w = (Button) view;
    }

    @Override // defpackage.dpnn
    public final Object C(ffgu ffguVar) {
        this.w.setOnClickListener(new View.OnClickListener() { // from class: dpns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final dpnt dpntVar = dpnt.this;
                dpntVar.u.b("CameraButtonViewHolder#onButtonClick", new View.OnClickListener() { // from class: dpnr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        view2.getClass();
                        dpnt.this.v.c.a(view2);
                    }
                });
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.dpnn
    public final Object E() {
        return ffcu.a;
    }

    @Override // defpackage.dpnn
    public final void D(dpni dpniVar) {
    }
}
