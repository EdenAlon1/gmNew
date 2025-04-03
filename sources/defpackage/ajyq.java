package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajyq extends ffhv implements ffjm {
    final /* synthetic */ ajyr a;
    final /* synthetic */ UUID b;
    final /* synthetic */ akci c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyq(ffgu ffguVar, ajyr ajyrVar, UUID uuid, akci akciVar) {
        super(2, ffguVar);
        this.a = ajyrVar;
        this.b = uuid;
        this.c = akciVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.v(this.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajyq ajyqVar = new ajyq(ffguVar, this.a, this.b, this.c);
        ajyqVar.d = obj;
        return ajyqVar;
    }
}
