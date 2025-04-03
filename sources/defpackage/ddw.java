package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddw implements PointerInputEventHandler {
    final /* synthetic */ ddx a;

    public ddw(ddx ddxVar) {
        this.a = ddxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object b = this.a.b(ildVar, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
