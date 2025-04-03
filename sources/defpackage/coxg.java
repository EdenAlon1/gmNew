package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface coxg {
    public static final emyl a = emys.a(new emyl() { // from class: coxd
        @Override // defpackage.emyl
        public final Object get() {
            int i = coxe.a;
            return cfvl.n(cfvl.b, "enable_forward_sync_management_redesign", true);
        }
    });
    public static final cfup b = cfvl.k(cfvl.b, "forward_sync_cache_size", 1000);

    long a(long j);

    cqdh b(long j);

    elfl c(boolean z, long j, long j2, long j3, UUID uuid);

    elfl d();

    elfl e();

    elfl f(eqqh eqqhVar);

    void g();

    @Deprecated
    void h();

    void i(long j);

    @Deprecated
    void j(long j, eqqh eqqhVar);

    @Deprecated
    void k(eqqh eqqhVar);

    @Deprecated
    void l(eqqh eqqhVar);

    @Deprecated
    void m(Uri uri, Instant instant);

    void n();

    void o(cno cnoVar);

    void p(boolean z);

    void q(boolean z);

    void r(long j);

    @Deprecated
    boolean s();

    boolean t(long j);

    @Deprecated
    boolean u();

    boolean v();

    boolean w(long j);
}
