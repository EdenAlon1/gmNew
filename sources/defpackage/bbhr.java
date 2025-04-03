package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbhr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bbhs b;
    final /* synthetic */ bbim c;
    final /* synthetic */ UUID d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbhr(bbhs bbhsVar, bbim bbimVar, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bbhsVar;
        this.c = bbimVar;
        this.d = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbhr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bbhs bbhsVar = this.b;
        bbim bbimVar = this.c;
        UUID uuid = this.d;
        this.a = 1;
        Object b = bbhsVar.b(bbimVar, uuid, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bbhr(this.b, this.c, this.d, ffguVar);
    }
}
