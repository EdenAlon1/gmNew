package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ioj extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ipn c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioj(hvi hviVar, ffjm ffjmVar, ipn ipnVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = ffjmVar;
        this.c = ipnVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        iol.b(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
