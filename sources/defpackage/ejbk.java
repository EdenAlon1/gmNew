package defpackage;

import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbk {
    public static final enru a = enru.c("com/google/apps/tiktok/account/data/google/GmsAccounts");
    public final dfad b;
    public final errl c;
    public final errl d;
    public final ebwq e;
    public final dfap f;
    public final ffbr g;

    public ejbk(dfad dfadVar, errl errlVar, errl errlVar2, ebwq ebwqVar, dfap dfapVar, ffbr ffbrVar) {
        dfadVar.getClass();
        errlVar.getClass();
        errlVar2.getClass();
        ebwqVar.getClass();
        this.b = dfadVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = ebwqVar;
        this.f = dfapVar;
        this.g = ffbrVar;
    }

    public final ListenableFuture a(final String str) {
        ekzz f = eleg.f("GmsAccounts.getAccountId");
        try {
            ListenableFuture g = ernq.g(erqt.n(eldl.c(new erog() { // from class: ejas
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ekzz f2 = eleg.f("Fast GoogleAuthUtilWrapper.getAccountId");
                    try {
                        ListenableFuture a2 = duin.a(ejbk.this.b.b(str));
                        f2.b(a2);
                        ffig.a(f2, null);
                        return a2;
                    } finally {
                    }
                }
            }), this.c), dezu.class, eldl.d(new eroh() { // from class: ejay
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    dezu dezuVar = (dezu) obj;
                    dezuVar.getClass();
                    ((enrr) ((enrr) ejbk.a.h()).g(dezuVar).h("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$lambda$23$lambda$22", 374, "GmsAccounts.kt")).q("Fast Auth.getAccountId() Failed");
                    final ejbk ejbkVar = ejbk.this;
                    final String str2 = str;
                    ekzz f2 = eleg.f("GoogleAuthUtilWrapper.getToken");
                    try {
                        ListenableFuture a2 = duin.a(ejbkVar.b.g(new Account(str2, "com.google")));
                        f2.b(a2);
                        ffig.a(f2, null);
                        return erny.f(erny.g(erqc.o(a2), eldl.d(new eroh() { // from class: ejaz
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                ((String) obj2).getClass();
                                ekzz f3 = eleg.f("GoogleAuthUtilWrapper.getAccountId");
                                try {
                                    ListenableFuture a3 = duin.a(ejbk.this.b.b(str2));
                                    f3.b(a3);
                                    ffig.a(f3, null);
                                    return a3;
                                } finally {
                                }
                            }
                        }), ejbkVar.c), eldl.a(new emwl() { // from class: ejba
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                String str3 = (String) obj2;
                                ((enrr) ejbk.a.i().h("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$lambda$23$lambda$22$lambda$21", 403, "GmsAccounts.kt")).q("Found case where getToken fixed the getAccountId failure");
                                return str3;
                            }
                        }), erpp.a);
                    } finally {
                    }
                }
            }), this.c);
            f.b(g);
            ffig.a(f, null);
            return g;
        } finally {
        }
    }
}
