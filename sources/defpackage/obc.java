package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class obc extends ffkk implements ffji {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obc(String str) {
        super(1);
        this.a = str;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffcf ffcfVar = (ffcf) obj;
        ffcfVar.getClass();
        return Boolean.valueOf(ffkj.e(ffcfVar.a, this.a));
    }
}
