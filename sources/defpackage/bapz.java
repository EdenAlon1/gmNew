package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Consumer$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bapz implements emyl {
    final /* synthetic */ bara a;
    final /* synthetic */ bvpo b;
    final /* synthetic */ ffkx c;
    final /* synthetic */ boolean d;
    final /* synthetic */ coux e;
    final /* synthetic */ ConversationIdType f;
    final /* synthetic */ aztg g;
    final /* synthetic */ long h;
    final /* synthetic */ String i;
    final /* synthetic */ bdfy j;
    final /* synthetic */ boolean k;
    final /* synthetic */ byyt l;
    final /* synthetic */ String m;

    public bapz(bara baraVar, bvpo bvpoVar, ffkx ffkxVar, boolean z, coux couxVar, ConversationIdType conversationIdType, aztg aztgVar, long j, String str, bdfy bdfyVar, boolean z2, byyt byytVar, String str2) {
        this.a = baraVar;
        this.b = bvpoVar;
        this.c = ffkxVar;
        this.d = z;
        this.e = couxVar;
        this.f = conversationIdType;
        this.g = aztgVar;
        this.h = j;
        this.i = str;
        this.j = bdfyVar;
        this.k = z2;
        this.l = byytVar;
        this.m = str2;
    }

    @Override // defpackage.emyl
    public final /* bridge */ /* synthetic */ Object get() {
        ParticipantsTable.BindData bindData;
        ((bdrr) this.a.e.b()).j(this.b);
        int i = this.c.a ? 104 : !this.d ? 112 : EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        boolean a = baam.c(this.b.a).a();
        if (a) {
            this.a.r.b(this.b.a);
        }
        MessageCoreData a2 = this.a.q.a(this.e, this.f, this.b.a, this.g.g(), i, a ? byzi.VERIFICATION_UNVERIFIED : byzi.VERIFICATION_NA, this.h);
        this.a.x.j(a2);
        ((bdjr) this.a.L.b()).a(a2);
        ((clvi) this.a.E.b()).a(this.f);
        String str = this.b.a;
        enru enruVar = bdqu.a;
        ParticipantsTable.BindData b = ParticipantsTable.b(str);
        if (b != null) {
            bindData = bdqu.d(this.a.d, b, this.i);
            if (bindData != null && !a) {
                if (bindData.u() == -3) {
                    this.a.s.a(bindData).y(115, TimeUnit.SECONDS.toMillis(10L));
                }
                this.a.w.b(bindData);
                b = bindData;
            }
        } else {
            bindData = null;
        }
        if (this.j.b()) {
            if (!((cggu) this.a.R.b()).d() && this.k) {
                ConversationIdType conversationIdType = this.f;
                conversationIdType.getClass();
                cggo.b(conversationIdType);
            } else if (!this.k) {
                ConversationIdType conversationIdType2 = this.f;
                conversationIdType2.getClass();
                cggo.c(conversationIdType2);
            }
        }
        if (!this.c.a) {
            ((bdfl) this.a.h.b()).e(this.f, a2.B(), Long.valueOf(a2.o()), this.l, true);
            this.a.u.c(this.f, b, a2);
            this.a.t.e(this.f, true);
            bara baraVar = this.a;
            final bapy bapyVar = new bapy(this.m, i);
            baraVar.z.ifPresent(new Consumer() { // from class: baqw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final /* synthetic */ void o(Object obj) {
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (bindData != null) {
            ((bczy) this.a.f.b()).R(this.b.a);
        }
        return a2;
    }
}
