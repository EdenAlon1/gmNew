package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkx {
    public static final Object a(axrc axrcVar, hfd hfdVar) {
        Object obj;
        hfdVar.v(433349789);
        boolean z = axrcVar instanceof axqd;
        ffhe ffheVar = ffhe.a;
        if (z) {
            try {
                obj = ((axqd) axrcVar).c();
            } catch (NullPointerException e) {
                ((enrr) ((enrr) zkw.a.j()).g(e).h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListScrollHelperKt", "collectMessage", 70, "PagedMessageListScrollHelper.kt")).q("Failed to get state flow value to display");
                obj = null;
            }
        } else {
            obj = hkt.b(axrcVar, axrcVar.b(), ffheVar, hfdVar, 0).a();
        }
        hfdVar.o();
        return obj;
    }
}
