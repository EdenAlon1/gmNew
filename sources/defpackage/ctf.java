package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctf extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctf(boolean z, ffix ffixVar) {
        super(1);
        this.a = z;
        this.b = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        boolean z = false;
        if (!this.a && ((Boolean) this.b.invoke()).booleanValue()) {
            z = true;
        }
        iddVar.r(z);
        return ffcu.a;
    }
}
