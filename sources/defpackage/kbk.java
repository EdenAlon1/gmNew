package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbk extends ffkk implements ffix {
    final /* synthetic */ kbs a;
    final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbk(kbs kbsVar, View view) {
        super(0);
        this.a = kbsVar;
        this.b = view;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.removeView(this.b);
        return ffcu.a;
    }
}
