package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drgj extends vk {
    public final vx a;
    public final vk d;
    public final int e;
    private final ffbz f;

    public drgj(vx vxVar, vk vkVar, int i) {
        vkVar.getClass();
        this.a = vxVar;
        this.d = vkVar;
        this.e = i;
        this.f = ffca.a(new ffix() { // from class: drgh
            @Override // defpackage.ffix
            public final Object invoke() {
                return new dtcr(drgj.this.e, 0);
            }
        });
    }

    @Override // defpackage.vk
    public final int a() {
        return 1;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gifsticker_nested_recycler_view, viewGroup, false);
        inflate.getClass();
        return new drgi(this, (RecyclerView) inflate);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        drgi drgiVar = (drgi) wrVar;
        drgiVar.getClass();
        drgj drgjVar = drgiVar.t;
        RecyclerView recyclerView = drgiVar.s;
        recyclerView.ap(drgjVar.a);
        recyclerView.am(drgjVar.d);
        recyclerView.w(drgjVar.m());
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void k(wr wrVar) {
        drgi drgiVar = (drgi) wrVar;
        drgiVar.getClass();
        RecyclerView recyclerView = drgiVar.s;
        recyclerView.ap(null);
        recyclerView.am(null);
        recyclerView.ae(drgiVar.t.m());
    }

    public final dtcr m() {
        return (dtcr) this.f.a();
    }
}
