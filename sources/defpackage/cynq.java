package defpackage;

import android.R;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cynq implements cvrj {
    public final ConversationDetailsActivity a;
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;

    public cynq(ConversationDetailsActivity conversationDetailsActivity, ffbr ffbrVar, ffbr ffbrVar2, final eito eitoVar, final ejgc ejgcVar, ffbr ffbrVar3) {
        eitoVar.getClass();
        ejgcVar.getClass();
        ffbrVar3.getClass();
        this.a = conversationDetailsActivity;
        this.b = ffbrVar;
        this.d = ffbrVar2;
        this.c = ffbrVar3;
        Optional optional = (Optional) ffbrVar.b();
        final ffji ffjiVar = new ffji() { // from class: cynn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((cynk) obj).getClass();
                cynq cynqVar = this;
                eiwy f = eiwz.f(cynqVar.a);
                f.d(ejgc.class);
                f.d(ejed.class);
                eiwz a = f.a();
                eito eitoVar2 = eito.this;
                eitoVar2.g(a);
                eitoVar2.e(new cynp(cynqVar));
                eitoVar2.e(new ejgb(ejgcVar));
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: cyno
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.cvrj
    public final void a(ConversationId conversationId, String str, engw engwVar, eisx eisxVar) {
        Bundle bundle = new Bundle(5);
        bundle.putParcelable("conversation_mapi_id", conversationId);
        bundle.putString("group_name", str);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        enqv it = engwVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            Recipient recipient = (Recipient) it.next();
            aoku g = recipient.g();
            g.getClass();
            String a = aswb.a() ? cuxh.a(recipient.x(true)) : recipient.x(true);
            a.getClass();
            arrayList.add(new ChipData(g, a, recipient.f().k, recipient.b(), true));
        }
        bundle.putParcelableArrayList("identities", arrayList);
        bundle.putInt("contact_picker_source", 2);
        bundle.putInt("selection_mode", cwjb.b.ordinal());
        cvqu a2 = cvqu.a(eisxVar);
        a2.at(bundle);
        fr a3 = this.a.a();
        ea h = a3.h("ConversationDetailsFragment");
        if (h == null) {
            return;
        }
        cg cgVar = new cg(a3);
        cgVar.n(h);
        cgVar.v("ConversationDetailsFragment");
        cgVar.j();
        a3.an();
        cg cgVar2 = new cg(a3);
        cgVar2.x(R.id.content, a2, "GroupRenameFragment");
        cgVar2.c();
    }

    public final void b() {
        this.a.finishAfterTransition();
    }

    public final void c() {
        fr a = this.a.a();
        ea h = a.h("GroupRenameFragment");
        if (h == null) {
            b();
            return;
        }
        cg cgVar = new cg(a);
        cgVar.n(h);
        cgVar.c();
        ea h2 = a.h("ConversationDetailsFragment");
        if (h2 == null) {
            return;
        }
        a.as(h2.H);
    }
}
