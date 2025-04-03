package defpackage;

import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import androidx.camera.view.PreviewView;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccd implements awk {
    final /* synthetic */ PreviewView a;

    public ccd(PreviewView previewView) {
        this.a = previewView;
    }

    @Override // defpackage.awk
    public final void a(final axt axtVar) {
        cci ccxVar;
        if (!biw.d()) {
            koa.e(this.a.getContext()).execute(new Runnable() { // from class: cca
                @Override // java.lang.Runnable
                public final void run() {
                    ccd.this.a.j.a(axtVar);
                }
            });
            return;
        }
        avw.a("PreviewView", "Surface requested by Preview.");
        final bct bctVar = axtVar.f;
        this.a.i = bctVar.f();
        ccj ccjVar = this.a.h;
        Rect f = bctVar.e().f();
        ccjVar.a = new Rational(f.width(), f.height());
        synchronized (ccjVar) {
            ccjVar.d = f;
        }
        axtVar.c(koa.e(this.a.getContext()), new axs() { // from class: ccb
            @Override // defpackage.axs
            public final void a(axr axrVar) {
                cci cciVar;
                Objects.toString(axrVar);
                avw.a("PreviewView", "Preview transformation info updated. ".concat(axrVar.toString()));
                int a = bctVar.f().a();
                Integer.valueOf(a).getClass();
                StringBuilder sb = new StringBuilder("Transformation info set: ");
                sb.append(axrVar);
                sb.append(" ");
                Size size = axtVar.c;
                sb.append(size);
                sb.append(" ");
                boolean z = true;
                boolean z2 = a == 0;
                sb.append(z2);
                avw.a("PreviewTransform", sb.toString());
                asz aszVar = (asz) axrVar;
                Rect rect = aszVar.a;
                PreviewView previewView = ccd.this.a;
                cbx cbxVar = previewView.c;
                cbxVar.b = rect;
                cbxVar.c = aszVar.b;
                int i = aszVar.c;
                cbxVar.e = i;
                cbxVar.a = size;
                cbxVar.f = z2;
                cbxVar.g = aszVar.d;
                cbxVar.d = aszVar.e;
                if (i != -1 && ((cciVar = previewView.a) == null || !(cciVar instanceof ccx))) {
                    z = false;
                }
                previewView.d = z;
                previewView.c();
            }
        });
        PreviewView previewView = this.a;
        boolean z = previewView.a instanceof ccx;
        int i = previewView.k;
        if (!z || PreviewView.e(axtVar, i)) {
            PreviewView previewView2 = this.a;
            if (PreviewView.e(axtVar, previewView2.k)) {
                PreviewView previewView3 = this.a;
                ccxVar = new cdg(previewView3, previewView3.c);
            } else {
                PreviewView previewView4 = this.a;
                ccxVar = new ccx(previewView4, previewView4.c);
            }
            previewView2.a = ccxVar;
        }
        bcq f2 = bctVar.f();
        PreviewView previewView5 = this.a;
        cbw cbwVar = new cbw(f2, previewView5.e, previewView5.a);
        this.a.f.set(cbwVar);
        bctVar.g().c(koa.e(this.a.getContext()), cbwVar);
        this.a.a.h(axtVar, new ccc(this, cbwVar, bctVar));
        PreviewView previewView6 = this.a;
        if (previewView6.indexOfChild(previewView6.b) == -1) {
            PreviewView previewView7 = this.a;
            previewView7.addView(previewView7.b);
        }
    }
}
