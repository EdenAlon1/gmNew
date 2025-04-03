package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmw implements ljv {
    public final /* synthetic */ ahmq a;

    public ahmw(ea eaVar, dsfh dsfhVar, ahmo ahmoVar, final ahmn ahmnVar, dtac dtacVar, final ViewGroup viewGroup, EditText editText, dzwu dzwuVar, Consumer consumer, Consumer consumer2) {
        final ahmr ahmrVar = new ahmr(consumer);
        final ahms ahmsVar = new ahms(consumer2);
        dqmr dqmrVar = ahmnVar.d;
        boolean a = ((ersq) ((atdw) ahmnVar.c).a.b()).a("bugle.use_tracing_in_edit_text_draft_text_controller");
        dqkk dqkkVar = (dqkk) dqmrVar.a.b();
        dqkkVar.getClass();
        dqmq dqmqVar = new dqmq(editText, a, dqkkVar);
        ffji ffjiVar = new ffji() { // from class: ahmj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                drlh drlhVar = (drlh) obj;
                drlhVar.getClass();
                ffji.this.invoke(drlhVar.f());
                return ffcu.a;
            }
        };
        ffji ffjiVar2 = new ffji() { // from class: ahmk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dzpz dzpzVar = (dzpz) obj;
                dzpzVar.getClass();
                ffji.this.invoke(dzpzVar.a().r());
                return ffcu.a;
            }
        };
        dqme dqmeVar = ahmnVar.b;
        new dqlu();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ahmm ahmmVar = new ahmm(ffjiVar, ahmnVar, ffjiVar2);
        int i = fflc.a;
        dqmd.b(new ffkb(drlh.class), ahmmVar, linkedHashMap);
        final dqls dqlsVar = new dqls(dqmqVar, dqmd.a(ahmnVar.a, linkedHashMap, dqmeVar));
        dzwuVar.j(new dzwt() { // from class: ahml
            @Override // defpackage.dzwt
            public final void a(Object obj) {
                ahmn ahmnVar2 = ahmn.this;
                ahmnVar2.e = (engw) obj;
                List list = ahmnVar2.e;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dzsr dzsrVar = (dzsr) dzsl.a(((dzpz) it.next()).a()).f();
                    if (dzsrVar != null) {
                        arrayList.add(dzsrVar);
                    }
                }
                List a2 = ahmnVar2.a.a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : a2) {
                    doxs doxsVar = (doxs) obj2;
                    if (doxsVar instanceof drlh) {
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (ffkj.e(((dzsr) it2.next()).g(), ((drlh) doxsVar).f())) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(obj2);
                    }
                }
                dqls dqlsVar2 = dqlsVar;
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    dqlsVar2.b.d((doxs) it3.next());
                }
            }
        });
        fr I = eaVar.I();
        ffix ffixVar = new ffix() { // from class: ahmt
            @Override // defpackage.ffix
            public final Object invoke() {
                return dqls.this;
            }
        };
        final int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.minimum_available_space);
        dsfv a2 = dsfhVar.a(dtacVar, I, ffixVar, new dsxk(new ffix() { // from class: ahmu
            @Override // defpackage.ffix
            public final Object invoke() {
                Object parent = viewGroup.getParent();
                parent.getClass();
                return Integer.valueOf(((View) parent).getHeight() - dimensionPixelSize);
            }
        }, viewGroup, new Consumer() { // from class: ahmv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                ViewGroup viewGroup2 = viewGroup;
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = num.intValue();
                viewGroup2.setLayoutParams(layoutParams);
                viewGroup2.setVisibility(num.intValue() > 0 ? 0 : 8);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer3) {
                return Consumer$CC.$default$andThen(this, consumer3);
            }
        }, 0, false, false, false, false, false, false, false, 131042));
        eg egVar = (eg) ahmoVar.a.b();
        egVar.getClass();
        ea eaVar2 = (ea) ((fbbb) ahmoVar.b).a;
        this.a = new ahmq(egVar, eaVar2, (uhd) ahmoVar.d.b(), a2);
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        this.a.f(lkrVar);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        this.a.ha(lkrVar);
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
    }
}
