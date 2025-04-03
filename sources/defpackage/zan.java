package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zan extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zan(zao zaoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zaoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zan) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            zao zaoVar = this.b;
            this.a = 1;
            obj = fgbj.a(zaoVar.e, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ffdx.U((List) obj);
        if (resolvedRecipient == null) {
            return ffcu.a;
        }
        ((tac) this.b.g.b()).a(new tad(resolvedRecipient, this.b.d, 1, 9));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zan(this.b, ffguVar);
    }
}
