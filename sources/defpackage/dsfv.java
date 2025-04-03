package defpackage;

import android.app.Activity;
import android.os.Bundle;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsfv implements dsfg, dtac {
    static final /* synthetic */ ffmx[] a;
    public static final enru b;
    public final dsma c;
    public final ffsk d;
    public final dsxk e;
    public final fgcm f;
    public final fgcm g;
    public final fgcm h;
    public final fgcm i;
    public final dsxg j;
    public final ffxx k;
    public final ffls l;
    private final dsxh m;
    private final dqli n;
    private final dtac o;
    private final ffix p;
    private final ffbz q;
    private final fgcm r;
    private final fgcm s;
    private final ffxx t;
    private final dsfq u;

    static {
        ffko ffkoVar = new ffko(dsfv.class, "activeEntryPoint", "getActiveEntryPoint()Lcom/google/android/libraries/compose/ui/entrypoint/ComposeEntryPoint;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
        b = enru.c("com/google/android/libraries/compose/ui/HugoManagerImpl");
    }

    public dsfv(Activity activity, dsma dsmaVar, dsxh dsxhVar, final fazb fazbVar, final fazb fazbVar2, ffsk ffskVar, dqli dqliVar, dtac dtacVar, fr frVar, ffix ffixVar, dsxk dsxkVar) {
        this.c = dsmaVar;
        this.m = dsxhVar;
        this.d = ffskVar;
        this.n = dqliVar;
        this.o = dtacVar;
        this.p = ffixVar;
        this.e = dsxkVar;
        ffca.a(new ffix() { // from class: dsfi
            @Override // defpackage.ffix
            public final Object invoke() {
                enru enruVar = dsfv.b;
                return (Map) fazb.this.b();
            }
        });
        this.q = ffca.a(new ffix() { // from class: dsfj
            @Override // defpackage.ffix
            public final Object invoke() {
                enru enruVar = dsfv.b;
                return (Map) fazb.this.b();
            }
        });
        fgcm a2 = fgdm.a(dsxi.d);
        this.f = a2;
        fgcm a3 = fgdm.a(dsmm.d);
        this.g = a3;
        fgcm a4 = fgdm.a(dtbi.a);
        this.h = a4;
        fgcm a5 = fgdm.a(dtbb.a);
        this.r = a5;
        fgcm a6 = fgdm.a(0);
        this.i = a6;
        fgcm a7 = fgdm.a(null);
        this.s = a7;
        ffxx fgchVar = new fgch(a4, a7, new dsfu(this, null));
        this.t = fgchVar;
        this.k = fgck.c(a2, a3, dsxkVar.o ? fgchVar : ffyy.a(fgchVar), a5, a6, new dsft(this, null));
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("HugoManager requires " + activity.getLocalClassName() + " to extend FragmentActivity.");
        }
        eg egVar = (eg) activity;
        egVar.P().c(new dsfl());
        fr a8 = frVar == null ? egVar.a() : frVar;
        dsxk dsxkVar2 = new dsxk(dsxkVar.a, dsxkVar.b, dsxkVar.c, new Consumer() { // from class: dsfk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dsfv.s(dsfv.this, 0, ((Integer) obj).intValue(), 1);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, dsxkVar.e, dsxkVar.f, dsxkVar.g, dsxkVar.h, dsxkVar.j, dsxkVar.k, dsxkVar.m, dsxkVar.n, dsxkVar.o);
        dsfm dsfmVar = new dsfm(this);
        ernh ernhVar = (ernh) dsxhVar.a.b();
        ernhVar.getClass();
        dszm dszmVar = (dszm) dsxhVar.b.b();
        dszmVar.getClass();
        dszj dszjVar = (dszj) dsxhVar.c.b();
        dszjVar.getClass();
        this.j = new dsxg(ernhVar, dszmVar, dszjVar, a8, ffixVar, dsxkVar2, dsmaVar, this, dsfmVar);
        ffqy.d(ffskVar, null, null, new dsfo(this, null), 3);
        this.l = new dsfs(this);
        this.u = new dsfq(this);
    }

    static /* synthetic */ void s(dsfv dsfvVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = dsfvVar.c.c((dsmm) dsfvVar.g.c());
        }
        if ((i3 & 2) != 0) {
            i2 = dsfvVar.j.a((dsxi) dsfvVar.f.c());
        }
        fgcm fgcmVar = dsfvVar.i;
        dsxi dsxiVar = (dsxi) dsfvVar.f.c();
        dsmm dsmmVar = dsmm.a;
        int ordinal = dsxiVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 += i;
            } else if (ordinal == 2) {
                i2 = Math.max(i, i2);
            } else {
                if (ordinal != 3) {
                    throw new ffcd();
                }
                i2 = dsfvVar.c.b();
            }
        }
        fgcmVar.f(Integer.valueOf(i2));
    }

    private final dtaa t(dszr dszrVar, Bundle bundle) {
        dslv c = this.j.c(dszrVar);
        if (c != null) {
            c.at(bundle);
        } else {
            dszv dszvVar = (dszv) ((Map) this.q.a()).get(dszrVar);
            if (dszvVar == null) {
                Objects.toString(dszrVar);
                throw new IllegalStateException("Cannot find a factory for screen category ".concat(String.valueOf(dszrVar)));
            }
            c = dszvVar.b(bundle);
        }
        return (dtaa) c;
    }

    @Override // defpackage.dtac
    public final void a(dszr dszrVar, int i, Duration duration) {
        dszrVar.getClass();
        dtac dtacVar = this.o;
        if (dtacVar != null) {
            dtacVar.a(dszrVar, i, duration);
        }
        this.r.f(new dtaz(i, duration));
    }

    @Override // defpackage.dtac
    public final void b(dszr dszrVar, int i, Duration duration) {
        dszrVar.getClass();
        this.r.f(new dtba(i, duration));
        dtac dtacVar = this.o;
        if (dtacVar != null) {
            dtacVar.b(dszrVar, i, duration);
        }
        this.r.f(new dtbc(i));
    }

    @Override // defpackage.dsfg
    public final dsxi c() {
        return (dsxi) this.f.c();
    }

    @Override // defpackage.dsfg
    public final void d() {
        this.c.k(this.u);
        this.j.e();
    }

    @Override // defpackage.dsfg
    public final void e() {
        this.j.g();
    }

    @Override // defpackage.dsfg
    public final void f() {
        this.c.n(this.u);
        this.j.h();
    }

    @Override // defpackage.dsfg
    public final void g() {
        this.c.g();
        dsxg dsxgVar = this.j;
        if (dsxg.p(dsxgVar)) {
            dsxk dsxkVar = dsxgVar.c;
            dsma dsmaVar = dsxgVar.d;
            dszd dszdVar = dsxgVar.f;
            int a2 = dsxkVar.a();
            int a3 = dsmaVar.a();
            dszdVar.j(ffmk.f(ffmk.i(dszdVar.b(), a3, ffmk.f(a2, a3)), ((Number) dszdVar.i.a()).intValue()));
        }
    }

    @Override // defpackage.dsfg
    public final void h() {
        dqls dqlsVar = (dqls) this.p.invoke();
        dqlsVar.a.h();
        dqlsVar.b.c();
    }

    @Override // defpackage.dsfg
    public final void i(Bundle bundle) {
        dsxg dsxgVar;
        dtaa c;
        ffdb ffdbVar = new ffdb(dszr.k);
        while (true) {
            dsxgVar = this.j;
            if (!ffdbVar.hasNext()) {
                break;
            }
            dtaa c2 = dsxgVar.c((dszr) ffdbVar.next());
            if (c2 != null) {
                dsxgVar.f(c2);
                if (dsxgVar.c.n) {
                    dsxgVar.f.g(c2);
                }
            }
        }
        if (dsxgVar.c.j) {
            Object obj = bundle.get("current_screen_category");
            if (obj != null && (c = dsxgVar.c((dszr) obj)) != null) {
                dsxgVar.n(c);
            }
            Object obj2 = bundle.get("current_screen_state");
            dsxi dsxiVar = obj2 instanceof dsxi ? (dsxi) obj2 : null;
            if (dsxiVar != null) {
                dsxgVar.o(dsxiVar);
            }
            Integer valueOf = Integer.valueOf(bundle.getInt("current_rendered_height", 0));
            Integer num = (dsxgVar.c.h || valueOf.intValue() > 0) ? valueOf : null;
            if (num != null) {
                dsxgVar.f.i(ffmk.g(num.intValue(), dsxgVar.c.a()), false);
            }
        }
    }

    @Override // defpackage.dsfg
    public final void j(Bundle bundle) {
        dsxg dsxgVar = this.j;
        dtaa d = dsxgVar.d();
        bundle.putSerializable("current_screen_category", d != null ? d.t() : null);
        bundle.putSerializable("current_screen_state", dsxgVar.b());
        bundle.putInt("current_rendered_height", dsxgVar.f.b());
    }

    @Override // defpackage.dsfg
    public final void k(dszr dszrVar) {
        dszrVar.getClass();
        ((enrr) b.h().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "open", 360, "HugoManagerImpl.kt")).t("Opening directly %s", dszrVar);
        this.r.f(dtbb.a);
        this.j.k(t(dszrVar, new Bundle()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dsfg
    public final void l(int i) {
        ((enrr) b.h().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "openShortcut", 367, "HugoManagerImpl.kt")).t("Opening directly %s", dszr.e);
        dszr dszrVar = dszr.e;
        dsbg dsbgVar = new dsbg(Integer.valueOf(i));
        Bundle bundle = new Bundle();
        Integer num = dsbgVar.a;
        if (num != null) {
            num.intValue();
            bundle.putInt("auto_launch_shortcut", dsbgVar.a.intValue());
        }
        dtaa t = t(dszrVar, bundle);
        if (t.bI()) {
            t.getClass();
            ((dsau) t).a(i);
        }
        this.j.k(t);
    }

    @Override // defpackage.dsfg
    public final /* synthetic */ void m(Iterable iterable, dszr dszrVar) {
        n(iterable, dszrVar, null);
    }

    @Override // defpackage.dsfg
    public final void n(Iterable iterable, dszr dszrVar, String str) {
        iterable.getClass();
        ((enrr) b.h().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "openWithSearch", 386, "HugoManagerImpl.kt")).t("Opening directly with search %s", iterable);
        dszr dszrVar2 = dszr.d;
        drxa drxaVar = new drxa(ffdx.ak(iterable), dszrVar, str);
        Bundle bundle = new Bundle();
        List list = drxaVar.a;
        ArrayList<String> arrayList = new ArrayList<>(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dszr) it.next()).name());
        }
        bundle.putStringArrayList("categories", arrayList);
        bundle.putString("initial_search_term", drxaVar.c);
        dszr dszrVar3 = drxaVar.b;
        if (dszrVar3 != null) {
            bundle.putInt("initial_screen", dszrVar3.ordinal());
        }
        dtaa t = t(dszrVar2, bundle);
        t.getClass();
        drwz drwzVar = (drwz) t;
        drwzVar.e = this.s;
        this.j.k(drwzVar);
        if (dszrVar == null || !drwzVar.bI()) {
            return;
        }
        if (!this.e.m || this.s.c() != dszrVar) {
            drwzVar.r(dszrVar);
        }
        if (((drxd) drwzVar.bA()).e && str != null) {
            drzi drziVar = drwzVar.c;
            if (drziVar == null) {
                ffkj.c("searchController");
                drziVar = null;
            }
            drziVar.m(str);
        }
    }

    @Override // defpackage.dsfg
    public final void o(dszr dszrVar, dtab dtabVar) {
        dszrVar.getClass();
        this.j.g.put(dszrVar, dtabVar);
    }

    @Override // defpackage.dsfg
    public final boolean p() {
        dsxg dsxgVar = this.j;
        dsxi b2 = dsxgVar.b();
        dsmm dsmmVar = dsmm.a;
        if (b2.ordinal() == 3) {
            return false;
        }
        dtaa d = dsxgVar.d();
        if (d != null && d.gY()) {
            return true;
        }
        dsxgVar.g();
        return true;
    }

    public final dsot q(dsmm dsmmVar) {
        int c = this.c.c(dsmmVar);
        dsmm dsmmVar2 = dsmm.a;
        int ordinal = dsmmVar.ordinal();
        if (ordinal == 0) {
            return new dsoq(c);
        }
        if (ordinal == 1) {
            return new dsor(c, this.c.a());
        }
        if (ordinal == 2) {
            return new dsop(c);
        }
        if (ordinal == 3) {
            return dsoo.a;
        }
        throw new ffcd();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.dsar r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dsfr
            if (r0 == 0) goto L13
            r0 = r6
            dsfr r0 = (defpackage.dsfr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsfr r0 = new dsfr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dsar r5 = r0.d
            defpackage.ffci.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            dqli r6 = r4.n
            java.util.List r2 = r5.c
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.b(r2, r0)
            if (r6 == r1) goto L53
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L50
            ffji r5 = r5.d
            r6 = 0
            r5.invoke(r6)
        L50:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsfv.r(dsar, ffgu):java.lang.Object");
    }
}
