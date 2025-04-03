package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.Compose2oMessagePartDataConverter;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czfx extends czgd implements dbxo, dcbb {
    private final dcax A;
    private final dcba B;
    private final cxqh C;
    private final bcpw D;
    private ContentGridView E;
    dbxt a;
    public boolean b;
    public boolean c;
    public final bbfb d;
    public final alcb e;
    public final altk f;
    public final ffbr g;
    public final cqoh h;
    public final uot i;
    public final uco j;
    public final cpbn k;
    public final csuk l;
    public final ddzb m;
    public final byzp n;
    public final bcpw o;
    public final bdud p;
    private dcae w;
    private AttachmentQueueState x;
    private dcaw y;
    private final alct z;

    public czfx(bbfb bbfbVar, alcb alcbVar, alct alctVar, dcax dcaxVar, dcba dcbaVar, altk altkVar, ffbr ffbrVar, cqoh cqohVar, cxqh cxqhVar, uot uotVar, uco ucoVar, ddzb ddzbVar, byzp byzpVar, czgx czgxVar, czgy czgyVar, czha czhaVar, fr frVar, csuk csukVar, cpbn cpbnVar, bcpw bcpwVar, bcpw bcpwVar2, bdud bdudVar, Context context) {
        super(czgxVar, czgyVar, czhaVar, frVar, context, false);
        this.b = false;
        this.d = bbfbVar;
        this.e = alcbVar;
        this.z = alctVar;
        this.A = dcaxVar;
        this.B = dcbaVar;
        this.f = altkVar;
        this.g = ffbrVar;
        this.h = cqohVar;
        this.i = uotVar;
        this.j = ucoVar;
        this.m = ddzbVar;
        this.n = byzpVar;
        this.l = csukVar;
        this.k = cpbnVar;
        this.o = bcpwVar;
        this.D = bcpwVar2;
        this.p = bdudVar;
        this.C = cxqhVar;
    }

    private final void A() {
        Compose2oFragment n = n();
        if (((Boolean) cful.V.e()).booleanValue() && this.b && n != null && this.w == null) {
            dcae a = this.y.a(eymn.CAMERA_GALLERY, -1);
            this.w = a;
            if (a != null) {
                a.v(new czfv(this));
                n.H().a(this.w);
            }
        }
    }

    private final boolean B() {
        return this.a != null;
    }

    private final boolean C() {
        return ((bcqs) this.D.a()).g.a() != null && bdqv.d(((bcqs) this.D.a()).g.a());
    }

    private final void z(Consumer consumer) {
        int a = this.a.a();
        for (int i = 0; i < a; i++) {
            consumer.o(this.a.b(i));
        }
        dcae dcaeVar = this.w;
        if (dcaeVar != null) {
            consumer.o(dcaeVar);
        }
    }

    @Override // defpackage.dcbb
    public final void D(CustomizationModel customizationModel) {
        if (customizationModel.b) {
            this.B.a(customizationModel);
            this.a.g(customizationModel, this.y, C());
        }
        ContentGridView contentGridView = this.E;
        if (contentGridView != null) {
            contentGridView.a();
        }
    }

    @Override // defpackage.dbxo
    public final void a() {
        this.t.Z();
    }

    @Override // defpackage.dbxo
    public final void b(cxqz cxqzVar) {
        if (B()) {
            this.a.d(cxqzVar);
            dcae dcaeVar = this.w;
            if (dcaeVar != null) {
                dcaeVar.f(cxqzVar);
            }
        }
    }

    @Override // defpackage.dbxo
    public final void c(Configuration configuration) {
        int a = this.a.a();
        for (int i = 0; i < a; i++) {
            this.a.b(i).p(configuration);
        }
        dcae dcaeVar = this.w;
        if (dcaeVar != null) {
            dcaeVar.p(configuration);
        }
    }

    @Override // defpackage.dbxo
    public final void d(Bundle bundle) {
        if (!B()) {
            csjy.n("Bugle", "ConversationCompose2oPicker: Cannot create, contentGridPresenter is null");
            return;
        }
        int a = this.a.a();
        for (int i = 0; i < a; i++) {
            this.a.b(i).g(bundle);
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("is_camera_gallery_roll_visible_key", false);
            this.c = z;
            r(z);
        }
        dcae dcaeVar = this.w;
        if (dcaeVar != null) {
            dcaeVar.g(bundle);
        }
    }

    @Override // defpackage.dbxo
    public final void e() {
        if (B()) {
            z(new Consumer() { // from class: czfq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((dcae) obj).h();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            csjy.n("Bugle", "ConversationCompose2oPicker: Cannot destroy, contentGridPresenter is null");
        }
    }

    @Override // defpackage.dbxo
    public final void f() {
        if (B()) {
            z(new Consumer() { // from class: czfs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((dcae) obj).q();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            csjy.n("Bugle", "ConversationCompose2oPicker: Cannot react to low memory, contentGridPresenter is null");
        }
    }

    @Override // defpackage.dbxo
    public final void g() {
        if (B()) {
            z(new Consumer() { // from class: czft
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((dcae) obj).r();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            csjy.n("Bugle", "ConversationCompose2oPicker: Cannot pause, contentGridPresenter is null");
        }
    }

    @Override // defpackage.dbxo
    public final void h() {
        if (B()) {
            z(new Consumer() { // from class: czfr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((dcae) obj).s();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            csjy.n("Bugle", "ConversationCompose2oPicker: Cannot resume, contentGridPresenter is null");
        }
    }

    @Override // defpackage.dbxo
    public final void i(Bundle bundle) {
        if (!B()) {
            csjy.n("Bugle", "ConversationCompose2oPicker: Cannot save instance state, contentGridPresenter is null");
            return;
        }
        int a = this.a.a();
        for (int i = 0; i < a; i++) {
            this.a.b(i).i(bundle);
        }
        dcae dcaeVar = this.w;
        if (dcaeVar != null) {
            dcaeVar.i(bundle);
        }
        if (this.c) {
            bundle.putBoolean("is_camera_gallery_roll_visible_key", true);
        }
    }

    @Override // defpackage.dbxo
    public final void j() {
        if (B()) {
            z(new Consumer() { // from class: czfu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((dcae) obj).t();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            csjy.n("Bugle", "ConversationCompose2oPicker: Cannot start, contentGridPresenter is null");
        }
    }

    @Override // defpackage.dbxo
    public final void k() {
        if (B()) {
            z(new Consumer() { // from class: czfp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((dcae) obj).u();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            csjy.n("Bugle", "ConversationCompose2oPicker: Cannot stop, contentGridPresenter is null");
        }
    }

    @Override // defpackage.dbxo
    public final boolean l() {
        if (B()) {
            this.a.f();
            return true;
        }
        csjy.n("Bugle", "ConversationCompose2oPicker: Cannot process intent results, contentGridPresenter is null");
        return false;
    }

    @Override // defpackage.dbxo
    public final void m(ContentGridView contentGridView) {
        this.E = contentGridView;
        dbxt i = dbxt.i(contentGridView);
        this.a = i;
        this.x.j(i);
        Compose2oFragment n = n();
        dbxp H = n.H();
        CustomizationModel customizationModel = this.B.a;
        H.v = customizationModel;
        dcaw dcawVar = this.y;
        dcawVar.a = this.a;
        dcawVar.c = this.E;
        dcawVar.b = n.H();
        this.a.c(this.y.b(customizationModel, C()));
        this.a.h(new czfv(this));
        if (this.c) {
            A();
        }
    }

    public final Compose2oFragment n() {
        return (Compose2oFragment) this.v.h("c2oFragment");
    }

    public final void o(Compose2oFragment compose2oFragment) {
        czfx czfxVar;
        Compose2oFragment compose2oFragment2;
        if (this.b) {
            czfxVar = this;
            compose2oFragment2 = compose2oFragment;
            czfxVar.y.b = compose2oFragment2.H();
        } else {
            this.b = true;
            this.x = new AttachmentQueueState((bcvr) this.o.a(), new Compose2oMessagePartDataConverter());
            ((bcvr) this.o.a()).D(this.x);
            czfxVar = this;
            compose2oFragment2 = compose2oFragment;
            czfxVar.y = this.A.a(compose2oFragment2, Boolean.valueOf(((bcqs) this.D.a()).d.y()), this.o, this.s, this.x, this.E, this.t, this.a, czfxVar, compose2oFragment.H());
        }
        compose2oFragment2.H().f(czfxVar.C.d());
        compose2oFragment2.H().e(this);
        compose2oFragment2.H().n(czfxVar.c);
    }

    public final void p(eppr epprVar, int i) {
        this.e.d(epprVar, i);
    }

    public final void r(boolean z) {
        if (z) {
            A();
        }
        Compose2oFragment n = n();
        if (n != null) {
            n.H().n(z);
        }
        this.c = z;
    }

    @Override // defpackage.czgz
    public final boolean s(boolean z) {
        Compose2oFragment n = n();
        if (n == null) {
            return false;
        }
        cg cgVar = new cg(this.v);
        cgVar.l(n);
        try {
            cgVar.j();
            this.u.X();
        } catch (IllegalStateException e) {
            csjy.h("Bugle", e, "compose2o cannot commit fragment");
        }
        bcvr bcvrVar = (bcvr) this.o.a();
        alct alctVar = this.z;
        epts eptsVar = this.c ? epts.CAMERA_GALLERY : epts.ALL;
        List list = bcvrVar.v;
        eptu eptuVar = eptu.COLLAPSED;
        list.size();
        this.h.f().toEpochMilli();
        alctVar.b(eptsVar, eptuVar, eptk.UNKNOWN_CLOSING_SOURCE);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r3 != false) goto L19;
     */
    @Override // defpackage.czgd, defpackage.czgz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(defpackage.im r6) {
        /*
            r5 = this;
            com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment r0 = r5.n()
            r1 = 0
            if (r0 == 0) goto L82
            dbxp r0 = r0.H()
            dede r2 = r0.A
            boolean r2 = r2.b
            r3 = r2 ^ 1
            cfva r4 = defpackage.dbxq.b
            java.lang.Object r4 = r4.e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L28
            boolean r4 = r0.o()
            if (r4 == 0) goto L28
            if (r2 == 0) goto L44
            r3 = r1
        L28:
            cfva r2 = defpackage.dbxq.b
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L82
            boolean r2 = r0.m
            if (r2 != 0) goto L42
            boolean r2 = r0.o()
            if (r2 == 0) goto L41
            goto L42
        L41:
            return r1
        L42:
            if (r3 == 0) goto L82
        L44:
            boolean r1 = r6.isShowing()
            if (r1 != 0) goto L4d
            r6.show()
        L4d:
            r1 = 12
            r6.setDisplayOptions(r1)
            r1 = 2131232840(0x7f080848, float:1.80818E38)
            r6.setHomeAsUpIndicator(r1)
            com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment r1 = r0.w
            eg r1 = r1.G()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2132082772(0x7f150054, float:1.9805668E38)
            java.lang.String r1 = r1.getString(r2)
            r6.setHomeActionContentDescription(r1)
            com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment r1 = r0.w
            eg r1 = r1.G()
            boolean r0 = r0.h
            r2 = 1
            if (r2 == r0) goto L7b
            r0 = 2132083186(0x7f1501f2, float:1.9806507E38)
            goto L7e
        L7b:
            r0 = 2132083189(0x7f1501f5, float:1.9806513E38)
        L7e:
            defpackage.cwpw.c(r1, r6, r0)
            return r2
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czfx.t(im):boolean");
    }

    public final void u(boolean z, boolean z2) {
        cg cgVar = new cg(this.v);
        Compose2oFragment n = n();
        boolean z3 = n == null;
        if (z3) {
            n = new Compose2oFragment();
            fbae.e(n);
            n.a.c(new czfw(this, n));
            cgVar.x(R.id.c2o_fragment_container, n, "c2oFragment");
        } else if (z) {
            cgVar.q(n);
        }
        if (!z) {
            cgVar.l(n);
        }
        try {
            elav k = ekyf.k();
            try {
                cgVar.j();
                k.close();
            } finally {
            }
        } catch (IllegalStateException e) {
            csjy.h("Bugle", e, "compose2o cannot commit fragment");
        }
        if (!z3) {
            o(n);
        }
        if (z2) {
            this.v.an();
        }
    }

    @Override // defpackage.czgz
    public final void v(boolean z) {
        this.h.f().toEpochMilli();
        u(true, false);
    }

    @Override // defpackage.czgd, defpackage.czgz
    public final void q(Bundle bundle) {
    }
}
