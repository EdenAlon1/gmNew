package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszl extends dszd {
    public static final /* synthetic */ int j = 0;
    private final ffbz k;

    public dszl(Context context, dsxv dsxvVar, fr frVar, final dsxk dsxkVar, dsma dsmaVar) {
        super(context, dsxvVar, frVar, dsxkVar, dsmaVar);
        this.k = ffca.a(new ffix() { // from class: dszk
            @Override // defpackage.ffix
            public final Object invoke() {
                int i = dszl.j;
                return new PopupWindow(dsxk.this.c);
            }
        });
    }

    private final PopupWindow n() {
        return (PopupWindow) this.k.a();
    }

    @Override // defpackage.dszd
    public final void e() {
        super.e();
        n().dismiss();
    }

    @Override // defpackage.dszd
    public final void i(int i, boolean z) {
        super.i(i, z);
        n().setHeight(i);
    }

    @Override // defpackage.dszd
    public final void k(int i, int i2) {
        super.k(i, i2);
        n().setHeight(i2);
        ViewGroup.LayoutParams layoutParams = n().getContentView().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new WindowManager.LayoutParams();
        }
        layoutParams.width = -1;
        layoutParams.height = i2;
        n().getContentView().setLayoutParams(layoutParams);
        n().showAtLocation(this.d.c, 80, 0, i);
    }
}
