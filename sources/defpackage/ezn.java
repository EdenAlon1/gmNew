package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezn extends ffkk implements ffji {
    final /* synthetic */ ezv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezn(ezv ezvVar) {
        super(1);
        this.a = ezvVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = ((jlm) obj).b;
        ezv ezvVar = this.a;
        ezv.a(ezvVar.c, str, ezvVar.d);
        return true;
    }
}
