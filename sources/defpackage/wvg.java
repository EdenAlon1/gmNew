package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wvh b;
    final /* synthetic */ alxj c;
    final /* synthetic */ engw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvg(wvh wvhVar, alxj alxjVar, engw engwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wvhVar;
        this.c = alxjVar;
        this.d = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wvg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = this.b.c.c().b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        boolean z = ((alxg) obj).e().g;
        wvh wvhVar = this.b;
        ConversationId c = this.c.c();
        c.getClass();
        String i2 = this.c.i();
        i2.getClass();
        engw engwVar = this.d;
        engwVar.getClass();
        wvhVar.b.h(new ainu(new cvqo(c, i2, engwVar, z)));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wvg(this.b, this.c, this.d, ffguVar);
    }
}
