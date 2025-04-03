package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.net.URI;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essb extends ffhv implements ffji {
    int a;
    final /* synthetic */ essj b;
    final /* synthetic */ esqv c;
    final /* synthetic */ fcek d;
    final /* synthetic */ Instant e;
    final /* synthetic */ essw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public essb(essj essjVar, esqv esqvVar, fcek fcekVar, Instant instant, essw esswVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = essjVar;
        this.c = esqvVar;
        this.d = fcekVar;
        this.e = instant;
        this.f = esswVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        elfl h;
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            essj essjVar = this.b;
            final esqv esqvVar = this.c;
            fcek fcekVar = this.d;
            final Instant instant = this.e;
            this.a = 1;
            Optional optional = esqvVar.a.b;
            Optional ofNullable = Optional.ofNullable(fcekVar);
            if (optional.isEmpty()) {
                h = elfo.d(new cpnd("Missing Conference URI when being added to a group.", true));
            } else {
                final cpll cpllVar = essjVar.a.a;
                final Optional map = ofNullable.map(new Function() { // from class: cpkv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        awxe awxeVar = (awxe) awxf.a.createBuilder();
                        awui a = ((avkc) cpll.this.c.b()).a(((fcek) obj3).c, false);
                        awxeVar.copyOnWrite();
                        awxf awxfVar = (awxf) awxeVar.instance;
                        a.getClass();
                        awxfVar.c = a;
                        awxfVar.b |= 1;
                        eyja b = eykj.b(instant);
                        awxeVar.copyOnWrite();
                        awxf awxfVar2 = (awxf) awxeVar.instance;
                        b.getClass();
                        awxfVar2.d = b;
                        awxfVar2.b |= 2;
                        return (awxf) awxeVar.build();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                awvx awvxVar = (awvx) awvy.b.createBuilder();
                awvxVar.a(cpkn.a(esqvVar.c));
                final awwx awwxVar = (awwx) awwy.a.createBuilder();
                String str = esqvVar.b.a;
                awwxVar.copyOnWrite();
                awwy awwyVar = (awwy) awwxVar.instance;
                awwyVar.b |= 1;
                awwyVar.c = str;
                map.ifPresent(new Consumer() { // from class: cpkw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        awwx awwxVar2 = awwx.this;
                        awxf awxfVar = (awxf) obj3;
                        awwxVar2.copyOnWrite();
                        awwy awwyVar2 = (awwy) awwxVar2.instance;
                        awwy awwyVar3 = awwy.a;
                        awxfVar.getClass();
                        awwyVar2.d = awxfVar;
                        awwyVar2.b |= 2;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                if (((asqj) cpllVar.h.b()).a()) {
                    awwj a = cpin.a(esqvVar.b.c);
                    awvxVar.copyOnWrite();
                    awvy awvyVar = (awvy) awvxVar.instance;
                    awvyVar.m = a;
                    awvyVar.c |= 128;
                }
                avkh avkhVar = cpllVar.b;
                final awvz awvzVar = (awvz) awwa.a.createBuilder();
                esqs esqsVar = esqvVar.b.d;
                awvzVar.copyOnWrite();
                awwa awwaVar = (awwa) awvzVar.instance;
                awwaVar.b |= 1;
                awwaVar.c = esqsVar.b;
                map.ifPresent(new Consumer() { // from class: cpkx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        awvz awvzVar2 = awvz.this;
                        awxf awxfVar = (awxf) obj3;
                        awvzVar2.copyOnWrite();
                        awwa awwaVar2 = (awwa) awvzVar2.instance;
                        awwa awwaVar3 = awwa.a;
                        awxfVar.getClass();
                        awwaVar2.d = awxfVar;
                        awwaVar2.b |= 2;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                awvxVar.copyOnWrite();
                awvy awvyVar2 = (awvy) awvxVar.instance;
                awwa awwaVar2 = (awwa) awvzVar.build();
                awwaVar2.getClass();
                awvyVar2.j = awwaVar2;
                awvyVar2.c |= 16;
                awui awuiVar = cpllVar.f;
                awvxVar.copyOnWrite();
                awvy awvyVar3 = (awvy) awvxVar.instance;
                awuiVar.getClass();
                awvyVar3.l = awuiVar;
                awvyVar3.c |= 64;
                String str2 = esqvVar.a.a.c;
                awvxVar.copyOnWrite();
                awvy awvyVar4 = (awvy) awvxVar.instance;
                str2.getClass();
                awvyVar4.c |= 1;
                awvyVar4.d = str2;
                awui a2 = ((avkc) cpllVar.c.b()).a(((URI) esqvVar.a.b.get()).toString(), true);
                awvxVar.copyOnWrite();
                awvy awvyVar5 = (awvy) awvxVar.instance;
                a2.getClass();
                awvyVar5.f = a2;
                awvyVar5.c |= 4;
                enip enipVar = esqvVar.d;
                final emwd m = new cpiw().m();
                Stream map2 = Collection.EL.stream(enipVar).map(new Function() { // from class: cpky
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ((esqy) obj3).b();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: cpla
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return (awui) emwd.this.fP((fcek) obj3);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: cplb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        awui awuiVar2 = (awui) obj3;
                        entd entdVar = cpll.a;
                        final awwn awwnVar = (awwn) awwq.a.createBuilder();
                        awwnVar.copyOnWrite();
                        awwq awwqVar = (awwq) awwnVar.instance;
                        awuiVar2.getClass();
                        awwqVar.c = awuiVar2;
                        awwqVar.b |= 1;
                        awwp awwpVar = awwp.JOINED;
                        awwnVar.copyOnWrite();
                        awwq awwqVar2 = (awwq) awwnVar.instance;
                        awwqVar2.d = awwpVar.e;
                        awwqVar2.b |= 2;
                        Optional.this.ifPresent(new Consumer() { // from class: cplh
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj4) {
                                awwn awwnVar2 = awwn.this;
                                awxf awxfVar = (awxf) obj4;
                                awwnVar2.copyOnWrite();
                                awwq awwqVar3 = (awwq) awwnVar2.instance;
                                awwq awwqVar4 = awwq.a;
                                awxfVar.getClass();
                                awwqVar3.e = awxfVar;
                                awwqVar3.b |= 4;
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return (awwq) awwnVar.build();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = engw.d;
                awvxVar.b((engw) map2.collect(endq.a));
                awvxVar.copyOnWrite();
                awvy awvyVar6 = (awvy) awvxVar.instance;
                awwy awwyVar2 = (awwy) awwxVar.build();
                awwyVar2.getClass();
                awvyVar6.i = awwyVar2;
                awvyVar6.c |= 8;
                h = avkhVar.d((awvy) awvxVar.build()).i(new eroh() { // from class: cpkr
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj3) {
                        final awud awudVar = (awud) obj3;
                        awuc awucVar = awuc.OK;
                        awuc b = awuc.b(awudVar.c);
                        if (b == null) {
                            b = awuc.UNKNOWN_STATUS;
                        }
                        if (!awucVar.equals(b)) {
                            return elfo.e(awudVar);
                        }
                        esqv esqvVar2 = esqvVar;
                        eyee eyeeVar = esqvVar2.a.a.e;
                        if (!eyee.b.equals(eyeeVar)) {
                            cpll cpllVar2 = cpll.this;
                            return ((cpke) cpllVar2.d.b()).c(esqvVar2.a.a.c, eyeeVar).h(new emwl() { // from class: cpku
                                @Override // defpackage.emwl
                                public final Object apply(Object obj4) {
                                    entd entdVar = cpll.a;
                                    return awud.this;
                                }
                            }, cpllVar2.e);
                        }
                        ensz enszVar = (ensz) cpll.a.h();
                        enszVar.Y(csux.J, esqvVar2.a.a.c);
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupHandlerChapiAdapter", "storeRoutingInfoToken", 310, "TachygramGroupHandlerChapiAdapter.java")).q("Added to an incoming tachygram group with a missing routing info token.");
                        return elfo.e(awudVar);
                    }
                }, cpllVar.e).h(new emwl() { // from class: cpks
                    @Override // defpackage.emwl
                    public final Object apply(Object obj3) {
                        cpll.d((awud) obj3, "handleSelfAddedToGroup");
                        return null;
                    }
                }, cpllVar.e);
            }
            h.getClass();
            Object c = fgfz.c(h, this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new essb(this.b, this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
