package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajxc extends ffhv implements ffjm {
    final /* synthetic */ ajyr a;
    final /* synthetic */ UUID b;
    final /* synthetic */ akci c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajxc(ffgu ffguVar, ajyr ajyrVar, UUID uuid, akci akciVar) {
        super(2, ffguVar);
        this.a = ajyrVar;
        this.b = uuid;
        this.c = akciVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajxc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((dtuu) this.a.c.b()).d("completeActiveExecution", new ajxf(this.b, this.a, this.c));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajxc ajxcVar = new ajxc(ffguVar, this.a, this.b, this.c);
        ajxcVar.d = obj;
        return ajxcVar;
    }
}
