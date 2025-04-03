package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aarr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aasc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aarr(aasc aascVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aascVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aarr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aasc aascVar = this.b;
            this.a = 1;
            obj = fgbj.a(aascVar.d, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ffdx.U((List) obj);
        if (resolvedRecipient == null) {
            return ffcu.a;
        }
        final aasc aascVar2 = this.b;
        aascVar2.g.b(new ffji() { // from class: aarq
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                aasc aascVar3 = aasc.this;
                return ((cvmu) aascVar3.j.b()).a((ajiy) obj2, resolvedRecipient, aascVar3.e, cuea.c);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aarr(this.b, ffguVar);
    }
}
