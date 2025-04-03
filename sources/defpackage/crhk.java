package defpackage;

import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crhk implements cbbt {
    private WeakReference a;

    public crhk(AsyncImageView asyncImageView) {
        this.a = new WeakReference(asyncImageView);
    }

    private final AsyncImageView d() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return (AsyncImageView) weakReference.get();
    }

    public final void c() {
        this.a = null;
    }

    @Override // defpackage.cbbt
    public final void fW(cbbn cbbnVar) {
        AsyncImageView d = d();
        if (d == null) {
            return;
        }
        d.e();
        d.f();
    }

    @Override // defpackage.cbbt
    public final /* bridge */ /* synthetic */ void fX(cbbn cbbnVar, cbcc cbccVar, boolean z) {
        cbbk cbbkVar = (cbbk) cbccVar;
        AsyncImageView d = d();
        if (d == null || d.b == cbbkVar) {
            return;
        }
        d.c(cbbkVar, z);
    }
}
