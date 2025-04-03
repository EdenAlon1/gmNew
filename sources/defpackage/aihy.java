package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aihy extends ffhv implements ffjm {
    final /* synthetic */ aihz a;
    final /* synthetic */ aihr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aihy(aihz aihzVar, aihr aihrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aihzVar;
        this.b = aihrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aihy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffgu ffguVar = ((aiid) this.b).b;
        ffgu ffguVar2 = null;
        if (ffguVar == null) {
            ffkj.c("continuation");
            ffguVar = null;
        }
        aihz aihzVar = this.a;
        ffguVar.getClass();
        aihzVar.c = ffguVar;
        try {
            ffgu ffguVar3 = aihzVar.c;
            if (ffguVar3 == null) {
                ffkj.c("continuation");
            } else {
                ffguVar2 = ffguVar3;
            }
            ffguVar2.w(this.a.b);
        } catch (Exception unused) {
            ((enrr) aihz.a.j().h("com/google/android/apps/messaging/navigation/statemachine/CompletedWithResultState$transitionFrom$1", "invokeSuspend", 36, "CompletedWithResultState.kt")).q("Disregarding exception thrown by resumed continuation");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aihy(this.a, this.b, ffguVar);
    }
}
