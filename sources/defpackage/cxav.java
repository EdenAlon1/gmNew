package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxav extends cwuk {
    protected final int a;
    private final ctyx b;

    public cxav(ctyx ctyxVar, Context context, int i) {
        super(context);
        this.b = ctyxVar;
        this.a = ctyxVar.d(context.getString(R.string.rcs_default_sharing_method_key), i != 1 ? 0 : i);
    }

    @Override // defpackage.cwuk
    protected final void a(int i) {
        this.b.j(this.i.getString(R.string.rcs_default_sharing_method_key), i);
        d();
    }

    @Override // defpackage.cwuk
    protected final void c() {
        this.j = this.i.getString(R.string.rcs_default_sharing_method_title);
        this.k = this.i.getResources().getStringArray(R.array.rcs_default_sharing_method_options);
        this.l = this.a;
        super.c();
    }
}
