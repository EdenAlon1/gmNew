package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnjp {
    public static final cskc a = cskc.g("Bugle", "OtpUtils");
    public final engw b;
    public final errl c;
    private final errl d;

    public cnjp(cfuu cfuuVar, Set set, errl errlVar, errl errlVar2) {
        cfuuVar.a();
        this.b = engw.n(set);
        this.d = errlVar;
        this.c = errlVar2;
    }

    public final elfl a(String str, int i) {
        return TextUtils.isEmpty(str) ? elfo.e(false) : b(str, i, 0);
    }

    public final elfl b(final String str, final int i, final int i2) {
        Throwable th;
        elfl i3;
        ekzz f = eleg.f("OtpUtils.processIfOtp");
        try {
            if (i2 >= this.b.size()) {
                try {
                    i3 = elfo.e(false);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        f.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th;
                    }
                }
            } else {
                final cnjo cnjoVar = (cnjo) this.b.get(i2);
                try {
                    i3 = elfo.g(new Callable() { // from class: cnjm
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(cnjo.this.f(str));
                        }
                    }, this.c).i(new eroh() { // from class: cnjn
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            cnjp cnjpVar = cnjp.this;
                            String str2 = str;
                            int i4 = i;
                            if (!booleanValue) {
                                return cnjpVar.b(str2, i4, i2 + 1);
                            }
                            cnjo cnjoVar2 = cnjoVar;
                            cnjp.a.m("The message is an OTP");
                            return cnjoVar2.gf(str2, i4).h(new emwl() { // from class: cnjl
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return true;
                                }
                            }, cnjpVar.c);
                        }
                    }, this.d);
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    f.close();
                    throw th;
                }
            }
            f.close();
            return i3;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
