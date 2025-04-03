package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uab extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ uac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uab(uac uacVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = uacVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uab) c((engw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            engw engwVar = (engw) this.b;
            uac uacVar = this.c;
            ffhd a = ekxi.a(uacVar.a);
            uaa uaaVar = new uaa(null, uacVar, engwVar);
            this.a = 1;
            obj = ffra.a(a, uaaVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        uab uabVar = new uab(this.c, ffguVar);
        uabVar.b = obj;
        return uabVar;
    }
}
