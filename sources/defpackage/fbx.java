package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbx extends ffkk implements ffjm {
    final /* synthetic */ fcu a;
    final /* synthetic */ huo b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbx(fcu fcuVar, huo huoVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = fcuVar;
        this.b = huoVar;
        this.c = ffjmVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        fci.b(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
