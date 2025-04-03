package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajms extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ ajmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajms(ajmw ajmwVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ajmwVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ajms ajmsVar = new ajms(this.c, (ffgu) obj3);
        ajmsVar.a = (ajmx) obj;
        ajmsVar.b = booleanValue;
        return ajmsVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        boolean z = this.b;
        if (!((aull) this.c.k.b()).a()) {
            return obj2;
        }
        if (!z || obj2 == null) {
            return null;
        }
        ensk h = ajmw.a.h();
        h.Y(ente.a, "BugleProfiles");
        ((enrr) h.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$uiData$2$1", "invokeSuspend", 93, "SendingAsUiAdapterImpl.kt")).q("User has draft text/attachments, showing sending as UI...");
        return obj2;
    }
}
