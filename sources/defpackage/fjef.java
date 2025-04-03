package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjef implements fjbm {
    final /* synthetic */ fjeh a;

    public fjef(fjeh fjehVar) {
        this.a = fjehVar;
    }

    @Override // defpackage.fjbm
    public final void onFailure(fjbj fjbjVar, Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.fjbm
    public final void onResponse(fjbj fjbjVar, fjdu fjduVar) {
        if (fjduVar.c()) {
            this.a.set(fjduVar.b);
        } else {
            this.a.setException(new fjel(fjduVar));
        }
    }
}
