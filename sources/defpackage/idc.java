package defpackage;

import android.graphics.RenderEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class idc {
    private RenderEffect a;

    protected abstract RenderEffect a();

    public final RenderEffect b() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect a = a();
        this.a = a;
        return a;
    }
}
