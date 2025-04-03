package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dray extends drri {
    private static final drkd z = new drkd(true, true);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dray(android.app.Activity r13, defpackage.ffsk r14, defpackage.drro r15, defpackage.dqkk r16, android.view.View r17, defpackage.drrj r18) {
        /*
            r12 = this;
            r0 = 2131429115(0x7f0b06fb, float:1.8479894E38)
            r6 = r17
            android.view.View r0 = r6.findViewById(r0)
            r0.getClass()
            r7 = r0
            com.google.android.libraries.compose.ui.views.RoundedImageView r7 = (com.google.android.libraries.compose.ui.views.RoundedImageView) r7
            java.lang.String r9 = "CustomStickerViewHolder#onClick"
            java.lang.String r10 = "CustomStickerViewHolder#onLongClick"
            java.lang.String r8 = "CustomStickerViewHolder"
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r11 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dray.<init>(android.app.Activity, ffsk, drro, dqkk, android.view.View, drrj):void");
    }

    @Override // defpackage.drri
    public final /* bridge */ /* synthetic */ qqo C(drlj drljVar, qqo qqoVar) {
        dqzc dqzcVar = (dqzc) drljVar;
        if (this.x.a == null) {
            this.v.c(drlf.a(dqzcVar));
        }
        this.v.b();
        this.a.setContentDescription(dqzcVar.f);
        this.a.setTag("Custom Sticker: ".concat(dqzcVar.a));
        qqo a = qqoVar.a(new drax(this));
        a.getClass();
        return a;
    }

    @Override // defpackage.drri
    public final /* bridge */ /* synthetic */ drlh D(drlj drljVar) {
        return drma.b((dqzc) drljVar, z);
    }

    @Override // defpackage.drri
    public final void E() {
        super.E();
        this.a.setContentDescription(null);
    }
}
