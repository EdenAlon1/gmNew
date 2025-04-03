package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djbd extends ernr implements dkgk {
    private final Conversation a;

    public djbd(Conversation conversation) {
        this.a = conversation;
    }

    @Override // defpackage.dkgk
    public final void a(dkgi dkgiVar) {
        dkgiVar.e(this);
        ehyt ehytVar = new ehyt();
        ehytVar.b(this.a);
        ehytVar.c(MessagingResult.d);
        set(ehytVar.a());
    }

    @Override // defpackage.dkgk
    public final void c(dkgi dkgiVar, dkgj dkgjVar) {
        dkgiVar.e(this);
        eibw d = MessagingResult.d();
        d.c(16);
        d.b(7);
        MessagingResult e = d.e();
        ehyt ehytVar = new ehyt();
        ehytVar.b(this.a);
        ehytVar.c(e);
        set(ehytVar.a());
    }

    @Override // defpackage.dkgk
    public final void d(dkgi dkgiVar, int i, String str) {
        dkgiVar.e(this);
        ehyt ehytVar = new ehyt();
        ehytVar.b(this.a);
        ehytVar.c(djhf.a(i));
        set(ehytVar.a());
    }

    @Override // defpackage.dkgk
    public final void e() {
    }

    @Override // defpackage.dkgk
    public final void f() {
    }
}
