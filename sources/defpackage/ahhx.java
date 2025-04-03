package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahhx implements ahhq {
    public final aitz a;
    public final ahik b;
    public final errl c;
    public final ejvp d;
    private final ejvb e;
    private final aisv f;

    public ahhx(ejvb ejvbVar, aisv aisvVar, aitz aitzVar, ahik ahikVar, errl errlVar, ejvp ejvpVar) {
        this.e = ejvbVar;
        this.f = aisvVar;
        this.a = aitzVar;
        this.b = ahikVar;
        this.c = errlVar;
        this.d = ejvpVar;
    }

    @Override // defpackage.ahhq
    public final ejuh a() {
        return new ejuy(this.e, new eros() { // from class: ahht
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                ahhx ahhxVar = ahhx.this;
                final elfl h = ahhxVar.b.b().h(new emwl() { // from class: ahhv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((cxkc) obj).d());
                    }
                }, ahhxVar.c);
                final elfl c = ahhxVar.a.c();
                return new erph(elfo.m(h, c).a(new Callable() { // from class: ahhw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new ahgy(((Boolean) erqt.q(elfl.this)).booleanValue(), ((Boolean) erqt.q(c)).booleanValue());
                    }
                }, ahhxVar.c));
            }
        }, "super_sort_settings");
    }

    @Override // defpackage.ahhq
    public final elfl b(boolean z) {
        final elfl a = this.f.a(z);
        return a.h(new emwl() { // from class: ahhs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahhx.this.d.a(a, "super_sort_settings");
                return null;
            }
        }, this.c);
    }

    @Override // defpackage.ahhq
    public final elfl c(boolean z) {
        final elfl l = z ? this.b.l(true) : this.b.l(false).i(new eroh() { // from class: ahhr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ahhx.this.a.d(false);
            }
        }, this.c);
        return l.h(new emwl() { // from class: ahhu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahhx.this.d.a(l, "super_sort_settings");
                return null;
            }
        }, this.c);
    }
}
