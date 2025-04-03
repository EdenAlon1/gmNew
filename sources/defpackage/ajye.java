package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajye extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajyr b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajye(ajyr ajyrVar, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajyrVar;
        this.c = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajye) c((UUID) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ajyr ajyrVar = this.b;
            UUID uuid = this.c;
            this.a = 1;
            obj = ajyrVar.o(uuid, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ajwc ajwcVar = (ajwc) obj;
        if (ajwcVar != null) {
            return ajwcVar.c;
        }
        throw new ajww(this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajye(this.b, this.c, ffguVar);
    }
}
