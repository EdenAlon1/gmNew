package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.view.PreviewView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyb extends fflr {
    final /* synthetic */ dpyd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpyb(dpyd dpydVar) {
        super(null);
        this.a = dpydVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dpni dpniVar = (dpni) obj2;
        boolean d = this.a.x.d(dqlf.a);
        boolean z = false;
        if (dpniVar != null && dpniVar.b && d) {
            z = true;
        }
        this.a.J(z);
        String str = true != ffkj.e(dpniVar, dpng.a) ? null : "1:1";
        PreviewView previewView = this.a.C;
        previewView.getClass();
        ViewGroup.LayoutParams layoutParams = previewView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        kjz kjzVar = (kjz) layoutParams;
        kjzVar.I = str;
        previewView.setLayoutParams(kjzVar);
        int i = str != null ? -2 : -1;
        dpyd dpydVar = this.a;
        PreviewView previewView2 = dpydVar.C;
        previewView2.getClass();
        ffoh ffohVar = new ffoh(new ffoi(kvz.a(previewView2), new dpya(dpydVar)));
        while (ffohVar.hasNext()) {
            Object obj3 = (ViewParent) ffohVar.next();
            View view = obj3 instanceof View ? (View) obj3 : null;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = i;
                view.setLayoutParams(layoutParams2);
            }
        }
        View view2 = this.a.a;
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = i;
        view2.setLayoutParams(layoutParams3);
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
