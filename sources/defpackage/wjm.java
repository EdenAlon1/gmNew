package defpackage;

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
public final class wjm implements wiw {
    public final ea a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final enru j;
    private final ffbr k;
    private final ffbr l;

    public wjm(ea eaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        this.a = eaVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.k = ffbrVar7;
        this.l = ffbrVar8;
        this.h = ffbrVar9;
        this.i = ffbrVar10;
        this.j = enru.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImpl");
    }

    private final void d(final wgx wgxVar) {
        final dris drisVar = (dris) this.g.b();
        drisVar.g(new ffix() { // from class: wiz
            @Override // defpackage.ffix
            public final Object invoke() {
                dris.this.a();
                wgxVar.b();
                return ffcu.a;
            }
        });
    }

    private final void e() {
        Object b = this.l.b();
        b.getClass();
        final emdd emddVar = (emdd) fflm.b((Optional) b);
        if (emddVar != null) {
            if (!((Boolean) ctjd.bg.e()).booleanValue() && !((Boolean) ctjd.bd.e()).booleanValue()) {
                emddVar = null;
            }
            if (emddVar != null) {
                final dris drisVar = (dris) this.g.b();
                drisVar.j(new ffix() { // from class: wjf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        wjm wjmVar = wjm.this;
                        Future future = ((drja) ((dris) wjmVar.g.b()).a.c()).m;
                        if (future != null && !future.isDone()) {
                            Optional optional = (Optional) wjmVar.d.b();
                            final ffji ffjiVar = new ffji() { // from class: wjh
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj) {
                                    wmu wmuVar = (wmu) obj;
                                    wmuVar.getClass();
                                    wmuVar.k();
                                    return ffcu.a;
                                }
                            };
                            optional.ifPresent(new Consumer() { // from class: wji
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
                        if (((auut) wjmVar.i.b()).a()) {
                            try {
                                if (((auus) wjmVar.h.b()).a()) {
                                    drisVar2.a();
                                }
                                emddVar2.i();
                            } catch (Exception e) {
                                ensk j = wjmVar.j.j();
                                j.Y(ente.a, "BuglePenpal");
                                ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImpl", "setOnScreenCloseAndStopCallback$lambda$26$lambda$22$lambda$21", 167, "MagicComposeUiStateControllerImpl.kt")).q("Failed to close AICore client");
                            }
                        } else {
                            if (((auus) wjmVar.h.b()).a()) {
                                drisVar2.a();
                            }
                            emddVar2.i();
                        }
                        return ffcu.a;
                    }
                });
                ((dris) this.g.b()).i(new ffix() { // from class: wjg
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        wjm wjmVar = wjm.this;
                        Future future = ((drja) ((dris) wjmVar.g.b()).a.c()).m;
                        if (future != null && !future.isDone()) {
                            Optional optional = (Optional) wjmVar.d.b();
                            final ffji ffjiVar = new ffji() { // from class: wjb
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj) {
                                    wmu wmuVar = (wmu) obj;
                                    wmuVar.getClass();
                                    wmuVar.k();
                                    return ffcu.a;
                                }
                            };
                            optional.ifPresent(new Consumer() { // from class: wjc
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
        if (((asuf) this.k.b()).a() && !((Boolean) ctjd.bg.e()).booleanValue() && ((a = wgxVar.a()) == null || a.length() == 0)) {
            dris drisVar = (dris) this.g.b();
            drisVar.a();
            drisVar.f();
            drisVar.g(new ffix() { // from class: wjj
                @Override // defpackage.ffix
                public final Object invoke() {
                    wgx.this.b();
                    return ffcu.a;
                }
            });
            Object b = this.g.b();
            b.getClass();
            wgz.a((dris) b);
            Optional optional = (Optional) this.c.b();
            final ffji ffjiVar = new ffji() { // from class: wjk
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    wmf wmfVar = (wmf) obj;
                    wmfVar.getClass();
                    wmfVar.g(null);
                    wmfVar.c();
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: wjl
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
        dris drisVar2 = (dris) this.g.b();
        d(wgxVar);
        e();
        drisVar2.a();
        drisVar2.f();
        drisVar2.e(new ffix() { // from class: wiy
            @Override // defpackage.ffix
            public final Object invoke() {
                wjm wjmVar = wjm.this;
                if (((Optional) wjmVar.e.b()).isPresent()) {
                    ((wha) ((Optional) wjmVar.e.b()).get()).b();
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
            arrayList.add(new dokl(str, str, new ffix() { // from class: wja
                @Override // defpackage.ffix
                public final Object invoke() {
                    final wjm wjmVar = wjm.this;
                    if (!wjmVar.a.aF()) {
                        return ffcu.a;
                    }
                    final String str2 = str;
                    wgx wgxVar2 = wgxVar;
                    final dris drisVar3 = (dris) wjmVar.g.b();
                    drisVar3.a();
                    final String a3 = wgxVar2.a();
                    if (a3 != null && a3.length() != 0) {
                        Object obj = ((wlw) wjmVar.b.b()).a().get(str2);
                        if (obj == null) {
                            throw new IllegalArgumentException(a.a(str2, "Style '", "' wasn't registered."));
                        }
                        final esgx esgxVar = (esgx) obj;
                        drisVar3.h(new ffix() { // from class: wix
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                dris.this.a();
                                ellj.f(new wlx(a3, esgxVar), wjmVar.a);
                                return ffcu.a;
                            }
                        });
                        ellj.f(new wlx(a3, esgxVar), wjmVar.a);
                    }
                    drisVar3.q(new ffix() { // from class: wjd
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            wjm wjmVar2 = wjm.this;
                            ((ddzb) wjmVar2.f.b()).h(R.string.feedback_confirmation);
                            if (((Optional) wjmVar2.c.b()).isPresent()) {
                                ((wmf) ((Optional) wjmVar2.c.b()).get()).l(str2);
                            }
                            return ffcu.a;
                        }
                    });
                    drisVar3.p(new ffix() { // from class: wje
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            wjm wjmVar2 = wjm.this;
                            if (((Optional) wjmVar2.c.b()).isPresent()) {
                                ((wmf) ((Optional) wjmVar2.c.b()).get()).j(str2);
                            }
                            if (((Optional) wjmVar2.e.b()).isPresent()) {
                                ((wha) ((Optional) wjmVar2.e.b()).get()).a();
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
        ((dris) this.g.b()).o(future);
    }

    @Override // defpackage.wiw
    public final void c(wgx wgxVar) {
        dris drisVar = (dris) this.g.b();
        d(wgxVar);
        e();
        drisVar.a();
        drisVar.m();
    }
}
