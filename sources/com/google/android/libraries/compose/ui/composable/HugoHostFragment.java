package com.google.android.libraries.compose.ui.composable;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.composable.HugoHostFragment;
import defpackage.abo;
import defpackage.acc;
import defpackage.dqls;
import defpackage.dsar;
import defpackage.dsat;
import defpackage.dsfg;
import defpackage.dsfh;
import defpackage.dsfp;
import defpackage.dsfv;
import defpackage.dsfw;
import defpackage.dsgh;
import defpackage.dsgs;
import defpackage.dsgu;
import defpackage.dsgv;
import defpackage.dsgx;
import defpackage.dsjz;
import defpackage.dsmm;
import defpackage.dsxg;
import defpackage.dsxi;
import defpackage.dsxk;
import defpackage.dszr;
import defpackage.dtaa;
import defpackage.dtab;
import defpackage.dtac;
import defpackage.dtbg;
import defpackage.dtbi;
import defpackage.dtbl;
import defpackage.dtbn;
import defpackage.dtbp;
import defpackage.dtbr;
import defpackage.dtbt;
import defpackage.dtbv;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ffbr;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.ffcd;
import defpackage.ffdx;
import defpackage.ffix;
import defpackage.ffji;
import defpackage.ffkj;
import defpackage.fflm;
import defpackage.ffqy;
import defpackage.ffsk;
import defpackage.fr;
import defpackage.kug;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class HugoHostFragment extends dsgh implements dsfw {
    public static final enru a = enru.c("com/google/android/libraries/compose/ui/composable/HugoHostFragment");
    public Optional ag;
    public dqls ah;
    public dtbg ai;
    public ffji aj;
    public dsgx ak;
    public boolean al;
    public dsfg am;
    public abo an;
    public Integer ao;
    public Integer ap;
    private final ffbz aq;
    public dsfh b;
    public ffsk c;
    public Optional d;
    public ffbr e;

    public HugoHostFragment() {
        super(R.layout.hugo_anchor);
        this.aj = new ffji() { // from class: dsgm
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Context) obj).getClass();
                return 0;
            }
        };
        this.aq = ffca.a(new ffix() { // from class: dsgn
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional = HugoHostFragment.this.d;
                if (optional == null) {
                    ffkj.c("optionalProvidedConfiguration");
                    optional = null;
                }
                optional.isPresent();
                return optional.get();
            }
        });
    }

    private final void s(int i) {
        View view = this.Q;
        if (view != null) {
            kug.b(view, new dsgv(view, i));
        }
        this.ap = null;
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final View M = super.M(layoutInflater, viewGroup, bundle);
        if (M == null) {
            return null;
        }
        dsfh dsfhVar = this.b;
        if (dsfhVar == null) {
            ffkj.c("hugoManagerFactory");
            dsfhVar = null;
        }
        dtac dtacVar = e().a;
        fr I = I();
        ffix ffixVar = new ffix() { // from class: dsgi
            @Override // defpackage.ffix
            public final Object invoke() {
                HugoHostFragment hugoHostFragment = HugoHostFragment.this;
                ffbr ffbrVar = null;
                if (hugoHostFragment.e().c) {
                    ffbr ffbrVar2 = hugoHostFragment.e;
                    if (ffbrVar2 == null) {
                        ffkj.c("providedDraftController");
                    } else {
                        ffbrVar = ffbrVar2;
                    }
                    return (dqls) ffbrVar.b();
                }
                dqls dqlsVar = hugoHostFragment.ah;
                if (dqlsVar != null) {
                    return dqlsVar;
                }
                ffkj.c("draftController");
                return null;
            }
        };
        Consumer consumer = new Consumer() { // from class: dsgj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                View view = M;
                ViewParent parent = ((ViewGroup) view).getParent();
                HugoHostFragment hugoHostFragment = this;
                if (parent == null) {
                    ((enrr) HugoHostFragment.a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "onCreateView$lambda$12$lambda$8", 155, "HugoHostFragment.kt")).q("View does not have parent yet, so saving height to set when it does have a parent.");
                    hugoHostFragment.ao = num;
                    hugoHostFragment.ap = num;
                } else {
                    if (hugoHostFragment.al && ((Boolean) fflm.a(hugoHostFragment.f(), false)).booleanValue()) {
                        ((enrr) HugoHostFragment.a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "onCreateView$lambda$12$lambda$8", 144, "HugoHostFragment.kt")).r("Fragment is paused, so saving height %s to set when it resumes.", num.intValue());
                        hugoHostFragment.ap = num;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = num.intValue();
                    view.setLayoutParams(layoutParams);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        e();
        boolean z = e().b;
        e();
        dsfv a2 = dsfhVar.a(dtacVar, I, ffixVar, new dsxk(new ffix() { // from class: dsgk
            @Override // defpackage.ffix
            public final Object invoke() {
                HugoHostFragment hugoHostFragment = HugoHostFragment.this;
                Context z2 = hugoHostFragment.z();
                return Integer.valueOf(z2 != null ? ((Number) hugoHostFragment.aj.invoke(z2)).intValue() : 0);
            }
        }, (ViewGroup) M, consumer, 0, false, false, false, z, true, true, e().d, 5090));
        a2.d();
        this.am = a2;
        this.an = acc.a(fe().gE(), fe(), false, new ffji() { // from class: dsgl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((abo) obj).getClass();
                ((enrr) HugoHostFragment.a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "onCreateView$lambda$12$lambda$11", 187, "HugoHostFragment.kt")).q("Handling back navigation event.");
                HugoHostFragment hugoHostFragment = HugoHostFragment.this;
                dsfg dsfgVar = hugoHostFragment.am;
                dsfg dsfgVar2 = null;
                if (dsfgVar == null) {
                    ffkj.c("hugoManager");
                    dsfgVar = null;
                }
                if (!dsfgVar.p()) {
                    dsfg dsfgVar3 = hugoHostFragment.am;
                    if (dsfgVar3 == null) {
                        ffkj.c("hugoManager");
                    } else {
                        dsfgVar2 = dsfgVar3;
                    }
                    int ordinal = dsfgVar2.c().ordinal();
                    if (ordinal == 0) {
                        ((enrr) HugoHostFragment.a.i().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 288, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is MATCHING_KEYBOARD.");
                    } else if (ordinal == 1) {
                        ((enrr) HugoHostFragment.a.i().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 295, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is ABOVE_KEYBOARD.");
                    } else if (ordinal == 2) {
                        ((enrr) HugoHostFragment.a.i().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 302, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is EXPANDED.");
                    } else {
                        if (ordinal != 3) {
                            throw new ffcd();
                        }
                        ((enrr) HugoHostFragment.a.i().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "logOnBackPressedCallBack", 309, "HugoHostFragment.kt")).q("This callback should be disabled if hugoManager.onBackPressed() doesn't consume it. RenderingState is CLOSED.");
                    }
                }
                return ffcu.a;
            }
        });
        ffqy.d(p(), null, null, new dsgs(this, null), 3);
        ffqy.d(p(), null, null, new dsgu(this, null), 3);
        return M;
    }

    @Override // defpackage.ea
    public final void ai() {
        dsfg dsfgVar = this.am;
        if (dsfgVar != null) {
            dsfgVar.f();
        }
        abo aboVar = this.an;
        if (aboVar != null) {
            aboVar.f();
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void am() {
        super.am();
        this.al = true;
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        Integer num = this.ap;
        if (((Boolean) fflm.a(f(), false)).booleanValue() && num != null) {
            View view = this.Q;
            if ((view != null ? view.getParent() : null) != null) {
                ((enrr) a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "onResume", 243, "HugoHostFragment.kt")).q("Updating height to cached height in onResume.");
                s(num.intValue());
            }
        }
        this.al = false;
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        dsfg dsfgVar;
        view.getClass();
        if (bundle == null || (dsfgVar = this.am) == null) {
            return;
        }
        dsfgVar.i(bundle);
    }

    public final dsgx e() {
        dsgx dsgxVar = this.ak;
        return dsgxVar == null ? (dsgx) this.aq.a() : dsgxVar;
    }

    public final Optional f() {
        Optional optional = this.ag;
        if (optional != null) {
            return optional;
        }
        ffkj.c("cacheFragmentHeightWhilePaused");
        return null;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        dsfg dsfgVar = this.am;
        if (dsfgVar != null) {
            dsfgVar.j(bundle);
        }
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        dsfg dsfgVar = this.am;
        if (dsfgVar == null) {
            ffkj.c("hugoManager");
            dsfgVar = null;
        }
        dsfgVar.g();
    }

    public final ffsk p() {
        ffsk ffskVar = this.c;
        if (ffskVar != null) {
            return ffskVar;
        }
        ffkj.c("uiScope");
        return null;
    }

    public final void q(dsjz dsjzVar) {
        if (this.am != null) {
            ((enrr) a.e().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "applyHugoColors", 113, "HugoHostFragment.kt")).t("Applying HugoColors: %s", dsjzVar);
            dsfg dsfgVar = this.am;
            if (dsfgVar == null) {
                ffkj.c("hugoManager");
                dsfgVar = null;
            }
            ((enrr) dsxg.b.h().h("com/google/android/libraries/compose/ui/rendering/RenderingManager", "onHugoColorsChanged", 91, "RenderingManager.kt")).q("HugoColors changed");
            dsxg dsxgVar = ((dsfv) dsfgVar).j;
            dtaa d = dsxgVar.d();
            if (d != null) {
                d.bM(dsjzVar);
            }
            dsxgVar.c.k = dsjzVar;
        }
    }

    public final void r(dtbv dtbvVar) {
        dtbl dtblVar;
        dsar dsarVar;
        Object obj;
        if (this.ah == null) {
            throw new IllegalArgumentException("DraftController must be set before input display");
        }
        Integer num = ((Boolean) fflm.a(f(), false)).booleanValue() ? this.ap : this.ao;
        if (((Boolean) fflm.a(f(), false)).booleanValue() && num != null) {
            ((enrr) a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "display", 95, "HugoHostFragment.kt")).q("Updating height to cached height in display.");
            s(num.intValue());
            this.ao = null;
        } else if (num != null) {
            ((enrr) a.h().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "display", 99, "HugoHostFragment.kt")).q("Updating height since view now has parent.");
            View view = this.Q;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = num.intValue();
                view.setLayoutParams(layoutParams);
            }
            this.ao = null;
        }
        boolean z = dtbvVar instanceof dtbr;
        if (z) {
            dtblVar = ((dtbr) dtbvVar).a;
        } else {
            if (dtbvVar instanceof dtbt) {
                dtbt dtbtVar = (dtbt) dtbvVar;
                for (dtbl dtblVar2 : dtbtVar.a) {
                    if (dtblVar2.a == dtbtVar.b) {
                        dtblVar = dtblVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            dtblVar = null;
        }
        if (dtblVar != null) {
            this.aj = dtblVar.c;
        }
        dsfg dsfgVar = this.am;
        if (dsfgVar == null) {
            ffkj.c("hugoManager");
            dsfgVar = null;
        }
        dsfv dsfvVar = (dsfv) dsfgVar;
        dsfvVar.h.f(dtbvVar);
        if (z) {
            dtbl dtblVar3 = ((dtbr) dtbvVar).a;
            dtab dtabVar = dtblVar3.b;
            if (dtabVar != null) {
                dsfvVar.o(dtblVar3.a, dtabVar);
            }
            dsfvVar.k(dtblVar3.a);
            return;
        }
        if (dtbvVar instanceof dtbt) {
            dtbt dtbtVar2 = (dtbt) dtbvVar;
            for (dtbl dtblVar4 : dtbtVar2.a) {
                dszr dszrVar = dtblVar4.a;
                dtab dtabVar2 = dtblVar4.b;
                if (dtabVar2 != null) {
                    dsfvVar.o(dszrVar, dtabVar2);
                }
            }
            List list = dtbtVar2.a;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((dtbl) it.next()).a);
            }
            dsfvVar.n(arrayList, dtbtVar2.b, dtbtVar2.c);
            return;
        }
        if (dtbvVar instanceof dtbp) {
            View view2 = ((dtbp) dtbvVar).a;
            if (dsfvVar.g.c() == dsmm.d || dsfvVar.g.c() == dsmm.c) {
                ((enrr) dsfv.b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "ensureOnlyKeyboardOpen", 524, "HugoManagerImpl.kt")).q("Keyboard not visible, attempting to open.");
                if (view2 != null) {
                    dsfvVar.c.f(view2, false);
                    return;
                } else {
                    dsfvVar.c.j();
                    return;
                }
            }
            if (dsfvVar.f.c() == dsxi.d) {
                ((enrr) dsfv.b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "ensureOnlyKeyboardOpen", 533, "HugoManagerImpl.kt")).t("Keyboard already only input open (%s).", dsfvVar.g.c());
                return;
            }
            ((enrr) dsfv.b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "ensureOnlyKeyboardOpen", 528, "HugoManagerImpl.kt")).q("Keyboard showing above input, closing input.");
            dsfvVar.e();
            if (view2 != null) {
                View view3 = true != view2.hasFocus() ? view2 : null;
                if (view3 != null) {
                    view3.requestFocus();
                    return;
                }
                return;
            }
            return;
        }
        if (!(dtbvVar instanceof dtbn)) {
            if (!(dtbvVar instanceof dtbi)) {
                throw new ffcd();
            }
            dsfvVar.e();
            return;
        }
        if (!dsfvVar.e.o) {
            dtbn dtbnVar = (dtbn) dtbvVar;
            dsat dsatVar = dtbnVar.b;
            if (dsatVar != null) {
                dsfvVar.o(dszr.e, dsatVar);
            }
            dsfvVar.l(dtbnVar.a);
            return;
        }
        dtbn dtbnVar2 = (dtbn) dtbvVar;
        dsat dsatVar2 = dtbnVar2.b;
        if (dsatVar2 != null) {
            Iterator it2 = dsatVar2.a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((dsar) obj).a == dtbnVar2.a) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            dsarVar = (dsar) obj;
        } else {
            dsarVar = null;
        }
        if (dsarVar != null) {
            ffqy.d(dsfvVar.d, null, null, new dsfp(dsfvVar, dsarVar, null), 3);
            return;
        }
        throw new IllegalStateException("Couldn't find a shortcut with label " + dtbnVar2.a + ".");
    }
}
