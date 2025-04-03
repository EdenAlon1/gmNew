package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ykb extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;

    public ykb(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ykb ykbVar = new ykb((ffgu) obj3);
        ykbVar.a = booleanValue;
        ykbVar.b = (xls) obj2;
        return ykbVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        ensk g = yks.a.g();
        g.Y(ente.a, "BugleComposeRow2");
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl$enabledFlow$3", "invokeSuspend", 115, "SendButtonUiAdapterImpl.kt")).H("SendButtonUiAdapterImpl.enabledFlow sendingInProgress %s, disabledReason %s", z, obj2);
        boolean z2 = false;
        if (!z && obj2 == null) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
