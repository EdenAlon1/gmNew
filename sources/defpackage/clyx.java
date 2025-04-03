package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clyx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ clyz b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clyx(clyz clyzVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = clyzVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clyx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            clyz clyzVar = this.b;
            String str = this.c;
            this.a = 1;
            obj = clyzVar.a(str, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clyx(this.b, this.c, ffguVar);
    }
}
