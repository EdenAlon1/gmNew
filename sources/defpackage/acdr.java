package defpackage;

import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdr {
    private static final cskc e = cskc.g("Bugle", "DateTimePickerMixin");
    public final ea a;
    public acds d;
    public acbi b = acbi.a;
    public Instant c = Instant.EPOCH;
    private boolean f = false;

    public acdr(ea eaVar) {
        this.a = eaVar;
    }

    public final void a() {
        acbf acbfVar = (acbf) acbg.a.createBuilder();
        long epochMilli = this.c.toEpochMilli();
        acbfVar.copyOnWrite();
        ((acbg) acbfVar.instance).b = epochMilli;
        acbg acbgVar = (acbg) acbfVar.build();
        acbb acbbVar = new acbb();
        fbae.e(acbbVar);
        ekku.a(acbbVar, acbgVar);
        acbbVar.aP(this.a);
        c(acbbVar, "DATE");
        acds acdsVar = this.d;
        acdsVar.getClass();
        acdsVar.e().ifPresent(new Consumer() { // from class: acdk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ellj.f((ellf) obj, acdr.this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b(acbi acbiVar, acds acdsVar) {
        this.b = acbiVar;
        this.d = acdsVar;
        this.c = Instant.ofEpochMilli(acbiVar.f);
        if (!this.f) {
            ellj.c(this.a, accp.class, new ellh() { // from class: acdm
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    acdr.this.a();
                    return elli.a;
                }
            });
            ellj.c(this.a, accr.class, new ellh() { // from class: acdn
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    acdr acdrVar = acdr.this;
                    acds acdsVar2 = acdrVar.d;
                    acdsVar2.getClass();
                    ellj.f(acdsVar2.b((acbk) acdrVar.b.b.get(((accr) ellfVar).a)), acdrVar.a);
                    return elli.a;
                }
            });
            ellj.c(this.a, accq.class, new ellh() { // from class: acdo
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    Instant instant = ((accq) ellfVar).a.toInstant();
                    acdr acdrVar = acdr.this;
                    acdrVar.c = instant;
                    acdrVar.e();
                    return elli.a;
                }
            });
            ellj.c(this.a, accs.class, new ellh() { // from class: acdp
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    Instant instant = ((accs) ellfVar).a.toInstant();
                    final acdr acdrVar = acdr.this;
                    acdrVar.c = instant;
                    acaz acazVar = (acaz) acba.a.createBuilder();
                    long epochMilli = acdrVar.c.toEpochMilli();
                    acazVar.copyOnWrite();
                    ((acba) acazVar.instance).b = epochMilli;
                    acba acbaVar = (acba) acazVar.build();
                    acat acatVar = new acat();
                    fbae.e(acatVar);
                    ekku.a(acatVar, acbaVar);
                    acatVar.aP(acdrVar.a);
                    acdrVar.c(acatVar, "CONFIRMATION");
                    acds acdsVar2 = acdrVar.d;
                    acdsVar2.getClass();
                    acdsVar2.d().ifPresent(new Consumer() { // from class: acdi
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ellj.f((ellf) obj, acdr.this.a);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return elli.a;
                }
            });
            ellj.c(this.a, accn.class, new ellh() { // from class: acdq
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    acdr.this.d();
                    return elli.a;
                }
            });
            ellj.c(this.a, accm.class, new ellh() { // from class: acde
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    acdr.this.a();
                    return elli.a;
                }
            });
            ellj.c(this.a, acco.class, new ellh() { // from class: acdf
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    acdr.this.e();
                    return elli.a;
                }
            });
            ellj.c(this.a, acck.class, new ellh() { // from class: acdg
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    acdr acdrVar = acdr.this;
                    acds acdsVar2 = acdrVar.d;
                    acdsVar2.getClass();
                    ellj.f(acdsVar2.a(acdrVar.c), acdrVar.a);
                    return elli.a;
                }
            });
            ellj.c(this.a, accl.class, new ellh() { // from class: acdh
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    final acdr acdrVar = acdr.this;
                    acds acdsVar2 = acdrVar.d;
                    acdsVar2.getClass();
                    acdsVar2.c().ifPresent(new Consumer() { // from class: acdl
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ellj.f((ellf) obj, acdr.this.a);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return elli.a;
                }
            });
            this.f = true;
        }
        d();
    }

    public final void c(dn dnVar, String str) {
        eg G;
        fr frVar;
        ea eaVar = this.a;
        if (!eaVar.aF() || (G = eaVar.G()) == null || G.isDestroyed() || (frVar = eaVar.B) == null || frVar.x) {
            e.p("Cannot commit fragment transaction to show date picker.");
            return;
        }
        fr frVar2 = this.a.B;
        frVar2.getClass();
        cg cgVar = new cg(frVar2);
        cgVar.u(dnVar, str);
        cgVar.c();
    }

    public final void d() {
        acbx acbxVar = (acbx) acby.a.createBuilder();
        String str = this.b.c;
        acbxVar.copyOnWrite();
        acby acbyVar = (acby) acbxVar.instance;
        str.getClass();
        acbyVar.c = str;
        String str2 = this.b.d;
        acbxVar.copyOnWrite();
        acby acbyVar2 = (acby) acbxVar.instance;
        str2.getClass();
        acbyVar2.d = str2;
        String str3 = this.b.e;
        acbxVar.copyOnWrite();
        acby acbyVar3 = (acby) acbxVar.instance;
        str3.getClass();
        acbyVar3.e = str3;
        eygr eygrVar = this.b.b;
        acbxVar.copyOnWrite();
        acby acbyVar4 = (acby) acbxVar.instance;
        eygr eygrVar2 = acbyVar4.b;
        if (!eygrVar2.c()) {
            acbyVar4.b = eyfy.mutableCopy(eygrVar2);
        }
        eydl.addAll(eygrVar, acbyVar4.b);
        acby acbyVar5 = (acby) acbxVar.build();
        ea eaVar = this.a;
        acbp acbpVar = new acbp();
        fbae.e(acbpVar);
        ekku.a(acbpVar, acbyVar5);
        acbpVar.aP(eaVar);
        c(acbpVar, "PRESETS");
        acds acdsVar = this.d;
        acdsVar.getClass();
        acdsVar.f().ifPresent(new Consumer() { // from class: acdj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ellj.f((ellf) obj, acdr.this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void e() {
        acce acceVar = (acce) accf.a.createBuilder();
        long epochMilli = this.c.toEpochMilli();
        acceVar.copyOnWrite();
        ((accf) acceVar.instance).b = epochMilli;
        accf accfVar = (accf) acceVar.build();
        int i = accd.f;
        acbz acbzVar = new acbz();
        fbae.e(acbzVar);
        ekku.a(acbzVar, accfVar);
        acbzVar.aP(this.a);
        c(acbzVar, "TIME");
        acds acdsVar = this.d;
        acdsVar.getClass();
        acdsVar.g().ifPresent(new Consumer() { // from class: acdd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ellj.f((ellf) obj, acdr.this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
