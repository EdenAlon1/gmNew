package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lba extends ffhv implements ffjn {
    int a;
    final /* synthetic */ lcc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lba(lcc lccVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = lccVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new lba(this.b, (ffgu) obj3).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            lcc lccVar = this.b;
            this.a = 1;
            if (lccVar.e(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
