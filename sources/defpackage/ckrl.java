package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class ckrl implements eroh {
    public final /* synthetic */ ckrs a;

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        final eolv eolvVar = (eolv) obj;
        final ckrs ckrsVar = this.a;
        return elfo.f(new Runnable() { // from class: ckre
            @Override // java.lang.Runnable
            public final void run() {
                ((akxl) ckrs.this.a.b()).j((eolu) eolvVar.toBuilder());
            }
        }, ckrsVar.d);
    }
}
