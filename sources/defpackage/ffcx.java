package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffcx extends ffkk implements ffji {
    final /* synthetic */ ffcy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffcx(ffcy ffcyVar) {
        super(1);
        this.a = ffcyVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return obj == this.a ? "(this Collection)" : String.valueOf(obj);
    }
}
