package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class keo extends ffkk implements ffix {
    final /* synthetic */ kes a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keo(kes kesVar) {
        super(0);
        this.a = kesVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ioc a = this.a.a();
        if (a == null || !a.t()) {
            a = null;
        }
        boolean z = false;
        if (a != null && this.a.b() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
