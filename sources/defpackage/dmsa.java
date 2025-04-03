package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsa implements PointerInputEventHandler {
    final /* synthetic */ ffky a;
    final /* synthetic */ ffji b;
    final /* synthetic */ Context c;

    public dmsa(ffky ffkyVar, ffji ffjiVar, Context context) {
        this.a = ffkyVar;
        this.b = ffjiVar;
        this.c = context;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final ffkx ffkxVar = new ffkx();
        final ffky ffkyVar = this.a;
        ffji ffjiVar = new ffji() { // from class: dmrw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffky.this.a = 0.0f;
                ffkxVar.a = false;
                return ffcu.a;
            }
        };
        ffix ffixVar = new ffix() { // from class: dmrx
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        };
        ffix ffixVar2 = new ffix() { // from class: dmry
            @Override // defpackage.ffix
            public final Object invoke() {
                ffkx.this.a = false;
                return ffcu.a;
            }
        };
        final ffji ffjiVar2 = this.b;
        final Context context = this.c;
        Object b = dpu.b(ildVar, new dok(ffjiVar, new ffjm() { // from class: dmrz
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                float floatValue = ((Float) obj2).floatValue();
                ((iku) obj).getClass();
                ffkx ffkxVar2 = ffkx.this;
                if (!ffkxVar2.a) {
                    ffji ffjiVar3 = ffjiVar2;
                    ffky ffkyVar2 = ffkyVar;
                    float f = ffkyVar2.a + floatValue;
                    boolean z = false;
                    if (f < 0.0f && Math.abs(f) >= 150.0f && ffjiVar3 != null) {
                        z = true;
                    }
                    ffkxVar2.a = z;
                    ffkyVar2.a = f;
                    if (z) {
                        ffjiVar3.invoke(context);
                    }
                }
                return ffcu.a;
            }
        }, ffixVar, ffixVar2, null), ffguVar);
        ffhh ffhhVar = ffhh.a;
        if (b != ffhhVar) {
            b = ffcu.a;
        }
        return b == ffhhVar ? b : ffcu.a;
    }
}
