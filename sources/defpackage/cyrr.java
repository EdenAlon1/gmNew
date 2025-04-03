package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyrr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cyrs b;
    final /* synthetic */ ResolvedRecipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyrr(cyrs cyrsVar, ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyrsVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyrr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cyrs cyrsVar = this.b;
            this.a = 1;
            obj = fgbj.a(cyrsVar.c, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        aqux f = ((alxj) obj).f();
        if (f == null) {
            throw new IllegalArgumentException("Conversation self identity is missing");
        }
        ((aigz) this.b.e.b()).h(new ainz(this.c, f));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyrr(this.b, this.c, ffguVar);
    }
}
