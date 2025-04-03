package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dstt implements PointerInputEventHandler {
    final /* synthetic */ dsss a;
    final /* synthetic */ dstx b;
    final /* synthetic */ dspe c;
    final /* synthetic */ hho d;
    final /* synthetic */ hho e;
    final /* synthetic */ hho f;

    public dstt(dsss dsssVar, dstx dstxVar, dspe dspeVar, hho hhoVar, hho hhoVar2, hho hhoVar3) {
        this.a = dsssVar;
        this.b = dstxVar;
        this.c = dspeVar;
        this.d = hhoVar;
        this.e = hhoVar2;
        this.f = hhoVar3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object b = dpu.b(ildVar, new dsts(this.a, this.b, this.c, this.d, this.e, this.f, null), ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
