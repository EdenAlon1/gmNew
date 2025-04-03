package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eld extends ffkk implements ffji {
    final /* synthetic */ hrc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eld(hrc hrcVar) {
        super(1);
        this.a = hrcVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hrc hrcVar = this.a;
        return Boolean.valueOf(hrcVar != null ? hrcVar.c(obj) : true);
    }
}
