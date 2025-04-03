package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbzy implements dcah {
    public dbzn a;
    protected final dcab b;
    public int c;
    public dcau d;
    protected final ContentGridView e;
    private final dcak f;

    public dbzy(dcak dcakVar, dcab dcabVar, ContentGridView contentGridView, int i) {
        this.f = dcakVar;
        this.b = dcabVar;
        this.e = contentGridView;
        this.c = i;
    }

    public int a() {
        return this.f.a();
    }

    public int b(int i) {
        return 1;
    }

    protected long c(int i, int i2) {
        return -1L;
    }

    public void d(dcal dcalVar, int i) {
        dcalVar.b(new dcai(this, i));
    }

    @Override // defpackage.dcah
    public final void e(dcal dcalVar, int i) {
        f(dcalVar, i);
    }

    protected abstract void f(dcal dcalVar, int i);

    @Override // defpackage.dcah
    public /* synthetic */ void g() {
    }
}
