package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqs extends ffhv implements ffjm {
    final /* synthetic */ zqu a;
    final /* synthetic */ Optional b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqs(zqu zquVar, Optional optional, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = zquVar;
        this.b = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zqs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((altk) this.a.e.b()).aH(2, eorw.BIZINFO_SOURCE_CONVERSATION_START, ((aqmo) this.b.get()).b());
        ((aigz) this.a.f.b()).h(new ailc(this.a.b, ((aqmo) this.b.get()).b()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zqs(this.a, this.b, ffguVar);
    }
}
