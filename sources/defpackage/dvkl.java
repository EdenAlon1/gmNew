package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkl implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exze exzeVar = (exze) obj;
        ewah ewahVar = (ewah) ewai.a.createBuilder();
        if (exzeVar.b == 1 && exzd.a(1) == 2) {
            Object apply = dvmk.b.apply((exwv) exzeVar.c);
            ewahVar.copyOnWrite();
            ewai ewaiVar = (ewai) ewahVar.instance;
            apply.getClass();
            ewaiVar.c = apply;
            ewaiVar.b = 1;
        }
        if (exzeVar.b == 2 && exzd.a(2) == 3) {
            Object apply2 = dvmk.a.apply((exzj) exzeVar.c);
            ewahVar.copyOnWrite();
            ewai ewaiVar2 = (ewai) ewahVar.instance;
            apply2.getClass();
            ewaiVar2.c = apply2;
            ewaiVar2.b = 4;
        }
        return (ewai) ewahVar.build();
    }
}
