package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apsi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apsk b;
    final /* synthetic */ aqge c;
    final /* synthetic */ BugleConversationId d;
    final /* synthetic */ aqux e;
    final /* synthetic */ appw f;
    final /* synthetic */ bdhg g;
    final /* synthetic */ Instant h;
    final /* synthetic */ Instant i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apsi(apsk apskVar, aqge aqgeVar, BugleConversationId bugleConversationId, aqux aquxVar, appw appwVar, bdhg bdhgVar, Instant instant, Instant instant2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = apskVar;
        this.c = aqgeVar;
        this.d = bugleConversationId;
        this.e = aquxVar;
        this.f = appwVar;
        this.g = bdhgVar;
        this.h = instant;
        this.i = instant2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apsi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        apsk apskVar = this.b;
        aqge aqgeVar = this.c;
        BugleConversationId bugleConversationId = this.d;
        aqux aquxVar = this.e;
        appw appwVar = this.f;
        bdhg bdhgVar = this.g;
        Instant instant = this.h;
        Instant instant2 = this.i;
        this.a = 1;
        Object d = apskVar.d(aqgeVar, bugleConversationId, aquxVar, appwVar, bdhgVar, instant, instant2, 1, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apsi(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ffguVar);
    }
}
