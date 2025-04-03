package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wko extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ wkp c;
    final /* synthetic */ String d;
    final /* synthetic */ esgx e;
    final /* synthetic */ wgx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wko(wkp wkpVar, String str, esgx esgxVar, wgx wgxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = wkpVar;
        this.d = str;
        this.e = esgxVar;
        this.f = wgxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wko) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.b != 0) {
                obj2 = this.a;
                ffci.b(obj);
            } else {
                ffci.b(obj);
                Optional optional = (Optional) this.c.c.b();
                final esgx esgxVar = this.e;
                final ffji ffjiVar = new ffji() { // from class: wkg
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ((wmf) obj3).g(esgx.this);
                        return ffcu.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: wkh
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        ffji.this.invoke(obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ecri d = this.c.j.d();
                elfl a = ((wly) this.c.f.b()).a(this.d, this.e);
                this.c.b(a);
                this.a = d;
                this.b = 1;
                Object c = fgfz.c(a, this);
                if (c == ffhhVar) {
                    return ffhhVar;
                }
                obj2 = d;
                obj = c;
            }
            eygr eygrVar = ((esgu) obj).b;
            eygrVar.getClass();
            List<esgt> ai = ffdx.ai(ffdx.X(eygrVar), (int) ((Number) this.c.k.b()).longValue());
            this.c.j.f((ecri) obj2, new ecda("RequestMagicRewriteConv2"), null, ecrh.SUCCESS);
            final wkp wkpVar = this.c;
            final wgx wgxVar = this.f;
            final ArrayList arrayList = new ArrayList();
            for (final esgt esgtVar : ai) {
                fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
                fbwzVar.getClass();
                fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
                fbwxVar.getClass();
                fbrn.b(fbri.SMARTER_REPLY, fbwxVar);
                fbro.c(fbrn.a(fbwxVar), fbwzVar);
                fbxb fbxbVar = (fbxb) fbxc.a.createBuilder();
                fbxbVar.getClass();
                fbrp.b(esgtVar.b, fbxbVar);
                fbro.d(fbrp.a(fbxbVar), fbwzVar);
                arrayList.add(dokq.e(((abad) ((Optional) wkpVar.h.b()).get()).c(new SmartSuggestionItemSuggestionData(fbro.a(fbwzVar))), new ffix() { // from class: wka
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        esgt esgtVar2 = esgtVar;
                        final esgx b = esgx.b(esgtVar2.c);
                        if (b == null) {
                            b = esgx.UNRECOGNIZED;
                        }
                        wgx wgxVar2 = wgxVar;
                        wkp wkpVar2 = wkp.this;
                        b.getClass();
                        final String str = esgtVar2.b;
                        str.getClass();
                        Optional optional2 = (Optional) wkpVar2.i.b();
                        final ffji ffjiVar2 = new ffji() { // from class: wkb
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj3) {
                                wmu wmuVar = (wmu) obj3;
                                wmuVar.getClass();
                                wmuVar.c();
                                wmuVar.h(esgx.this, str);
                                return ffcu.a;
                            }
                        };
                        optional2.ifPresent(new Consumer() { // from class: wkc
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj3) {
                                ffji.this.invoke(obj3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        axol.k(wkpVar2.g, null, new wkf(wkpVar2, b, null), 3);
                        wgxVar2.c(str);
                        wgxVar2.b();
                        return ffcu.a;
                    }
                }));
            }
            if (!arrayList.isEmpty()) {
                Optional optional2 = (Optional) this.c.i.b();
                final esgx esgxVar2 = this.e;
                final ffji ffjiVar2 = new ffji() { // from class: wkm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ((wmu) obj3).d(esgx.this, arrayList.size());
                        return ffcu.a;
                    }
                };
                optional2.ifPresent(new Consumer() { // from class: wkn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        ffji.this.invoke(obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ((dris) this.c.e.b()).n(arrayList);
            return ffcu.a;
        } catch (CancellationException unused) {
            ensk f = this.c.p.f();
            f.Y(ente.a, "BuglePenpal");
            ((enrr) f.h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImplV2$magicRewriteToneOnClick$1", "invokeSuspend", 209, "MagicComposeUiStateControllerImplV2.kt")).q("Magic Rewrite request was cancelled");
            return ffcu.a;
        } catch (Exception e) {
            ensk i = this.c.p.i();
            i.Y(ente.a, "BuglePenpal");
            ((enrr) ((enrr) i).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImplV2$magicRewriteToneOnClick$1", "invokeSuspend", 212, "MagicComposeUiStateControllerImplV2.kt")).q("Error while processing Magic Rewrite response.");
            wkp wkpVar2 = this.c;
            Object b = wkpVar2.e.b();
            b.getClass();
            Object e2 = ctjd.bd.e();
            e2.getClass();
            boolean booleanValue = ((Boolean) e2).booleanValue();
            wgz.b(wkpVar2.a, (dris) b, e, booleanValue);
            Optional optional3 = (Optional) this.c.i.b();
            final ffji ffjiVar3 = new ffji() { // from class: wki
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    ((wmu) obj3).b(e);
                    return ffcu.a;
                }
            };
            optional3.ifPresent(new Consumer() { // from class: wkj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    ffji.this.invoke(obj3);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Optional optional4 = (Optional) this.c.c.b();
            final ffji ffjiVar4 = new ffji() { // from class: wkk
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    ((wmf) obj3).b(e);
                    return ffcu.a;
                }
            };
            optional4.ifPresent(new Consumer() { // from class: wkl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    ffji.this.invoke(obj3);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return ffcu.a;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wko(this.c, this.d, this.e, this.f, ffguVar);
    }
}
