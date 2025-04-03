package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyrq extends ffhv implements ffjm {
    final /* synthetic */ cyrs a;
    final /* synthetic */ ResolvedRecipient b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyrq(cyrs cyrsVar, ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cyrsVar;
        this.b = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyrq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((aigz) this.a.e.b()).h(new aino(this.b));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyrq(this.a, this.b, ffguVar);
    }
}
