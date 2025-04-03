package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cydt implements ffix {
    final /* synthetic */ cydx a;
    final /* synthetic */ cyee b;

    public cydt(cydx cydxVar, cyee cyeeVar) {
        this.a = cydxVar;
        this.b = cyeeVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ResolvedRecipient resolvedRecipient = this.b.b;
        cydx cydxVar = this.a;
        axol.k(cydxVar.d, null, new cydw(resolvedRecipient, cydxVar, null), 3);
        return ffcu.a;
    }
}
