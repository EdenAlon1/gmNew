package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgmt implements cfzm {
    public final cgmf a;
    private final errl b;

    public cgmt(cgmf cgmfVar, errl errlVar) {
        this.b = errlVar;
        this.a = cgmfVar;
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        return elfo.g(new Callable() { // from class: cgms
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new FileTeleporter(emxe.b(cgmt.this.a.f()).getBytes(), "MDDStatus"));
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl d() {
        return cfzj.d();
    }
}
