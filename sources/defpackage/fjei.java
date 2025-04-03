package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjei implements fjbm {
    final /* synthetic */ fjeh a;

    public fjei(fjeh fjehVar) {
        this.a = fjehVar;
    }

    @Override // defpackage.fjbm
    public final void onFailure(fjbj fjbjVar, Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.fjbm
    public final void onResponse(fjbj fjbjVar, fjdu fjduVar) {
        this.a.set(fjduVar);
    }
}
