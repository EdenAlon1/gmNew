package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amif extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amih b;
    final /* synthetic */ Conversation c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amif(amih amihVar, Conversation conversation, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amihVar;
        this.c = conversation;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amif) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        amih amihVar = this.b;
        Conversation conversation = this.c;
        int i2 = this.d;
        this.a = 1;
        Object a = ffra.a(ekxi.a(amihVar.b), new amie(null, conversation, amihVar, i2), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amif(this.b, this.c, this.d, ffguVar);
    }
}
