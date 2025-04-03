package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crlq extends ffhv implements ffjm {
    final /* synthetic */ crlt a;
    final /* synthetic */ MessageIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crlq(crlt crltVar, MessageIdType messageIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = crltVar;
        this.b = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((crlq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.b.a()) {
            ((cgrq) this.a.a.b()).f(this.b, cgrr.TOOLSTONE_DELETION);
            return null;
        }
        ((cgrq) this.a.a.b()).d(this.b);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new crlq(this.a, this.b, ffguVar);
    }
}
