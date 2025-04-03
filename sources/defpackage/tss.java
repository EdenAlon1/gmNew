package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.tss;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tss implements cfvx {
    public static final cskc a = cskc.g("BugleNetwork", "GaiaPingRefreshHandler");
    public final Context b;
    private final ffbr c;
    private final errl d;

    /* compiled from: PG */
    public interface a {
        cgxw c();
    }

    public tss(Context context, ffbr ffbrVar, errl errlVar) {
        this.b = context;
        this.c = ffbrVar;
        this.d = errlVar;
    }

    @Override // defpackage.cfvx
    public final elfl a() {
        a.p("Refreshing Tachyon Gaia registration.");
        return ((babf) this.c.b()).a().i(new eroh() { // from class: tsq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((tss.a) ekhv.a(tss.this.b, tss.a.class, (eisx) obj)).c().w();
            }
        }, this.d).f(babn.class, new eroh() { // from class: tsr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                tss.a.r("Cannot refresh Gaia Tachyon registration because no account is linked.");
                return elfo.e(null);
            }
        }, erpp.a);
    }
}
