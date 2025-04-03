package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpgc implements esph {
    private final awui a;
    private final akkg b;

    public cpgc(awui awuiVar, akkg akkgVar) {
        awuiVar.getClass();
        akkgVar.getClass();
        this.a = awuiVar;
        this.b = akkgVar;
    }

    @Override // defpackage.esph
    public final ListenableFuture a() {
        akkg akkgVar = this.b;
        final cpgb cpgbVar = new cpgb(this.a, (errl) akkgVar.a.a.t.b(), (errl) akkgVar.a.a.p.b(), (chbx) akkgVar.a.a.a.gr.b(), new cpgj());
        ekzz f = eleg.f("IdentityBoundTachygramAuthTokenProvider#getAuthToken");
        try {
            elfl f2 = cpgbVar.a.d(cpgbVar.d.d, 15).i(new eroh() { // from class: cpfy
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ((chbu) obj).k();
                }
            }, cpgbVar.b).h(new emwl() { // from class: cpfz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ((fcdu) obj).b;
                }
            }, cpgbVar.c).f(fedn.class, new eroh() { // from class: cpga
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    fedn fednVar = (fedn) obj;
                    return elfo.d(new esps("Registration to tachyon failed.", essm.a(fednVar, cpgb.this.e), fednVar));
                }
            }, cpgbVar.c);
            f.b(f2);
            f.close();
            return f2;
        } finally {
        }
    }

    @Override // defpackage.esph
    public final Object b(ffgu ffguVar) {
        return fgfz.c(a(), ffguVar);
    }
}
