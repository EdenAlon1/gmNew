package defpackage;

import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dsyz extends ffkh implements ffji {
    public dsyz(Object obj) {
        super(1, obj, dszd.class, "detachContainer", "detachContainer(Lcom/google/android/libraries/compose/ui/rendering/container/RendererContainer;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RendererContainer rendererContainer = (RendererContainer) obj;
        rendererContainer.getClass();
        dszd dszdVar = (dszd) this.g;
        enru enruVar = dszd.b;
        ((enrr) dszd.b.h().h("com/google/android/libraries/compose/ui/rendering/renderer/Renderer", "detachContainer", 161, "Renderer.kt")).t("Detaching to container %s from anchor", rendererContainer);
        dsxu dsxuVar = dszdVar.e;
        if (dsxuVar != null) {
            dsxuVar.f(false);
        }
        rendererContainer.removeOnLayoutChangeListener(dszdVar.h);
        if (!dszdVar.d.h) {
            dszdVar.g.b();
        }
        return ffcu.a;
    }
}
