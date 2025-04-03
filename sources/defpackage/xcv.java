package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xcv extends ffhv implements ffjo {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ ffbr e;
    final /* synthetic */ ffhd f;
    final /* synthetic */ ampf g;
    final /* synthetic */ alxl h;
    final /* synthetic */ ConversationId i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcv(ffbr ffbrVar, ffhd ffhdVar, ampf ampfVar, alxl alxlVar, ConversationId conversationId, ffgu ffguVar) {
        super(4, ffguVar);
        this.e = ffbrVar;
        this.f = ffhdVar;
        this.g = ampfVar;
        this.h = alxlVar;
        this.i = conversationId;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        xcv xcvVar = new xcv(this.e, this.f, this.g, this.h, this.i, (ffgu) obj4);
        xcvVar.b = (engw) obj;
        xcvVar.c = booleanValue;
        xcvVar.d = (alxj) obj3;
        return xcvVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            boolean z = this.c;
            ?? r6 = this.d;
            if (((aspy) this.e.b()).a() || !z) {
                return obj2;
            }
            ffhd ffhdVar = this.f;
            ampf ampfVar = this.g;
            alxl alxlVar = this.h;
            ConversationId conversationId = this.i;
            ffhd a = ekxi.a(ffhdVar);
            xcu xcuVar = new xcu(null, ampfVar, (engw) obj2, r6, alxlVar, conversationId);
            this.b = null;
            this.a = 1;
            obj = ffra.a(a, xcuVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return (engw) obj;
    }
}
