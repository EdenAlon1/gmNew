package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import defpackage.wls;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wls implements wlh {
    private final Context a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ecrj g;
    private final ffsk h;
    private final dqiz i;

    public wls(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ecrj ecrjVar, ffsk ffskVar, dqiz dqizVar) {
        context.getClass();
        ffbrVar2.getClass();
        ffbrVar5.getClass();
        ecrjVar.getClass();
        ffskVar.getClass();
        this.a = context;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ecrjVar;
        this.h = ffskVar;
        this.i = dqizVar;
    }

    @Override // defpackage.wlh
    public final ejlr a(wgx wgxVar) {
        int longValue = (int) ((Number) this.c.b()).longValue();
        ffbr ffbrVar = this.d;
        ffbr ffbrVar2 = this.e;
        ffbr ffbrVar3 = this.f;
        ecrj ecrjVar = this.g;
        ffsk ffskVar = this.h;
        dqiz dqizVar = this.i;
        return new a(this.a, wgxVar, this.b, longValue, ffbrVar, ffbrVar2, ffbrVar3, ecrjVar, ffskVar, dqizVar);
    }

    /* compiled from: PG */
    public final class a implements ejlr<Void, eyjv<esgu>> {
        public final wgx a;
        public final ffbr b;
        public final ffsk c;
        public final dqiy d;
        private final Context e;
        private final ffbr f;
        private final int g;
        private final ffbr h;
        private final ffbr i;
        private final ecrj j;
        private final cskc k = cskc.f("BuglePenpal", a.class);

        public a(Context context, wgx wgxVar, ffbr ffbrVar, int i, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ecrj ecrjVar, ffsk ffskVar, dqiz dqizVar) {
            this.e = context;
            this.a = wgxVar;
            this.f = ffbrVar;
            this.g = i;
            this.h = ffbrVar2;
            this.b = ffbrVar3;
            this.i = ffbrVar4;
            this.j = ecrjVar;
            this.c = ffskVar;
            this.d = dqizVar.a(new dqkd(31));
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void c(Object obj, Object obj2) {
            eyjv eyjvVar = (eyjv) obj2;
            eyjvVar.getClass();
            if (ctjd.c()) {
                this.j.g(new ecda("RequestMagicRewrite"), null, null, ecrh.SUCCESS);
                eygr eygrVar = ((esgu) eyjvVar.a(esgu.a, eyfc.a())).b;
                eygrVar.getClass();
                final List<esgt> ai = ffdx.ai(eygrVar, this.g);
                if (!ai.isEmpty()) {
                    Optional optional = (Optional) this.b.b();
                    final ffji ffjiVar = new ffji() { // from class: wli
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            wmu wmuVar = (wmu) obj3;
                            wmuVar.getClass();
                            List list = ai;
                            esgx b = esgx.b(((esgt) ffdx.K(list)).c);
                            if (b == null) {
                                b = esgx.UNRECOGNIZED;
                            }
                            b.getClass();
                            wmuVar.d(b, list.size());
                            return ffcu.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: wlj
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
                dris drisVar = (dris) this.i.b();
                ArrayList arrayList = new ArrayList();
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
                    arrayList.add(dokq.e(((abad) ((Optional) this.f.b()).get()).c(new SmartSuggestionItemSuggestionData(fbro.a(fbwzVar))), new ffix() { // from class: wlk
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            wls.a aVar = wls.a.this;
                            Optional optional2 = (Optional) aVar.b.b();
                            final esgt esgtVar2 = esgtVar;
                            final ffji ffjiVar2 = new ffji() { // from class: wll
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj3) {
                                    wmu wmuVar = (wmu) obj3;
                                    wmuVar.getClass();
                                    wmuVar.c();
                                    esgt esgtVar3 = esgt.this;
                                    esgx b = esgx.b(esgtVar3.c);
                                    if (b == null) {
                                        b = esgx.UNRECOGNIZED;
                                    }
                                    b.getClass();
                                    String str = esgtVar3.b;
                                    str.getClass();
                                    wmuVar.h(b, str);
                                    return ffcu.a;
                                }
                            };
                            optional2.ifPresent(new Consumer() { // from class: wlm
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj3) {
                                    ffji.this.invoke(obj3);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            axol.k(aVar.c, null, new wlr(aVar, esgtVar2, null), 3);
                            aVar.a.c(esgtVar2.b);
                            aVar.a.b();
                            return ffcu.a;
                        }
                    }));
                }
                drisVar.n(arrayList);
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, final Throwable th) {
            if (th instanceof CancellationException) {
                this.k.m("Magic Rewrite request was cancelled.");
                return;
            }
            this.k.o("Error while processing Magic Rewrite response.", th);
            Context context = this.e;
            Object b = this.i.b();
            b.getClass();
            Boolean bool = (Boolean) ctjd.bd.e();
            bool.getClass();
            wgz.b(context, (dris) b, th, bool.booleanValue());
            Optional optional = (Optional) this.h.b();
            final ffji ffjiVar = new ffji() { // from class: wln
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    wmf wmfVar = (wmf) obj2;
                    wmfVar.getClass();
                    wmfVar.b(th);
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: wlo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Optional optional2 = (Optional) this.b.b();
            final ffji ffjiVar2 = new ffji() { // from class: wlp
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    wmu wmuVar = (wmu) obj2;
                    wmuVar.getClass();
                    wmuVar.b(th);
                    return ffcu.a;
                }
            };
            optional2.ifPresent(new Consumer() { // from class: wlq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
