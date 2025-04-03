package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csl extends ffkk implements ffji {
    final /* synthetic */ dbe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csl(dbe dbeVar) {
        super(1);
        this.a = dbeVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(!ffkj.e(obj, this.a.f()));
    }
}
