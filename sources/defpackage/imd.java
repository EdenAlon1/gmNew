package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imd extends ffkk implements ffji {
    final /* synthetic */ imc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imd(imc imcVar) {
        super(1);
        this.a = imcVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        imc imcVar = this.a;
        Throwable th = (Throwable) obj;
        ffrf ffrfVar = imcVar.a;
        if (ffrfVar != null) {
            ffrfVar.h(th);
        }
        imcVar.a = null;
        return ffcu.a;
    }
}
