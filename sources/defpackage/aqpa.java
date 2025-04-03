package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqpa extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqpa(ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqpa) c((ResolvedRecipient) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffji ffjiVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffjiVar = (ffji) this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) this.b;
            ffji ffjiVar2 = this.c;
            elfl b = resolvedRecipient.E(1).b();
            b.getClass();
            this.b = ffjiVar2;
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            ffjiVar = ffjiVar2;
        }
        obj.getClass();
        return ffjiVar.invoke(obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqpa aqpaVar = new aqpa(this.c, ffguVar);
        aqpaVar.b = obj;
        return aqpaVar;
    }
}
