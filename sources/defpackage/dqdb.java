package defpackage;

import android.content.Context;
import android.util.Size;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqdb {
    public final Context a;
    public final dtdg b;
    public final dqcp c;
    public final dqdf d;
    public dqcz f;
    private final ffbz g = ffca.a(new ffix() { // from class: dqct
        @Override // defpackage.ffix
        public final Object invoke() {
            return new dqda(dqdb.this);
        }
    });
    private final ffbz h = ffca.a(new ffix() { // from class: dqcu
        @Override // defpackage.ffix
        public final Object invoke() {
            return new dtct(dqdb.this.a.getResources().getDimensionPixelSize(R.dimen.standard_view_padding));
        }
    });
    public final ffbz e = ffca.a(new ffix() { // from class: dqcv
        @Override // defpackage.ffix
        public final Object invoke() {
            return Integer.valueOf(dqdb.this.a.getResources().getDimensionPixelSize(R.dimen.camera_gallery_reactive_grid_threshold));
        }
    });

    public dqdb(Context context, dtdg dtdgVar, dqcp dqcpVar, dqdf dqdfVar) {
        this.a = context;
        this.b = dtdgVar;
        this.c = dqcpVar;
        this.d = dqdfVar;
    }

    public final Size a(int i) {
        dqcw b = b();
        if (true != b.b()) {
            b = null;
        }
        if (b != null) {
            return b.a(i);
        }
        return null;
    }

    public final dqcw b() {
        return (dqcw) this.g.a();
    }

    public final dtct c() {
        return (dtct) this.h.a();
    }
}
