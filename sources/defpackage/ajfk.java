package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajfk extends ffhv implements ffjm {
    final /* synthetic */ ajfi a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajfk(ajfi ajfiVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajfiVar;
        this.b = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajfk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((cjeo) ((Optional) this.a.b.b()).get()).m(((Boolean) this.b).booleanValue());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajfk(this.a, this.b, ffguVar);
    }
}
