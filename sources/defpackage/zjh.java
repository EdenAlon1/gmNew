package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zjt b;
    final /* synthetic */ alxr c;
    final /* synthetic */ ffix d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjh(zjt zjtVar, alxr alxrVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zjtVar;
        this.c = alxrVar;
        this.d = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zjh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aawn aawnVar = (aawn) this.b.f.b();
            MessageId b = this.c.b();
            this.a = 1;
            if (aawnVar.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.d.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zjh(this.b, this.c, this.d, ffguVar);
    }
}
