package defpackage;

import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxr extends fflr {
    final /* synthetic */ dsxu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsxr(Object obj, dsxu dsxuVar) {
        super(obj);
        this.a = dsxuVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            dsxu dsxuVar = this.a;
            RendererContainer rendererContainer = dsxuVar.c;
            rendererContainer.a = dsxuVar.m;
            rendererContainer.setOnTouchListener(dsxuVar.n);
            return;
        }
        dsxu dsxuVar2 = this.a;
        dsxuVar2.g();
        RendererContainer rendererContainer2 = dsxuVar2.c;
        rendererContainer2.a = null;
        rendererContainer2.setOnTouchListener(null);
        if (dsxuVar2.q >= 0.0f) {
            dsxuVar2.e();
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
