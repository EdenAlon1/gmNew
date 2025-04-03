package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjck implements fjbm {
    final /* synthetic */ ffrf a;

    public fjck(ffrf ffrfVar) {
        this.a = ffrfVar;
    }

    @Override // defpackage.fjbm
    public final void onFailure(fjbj fjbjVar, Throwable th) {
        this.a.w(ffci.a(th));
    }

    @Override // defpackage.fjbm
    public final void onResponse(fjbj fjbjVar, fjdu fjduVar) {
        this.a.w(fjduVar);
    }
}
