package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehbh implements kud {
    final /* synthetic */ ehbn a;

    public ehbh(ehbn ehbnVar) {
        this.a = ehbnVar;
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        ehbn ehbnVar = this.a;
        ehbm ehbmVar = ehbnVar.h;
        if (ehbmVar != null) {
            ehbnVar.c.D.remove(ehbmVar);
        }
        ehbn ehbnVar2 = this.a;
        ehbnVar2.h = new ehbm(ehbnVar2.d, kxhVar);
        ehbn ehbnVar3 = this.a;
        ehbnVar3.h.d(ehbnVar3.getWindow());
        ehbn ehbnVar4 = this.a;
        ehbnVar4.c.w(ehbnVar4.h);
        return kxhVar;
    }
}
