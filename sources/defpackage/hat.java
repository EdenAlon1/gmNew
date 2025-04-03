package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hat extends ffkk implements ffji {
    final /* synthetic */ jkv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hat(jkv jkvVar) {
        super(1);
        this.a = jkvVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ixv ixvVar = (ixv) obj;
        ixvVar.getClass();
        hbu hbuVar = (hbu) ixvVar;
        hbuVar.b = true;
        hbuVar.a.invoke(this.a);
        ixo.a(hbuVar);
        return false;
    }
}
