package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpam implements cfzm {
    public final ffbr a;
    private final errl b;

    public cpam(ffbr ffbrVar, errl errlVar) {
        this.a = ffbrVar;
        this.b = errlVar;
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        return elfo.g(new Callable() { // from class: cpal
            @Override // java.util.concurrent.Callable
            public final Object call() {
                engr engrVar = new engr();
                engrVar.h(new FileTeleporter(((cpar) cpam.this.a.b()).c().getBytes(StandardCharsets.UTF_8), "Carrier config"));
                return engrVar.g();
            }
        }, this.b);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl d() {
        return cfzj.d();
    }
}
