package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cudv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cudw b;
    final /* synthetic */ Conversation c;
    final /* synthetic */ cuex d;
    final /* synthetic */ String e;
    final /* synthetic */ cuea f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cudv(cudw cudwVar, Conversation conversation, cuex cuexVar, String str, cuea cueaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cudwVar;
        this.c = conversation;
        this.d = cuexVar;
        this.e = str;
        this.f = cueaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cudv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cudw cudwVar = this.b;
        Conversation conversation = this.c;
        cuex cuexVar = this.d;
        String str = this.e;
        cuea cueaVar = this.f;
        this.a = 1;
        Object g = cudwVar.g(conversation, cuexVar, str, cueaVar, this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cudv(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
