package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cox extends ffkk implements ffji {
    final /* synthetic */ coy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cox(coy coyVar) {
        super(1);
        this.a = coyVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return obj == this.a ? "(this)" : String.valueOf(obj);
    }
}
