package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfty implements cfzm {
    public final ffbr a;
    private final errl b;

    public cfty(errl errlVar, ffbr ffbrVar) {
        this.b = errlVar;
        this.a = ffbrVar;
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        return elfo.g(new Callable() { // from class: cftx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new FileTeleporter(((cfus) cfty.this.a.b()).a().getBytes(), "Phenotypes"));
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl d() {
        return cfzj.d();
    }
}
