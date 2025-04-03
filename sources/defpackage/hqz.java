package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqz extends ffkk implements ffji {
    final /* synthetic */ hra a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqz(hra hraVar) {
        super(1);
        this.a = hraVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hrc hrcVar = this.a.d;
        return Boolean.valueOf(hrcVar != null ? hrcVar.c(obj) : true);
    }
}
