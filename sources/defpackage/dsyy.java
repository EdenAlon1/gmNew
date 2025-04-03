package defpackage;

import android.view.View;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dsyy extends ffkh implements ffji {
    public dsyy(Object obj) {
        super(1, obj, dszd.class, "attachContainer", "attachContainer(Lcom/google/android/libraries/compose/ui/rendering/container/RendererContainer;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RendererContainer rendererContainer = (RendererContainer) obj;
        rendererContainer.getClass();
        final dszd dszdVar = (dszd) this.g;
        enru enruVar = dszd.b;
        ((enrr) dszd.b.h().h("com/google/android/libraries/compose/ui/rendering/renderer/Renderer", "attachContainer", 152, "Renderer.kt")).t("Attaching to container %s added to anchor", rendererContainer);
        View a = rendererContainer.a();
        a.getLayoutParams().height = dszdVar.d.e;
        a.setTranslationY(-dszdVar.d.e);
        a.requestLayout();
        rendererContainer.addOnLayoutChangeListener(dszdVar.h);
        dsxu dsxuVar = null;
        if (dszdVar.e == null) {
            dsxv dsxvVar = dszdVar.c;
            ffix ffixVar = new ffix() { // from class: dsyq
                @Override // defpackage.ffix
                public final Object invoke() {
                    dtaa dtaaVar = dszd.this.f;
                    if (dtaaVar != null) {
                        return dtaaVar.gR();
                    }
                    return null;
                }
            };
            dswz dswzVar = new dswz(new ffix() { // from class: dsyr
                @Override // defpackage.ffix
                public final Object invoke() {
                    return Integer.valueOf(dszd.this.b());
                }
            }, new ffji() { // from class: dsys
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    dszd.this.j(((Integer) obj2).intValue());
                    return ffcu.a;
                }
            });
            dsyw dsywVar = new dsyw(dszdVar);
            dsxk dsxkVar = dszdVar.d;
            dsyx dsyxVar = new dsyx(dsxkVar);
            View a2 = dsxkVar.e > 0 ? rendererContainer.a() : null;
            ernh ernhVar = (ernh) dsxvVar.a.b();
            ernhVar.getClass();
            dszdVar.e = new dsxu(ernhVar, rendererContainer, ffixVar, dswzVar, dsywVar, dsyxVar, a2);
        }
        dsxu dsxuVar2 = dszdVar.e;
        if (dsxuVar2 == null) {
            ffkj.c("touchListener");
        } else {
            dsxuVar = dsxuVar2;
        }
        dsxuVar.f(true);
        dtaa dtaaVar = dszdVar.f;
        if (dtaaVar != null && dszdVar.d(dtaaVar.t()) == null) {
            dszh c = dszdVar.c();
            if (c == null) {
                throw new IllegalStateException("RendererFragment wasn't attached");
            }
            c.a(dtaaVar, dszdVar.d);
        }
        dszdVar.i(dszdVar.b(), false);
        return ffcu.a;
    }
}
