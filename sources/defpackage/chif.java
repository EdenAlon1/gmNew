package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chif implements erqj {
    final /* synthetic */ akzw a;
    final /* synthetic */ chig b;
    final /* synthetic */ chih c;

    public chif(chih chihVar, akzw akzwVar, chig chigVar) {
        this.a = akzwVar;
        this.b = chigVar;
        this.c = chihVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        this.a.c();
        String str = ((chgs) this.b).b;
        if (str == null) {
            return;
        }
        chih chihVar = this.c;
        chihVar.a.e(str, Status.b.getCode().value());
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.c();
        String str = ((chgs) this.b).b;
        if (str == null) {
            return;
        }
        chih chihVar = this.c;
        chihVar.a.e(str, Status.c(th).getCode().value());
    }
}
