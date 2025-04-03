package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fab extends ffkk implements ffji {
    final /* synthetic */ ffkz a;
    final /* synthetic */ ffkz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fab(ffkz ffkzVar, ffkz ffkzVar2) {
        super(1);
        this.a = ffkzVar;
        this.b = ffkzVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffos ffosVar = (ffos) obj;
        ffkz ffkzVar = this.a;
        if (ffkzVar.a == -1) {
            ffkzVar.a = ffosVar.b().a;
        }
        this.b.a = ffosVar.b().b + 1;
        return "";
    }
}
