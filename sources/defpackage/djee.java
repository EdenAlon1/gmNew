package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djee extends dkji {
    final /* synthetic */ djef a;

    public djee(djef djefVar) {
        this.a = djefVar;
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void k() {
        this.a.a.aU(this);
        ehyt ehytVar = new ehyt();
        ehytVar.b(this.a.b);
        ehytVar.c(MessagingResult.d);
        this.a.set(ehytVar.a());
    }
}
