package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xmh implements PointerInputEventHandler {
    final /* synthetic */ dsma a;
    final /* synthetic */ View b;

    public xmh(dsma dsmaVar, View view) {
        this.a = dsmaVar;
        this.b = view;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object p = ildVar.p(new xmg(this.a, this.b, null), ffguVar);
        return p == ffhh.a ? p : ffcu.a;
    }
}
