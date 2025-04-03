package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zzi extends ffhv implements ffji {
    int a;
    final /* synthetic */ zzw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzw zzwVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = zzwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            zzw zzwVar = this.b;
            this.a = 1;
            ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
            ffrhVar.B();
            zzwVar.f.d(true, new zzv(ffrhVar, zzwVar));
            obj = ffrhVar.m();
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            ((enrr) zzw.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/badges/ScheduledSendEditDialog$editScheduledMessage$replaced$1", "invokeSuspend", 80, "ScheduledSendEditDialog.kt")).q("Confirmed overwriting draft message");
            return bool;
        }
        ((enrr) zzw.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/badges/ScheduledSendEditDialog$editScheduledMessage$replaced$1", "invokeSuspend", 82, "ScheduledSendEditDialog.kt")).q("Did not confirm overwriting draft message");
        return bool;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new zzi(this.b, (ffgu) obj).b(ffcu.a);
    }
}
