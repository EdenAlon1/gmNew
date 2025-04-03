package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drzy extends vk {
    public final dtbz a;
    public final dqkk d;
    public final ffji e;
    public final ffji f;
    public String g;
    private final ffbz i = ffca.a(new ffix() { // from class: drzm
        @Override // defpackage.ffix
        public final Object invoke() {
            final drzy drzyVar = drzy.this;
            dqig dqigVar = new dqig() { // from class: drzn
                @Override // defpackage.dqig
                public final /* synthetic */ boolean a(Object obj, int i, Object obj2) {
                    drzx drzxVar = (drzx) obj;
                    drzy drzyVar2 = drzy.this;
                    String str = drzyVar2.g;
                    if (str == null) {
                        ffkj.c("userQuery");
                        str = null;
                    }
                    drzxVar.C(str, (drzq) drzyVar2.h.get(i));
                    return true;
                }
            };
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = fflc.a;
            dqif.b(new ffkb(drzr.class), dqigVar, linkedHashMap);
            return dqif.a(linkedHashMap);
        }
    });
    public List h = ffel.a;

    public drzy(dtbz dtbzVar, dqkk dqkkVar, ffji ffjiVar, ffji ffjiVar2) {
        this.a = dtbzVar;
        this.d = dqkkVar;
        this.e = ffjiVar;
        this.f = ffjiVar2;
    }

    public final void F(List list) {
        List a = dqie.a(this.h, list, new ffjm() { // from class: drzk
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                ((drzq) obj).getClass();
                ((drzq) obj2).getClass();
                return false;
            }
        }, new ffjm() { // from class: drzl
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                ((drzq) obj).getClass();
                ((drzq) obj2).getClass();
                return drzr.a;
            }
        }, 4);
        this.h = list;
        dqie.b(a, 6, this);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.h.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_row_layout, viewGroup, false);
        inflate.getClass();
        return new drzx(this, inflate);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        drzx drzxVar = (drzx) wrVar;
        drzxVar.getClass();
        z(drzxVar, i, ffel.a);
    }

    @Override // defpackage.vk
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void z(drzx drzxVar, int i, List list) {
        drzxVar.getClass();
        list.getClass();
        if (((dqih) this.i.a()).a(drzxVar, i, list)) {
            return;
        }
        String str = this.g;
        if (str == null) {
            ffkj.c("userQuery");
            str = null;
        }
        final drzq drzqVar = (drzq) this.h.get(i);
        str.getClass();
        drzqVar.getClass();
        Object a = drzxVar.t.a();
        a.getClass();
        View view = drzxVar.s;
        ((ImageView) a).setImageDrawable(view.getContext().getDrawable(drzqVar.a()));
        View view2 = drzxVar.s;
        final drzy drzyVar = drzxVar.u;
        view2.setOnClickListener(drzyVar.d.b("SearchRowsAdapter.ViewHolder#onRowClick", new View.OnClickListener() { // from class: drzv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i2 = drzx.v;
                drzy.this.e.invoke(drzqVar.b());
            }
        }));
        drzxVar.C(str, drzqVar);
    }
}
