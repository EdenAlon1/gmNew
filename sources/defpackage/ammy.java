package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ammy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amna b;
    final /* synthetic */ List c;
    final /* synthetic */ amfx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ammy(amna amnaVar, List list, amfx amfxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amnaVar;
        this.c = list;
        this.d = amfxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ammy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            amna amnaVar = this.b;
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ffdx.T(this.c);
            amfx amfxVar = this.d;
            this.a = 1;
            if (amnaVar.a(resolvedRecipient, amfxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ammy(this.b, this.c, this.d, ffguVar);
    }
}
