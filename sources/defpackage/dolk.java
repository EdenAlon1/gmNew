package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dolk implements PointerInputEventHandler {
    final /* synthetic */ List a;
    final /* synthetic */ hho b;
    final /* synthetic */ hho c;

    public dolk(List list, hho hhoVar, hho hhoVar2) {
        this.a = list;
        this.b = hhoVar;
        this.c = hhoVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        Object c = dlur.c(ildVar, dolo.b(this.b), dolo.a(this.c), this.a, ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }
}
