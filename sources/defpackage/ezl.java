package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezl extends ffkk implements ffji {
    final /* synthetic */ ezv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezl(ezv ezvVar) {
        super(1);
        this.a = ezvVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.c.j(true);
        this.a.c.f(true);
        String str = ((jlm) obj).b;
        ezv ezvVar = this.a;
        ezv.a(ezvVar.c, str, ezvVar.d);
        return true;
    }
}
