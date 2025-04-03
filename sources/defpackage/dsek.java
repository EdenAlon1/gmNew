package defpackage;

import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsek extends vk {
    private static final drrj g;
    public final ffjn a;
    public final ffji d;
    public final ffjm e;
    public dscj f;
    private final drfd h;
    private final ffji i;

    static {
        ffbz ffbzVar = drje.a;
        g = new drrj(drjd.a(), (ImageView.ScaleType) null, 6);
    }

    public dsek(drfd drfdVar, ffji ffjiVar, ffjn ffjnVar, ffji ffjiVar2, ffjm ffjmVar) {
        this.h = drfdVar;
        this.i = ffjiVar;
        this.a = ffjnVar;
        this.d = ffjiVar2;
        this.e = ffjmVar;
    }

    public static final int m(int i) {
        return i == 0 ? 1 : 2;
    }

    @Override // defpackage.vk
    public final int a() {
        dscj dscjVar = this.f;
        if (dscjVar == null) {
            ffkj.c("stickerPack");
            dscjVar = null;
        }
        return dscjVar.e.size() + 1;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return m(i) - 1;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return this.h.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gifsticker_media_item_layout, viewGroup, false), g);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_pack_header_layout, viewGroup, false);
        inflate.getClass();
        return new dsej(this, inflate);
    }

    @Override // defpackage.vk
    public final void g(final wr wrVar, int i) {
        wrVar.getClass();
        final dscj dscjVar = null;
        if (!(wrVar instanceof dsej)) {
            if (wrVar instanceof drfc) {
                drfc drfcVar = (drfc) wrVar;
                dscj dscjVar2 = this.f;
                if (dscjVar2 == null) {
                    ffkj.c("stickerPack");
                } else {
                    dscjVar = dscjVar2;
                }
                drri.G(drfcVar, (drlj) dscjVar.e.get(i - 1), this.i, new drre() { // from class: dseg
                    @Override // defpackage.drre
                    public final boolean a(Object obj, PointF pointF) {
                        dsek.this.a.a((dsci) obj, wrVar.a, pointF);
                        return true;
                    }
                }, null, null, 120);
                return;
            }
            return;
        }
        final dsej dsejVar = (dsej) wrVar;
        dscj dscjVar3 = this.f;
        if (dscjVar3 == null) {
            ffkj.c("stickerPack");
        } else {
            dscjVar = dscjVar3;
        }
        dscjVar.getClass();
        dsejVar.t.setText(dscjVar.c);
        dsejVar.u.setText(dscjVar.d);
        View view = dsejVar.v;
        final dsek dsekVar = dsejVar.x;
        view.setOnClickListener(new View.OnClickListener() { // from class: dseh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = dsej.y;
                dsek.this.d.invoke(dscjVar);
            }
        });
        ImageView imageView = dsejVar.w;
        final dsek dsekVar2 = dsejVar.x;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: dsei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dscj dscjVar4 = dscj.this;
                dscjVar4.f = !dscjVar4.f;
                dsej dsejVar2 = dsejVar;
                dsejVar2.C(dsejVar2.s);
                dsekVar2.e.a(dscjVar4, Boolean.valueOf(dscjVar4.f));
            }
        });
        dsejVar.C(dsejVar.s);
        View view2 = dsejVar.s;
        view2.setContentDescription(dscjVar.c);
        int i2 = -view2.getContext().getResources().getDimensionPixelSize(R.dimen.standard_view_padding);
        View view3 = dsejVar.a;
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i2);
        marginLayoutParams.setMarginEnd(i2);
        view3.setLayoutParams(marginLayoutParams);
    }
}
