package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akaz extends ffhv implements ffji {
    int a;
    final /* synthetic */ akbo b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akaz(akbo akboVar, UUID uuid, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = akboVar;
        this.c = uuid;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            akbo akboVar = this.b;
            akay akayVar = new akay(this.c, akboVar, null);
            this.a = 1;
            if (ffra.a(akboVar.g, akayVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new akaz(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
