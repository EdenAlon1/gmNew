package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aabg extends ffhv implements ffjm {
    final /* synthetic */ aabi a;
    final /* synthetic */ MessageId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aabg(aabi aabiVar, MessageId messageId, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aabiVar;
        this.b = messageId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aabg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        axnw.f(this.a.d.R(this.b), "Failed to load link preview");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aabg(this.a, this.b, ffguVar);
    }
}
