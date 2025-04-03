package defpackage;

import io.grpc.Status;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djia extends clpu {
    public static final void j(ffbc ffbcVar) {
        ffbcVar.b(Status.l.withDescription("JibeService not initialized").asException());
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void b(final clni clniVar, final ffbc ffbcVar) {
        dkqe.a().ifPresentOrElse(new Consumer() { // from class: djhy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqm) obj).f().b(clni.this, ffbcVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: djhz
            @Override // java.lang.Runnable
            public final void run() {
                djia.j(ffbc.this);
            }
        });
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void c(final clny clnyVar, final ffbc ffbcVar) {
        dkqe.a().ifPresentOrElse(new Consumer() { // from class: djhm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqm) obj).f().c(clny.this, ffbcVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: djhr
            @Override // java.lang.Runnable
            public final void run() {
                djia.j(ffbc.this);
            }
        });
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void d(final clrd clrdVar, final ffbc ffbcVar) {
        dkqe.a().ifPresentOrElse(new Consumer() { // from class: djhn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqm) obj).f().d(clrd.this, ffbcVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: djho
            @Override // java.lang.Runnable
            public final void run() {
                djia.j(ffbc.this);
            }
        });
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void e(final clrz clrzVar, final ffbc ffbcVar) {
        dkqe.a().ifPresentOrElse(new Consumer() { // from class: djhs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqm) obj).f().e(clrz.this, ffbcVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: djht
            @Override // java.lang.Runnable
            public final void run() {
                djia.j(ffbc.this);
            }
        });
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void f(final clsh clshVar, final ffbc ffbcVar) {
        dkqe.a().ifPresentOrElse(new Consumer() { // from class: djhu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqm) obj).f().f(clsh.this, ffbcVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: djhv
            @Override // java.lang.Runnable
            public final void run() {
                djia.j(ffbc.this);
            }
        });
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void g(final clst clstVar, final ffbc ffbcVar) {
        dkqe.a().ifPresentOrElse(new Consumer() { // from class: djhw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqm) obj).f().g(clst.this, ffbcVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: djhx
            @Override // java.lang.Runnable
            public final void run() {
                djia.j(ffbc.this);
            }
        });
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void h(final cltb cltbVar, final ffbc ffbcVar) {
        dkqe.a().ifPresentOrElse(new Consumer() { // from class: djhp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqm) obj).f().h(cltb.this, ffbcVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: djhq
            @Override // java.lang.Runnable
            public final void run() {
                djia.j(ffbc.this);
            }
        });
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void i() {
        throw new IllegalStateException("Not implemented anymore!");
    }
}
