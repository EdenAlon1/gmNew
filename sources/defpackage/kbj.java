package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbj extends ffkk implements ffji {
    final /* synthetic */ kbs a;
    final /* synthetic */ iui b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbj(kbs kbsVar, iui iuiVar) {
        super(1);
        this.a = kbsVar;
        this.b = iuiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kbu.d(this.a, this.b);
        this.a.d.A();
        kbs kbsVar = this.a;
        View view = kbsVar.c;
        int[] iArr = kbsVar.o;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationOnScreen(iArr);
        kbs kbsVar2 = this.a;
        long j = kbsVar2.p;
        kbsVar2.p = ((ioc) obj).g();
        kbs kbsVar3 = this.a;
        int[] iArr2 = kbsVar3.o;
        if (i != iArr2[0] || i2 != iArr2[1] || !kaf.e(j, kbsVar3.p)) {
            kbsVar3.c.requestApplyInsets();
        }
        return ffcu.a;
    }
}
