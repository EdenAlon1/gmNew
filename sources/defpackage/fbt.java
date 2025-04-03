package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbt extends ffkk implements ffji {
    final /* synthetic */ fbw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbt(fbw fbwVar) {
        super(1);
        this.a = fbwVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        fbw fbwVar = this.a;
        fbq fbqVar = fbwVar.j;
        if (fbqVar == null) {
            return false;
        }
        fbqVar.b = booleanValue;
        fbwVar.j();
        return true;
    }
}
