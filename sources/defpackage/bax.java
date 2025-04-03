package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bax {
    public int a;
    private final Map b;

    public bax() {
        this.a = ((CaptureFailedRetryQuirk) blp.a(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.b = new HashMap();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Matrix d();

    public abstract Rect e();

    public abstract avf f();

    public abstract avg g();

    public abstract List h();

    public abstract Executor i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    final void m(final avl avlVar) {
        i().execute(new Runnable() { // from class: bav
            @Override // java.lang.Runnable
            public final void run() {
                bax.this.f().a(avlVar);
            }
        });
    }

    final boolean n() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    final void o(int i) {
        Map map = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            this.b.put(valueOf, true);
        } else {
            avw.c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }
}
