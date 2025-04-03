package defpackage;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bew extends bdy {
    private final Surface a;

    public bew(Surface surface) {
        super(bdy.b, 0);
        this.a = surface;
    }

    @Override // defpackage.bdy
    public final ListenableFuture a() {
        return bkj.b(this.a);
    }

    public bew(Surface surface, Size size, int i) {
        super(size, i);
        this.a = surface;
    }
}
