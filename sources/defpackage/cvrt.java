package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cvrt implements ffix {
    public final /* synthetic */ cvsa a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ffix c;

    public /* synthetic */ cvrt(cvsa cvsaVar, long j, ffix ffixVar) {
        this.a = cvsaVar;
        this.b = j;
        this.c = ffixVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        if (!((cvsd) this.a.i.b()).a(this.b)) {
            this.c.invoke();
        }
        return ffcu.a;
    }
}
