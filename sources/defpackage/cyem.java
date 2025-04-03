package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyem implements ffix {
    final /* synthetic */ cyep a;
    final /* synthetic */ cyew b;

    public cyem(cyep cyepVar, cyew cyewVar) {
        this.a = cyepVar;
        this.b = cyewVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ResolvedRecipient resolvedRecipient = this.b.b;
        cyep cyepVar = this.a;
        axol.k(cyepVar.d, null, new cyen(resolvedRecipient, cyepVar, null), 3);
        return ffcu.a;
    }
}
