package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsj implements bjt {
    final /* synthetic */ btb a;

    public bsj(btb btbVar) {
        this.a = btbVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        ksw.d(this.a.q != null, "In-progress recording shouldn't be null");
        Objects.toString(th);
        avw.a("Recorder", "Encodings end with error: ".concat(th.toString()));
        btb btbVar = this.a;
        btbVar.i(btbVar.A == null ? 8 : 6, th);
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        avw.a("Recorder", "Encodings end successfully.");
        btb btbVar = this.a;
        btbVar.i(btbVar.O, btbVar.P);
    }
}
