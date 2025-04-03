package defpackage;

import android.app.Activity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvwz extends dvxa {
    private final emwl d;
    private final dvzc e;
    private final dvxy f;

    public dvwz(dvxd dvxdVar, emwl emwlVar, dvzc dvzcVar, dvxy dvxyVar) {
        super(dvxdVar);
        this.d = emwlVar;
        this.e = dvzcVar;
        this.f = dvxyVar;
    }

    @Deprecated
    public final dvxe a() {
        return (dvxe) this.d.apply(e(this.e));
    }

    @Deprecated
    public final dvxe b(View view) {
        dvxy dvxyVar = this.f;
        dvxyVar.getClass();
        return dvxyVar.b(view, this);
    }

    @Deprecated
    public final void c(View view) {
        dvxy dvxyVar = this.f;
        dvxyVar.getClass();
        dvxyVar.e(view, this);
    }

    @Deprecated
    public final void d(Activity activity) {
        dvxy dvxyVar = this.f;
        dvxyVar.getClass();
        dvxyVar.f(activity, this);
    }
}
