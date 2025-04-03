package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class demt extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ demu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public demt(demu demuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = demuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((demt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            demu demuVar = this.c;
            cjtu cjtuVar = (cjtu) demuVar.a.b();
            this.a = demuVar;
            this.b = 1;
            Object a = cjtuVar.a(this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj2 = demuVar;
            obj = a;
        }
        cjtw b = cjtw.b(((cjtq) obj).c);
        if (b == null) {
            b = cjtw.SHARE_TO_UNKNOWN;
        }
        b.getClass();
        ((demu) obj2).a(b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new demt(this.c, ffguVar);
    }
}
