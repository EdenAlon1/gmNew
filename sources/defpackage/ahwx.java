package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwx extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ahwz c;
    final /* synthetic */ List d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwx(ffgu ffguVar, ahwz ahwzVar, List list) {
        super(3, ffguVar);
        this.c = ahwzVar;
        this.d = list;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ahwx ahwxVar = new ahwx((ffgu) obj3, this.c, this.d);
        ahwxVar.e = (ffxy) obj;
        ahwxVar.b = (Object[]) obj2;
        return ahwxVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r8 = this.e;
            dmmk dmmkVar = new dmmk(ffdo.L((dlwk[]) this.b), ahwu.a, new ahwv(this.c, this.d));
            this.a = 1;
            if (r8.fQ(dmmkVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
