package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dycl implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ emxc c;
    final /* synthetic */ dycm d;
    final /* synthetic */ int e;

    public dycl(dycm dycmVar, String str, long j, int i, emxc emxcVar) {
        this.a = str;
        this.b = j;
        this.e = i;
        this.c = emxcVar;
        this.d = dycmVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dxth.d("%s: Successfully updated periodic tasks for MDD lib %s %d", "WorkManagerTaskScheduler", this.a, Long.valueOf(this.b));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dxth.i("%s: Failed to update periodic tasks for MDD lib %s %d", "WorkManagerTaskScheduler", this.a, Long.valueOf(this.b));
        this.d.b(this.a, this.b, this.e, false, this.c);
    }
}
