package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ebdv extends ebdm {
    public final int y;
    public ImageView z;

    public ebdv(ViewGroup viewGroup, Context context, ebvw ebvwVar) {
        super(viewGroup, context, ebvwVar);
        this.y = ebnr.b(context, R.attr.ogIconColor);
    }

    protected abstract void D(ViewGroup viewGroup);

    @Override // defpackage.ebdm
    protected final void E(lkr lkrVar) {
        super.E(lkrVar);
        ebdf ebdfVar = this.x;
        ebdfVar.getClass();
        ((ebdt) ebdfVar).i.l(lkrVar);
    }

    @Override // defpackage.ebdm
    protected final void F(ViewGroup viewGroup, ViewGroup viewGroup2) {
        View inflate = LayoutInflater.from(this.s).inflate(R.layout.og_icon_dynamic_card, viewGroup);
        this.z = (ImageView) inflate.findViewById(R.id.og_card_icon);
        D((ViewGroup) inflate.findViewById(R.id.og_card_view_container));
    }

    protected final void G(lkr lkrVar, ebdt ebdtVar) {
        super.H(lkrVar, ebdtVar);
        ebdtVar.i.f(lkrVar, new llh() { // from class: ebdu
            @Override // defpackage.llh
            public final void a(Object obj) {
                ebdv ebdvVar = ebdv.this;
                ebdvVar.z.setImageDrawable(((ebff) obj).e(ebdvVar.s, ebdvVar.y));
            }
        });
    }
}
