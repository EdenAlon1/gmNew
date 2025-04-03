package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqot implements esph {
    private final cpgh a;

    public cqot(cpgh cpghVar) {
        this.a = cpghVar;
    }

    @Override // defpackage.esph
    public final ListenableFuture a() {
        throw null;
    }

    @Override // defpackage.esph
    public final Object b(ffgu ffguVar) {
        final cpgh cpghVar = this.a;
        ekzz f = eleg.f("TachygramAuthTokenProvider#getAuthToken");
        try {
            elfl f2 = cpghVar.b.a().i(new eroh() { // from class: cpgd
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    String str = (String) obj;
                    boolean isEmpty = TextUtils.isEmpty(str);
                    cpgh cpghVar2 = cpgh.this;
                    if (isEmpty) {
                        throw new esps("Could not access RCS msisdn at this time.", new espw(espt.q, espv.d), null);
                    }
                    ekzz f3 = eleg.f("TachygramAuthTokenProvider#getRegistrationProvider");
                    try {
                        elfl d = cpghVar2.a.d(str, 13);
                        f3.b(d);
                        f3.close();
                        return d;
                    } catch (Throwable th) {
                        try {
                            f3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, cpghVar.d).i(new eroh() { // from class: cpge
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    chbu chbuVar = (chbu) obj;
                    ekzz f3 = eleg.f("TachygramAuthTokenProvider#getTachyonRegistration");
                    try {
                        elfl s = chbuVar.s();
                        f3.b(s);
                        f3.close();
                        return s;
                    } catch (Throwable th) {
                        try {
                            f3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, cpghVar.c).h(new emwl() { // from class: cpgf
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ((fcdu) obj).b;
                }
            }, cpghVar.d).f(fedn.class, new eroh() { // from class: cpgg
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    fedn fednVar = (fedn) obj;
                    return elfo.d(new esps("Registration to tachyon failed.", essm.a(fednVar, cpgh.this.e), fednVar));
                }
            }, cpghVar.d);
            f.b(f2);
            f.close();
            return fgfz.c(f2, ffguVar);
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
