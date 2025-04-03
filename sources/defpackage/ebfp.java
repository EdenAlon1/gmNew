package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebfp {
    public static ebfn h() {
        ebfr ebfrVar = new ebfr();
        ebfrVar.f(R.id.og_ai_custom_action);
        ebfrVar.i(false);
        ebfrVar.h(90541);
        ebfrVar.e(-1);
        ebfrVar.c(ebfm.CUSTOM);
        return ebfrVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Drawable d();

    public abstract View.OnClickListener e();

    public abstract lld f();

    public abstract ebfm g();

    public abstract ebfn i();

    public final ebfp j(View.OnClickListener onClickListener) {
        ebfn i = i();
        ((ebfr) i).b = onClickListener;
        return i.b();
    }

    public abstract ebfq k();

    public abstract emxc l();

    public abstract emxc m();

    public abstract String n();

    public abstract boolean o();

    public abstract void p();
}
