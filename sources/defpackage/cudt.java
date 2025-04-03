package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cudt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cudw b;
    final /* synthetic */ Conversation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cudt(cudw cudwVar, Conversation conversation, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cudwVar;
        this.c = conversation;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cudt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        this.a = 1;
        Object f = cudwVar.f(conversation, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cudt(this.b, this.c, ffguVar);
    }
}
