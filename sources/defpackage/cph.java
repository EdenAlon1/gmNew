package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cph extends ffkk implements ffji {
    final /* synthetic */ cpi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cph(cpi cpiVar) {
        super(1);
        this.a = cpiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return obj == this.a ? "(this)" : String.valueOf(obj);
    }
}
