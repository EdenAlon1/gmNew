package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkp implements wiw {
    public final Context a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffsk g;
    public final ffbr h;
    public final ffbr i;
    public final ecrj j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final dqiy o;
    public final enru p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;

    public wkp(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffsk ffskVar, ffbr ffbrVar6, dqiz dqizVar, ffbr ffbrVar7, ecrj ecrjVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14) {
        context.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        ecrjVar.getClass();
        ffbrVar8.getClass();
        ffbrVar10.getClass();
        ffbrVar12.getClass();
        ffbrVar13.getClass();
        ffbrVar14.getClass();
        this.a = context;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffskVar;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.j = ecrjVar;
        this.k = ffbrVar8;
        this.l = ffbrVar9;
        this.q = ffbrVar10;
        this.r = ffbrVar11;
        this.s = ffbrVar12;
        this.m = ffbrVar13;
        this.n = ffbrVar14;
        this.o = dqizVar.a(new dqkd(31));
        this.p = enru.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImplV2");
    }

    private final void e(final wgx wgxVar) {
        final dris drisVar = (dris) this.e.b();
        drisVar.g(new ffix() { // from class: wjv
            @Override // defpackage.ffix
            public final Object invoke() {
                dris.this.a();
                wgxVar.b();
                return ffcu.a;
            }
        });
    }

    private final void f() {
        Object b = this.r.b();
        b.getClass();
        final emdd emddVar = (emdd) fflm.b((Optional) b);
        if (emddVar != null) {
            if (!((Boolean) ctjd.bg.e()).booleanValue() && !((Boolean) ctjd.bd.e()).booleanValue()) {
                emddVar = null;
            }
            if (emddVar != null) {
                final dris drisVar = (dris) this.e.b();
                drisVar.j(new ffix() { // from class: wjy
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        wkp wkpVar = wkp.this;
                        Future future = ((drja) ((dris) wkpVar.e.b()).a.c()).m;
                        if (future != null && !future.isDone()) {
                            Optional optional = (Optional) wkpVar.i.b();
                            final ffji ffjiVar = new ffji() { // from class: wkd
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj) {
                                    wmu wmuVar = (wmu) obj;
                                    wmuVar.getClass();
                                    wmuVar.k();
                                    return ffcu.a;
                                }
                            };
                            optional.ifPresent(new Consumer() { // from class: wke
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    ffji.this.invoke(obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                        emdd emddVar2 = emddVar;
                        dris drisVar2 = drisVar;
                        if (((auut) wkpVar.n.b()).a()) {
                            try {
                                if (((auus) wkpVar.m.b()).a()) {
                                    drisVar2.a();
                                }
                                emddVar2.i();
                            } catch (Exception e) {
                                ensk j = wkpVar.p.j();
                                j.Y(ente.a, "BuglePenpal");
                                ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImplV2", "setOnScreenCloseAndStopCallback$lambda$32$lambda$28$lambda$27", 305, "MagicComposeUiStateControllerImplV2.kt")).q("Failed to close AICore client");
                            }
                        } else {
                            if (((auus) wkpVar.m.b()).a()) {
                                drisVar2.a();
                            }
                            emddVar2.i();
                        }
                        return ffcu.a;
                    }
                });
                ((dris) this.e.b()).i(new ffix() { // from class: wjz
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        wkp wkpVar = wkp.this;
                        Future future = ((drja) ((dris) wkpVar.e.b()).a.c()).m;
                        if (future != null && !future.isDone()) {
                            Optional optional = (Optional) wkpVar.i.b();
                            final ffji ffjiVar = new ffji() { // from class: wjt
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj) {
                                    wmu wmuVar = (wmu) obj;
                                    wmuVar.getClass();
                                    wmuVar.k();
                                    return ffcu.a;
                                }
                            };
                            optional.ifPresent(new Consumer() { // from class: wju
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    ffji.this.invoke(obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                        return ffcu.a;
                    }
                });
            }
        }
    }

    @Override // defpackage.wiw
    public final void a(final wgx wgxVar) {
        String a;
        if (((Boolean) ctjd.aZ.e()).booleanValue()) {
            ((adsd) this.s.b()).a(40);
        }
        if (((asuf) this.q.b()).a() && !((Boolean) ctjd.bg.e()).booleanValue() && ((a = wgxVar.a()) == null || a.length() == 0)) {
            dris drisVar = (dris) this.e.b();
            drisVar.a();
            drisVar.f();
            drisVar.g(new ffix() { // from class: wjo
                @Override // defpackage.ffix
                public final Object invoke() {
                    wgx.this.b();
                    return ffcu.a;
                }
            });
            Object b = this.e.b();
            b.getClass();
            wgz.a((dris) b);
            Optional optional = (Optional) this.c.b();
            final ffji ffjiVar = new ffji() { // from class: wjp
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    wmf wmfVar = (wmf) obj;
                    wmfVar.getClass();
                    wmfVar.g(null);
                    wmfVar.c();
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: wjq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        dris drisVar2 = (dris) this.e.b();
        e(wgxVar);
        f();
        drisVar2.a();
        drisVar2.f();
        drisVar2.e(new ffix() { // from class: wjr
            @Override // defpackage.ffix
            public final Object invoke() {
                wkp wkpVar = wkp.this;
                if (((Optional) wkpVar.l.b()).isPresent()) {
                    ((wha) ((Optional) wkpVar.l.b()).get()).b();
                }
                return ffcu.a;
            }
        });
        drisVar2.c(ctjd.a());
        LinkedHashMap a2 = ((wlw) this.b.b()).a();
        Set<String> keySet = a2.keySet();
        keySet.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(keySet, 10));
        for (final String str : keySet) {
            str.getClass();
            arrayList.add(new dokl(str, str, new ffix() { // from class: wjs
                @Override // defpackage.ffix
                public final Object invoke() {
                    final wkp wkpVar = wkp.this;
                    final dris drisVar3 = (dris) wkpVar.e.b();
                    drisVar3.a();
                    final String str2 = str;
                    final wgx wgxVar2 = wgxVar;
                    final String a3 = wgxVar2.a();
                    if (a3 != null && a3.length() != 0) {
                        Object obj = ((wlw) wkpVar.b.b()).a().get(str2);
                        if (obj == null) {
                            throw new IllegalArgumentException(a.a(str2, "Style '", "' wasn't registered."));
                        }
                        final esgx esgxVar = (esgx) obj;
                        drisVar3.h(new ffix() { // from class: wjn
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                dris.this.a();
                                wkpVar.d(a3, esgxVar, wgxVar2);
                                return ffcu.a;
                            }
                        });
                        wkpVar.d(a3, esgxVar, wgxVar2);
                    }
                    drisVar3.q(new ffix() { // from class: wjw
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            wkp wkpVar2 = wkp.this;
                            ((ddzb) wkpVar2.d.b()).h(R.string.feedback_confirmation);
                            if (((Optional) wkpVar2.c.b()).isPresent()) {
                                ((wmf) ((Optional) wkpVar2.c.b()).get()).l(str2);
                            }
                            return ffcu.a;
                        }
                    });
                    drisVar3.p(new ffix() { // from class: wjx
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            wkp wkpVar2 = wkp.this;
                            if (((Optional) wkpVar2.c.b()).isPresent()) {
                                ((wmf) ((Optional) wkpVar2.c.b()).get()).j(str2);
                            }
                            if (((Optional) wkpVar2.l.b()).isPresent()) {
                                ((wha) ((Optional) wkpVar2.l.b()).get()).a();
                            }
                            return ffcu.a;
                        }
                    });
                    return ffcu.a;
                }
            }));
        }
        drisVar2.k(arrayList);
        Collection values = a2.values();
        values.getClass();
        drisVar2.l(ffdx.ak(values));
    }

    @Override // defpackage.wiw
    public final void b(Future future) {
        ((dris) this.e.b()).o(future);
    }

    @Override // defpackage.wiw
    public final void c(wgx wgxVar) {
        if (((Boolean) ctjd.aZ.e()).booleanValue()) {
            ((adsd) this.s.b()).a(40);
        }
        dris drisVar = (dris) this.e.b();
        e(wgxVar);
        f();
        drisVar.a();
        drisVar.m();
    }

    public final void d(String str, esgx esgxVar, wgx wgxVar) {
        axol.k(this.g, null, new wko(this, str, esgxVar, wgxVar, null), 3);
    }
}
