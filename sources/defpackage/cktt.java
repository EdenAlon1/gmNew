package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cktt implements emyl {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ SelfIdentityId c;
    final /* synthetic */ cknh d;
    final /* synthetic */ aoku e;
    final /* synthetic */ ConversationIdType f;
    final /* synthetic */ cktv g;
    final /* synthetic */ String h;
    final /* synthetic */ List i;

    public cktt(String str, String str2, SelfIdentityId selfIdentityId, cknh cknhVar, aoku aokuVar, ConversationIdType conversationIdType, cktv cktvVar, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = selfIdentityId;
        this.d = cknhVar;
        this.e = aokuVar;
        this.f = conversationIdType;
        this.g = cktvVar;
        this.h = str3;
        this.i = list;
    }

    @Override // defpackage.emyl
    public final /* synthetic */ Object get() {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs");
        bsoeVar.m();
        bsoeVar.Q(this.a);
        bsoeVar.N(this.b);
        bsoeVar.B(ckte.j);
        bsoeVar.n(((SelfIdentityIdImpl) this.c).a);
        bsoeVar.A(0);
        String str = this.h;
        if (str == null || str.length() == 0) {
            bsoeVar.D(byyy.NAME_IS_AUTOMATIC);
        }
        bsoeVar.O(this.d);
        Optional e = this.e.e();
        e.getClass();
        awui awuiVar = (awui) fflm.b(e);
        bsoeVar.S(awuiVar != null ? awuiVar.d : null);
        bsoeVar.R(Optional.of(this.g.e.f()));
        bsoeVar.f(this.f);
        ((bczy) this.g.d.b()).V(this.f, this.h, 2, false);
        String[] strArr2 = brww.a;
        brwj brwjVar = new brwj();
        brwjVar.f("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs");
        brwjVar.a(new cktr(this.f));
        brwjVar.d();
        String[] strArr3 = bsdr.a;
        bsdi bsdiVar = new bsdi();
        bsdiVar.f("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs");
        bsdiVar.c(new ckts(this.f));
        bsdiVar.d();
        return Boolean.valueOf(((bczy) this.g.d.b()).ap(this.e.e(), this.i, this.f, false));
    }
}
