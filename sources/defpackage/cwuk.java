package defpackage;

import android.R;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwuk {
    protected final Context i;
    protected String j;
    public CharSequence[] k;
    public int l;
    protected int m = -1;
    protected iv n;

    protected cwuk(Context context) {
        this.i = context;
    }

    protected abstract void a(int i);

    protected void c() {
        if (this.n != null) {
            d();
        }
        ehft ehftVar = new ehft(this.i);
        ehftVar.w(this.k, this.l, new cwui(this));
        ehftVar.y(this.j);
        ehftVar.o(R.string.cancel, null);
        iv create = ehftVar.create();
        this.n = create;
        create.setOnShowListener(new cwuj(this));
        this.n.show();
    }

    protected final void d() {
        iv ivVar = this.n;
        if (ivVar != null) {
            ivVar.dismiss();
            this.n = null;
        }
    }
}
