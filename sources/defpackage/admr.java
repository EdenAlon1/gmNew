package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admr implements admk {
    public final cgfd a;
    public final errl b;
    public final ffbr c;

    public admr(cgfd cgfdVar, ffbr ffbrVar, errl errlVar) {
        this.a = cgfdVar;
        this.c = ffbrVar;
        this.b = errlVar;
    }

    public static boolean c() {
        return csgj.a() && ((Boolean) ((cfup) csfu.a.get()).e()).booleanValue();
    }

    static final elfl d() {
        return c() ? elfo.e(admj.b) : elfo.e(admj.a);
    }

    @Override // defpackage.admk
    public final elfl a(eisx eisxVar) {
        cgfd cgfdVar = this.a;
        return elfl.g(cgfdVar.f.c(eisxVar)).h(new emwl() { // from class: cgeb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejui ejuiVar = cgfd.a;
                return Boolean.valueOf(!((eixn) obj).b().k.equals("pseudonymous"));
            }
        }, cgfdVar.d).i(new eroh() { // from class: admq
            /* JADX WARN: Type inference failed for: r0v9, types: [comc, java.lang.Object] */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return elfo.e(false);
                }
                admr admrVar = admr.this;
                return admr.c() ? ((axkm) admrVar.c.b()).e.get().h().h(new emwl() { // from class: axjo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(((axez) obj2).A);
                    }
                }, erpp.a).h(new emwl() { // from class: admm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(!((Boolean) obj2).booleanValue());
                    }
                }, admrVar.b) : admrVar.a.c.h().h(new emwl() { // from class: cgew
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(((cgea) obj2).c);
                    }
                }, erpp.a).h(new emwl() { // from class: admn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(!((Boolean) obj2).booleanValue());
                    }
                }, admrVar.b);
            }
        }, this.b).i(new eroh() { // from class: admo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(new admi(false, admj.a));
                }
                final admr admrVar = admr.this;
                return (!((Boolean) csgj.q.e()).booleanValue() ? admr.d() : ((axkm) admrVar.c.b()).r().i(new eroh() { // from class: admp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        axkl axklVar = ((axkm) admr.this.c.b()).n;
                        return axkl.f((axeu) obj2) ? elfo.e(admj.e) : admr.d();
                    }
                }, admrVar.b)).h(new emwl() { // from class: adml
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return new admi(true, (admj) obj2);
                    }
                }, admrVar.b);
            }
        }, this.b);
    }

    @Override // defpackage.admk
    public final void b(eito eitoVar) {
        eitoVar.c(engw.r(admh.class));
    }
}
