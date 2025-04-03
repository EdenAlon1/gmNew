package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aakt extends ffhv implements ffjm {
    final /* synthetic */ aalh a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ apor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aakt(aalh aalhVar, MessageId messageId, apor aporVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aalhVar;
        this.b = messageId;
        this.c = aporVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aakt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.h.a(this.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aakt(this.a, this.b, this.c, ffguVar);
    }
}
