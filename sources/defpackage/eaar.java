package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaar implements dzzh, dzxh {
    public final dylh A;
    public final dyom B;
    public ahly C;
    private eaaw D;
    private final dyil E;
    private final dyiu F;
    private final Map G;
    private final dzwu H;
    private dzwu I;
    private final dzwt J;
    public final View a;
    public final dzpt b;
    public final dyim c;
    public final dzja d;
    public final eaau e;
    public final eace f;
    public final Handler g;
    public eacl h;
    public dzzg i;
    public dzzd j;
    public dzzf k;
    public dzze l;
    public final emxc m;
    public final eadi n;
    public final emxc o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public boolean s;
    eadq t;
    public dzxw u;
    public final eabn v;
    eadw w;
    public MenuItem.OnMenuItemClickListener x;
    public MenuItem.OnMenuItemClickListener y;
    public final dzyw z;

    /* JADX WARN: Multi-variable type inference failed */
    public eaar(final View view, dzpt dzptVar, dzja dzjaVar, dylh dylhVar, dyij dyijVar, dyim dyimVar, dyil dyilVar, dyiu dyiuVar, dyom dyomVar, dzhn dzhnVar) {
        new SparseArray();
        new ArrayList();
        new ArrayList();
        this.G = enoz.a;
        this.i = new dzzg() { // from class: dzzs
            @Override // defpackage.dzzg
            public final boolean a() {
                return false;
            }
        };
        this.j = new dzzd() { // from class: dzzt
            @Override // defpackage.dzzd
            public final void a() {
            }
        };
        this.k = new dzzf() { // from class: dzzu
            @Override // defpackage.dzzf
            public final void a(dzja dzjaVar2, dzqs dzqsVar) {
            }
        };
        this.l = new dzze() { // from class: dzzv
        };
        int i = engw.d;
        engw engwVar = enou.a;
        this.o = emux.a;
        dyia.b();
        this.p = false;
        this.q = false;
        this.r = false;
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.J = new eaam(this);
        int i2 = eaan.a;
        int i3 = eaao.a;
        this.x = new eaap();
        this.y = null;
        int i4 = dzzx.a;
        int i5 = eaaq.a;
        int i6 = dzzm.a;
        if (!dzjaVar.c().g().contains(dzptVar.a())) {
            throw new IllegalArgumentException("Conversation owner doesn't belong to the account context");
        }
        this.a = view;
        this.b = dzptVar;
        this.d = dzjaVar;
        this.A = dylhVar;
        this.c = dyimVar;
        this.E = dyilVar;
        this.F = dyiuVar;
        this.B = dyomVar;
        eaau eaauVar = new eaau(dzptVar, dzjaVar, dzhnVar);
        this.e = eaauVar;
        ((dyol) dyimVar).m(dzjaVar, dzptVar, new emxg() { // from class: dymr
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((dzpk) obj).b() == -1;
            }
        }, new emxg() { // from class: dyms
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                dyhj.a();
                return System.currentTimeMillis() > ((dzpk) obj).e();
            }
        });
        this.I = dyilVar.a(dzjaVar, dzjaVar.c().f());
        if (dzptVar.e() == dzpq.ONE_TO_ONE) {
            this.m = emxc.j(dyilVar.a(dzjaVar, dzptVar.c()));
        } else {
            this.m = emux.a;
        }
        this.H = dyomVar.a(dzptVar);
        ((dykl) dyijVar).c(dzjaVar, dzptVar, emxl.ALWAYS_FALSE);
        dzyw dzywVar = new dzyw(dzjaVar, dzptVar, dyiuVar, view.d());
        this.z = dzywVar;
        dzywVar.b = new dzyt() { // from class: dzzn
            /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, dzzi] */
            /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, dzzi] */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, dzzi] */
            /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, dzzi] */
            @Override // defpackage.dzyt
            public final void a(String str) {
                dzxl dzxlVar;
                eaar eaarVar = eaar.this;
                String h = eaarVar.a.h();
                if (h != null && !h.equals(str)) {
                    eaarVar.e.c(10023);
                }
                eaarVar.e(str, eaarVar.a.i(), true);
                eaarVar.a.n(null);
                eaarVar.a.m(null);
                if (!fdql.o() || (dzxlVar = eaarVar.z.c) == null) {
                    return;
                }
                dyji.a();
                if (fdql.o()) {
                    dyhd dyhdVar = (dyhd) ((dyhc) dzxlVar).d;
                    if (dyhdVar.d.getVisibility() == 0) {
                        dyhdVar.d.setVisibility(8);
                        dyhdVar.b.setText((CharSequence) null);
                        dyhdVar.c.setText((CharSequence) null);
                        dyhdVar.a.setImageDrawable(null);
                    }
                }
            }
        };
        eace eaceVar = new eace(eaauVar);
        this.f = eaceVar;
        eacx eacxVar = new eacx(view.p(), dzptVar, dzjaVar, dyilVar, dyiuVar, eaceVar, enou.a);
        this.h = eacxVar;
        eacxVar.e = new eaac(this);
        eacxVar.d = new eaad(eaauVar);
        erny.f(dylhVar.b(2), new emwl() { // from class: eaae
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eaar eaarVar = eaar.this;
                eaarVar.f.c = booleanValue;
                ((eacx) eaarVar.h).b.H();
                return null;
            }
        }, erpp.a);
        erny.f(dylhVar.b(6), new emwl() { // from class: eaaf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eaar.this.f.d = ((Boolean) obj).booleanValue();
                return null;
            }
        }, erpp.a);
        erny.f(dylhVar.b(3), new emwl() { // from class: dzzj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (bool.booleanValue()) {
                    return null;
                }
                eaar.this.h.a(eaci.SUGGESTION_LIST);
                return null;
            }
        }, erpp.a);
        erny.f(dylhVar.b(5), new emwl() { // from class: dzzk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                eaar.this.h.a(eaci.RICH_CARD_BUBBLE);
                return null;
            }
        }, erpp.a);
        erny.f(dylhVar.b(11), new emwl() { // from class: dzzl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eaar.this.f.e = ((Boolean) obj).booleanValue();
                return null;
            }
        }, erpp.a);
        eaba eabaVar = new eaba(dzptVar, this.m, dzjaVar, dyimVar, view.e());
        this.D = eabaVar;
        eabaVar.d = new dzzo(this);
        if (fdql.j()) {
            ((eaba) this.D).e = new dzzp(this);
        }
        ((eaba) this.D).c = new eaav() { // from class: dzzq
        };
        view.a(this);
        view.l(this);
        eadi eadiVar = new eadi(view.g(), this);
        this.n = eadiVar;
        eadiVar.e = new eade() { // from class: dzzr
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, dzzi] */
            @Override // defpackage.eade
            public final void a() {
                view.k();
            }
        };
        this.v = new eabn(view.f());
        this.g = new Handler();
        erny.f(dylhVar.b(1), new emwl() { // from class: eaaa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    dyhr.a("ConvPresenter", "USER_INTERFACE_AUTO_BIND disabled, not starting bind");
                    return null;
                }
                eaar eaarVar = eaar.this;
                eaarVar.c.d(eaarVar.d);
                dyhr.a("ConvPresenter", "USER_INTERFACE_AUTO_BIND enabled, starting bind");
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.dzxh
    public final void a(dzjn dzjnVar) {
        eaau eaauVar = this.e;
        eaauVar.b.b(eaauVar.b(123).a());
        if (!dzjnVar.d().equals(dzjf.CUSTOM_ACTION)) {
            b(dzjnVar.b());
        }
        if (dzjnVar.g().g()) {
            dzjf e = dzjnVar.e();
            dyim dyimVar = this.c;
            final dzja dzjaVar = this.d;
            final dzpt dzptVar = this.b;
            dzjf dzjfVar = dzjf.NO_OP_ACTION;
            Object c = dzjnVar.g().c();
            final String str = (String) dzjnVar.h().e("");
            final emxc j = dzjnVar.j();
            final dyol dyolVar = (dyol) dyimVar;
            final dzjh dzjhVar = (dzjh) c;
            ListenableFuture g = erny.g(dyolVar.o(dzjaVar, dzptVar), new eroh() { // from class: dymk
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    dzpk dzpkVar = (dzpk) obj;
                    eyee n = dzpkVar == null ? eyee.b : dzpkVar.n();
                    dyol dyolVar2 = dyol.this;
                    emxc emxcVar = j;
                    String str2 = str;
                    dzjh dzjhVar2 = dzjhVar;
                    dzpt dzptVar2 = dzptVar;
                    dzja dzjaVar2 = dzjaVar;
                    dyxa c2 = dyxb.c();
                    ((dyww) c2).a = "send button or chip clicked event";
                    c2.b(dyxf.g);
                    dyxb a = c2.a();
                    fbik c3 = dzec.c(dzjhVar2);
                    dzdk dzdkVar = (dzdk) dyolVar2.b;
                    dzfx dzfxVar = new dzfx(dzdkVar.b, dzjaVar2, dzptVar2, n, c3, emxcVar, str2);
                    dyyt dyytVar = dzdkVar.c;
                    dzhl r = dzhm.r();
                    r.g(18);
                    r.n(dzjaVar2.c().f());
                    r.o(dzjaVar2.d().E());
                    r.p(dzfxVar.a);
                    r.d(dzptVar2);
                    dyytVar.b(r.a());
                    ListenableFuture b = dzdkVar.a.b(UUID.randomUUID(), dzfxVar, dzdkVar.a.d.b(), dzjaVar2, a, true);
                    erqt.r(b, new dzdj(dzdkVar, dzjaVar2, dzfxVar, dzptVar2), erpp.a);
                    return b;
                }
            }, dyolVar.c);
            if (e != dzjfVar) {
                erqt.r(g, new eaai(this, dzjnVar), dyhs.a());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, dzzi] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, dzzi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, dzzi] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, dzzi] */
    public final void b(final dzje dzjeVar) {
        int ordinal = dzjeVar.a().ordinal();
        if (ordinal == 1) {
            e(dzjeVar.d().d(), dzjeVar.d().c(), false);
            return;
        }
        if (ordinal == 2) {
            this.a.n(dzjeVar.c().c());
            this.z.a.c(dzjeVar.c().d());
            this.a.m(dzjeVar.c().d());
            return;
        }
        if (ordinal == 4) {
            erny.f(this.A.b(24), new emwl() { // from class: dzzy
                /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, dzzi] */
                /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, dzzi] */
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    eaar eaarVar = eaar.this;
                    dzje dzjeVar2 = dzjeVar;
                    if (booleanValue) {
                        eaarVar.c(dzjeVar2.k());
                        return null;
                    }
                    eabn eabnVar = eaarVar.v;
                    eabnVar.a.d(dzjeVar2.k(), emxc.j(eaarVar.a.g()), eaarVar.a.c());
                    dzyk.c(eaarVar.a);
                    return null;
                }
            }, erpp.a);
            return;
        }
        switch (ordinal) {
            case 7:
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:".concat(dzjeVar.h())));
                this.a.getContext().startActivity(intent, null);
                break;
            case 8:
                String j = dzjeVar.j();
                dznl dznlVar = new dznl(this.c.g(this.b, dzky.a(j), j, emxc.j(j), enhk.j(this.G)));
                dznlVar.c = dzlc.a;
                ((dyol) this.c).q(this.d, dznlVar.a(), true);
                break;
            case 9:
                if (dzjeVar.b().a().g()) {
                    final eadi eadiVar = this.n;
                    final dzqo dzqoVar = (dzqo) dzjeVar.b().a().c();
                    eadiVar.a.b(dzqoVar, this.a.b().getHeight() == this.a.b().getBottom());
                    eadiVar.a.findViewById(R.id.dismiss_button).setOnClickListener(new View.OnClickListener() { // from class: eadg
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dzqo dzqoVar2 = dzqoVar;
                            boolean g = dzqoVar2.c().g();
                            eadi eadiVar2 = eadi.this;
                            if (g) {
                                eadiVar2.b.a((dzjn) dzqoVar2.c().c());
                            }
                            eadiVar2.a();
                        }
                    });
                    eadiVar.a.findViewById(R.id.title).requestFocus();
                    eadiVar.a.findViewById(R.id.title).sendAccessibilityEvent(32768);
                    eadiVar.c.postDelayed(eadiVar.d, TimeUnit.SECONDS.toMillis(dzqoVar.b()));
                    break;
                }
                break;
            case 10:
                c(dzjeVar.g().c());
                break;
        }
    }

    public final void c(String str) {
        new afg().a().a(this.a.getContext(), Uri.parse(str));
    }

    public final void d() {
        if (this.w == null) {
            dyhr.a("ConvPresenter", "hideInfoIconTooltip: Cannot hide tooltip because it is null.");
        } else {
            dyhr.a("ConvPresenter", "hideInfoIconTooltip: Hiding InfoIconTooltip");
            this.w.a.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.View, dzzi] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, dzzi] */
    public final void e(String str, String str2, boolean z) {
        if (this.t != null) {
            this.s = true;
            this.I.l(this.J);
            eadq eadqVar = this.t;
            if (eadqVar != null) {
                this.a.j(eadqVar);
                this.t = null;
                d();
                this.w = null;
            }
        }
        this.F.c(this.b);
        if (!TextUtils.isEmpty(str)) {
            enhd enhdVar = new enhd();
            if (!emxe.c(str2)) {
                eydp eydpVar = (eydp) eydq.a.createBuilder();
                eydpVar.copyOnWrite();
                ((eydq) eydpVar.instance).b = "type.googleapis.com/google.protobuf.StringValue";
                eyir eyirVar = (eyir) eyis.a.createBuilder();
                eyirVar.copyOnWrite();
                eyis eyisVar = (eyis) eyirVar.instance;
                str2.getClass();
                eyisVar.b = str2;
                eyee byteString = ((eyis) eyirVar.build()).toByteString();
                eydpVar.copyOnWrite();
                ((eydq) eydpVar.instance).c = byteString;
                enhdVar.k("l_act_callback_payload", ((eydq) eydpVar.build()).toByteString());
            }
            enhdVar.g(this.G);
            dzqs g = this.c.g(this.b, dzky.a(str), str, emxc.j(str), enhdVar.c());
            eaau eaauVar = this.e;
            eaauVar.b.b(eaauVar.b(100).a());
            f(g);
        }
        if (z) {
            emxc e = this.H.e();
            if (e.g()) {
                engw engwVar = (engw) e.c();
                int size = engwVar.size();
                for (int i = 0; i < size; i++) {
                    dzpz dzpzVar = (dzpz) engwVar.get(i);
                    this.B.b(this.b, dzpzVar.a().r());
                    f(dzpzVar.a());
                }
            }
        }
        ?? r9 = this.a;
        r9.p().ac.ar(r9.p(), 0);
    }

    public final void f(final dzqs dzqsVar) {
        this.g.post(new Runnable() { // from class: eaab
            @Override // java.lang.Runnable
            public final void run() {
                dyhe.a(eaar.this.a.getContext(), R.string.sending_message_text);
            }
        });
        dzhs.a().b("MessageSentLatency", dzqsVar);
        dzhs.a().b("MessagePerceivedSentLatency", dzqsVar);
        dzhs.a().b("MessageDeliveredLatency", dzqsVar);
        dzhs.a().b("MessagePerceivedDeliveredLatency", dzqsVar);
        dzqm i = dzqsVar.i();
        dzqm dzqmVar = dzqm.OUTGOING_FAILED_SEND;
        final emux emuxVar = emux.a;
        final SettableFuture create = SettableFuture.create();
        final int i2 = i == dzqmVar ? 2 : 1;
        dyim dyimVar = this.c;
        final dzja dzjaVar = this.d;
        final dyol dyolVar = (dyol) dyimVar;
        dyolVar.d.execute(new Runnable() { // from class: dynf
            @Override // java.lang.Runnable
            public final void run() {
                dzqs dzqsVar2 = dzqsVar;
                boolean equals = dzqsVar2.i().equals(dzqm.OUTGOING_FAILED_SEND);
                dyol dyolVar2 = dyol.this;
                dzja dzjaVar2 = dzjaVar;
                SettableFuture settableFuture = create;
                if (equals && !dyolVar2.l(dzjaVar2).ae(dzqsVar2.r())) {
                    dyhr.c("LiMsgController", "Tried to resend unstored message.");
                    settableFuture.setException(new InvalidParameterException());
                    return;
                }
                int i3 = i2;
                dyyt dyytVar = dyolVar2.f;
                dzhl r = dzhm.r();
                r.g(9);
                r.n(dzjaVar2.c().f());
                r.o(dzjaVar2.d().E());
                r.p(dzqsVar2.r());
                r.d(dzqsVar2.f());
                r.l(i3);
                r.i(dyjp.a(dzqsVar2));
                dyytVar.b(r.a());
                settableFuture.set(true);
            }
        });
        erqt.r(erny.g(create, new eroh() { // from class: dyng
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    return erqt.i(null);
                }
                final dzqs dzqsVar2 = dzqsVar;
                final dzja dzjaVar2 = dzjaVar;
                final dyol dyolVar2 = dyol.this;
                ListenableFuture q = dyolVar2.q(dzjaVar2, dzqsVar2, false);
                ListenableFuture g = (dzqsVar2.h().a() == 3 && dyolVar2.q.containsKey(((dznp) dzqsVar2.h().b()).a)) ? erny.g(q, new eroh() { // from class: dynj
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ((dzdv) dyol.this.q.get(((dznp) dzqsVar2.h().b()).a)).f((dzqs) obj2);
                    }
                }, erpp.a) : q;
                final emxc emxcVar = emuxVar;
                final int i3 = i2;
                final ListenableFuture g2 = erny.g(erny.g(g, new eroh() { // from class: dynk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final dzqs dzqsVar3 = (dzqs) obj2;
                        dzpt f = dzqsVar3.f();
                        dyol dyolVar3 = dyol.this;
                        return erny.g(dyolVar3.o(dzjaVar2, f), new eroh() { // from class: dynp
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                dzqg g3 = dzqs.this.g();
                                g3.d(((dzpk) obj3).n());
                                return erqt.i(g3.a());
                            }
                        }, dyolVar3.c);
                    }
                }, dyolVar2.c), new eroh() { // from class: dynl
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final dzqs dzqsVar3 = (dzqs) obj2;
                        dyxa c = dyxb.c();
                        ((dyww) c).a = "send message";
                        c.b(dyxf.g);
                        final dyxb a = c.a();
                        final dyol dyolVar3 = dyol.this;
                        final dzja dzjaVar3 = dzjaVar2;
                        final emxc emxcVar2 = emxcVar;
                        return erqt.n(new erog() { // from class: dynz
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                final dzqs dzqsVar4 = dzqsVar3;
                                final fbik d = dzdk.d(dzqsVar4.f());
                                final dzdk dzdkVar = (dzdk) dyol.this.b;
                                final dzja dzjaVar4 = dzjaVar3;
                                final dyxb dyxbVar = a;
                                return dzdkVar.d.a(new erog() { // from class: dzdf
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        dzdk dzdkVar2 = dzdk.this;
                                        Context context = dzdkVar2.b;
                                        dzja dzjaVar5 = dzjaVar4;
                                        dzqs dzqsVar5 = dzqsVar4;
                                        fbik fbikVar = d;
                                        return dzdkVar2.a.b(UUID.randomUUID(), new dzfz(context, dzjaVar5, dzqsVar5, fbikVar, dzdkVar2.e), dzdkVar2.a.d.b(), dzjaVar5, dyxbVar, true);
                                    }
                                });
                            }
                        }, dyolVar3.c);
                    }
                }, erpp.a);
                dyolVar2.c.submit(new Runnable() { // from class: dynm
                    @Override // java.lang.Runnable
                    public final void run() {
                        dyol dyolVar3 = dyol.this;
                        dyil dyilVar = dyolVar3.n;
                        dzja dzjaVar3 = dzjaVar2;
                        dzqs dzqsVar3 = dzqsVar2;
                        dyilVar.a(dzjaVar3, dzqsVar3.e()).g();
                        if (dzqsVar3.f().e() != dzpq.ONE_TO_ONE) {
                            dyolVar3.a(dzjaVar3, dzqsVar3.f()).g();
                        } else {
                            dyolVar3.n.a(dzjaVar3, dzqsVar3.f().c()).g();
                        }
                    }
                });
                final ListenableFuture f = ernq.f(g, Throwable.class, new emwl() { // from class: dynn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return dzqs.this;
                    }
                }, erpp.a);
                final ListenableFuture a = erqt.b(q, g2, f).a(new Callable() { // from class: dyno
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dzqs a2;
                        ExecutionException executionException;
                        dzqg g3 = ((dzqs) f.get()).g();
                        int i4 = i3;
                        final dyol dyolVar3 = dyol.this;
                        final dzja dzjaVar3 = dzjaVar2;
                        dzqs dzqsVar3 = dzqsVar2;
                        try {
                            g3.n(((Long) ((dyqw) erqt.q(g2)).a().c()).longValue());
                            g3.k(dzqm.OUTGOING_SENT);
                            a2 = g3.a();
                            dyyt dyytVar = dyolVar3.f;
                            dzhl r = dzhm.r();
                            r.g(10);
                            r.n(dzjaVar3.c().f());
                            r.o(dzjaVar3.d().E());
                            r.p(dzqsVar3.r());
                            r.d(dzqsVar3.f());
                            r.l(i4);
                            dyytVar.b(r.a());
                            if (dzqsVar3.h().a() == 3 && dyolVar3.q.containsKey(((dznp) dzqsVar3.h().b()).a)) {
                                ((dzdv) dyolVar3.q.get(((dznp) dzqsVar3.h().b()).a)).d(dzjaVar3, dzqsVar3, dyolVar3.f);
                            }
                            dzhs.a().c("MessageSentLatency", dzqsVar3.r());
                            dzhp.a().b(dzhq.b, dzqsVar3);
                            executionException = null;
                        } catch (ExecutionException e) {
                            dyhr.d("LiMsgController", "Failed to send message", e);
                            dzhl r2 = dzhm.r();
                            r2.g(11);
                            r2.n(dzjaVar3.c().f());
                            r2.o(dzjaVar3.d().E());
                            r2.p(dzqsVar3.r());
                            r2.d(dzqsVar3.f());
                            r2.l(i4);
                            if (e.getCause() != null && (e.getCause() instanceof dzcy)) {
                                r2.f(10);
                            }
                            dyolVar3.f.b(r2.a());
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            dyhj.a();
                            g3.n(timeUnit.toMicros(System.currentTimeMillis()));
                            g3.k(dzqm.OUTGOING_FAILED_SEND);
                            a2 = g3.a();
                            executionException = e;
                        }
                        dznm dznmVar = (dznm) a2;
                        dyolVar3.l(dzjaVar3).ad(a2, dznmVar.d);
                        dyolVar3.l(dzjaVar3).ab(Arrays.asList(a2), dzqm.OUTGOING_SENDING, dznmVar.g);
                        dyyt dyytVar2 = dyolVar3.f;
                        dzhl r3 = dzhm.r();
                        r3.g(205);
                        r3.n(dzjaVar3.c().f());
                        r3.o(dzjaVar3.d().E());
                        final dzpt dzptVar = dznmVar.c;
                        r3.d(dzptVar);
                        dyytVar2.b(r3.a());
                        erqt.r(erqt.l(new Runnable() { // from class: dymw
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                final dyol dyolVar4 = dyol.this;
                                final dzja dzjaVar4 = dzjaVar3;
                                dzwo l = dyolVar4.l(dzjaVar4);
                                final dzpt dzptVar2 = dzptVar;
                                engw A = l.A(dzptVar2, dzqm.INCOMING_RECEIVED, dzqm.INCOMING_READ);
                                int size = A.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    String str = (String) A.get(i5);
                                    dzhl r4 = dzhm.r();
                                    r4.g(4);
                                    r4.n(dzjaVar4.c().f());
                                    r4.o(dzjaVar4.d().E());
                                    r4.p(str);
                                    r4.d(dzptVar2);
                                    dyolVar4.f.b(r4.a());
                                }
                                dyxa c = dyxb.c();
                                ((dyww) c).a = "message receipt";
                                c.b(dyxf.g);
                                final dyxb a3 = c.a();
                                dzwo l2 = dyolVar4.l(dzjaVar4);
                                dzqm dzqmVar2 = dzqm.INCOMING_READ;
                                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                                dyhj.a();
                                final engw x = l2.x(dzptVar2, dzqmVar2, timeUnit2.toMicros(System.currentTimeMillis() - fdpz.a()));
                                if (x.isEmpty()) {
                                    return;
                                }
                                erqt.d(erny.g(dyolVar4.o(dzjaVar4, dzptVar2), new eroh() { // from class: dyof
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        dzpk dzpkVar = (dzpk) obj2;
                                        eyee n = dzpkVar == null ? eyee.b : dzpkVar.n();
                                        dyxb dyxbVar = a3;
                                        engw engwVar = x;
                                        return ((dzdk) dyol.this.b).c(dzjaVar4, dzptVar2, n, engwVar, dyxbVar, true);
                                    }
                                }, dyolVar4.c)).c(new Runnable() { // from class: dyog
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        dyol.this.l(dzjaVar4).ac(dzptVar2, x, Arrays.asList(dzqm.INCOMING_READ), dzqm.INCOMING_READ_RECEIPT_SENT);
                                    }
                                }, erpp.a);
                            }
                        }, dyolVar3.c), new dyoh(dyolVar3, dzjaVar3, dzptVar), dyolVar3.c);
                        if (executionException == null) {
                            return null;
                        }
                        throw executionException;
                    }
                }, erpp.a);
                return erqt.d(a).a(new Callable() { // from class: dynq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        try {
                            return null;
                        } catch (ExecutionException e) {
                            dyhr.d("LiMsgController", "Failed to update message status", e);
                            throw e;
                        }
                    }
                }, erpp.a);
            }
        }, erpp.a), new eaal(this, dzqsVar), dyhs.a());
    }
}
