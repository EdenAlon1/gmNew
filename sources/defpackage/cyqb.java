package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyqb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cyqd b;
    final /* synthetic */ aqux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyqb(cyqd cyqdVar, aqux aquxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyqdVar;
        this.c = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyqb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cyqd cyqdVar = this.b;
            this.a = 1;
            obj = fgbj.a(cyqdVar.b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ffdx.T((List) obj);
        resolvedRecipient.getClass();
        ((aigz) this.b.d.b()).h(new ainz(resolvedRecipient, this.c));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyqb(this.b, this.c, ffguVar);
    }
}
