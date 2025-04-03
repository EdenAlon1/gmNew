package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyux extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cyvb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyux(cyvb cyvbVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = cyvbVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cyux cyuxVar = new cyux(this.d, (ffgu) obj4);
        cyuxVar.a = (engw) obj;
        cyuxVar.b = (ResolvedRecipient) obj2;
        cyuxVar.c = (cyxc) obj3;
        return cyuxVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        final ?? r4 = obj2 == null ? (ResolvedRecipient) ffdx.M(r1) : obj2;
        if (r4 == 0) {
            return null;
        }
        if ((obj2 == null && ((engw) r1).size() > 1) || obj3 == cyxc.e || r4.A() || r4.z() || r4.D()) {
            return null;
        }
        String string = this.d.a.getString(R.string.action_add_contact);
        string.getClass();
        final cyvb cyvbVar = this.d;
        return new dlsr(string, dmzz.cK, false, false, false, false, null, false, null, new ffix() { // from class: cyuw
            @Override // defpackage.ffix
            public final Object invoke() {
                cyvb.this.b.h(new aino(r4));
                return ffcu.a;
            }
        }, 1020);
    }
}
