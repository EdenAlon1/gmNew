package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.DynamicCardRootView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebds extends vk implements ebfg {
    public engw d;
    private final Context e;
    private final eayo f;
    private final lld g;
    private final ebny h;
    private final ebvw i;
    private final ebfh j;
    private final llh k;
    private final int l;
    private lkr m;
    private engw n;
    public final mz a = new mz(Integer.class, new ebdo(this));
    private final eays o = new ebdq(this);

    public ebds(Context context, final eayo eayoVar, lld lldVar, ebny ebnyVar, ebvw ebvwVar, int i) {
        this.e = context;
        this.j = new ebfh(ebkq.b(context), eazq.m(context) + i);
        this.f = eayoVar;
        this.g = lldVar;
        int i2 = engw.d;
        engw engwVar = enou.a;
        this.d = engwVar;
        this.h = ebnyVar;
        this.i = ebvwVar;
        this.n = engwVar;
        this.l = i;
        this.k = new llh() { // from class: ebdn
            @Override // defpackage.llh
            public final void a(Object obj) {
                engw engwVar2 = (engw) obj;
                engwVar2.getClass();
                ebds ebdsVar = ebds.this;
                ebdsVar.d = engwVar2;
                ebdsVar.F(eayoVar.a());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void H(engw engwVar) {
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            ((ebdf) engwVar.get(i)).c(this.m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(Object obj) {
        engr engrVar = new engr();
        engw engwVar = this.d;
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            ebdf a = ((ebcy) engwVar.get(i)).a().a(obj);
            if (a != null) {
                a.g = this.h;
                a.g();
                engrVar.h(a);
            }
        }
        engw g = engrVar.g();
        H(this.n);
        this.a.g();
        this.n = g;
        for (int i2 = 0; i2 < ((enou) g).c; i2++) {
            ((ebdf) g.get(i2)).b(this.m, new ebdr(this, i2));
        }
        p();
    }

    @Override // defpackage.ebfg
    public final int G(RecyclerView recyclerView, View view) {
        int gp = recyclerView.gp(view);
        int i = 1;
        if (gp == -1) {
            return 1;
        }
        emxc m = m(((Integer) this.a.e(gp)).intValue());
        if (m.f() == ebef.ALWAYS_HIDE_DIVIDER_CARD || m.f() == ebef.COMMON_ACTION_CARD) {
            return 1;
        }
        if (gp > 0 && m.equals(m(((Integer) this.a.e(gp - 1)).intValue())) && m.g()) {
            int ordinal = ((ebef) m.c()).ordinal();
            if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                }
            }
            return i;
        }
        return 2;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final int dE(int i) {
        int i2;
        ebdf ebdfVar = (ebdf) this.n.get(((Integer) this.a.e(i)).intValue());
        if (ebdfVar instanceof ebcz) {
            i2 = 4;
        } else if ((ebdfVar instanceof ebed) || (ebdfVar instanceof ebea)) {
            i2 = 2;
        } else if (ebdfVar instanceof ebcm) {
            i2 = 3;
        } else {
            if (!(ebdfVar instanceof ebei)) {
                throw new IllegalArgumentException("Unsupported card type");
            }
            i2 = 1;
        }
        return i2 - 1;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        ebdm ebfdVar;
        int i2 = new int[]{1, 2, 3, 4}[i];
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        ebvw ebvwVar = this.i;
        Context context = this.e;
        if (i3 != 0) {
            if (i3 == 1) {
                ebfdVar = new ebeb(viewGroup, context, ebvwVar);
            } else if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException("Unsupported card type");
                }
                ebfdVar = new ebda(viewGroup, context, ebvwVar);
            }
            int i4 = this.l;
            int[] iArr = kvo.a;
            DynamicCardRootView dynamicCardRootView = ebfdVar.u;
            int paddingStart = dynamicCardRootView.getPaddingStart() + i4;
            DynamicCardRootView dynamicCardRootView2 = ebfdVar.u;
            dynamicCardRootView.setPaddingRelative(paddingStart, dynamicCardRootView2.getPaddingTop(), dynamicCardRootView2.getPaddingEnd() + i4, ebfdVar.u.getPaddingBottom());
            return ebfdVar;
        }
        ebfdVar = new ebfd(viewGroup, context, ebvwVar);
        int i42 = this.l;
        int[] iArr2 = kvo.a;
        DynamicCardRootView dynamicCardRootView3 = ebfdVar.u;
        int paddingStart2 = dynamicCardRootView3.getPaddingStart() + i42;
        DynamicCardRootView dynamicCardRootView22 = ebfdVar.u;
        dynamicCardRootView3.setPaddingRelative(paddingStart2, dynamicCardRootView22.getPaddingTop(), dynamicCardRootView22.getPaddingEnd() + i42, ebfdVar.u.getPaddingBottom());
        return ebfdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final /* synthetic */ void g(wr wrVar, int i) {
        ebdm ebdmVar = (ebdm) wrVar;
        ebdmVar.H(this.m, (ebdf) this.n.get(((Integer) this.a.e(i)).intValue()));
        Integer num = (Integer) ebdmVar.a.getTag(R.id.og_card_highlight_id_tag);
        if (num != null) {
            num.intValue();
        }
    }

    @Override // defpackage.vk
    public final void h(RecyclerView recyclerView) {
        this.f.d(this.o);
        recyclerView.ae(this.j);
        this.g.k(this.k);
        H(this.n);
        this.a.g();
    }

    @Override // defpackage.vk
    public final void hc(RecyclerView recyclerView) {
        recyclerView.w(this.j);
        this.m = fr.f(recyclerView);
        this.f.c(this.o);
        this.o.b(this.f.a());
        this.g.f(this.m, this.k);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void k(wr wrVar) {
        ((ebdm) wrVar).E(this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final emxc m(int i) {
        ebdf ebdfVar = (ebdf) this.n.get(i);
        return ebdfVar instanceof ebei ? ((ebei) ebdfVar).w : emux.a;
    }
}
