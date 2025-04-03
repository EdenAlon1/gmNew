package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dseo extends vk {
    public final ffji a;
    public boolean d;
    public ffji e;
    private List f = ffel.a;

    public dseo(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    public final void F(ffji ffjiVar) {
        ffjiVar.getClass();
        this.e = ffjiVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_pack_item_layout, viewGroup, false);
        inflate.getClass();
        return new dsen(this, inflate);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dsen dsenVar = (dsen) wrVar;
        dsenVar.getClass();
        final dscj dscjVar = (dscj) this.f.get(i);
        dscjVar.getClass();
        ImageView imageView = dsenVar.t;
        qqs e = qpt.e(imageView);
        e.k(imageView);
        e.i(dscjVar.b).v(dsenVar.t);
        dsenVar.u.setText(dscjVar.c);
        int i2 = 8;
        if (dscjVar.f && dsenVar.w.d) {
            i2 = 0;
        }
        dsenVar.v.setVisibility(i2);
        View view = dsenVar.s;
        final dseo dseoVar = dsenVar.w;
        view.setContentDescription(dscjVar.c);
        view.setOnClickListener(new View.OnClickListener() { // from class: dsem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = dsen.x;
                dseo.this.a.invoke(dscjVar);
            }
        });
        ffji ffjiVar = dsenVar.w.e;
        if (ffjiVar != null) {
            ffjiVar.invoke(dsenVar.s);
        }
    }

    public final void m(List list, boolean z) {
        list.getClass();
        this.f = list;
        this.d = z;
        p();
    }
}
