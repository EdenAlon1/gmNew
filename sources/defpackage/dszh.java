package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszh extends ea implements dsfw {
    public static final enru a = enru.c("com/google/android/libraries/compose/ui/rendering/renderer/RendererFragment");
    public Integer b;
    public RendererContainer c;

    public dszh() {
        this.Z.c(new dszg());
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.renderer_root, viewGroup, false);
    }

    public final void a(final dtaa dtaaVar, dsxk dsxkVar) {
        final fr I = I();
        I.getClass();
        dsxl.a(dsxkVar, I, false, new ffji() { // from class: dszf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                gg ggVar = (gg) obj;
                ggVar.getClass();
                dtaa dtaaVar2 = dtaaVar;
                ea h = fr.this.h(dtaaVar2.t().name());
                if (h == null) {
                    ggVar.t(R.id.renderer_root, dtaaVar2, dtaaVar2.t().name());
                } else if (ffkj.e(h, dtaaVar2)) {
                    ggVar.q(dtaaVar2);
                } else {
                    ggVar.x(R.id.renderer_root, dtaaVar2, dtaaVar2.t().name());
                }
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        this.c = (RendererContainer) view;
        if (bundle != null && bundle.getBoolean("is_hidden")) {
            cg cgVar = new cg(J());
            cgVar.l(this);
            cgVar.j();
        }
        Integer num = this.b;
        if (num != null) {
            int intValue = num.intValue();
            RendererContainer rendererContainer = this.c;
            if (rendererContainer == null) {
                ffkj.c("root");
                rendererContainer = null;
            }
            rendererContainer.b(intValue, false);
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("is_hidden", aG());
    }
}
