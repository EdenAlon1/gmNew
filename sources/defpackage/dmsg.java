package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsg implements PointerInputEventHandler {
    final /* synthetic */ fflb a;
    final /* synthetic */ dmsk b;
    final /* synthetic */ Context c;
    final /* synthetic */ ffsk d;
    final /* synthetic */ hho e;
    final /* synthetic */ iir f;
    final /* synthetic */ hho g;
    final /* synthetic */ hho h;
    final /* synthetic */ ffji i;

    public dmsg(fflb fflbVar, dmsk dmskVar, Context context, ffsk ffskVar, hho hhoVar, iir iirVar, hho hhoVar2, hho hhoVar3, ffji ffjiVar) {
        this.a = fflbVar;
        this.b = dmskVar;
        this.c = context;
        this.d = ffskVar;
        this.e = hhoVar;
        this.f = iirVar;
        this.g = hhoVar2;
        this.h = hhoVar3;
        this.i = ffjiVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final fflb fflbVar = this.a;
        final hho hhoVar = this.e;
        final dmsk dmskVar = this.b;
        final Context context = this.c;
        final ffsk ffskVar = this.d;
        final iir iirVar = this.f;
        ffji ffjiVar = new ffji() { // from class: dmsc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                fflb fflbVar2 = fflb.this;
                fflbVar2.a = dmskVar.d.invoke(context);
                ffqy.d(ffskVar, null, null, new dmse(fflbVar2, hhoVar, iirVar, null), 3);
                return ffcu.a;
            }
        };
        dmsf dmsfVar = new dmsf(fflbVar, this.g, this.h, hhoVar, dmskVar, iirVar, null);
        final ffji ffjiVar2 = this.i;
        final hho hhoVar2 = this.e;
        Object i = dtr.i(ildVar, null, ffjiVar, dmsfVar, new ffji() { // from class: dmsd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffji.this.invoke(dmnc.f);
                hhoVar2.b(false);
                return ffcu.a;
            }
        }, ffguVar, 1);
        return i == ffhh.a ? i : ffcu.a;
    }
}
