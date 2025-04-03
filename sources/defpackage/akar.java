package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akar extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akbo b;
    final /* synthetic */ UUID c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akar(akbo akboVar, UUID uuid, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = akboVar;
        this.c = uuid;
        this.d = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akar) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            akbo akboVar = this.b;
            UUID uuid = this.c;
            long j = this.d;
            this.a = 1;
            if (akboVar.l(akboVar, uuid, j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akar(this.b, this.c, this.d, ffguVar);
    }
}
