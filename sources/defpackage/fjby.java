package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjby implements fjbm {
    final /* synthetic */ fjbm a;
    final /* synthetic */ fjbz b;

    public fjby(fjbz fjbzVar, fjbm fjbmVar) {
        this.a = fjbmVar;
        this.b = fjbzVar;
    }

    @Override // defpackage.fjbm
    public final void onFailure(fjbj fjbjVar, final Throwable th) {
        final fjbm fjbmVar = this.a;
        this.b.a.execute(new Runnable() { // from class: fjbx
            @Override // java.lang.Runnable
            public final void run() {
                fjbmVar.onFailure(fjby.this.b, th);
            }
        });
    }

    @Override // defpackage.fjbm
    public final void onResponse(fjbj fjbjVar, final fjdu fjduVar) {
        final fjbm fjbmVar = this.a;
        this.b.a.execute(new Runnable() { // from class: fjbw
            @Override // java.lang.Runnable
            public final void run() {
                fjbm fjbmVar2 = fjbmVar;
                fjby fjbyVar = fjby.this;
                if (fjbyVar.b.b.e()) {
                    fjbmVar2.onFailure(fjbyVar.b, new IOException("Canceled"));
                } else {
                    fjbmVar2.onResponse(fjbyVar.b, fjduVar);
                }
            }
        });
    }
}
