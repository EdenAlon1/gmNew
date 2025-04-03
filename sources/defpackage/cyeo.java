package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyeo extends ffhv implements ffjm {
    final /* synthetic */ ResolvedRecipient a;
    final /* synthetic */ cyep b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyeo(ResolvedRecipient resolvedRecipient, cyep cyepVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = resolvedRecipient;
        this.b = cyepVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyeo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ResolvedRecipient resolvedRecipient = this.a;
        if (resolvedRecipient != null) {
            cyep cyepVar = this.b;
            cyepVar.e.h(new aijl(resolvedRecipient.e(), resolvedRecipient.g(), 10, ffel.a));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyeo(this.a, this.b, ffguVar);
    }
}
