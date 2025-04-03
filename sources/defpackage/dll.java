package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dll extends ffhv implements ffjn {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ dlq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dll(ffjm ffjmVar, dlq dlqVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = ffjmVar;
        this.c = dlqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dll dllVar = new dll(this.b, this.c, (ffgu) obj3);
        dllVar.d = (dlu) obj;
        return dllVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.d;
            ffjm ffjmVar = this.b;
            dlk dlkVar = new dlk(this.c, (dlu) obj2);
            this.a = 1;
            if (ffjmVar.a(dlkVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
