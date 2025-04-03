package defpackage;

import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpq extends drri {
    private final TextView A;
    private final Optional z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public drpq(android.app.Activity r12, defpackage.drro r13, j$.util.Optional r14, defpackage.dqkk r15, defpackage.ffsk r16, android.view.View r17, defpackage.drrj r18) {
        /*
            r11 = this;
            r5 = r17
            r0 = 2131429049(0x7f0b06b9, float:1.847976E38)
            android.view.View r0 = r5.findViewById(r0)
            r0.getClass()
            r6 = r0
            com.google.android.libraries.compose.ui.views.RoundedImageView r6 = (com.google.android.libraries.compose.ui.views.RoundedImageView) r6
            java.lang.String r8 = "VisualLocalMediaViewHolder#onClick"
            java.lang.String r9 = "VisualLocalMediaViewHolder#onLongClick"
            java.lang.String r7 = "VisualLocalMediaViewHolder"
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r15
            r2 = r16
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.z = r14
            r12 = 2131430932(0x7f0b0e14, float:1.8483579E38)
            android.view.View r12 = r5.findViewById(r12)
            r12.getClass()
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.A = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drpq.<init>(android.app.Activity, drro, j$.util.Optional, dqkk, ffsk, android.view.View, drrj):void");
    }

    @Override // defpackage.drri
    public final /* bridge */ /* synthetic */ qqo C(drlj drljVar, qqo qqoVar) {
        rig rigVar;
        drnm drnmVar = (drnm) drljVar;
        this.v.b();
        if (drnmVar instanceof drnl) {
            this.A.setVisibility(0);
            if (((Boolean) fflm.a(this.z, true)).booleanValue()) {
                this.A.setText(DateUtils.formatElapsedTime(((drnl) drnmVar).g.getSeconds()));
            }
            this.A.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.v.getContext().getDrawable(R.drawable.gs_play_arrow_fill1_vd_24), (Drawable) null);
        } else {
            this.A.setVisibility(8);
        }
        if (this.x.b != ImageView.ScaleType.CENTER_CROP) {
            rigVar = rig.a();
        } else {
            if (rig.x == null) {
                rig.x = (rig) ((rig) new rig().E()).x();
            }
            rigVar = rig.x;
        }
        rhx W = qqoVar.q(rigVar).W(new rjm(drnmVar.b().a(), drnmVar.c().toEpochMilli()));
        W.getClass();
        return (qqo) W;
    }

    @Override // defpackage.drri
    public final /* bridge */ /* synthetic */ drlh D(drlj drljVar) {
        return (drnm) drljVar;
    }

    @Override // defpackage.drri
    public final void E() {
        super.E();
        this.a.setContentDescription(null);
    }
}
