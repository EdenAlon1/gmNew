package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acux implements acus {
    public static final cskc a = cskc.g("Bugle", "ReportInitializedHandler");
    public final Context b;
    private final cfvu c;
    private final acmx d;
    private final errl e;

    public acux(Context context, cfvu cfvuVar, acmx acmxVar, errl errlVar) {
        this.b = context;
        this.c = cfvuVar;
        this.d = acmxVar;
        this.e = errlVar;
    }

    @Override // defpackage.acus
    public final elfl a(esnk esnkVar, final esnl esnlVar) {
        a.p("Ditto JSBridge Reported Initialized");
        final acmx acmxVar = this.d;
        final elfl a2 = this.c.a();
        final elfl i = acmxVar.a().i(new eroh() { // from class: acmw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return elfo.e(Optional.empty());
                }
                final acmx acmxVar2 = acmx.this;
                eisx eisxVar = (eisx) optional.get();
                final elfl g = elfl.g(acmxVar2.b.c(eisxVar));
                final elfl g2 = elfl.g(acmxVar2.c.b(eisxVar));
                final elfl i2 = g.i(new eroh() { // from class: acmu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        String str = ((eixn) obj2).b().g;
                        acmx acmxVar3 = acmx.this;
                        return elfl.g(acmxVar3.e.g(str, 32)).h(new emwl() { // from class: acmr
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                Bitmap bitmap = (Bitmap) obj3;
                                if (bitmap == null) {
                                    return eyee.b;
                                }
                                eyee eyeeVar = eyee.b;
                                eyed eyedVar = new eyed();
                                bitmap.compress(Bitmap.CompressFormat.PNG, 0, eyedVar);
                                return eyedVar.b();
                            }
                        }, acmxVar3.a);
                    }
                }, acmxVar2.d);
                return elfo.m(g, g2, i2).a(new Callable() { // from class: acmv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eixn eixnVar = (eixn) erqt.q(elfl.this);
                        String str = (String) erqt.q(g2);
                        str.getClass();
                        eyee eyeeVar = (eyee) erqt.q(i2);
                        eslv eslvVar = (eslv) eslw.a.createBuilder();
                        eslvVar.copyOnWrite();
                        ((eslw) eslvVar.instance).b = str;
                        String str2 = eixnVar.b().d;
                        eslvVar.copyOnWrite();
                        eslw eslwVar = (eslw) eslvVar.instance;
                        str2.getClass();
                        eslwVar.c = str2;
                        eslvVar.copyOnWrite();
                        eslw eslwVar2 = (eslw) eslvVar.instance;
                        eyeeVar.getClass();
                        eslwVar2.d = eyeeVar;
                        eslvVar.copyOnWrite();
                        ((eslw) eslvVar.instance).e = "image/png";
                        return (eslw) eslvVar.build();
                    }
                }, acmxVar2.d).h(new emwl() { // from class: acms
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Optional.of((eslw) obj2);
                    }
                }, acmxVar2.d);
            }
        }, acmxVar.d);
        return elfo.m(a2, i).a(new Callable() { // from class: acuv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str = (String) erqt.q(a2);
                Optional optional = (Optional) erqt.q(i);
                final esnc esncVar = (esnc) esnd.a.createBuilder();
                String e = crob.e(acux.this.b);
                esncVar.copyOnWrite();
                esnd esndVar = (esnd) esncVar.instance;
                e.getClass();
                esndVar.c = e;
                if (str != null) {
                    esncVar.copyOnWrite();
                    ((esnd) esncVar.instance).d = str;
                }
                esnl esnlVar2 = esnlVar;
                esncVar.getClass();
                optional.ifPresent(new Consumer() { // from class: acuw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        esnc esncVar2 = esnc.this;
                        eslw eslwVar = (eslw) obj;
                        esncVar2.copyOnWrite();
                        esnd esndVar2 = (esnd) esncVar2.instance;
                        esnd esndVar3 = esnd.a;
                        eslwVar.getClass();
                        esndVar2.e = eslwVar;
                        esndVar2.b |= 1;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                csjb c = acux.a.c();
                c.A("payloadValue", esncVar.build());
                c.r();
                esnlVar2.copyOnWrite();
                esnn esnnVar = (esnn) esnlVar2.instance;
                esnd esndVar2 = (esnd) esncVar.build();
                esnn esnnVar2 = esnn.a;
                esndVar2.getClass();
                esnnVar.c = esndVar2;
                esnnVar.b = 100;
                return esnlVar2.build();
            }
        }, this.e);
    }
}
