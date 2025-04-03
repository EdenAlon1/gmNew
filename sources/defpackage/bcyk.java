package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bcyk implements bcyg {
    private final ffbr a;
    private emyl b = emys.a(new emyl() { // from class: bcyi
        @Override // defpackage.emyl
        public final Object get() {
            return InvalidConversationId.a;
        }
    });
    protected final bcym c;
    public bejf d;
    public final ffbr e;
    public final ffbr f;

    /* compiled from: PG */
    public interface a {
        bcym bA();

        ffbr gk();

        ffbr gm();

        ffbr gw();
    }

    public bcyk() {
        a aVar = (a) ctba.a(a.class);
        this.a = aVar.gm();
        this.f = aVar.gk();
        this.e = aVar.gw();
        this.c = aVar.bA();
        String[] strArr = bgmn.a;
        bfle.a(bdgq.a, new cpxu(), byyy.NAME_IS_AUTOMATIC, byyt.UNARCHIVED, ayhd.b(0), bdhe.b(-1L), new cfmh(0L), bdhb.a, ardn.VMT_STATUS_UNKNOWN, bdgq.a, new dtrr(bgmn.d()));
        String[] strArr2 = bfkq.a;
        this.d = bejh.a(bdgq.a, new cpxu(), byyy.NAME_IS_AUTOMATIC, byyt.UNARCHIVED, ayhd.b(0), bdhe.b(-1L), new cfmh(0L), bdhb.a, ardn.VMT_STATUS_UNKNOWN, bdgq.a, new dtrr(bfkq.e()));
    }

    public abstract String A(String str);

    public abstract boolean D();

    public abstract boolean K();

    public final int L() {
        return this.d.f();
    }

    public final int M() {
        bejf bejfVar = this.d;
        bejfVar.az(57, "sub_id");
        return bejfVar.af;
    }

    public final long N() {
        bejf bejfVar = this.d;
        bejfVar.az(15, "sort_timestamp");
        return bejfVar.p;
    }

    public final ConversationId O() {
        ConversationId conversationId = (ConversationId) this.b.get();
        emxf.a(conversationId != InvalidConversationId.a);
        return conversationId;
    }

    public final amny P() {
        bejf bejfVar = this.d;
        bejfVar.az(75, "conversation_id");
        return bejfVar.ax.b() ? amny.b : amny.c;
    }

    public final ConversationIdType Q() {
        return this.d.k();
    }

    public final byyt R() {
        bejf bejfVar = this.d;
        bejfVar.az(14, "archive_status");
        return bejfVar.o;
    }

    public final void S(final bejf bejfVar) {
        this.d = bejfVar;
        if (bejfVar.k().b()) {
            return;
        }
        this.b = emys.a(new emyl() { // from class: bcyj
            @Override // defpackage.emyl
            public final Object get() {
                ames amesVar = (ames) bcyk.this.f.b();
                bejf bejfVar2 = bejfVar;
                return amesVar.a(bejfVar2.k(), bejfVar2.o(), bejfVar2.p());
            }
        });
    }

    public final void T(bfkf bfkfVar) {
        S((bejf) bfkfVar.cO());
    }

    public final boolean U() {
        bejf bejfVar = this.d;
        bejfVar.az(43, "has_been_e2ee");
        return bejfVar.R;
    }

    public final boolean V() {
        bejf bejfVar = this.d;
        bejfVar.az(26, "include_email_addr");
        return bejfVar.A;
    }

    public final boolean W() {
        return this.d.p();
    }

    public final boolean X() {
        return byyr.b(L());
    }

    public final boolean Y() {
        bejf bejfVar = this.d;
        bejfVar.az(44, "marked_as_unread");
        return bejfVar.S;
    }

    public abstract int a();

    public abstract int d();

    public abstract long e();

    public abstract SelfIdentityId f();

    public abstract MessageUsageStatisticsData h(eooi eooiVar, DeviceData deviceData, long j);

    public abstract MessageIdType i();

    public abstract cpxu j();

    public abstract String s();

    public abstract String w();

    public abstract String x();

    public abstract String y();
}
