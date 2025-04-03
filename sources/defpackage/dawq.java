package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawq extends ffhv implements ffjn {
    final /* synthetic */ LoadMessagesReceiver a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawq(LoadMessagesReceiver loadMessagesReceiver, long j, boolean z, ffgu ffguVar) {
        super(3, ffguVar);
        this.a = loadMessagesReceiver;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new dawq(this.a, this.b, this.c, (ffgu) obj3).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        long a = ((cqoh) this.a.l().b()).a();
        ensk h = LoadMessagesReceiver.d.h();
        h.Y(ente.a, "BugleTests");
        ((enrr) h.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver$loadMessagesFromFile$4", "invokeSuspend", 153, "LoadMessagesReceiver.kt")).s("Completed in %d ms", a - this.b);
        if (this.c) {
            ensk h2 = LoadMessagesReceiver.d.h();
            h2.Y(ente.a, "BugleTests");
            ((enrr) h2.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver$loadMessagesFromFile$4", "invokeSuspend", 155, "LoadMessagesReceiver.kt")).q("Requesting full blocking sync");
            ((coxg) this.a.g().b()).q(true);
            ((coxg) this.a.g().b()).k(eqqh.FAKE_MESSAGE_GENERATOR);
        }
        return ffcu.a;
    }
}
