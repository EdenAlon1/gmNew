package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxs extends vk {
    private final dcag a;
    private int d;

    public dbxs(dcag dcagVar) {
        this.a = dcagVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return this.a.b(i).n();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new dbxr(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dcae b = this.a.b(i);
        b.x(this.d);
        b.gB(((dbxr) wrVar).a);
    }

    public final void m(int i) {
        this.d = i;
        for (int i2 = 0; i2 < this.a.a(); i2++) {
            dcae b = this.a.b(i2);
            if (b != null) {
                b.x(i);
            }
        }
    }
}
