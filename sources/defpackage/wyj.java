package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wyj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wyk b;
    final /* synthetic */ alxr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyj(wyk wykVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wykVar;
        this.c = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wyj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            wyk wykVar = this.b;
            MessageId b = this.c.b();
            this.a = 1;
            if (wykVar.d.a(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wyj(this.b, this.c, ffguVar);
    }
}
