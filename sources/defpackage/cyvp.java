package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyvp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cyvq b;
    final /* synthetic */ Recipient c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyvp(cyvq cyvqVar, Recipient recipient, long j, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyvqVar;
        this.c = recipient;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyvp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.b.f(this.c);
            this.b.c.f(cyxc.b);
            long j = this.d;
            if (!kaa.f(j, 0L)) {
                this.b.d.f(new kaa(j));
            }
            this.a = 1;
            if (ffsw.c(100L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.c.f(cyxc.c);
        ((akzt) this.b.a.b()).e("Bugle.MiniConversationDetailsPage.Open.Count", this.e - 1);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyvp(this.b, this.c, this.d, this.e, ffguVar);
    }
}
