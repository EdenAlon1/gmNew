package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czep extends vk {
    final /* synthetic */ czer a;

    public czep(czer czerVar) {
        this.a = czerVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.d.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = this.a.c.inflate(R.layout.emoji_variant_selector_recycler_view_item, viewGroup, false);
        AsyncImageView asyncImageView = (AsyncImageView) inflate.findViewById(R.id.emoji_image);
        asyncImageView.g();
        asyncImageView.setLayoutParams(this.a.m);
        final czeq czeqVar = new czeq(this.a, inflate, asyncImageView);
        asyncImageView.setOnClickListener(new View.OnClickListener() { // from class: czeo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czeq czeqVar2 = czeq.this;
                String str = (String) czeqVar2.t.d.get(czeqVar2.fr());
                czee czeeVar = czeqVar2.t.n;
                czeeVar.getClass();
                czeeVar.a.D(str);
                czeqVar2.t.dismiss();
            }
        });
        return czeqVar;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        czeq czeqVar = (czeq) wrVar;
        String a = czeqVar.t.b.a((String) this.a.d.get(i));
        Uri f = csuu.f(czeqVar.t.a, a);
        int i2 = czeqVar.t.k;
        czeqVar.s.d(new cbba(f, i2, i2));
        czeqVar.s.setContentDescription(a);
    }
}
