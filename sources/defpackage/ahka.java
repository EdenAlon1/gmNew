package defpackage;

import android.app.Activity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahka implements ahjw {
    public final ffbr a;
    private final ffbr b;
    private final ahju c;
    private final ahkc d;
    private final ahkd e;
    private final ejlq f;
    private final ejwl g;
    private final errl h;

    public ahka(ffbr ffbrVar, ffbr ffbrVar2, ahju ahjuVar, ahkc ahkcVar, ahkd ahkdVar, ejlq ejlqVar, ejwl ejwlVar, errl errlVar) {
        this.b = ffbrVar;
        this.a = ffbrVar2;
        this.c = ahjuVar;
        this.d = ahkcVar;
        this.e = ahkdVar;
        this.f = ejlqVar;
        this.g = ejwlVar;
        this.h = errlVar;
    }

    @Override // defpackage.ahjw
    public final void a(final ahjv ahjvVar, Activity activity, bcse bcseVar) {
        emxf.l(aewg.h());
        ahju ahjuVar = this.c;
        ahjuVar.b = activity;
        ahjuVar.c = bcseVar;
        elfl h = ((aeyq) this.b.b()).a(new aeyc(ahjvVar.b(), ahjvVar.a(), "", buay.USER, buax.HIGH, "", false)).h(new emwl() { // from class: ahjx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
        h.k(axnw.c(new Consumer() { // from class: ahjy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Optional c = ahjvVar.c();
                final ahka ahkaVar = ahka.this;
                c.ifPresent(new Consumer() { // from class: ahjz
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        ((abxd) ((Optional) ahka.this.a.b()).get()).d((ezfz) obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.h);
        this.f.i(ejlp.b(h), new ejlm(new ahjs(ahjvVar.b().b(), ahjvVar.a())), this.c);
    }

    @Override // defpackage.ahjw
    public final void b(vk vkVar, uts utsVar) {
        ahju ahjuVar = this.c;
        ahjuVar.a = vkVar;
        ahjuVar.d = utsVar;
        this.f.k(ahjuVar);
        this.e.a = vkVar;
        final afal afalVar = (afal) this.d.a.b();
        this.g.b(new ejuy(afalVar.c, new eros() { // from class: afaj
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final afal afalVar2 = afal.this;
                return new erph(((ahik) afalVar2.e.b()).e().i(new eroh() { // from class: afak
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        if (!((ahij) obj).c().c()) {
                            return elfo.e(false);
                        }
                        afal afalVar3 = afal.this;
                        if (!ctid.h(afalVar3.b)) {
                            return afalVar3.f.b();
                        }
                        afal.a.p("Disabling supersort for secondary users");
                        return elfo.e(false);
                    }
                }, afalVar2.d));
            }
        }, "ready_status_changed"), this.e);
    }
}
