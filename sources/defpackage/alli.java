package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alli {
    public static final cskc a = cskc.g("BugleUsageStatistics", "InstallReferrerFetcher");
    public final errl b;
    public final algm c;
    public final ffbr d;

    public alli(errl errlVar, algm algmVar, ffbr ffbrVar) {
        this.b = errlVar;
        this.c = algmVar;
        this.d = ffbrVar;
    }

    public final elfl a() {
        return elfl.g(this.c.a.a()).h(new emwl() { // from class: alfn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((alfi) obj).k;
            }
        }, erpp.a).i(new eroh() { // from class: allb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                if ("NO_REFERRER".equals(str)) {
                    return elfo.e(Optional.empty());
                }
                if (!TextUtils.isEmpty(str)) {
                    return elfo.e(Optional.of(str));
                }
                final alli alliVar = alli.this;
                final qmi qmiVar = (qmi) alliVar.d.b();
                ListenableFuture a2 = kfg.a(new kfd() { // from class: allf
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        ((qmi) alli.this.d.b()).c(new allh(kfbVar, qmiVar));
                        return "Requesting install referrer from Play Store";
                    }
                });
                qmiVar.getClass();
                a2.b(eldl.l(new Runnable() { // from class: allg
                    @Override // java.lang.Runnable
                    public final void run() {
                        qmi.this.b();
                    }
                }), alliVar.b);
                final elfl g = elfl.g(a2);
                elfl h = g.h(new emwl() { // from class: allc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return (String) ((Optional) obj2).orElse("NO_REFERRER");
                    }
                }, erpp.a);
                final algm algmVar = alliVar.c;
                algmVar.getClass();
                return h.i(new eroh() { // from class: alld
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final String str2 = (String) obj2;
                        return elfl.g(algm.this.a.b(new emwl() { // from class: alfv
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                int i = algm.d;
                                alfh alfhVar = (alfh) ((alfi) obj3).toBuilder();
                                alfhVar.copyOnWrite();
                                alfi alfiVar = (alfi) alfhVar.instance;
                                String str3 = str2;
                                str3.getClass();
                                alfiVar.b |= 512;
                                alfiVar.k = str3;
                                return (alfi) alfhVar.build();
                            }
                        }, erpp.a));
                    }
                }, alliVar.b).i(new eroh() { // from class: alle
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return elfl.this;
                    }
                }, erpp.a);
            }
        }, this.b);
    }
}
