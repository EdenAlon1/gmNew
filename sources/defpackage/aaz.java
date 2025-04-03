package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaz extends ffkk implements ffix {
    final /* synthetic */ abe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaz(abe abeVar) {
        super(0);
        this.a = abeVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        abe abeVar = this.a;
        return new lmg(abeVar.getApplication(), this.a, abeVar.getIntent() != null ? this.a.getIntent().getExtras() : null);
    }
}
