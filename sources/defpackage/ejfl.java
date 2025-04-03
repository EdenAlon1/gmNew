package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejfl implements eiyb {
    public final Context a;
    public final errl b;
    private final errl c;

    public ejfl(Context context, errl errlVar, errl errlVar2) {
        this.a = context;
        this.c = errlVar;
        this.b = errlVar2;
    }

    @Override // defpackage.eiyb
    public final ListenableFuture b(eiyc eiycVar) {
        return erqt.n(new erog() { // from class: ejfk
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ejfl ejflVar = ejfl.this;
                final qpt b = qpt.b(ejflVar.a);
                b.g();
                b.getClass();
                return ejflVar.b.submit(new Runnable() { // from class: ejfj
                    @Override // java.lang.Runnable
                    public final void run() {
                        qpt.this.h();
                    }
                });
            }
        }, this.c);
    }
}
