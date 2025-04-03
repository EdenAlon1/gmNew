package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class embb extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public embb(ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((embb) c(obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj2 = this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            Object obj3 = this.b;
            ffjm ffjmVar = this.c;
            this.a = 1;
            Object a = ffjmVar.a(obj3, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj2 = obj3;
            obj = a;
        }
        return ((Boolean) obj).booleanValue() ? obj2 : embc.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        embb embbVar = new embb(this.c, ffguVar);
        embbVar.b = obj;
        return embbVar;
    }
}
