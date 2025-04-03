package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpr {
    private static final cskc a = cskc.g("Bugle", "CmsMessagesToTelephonyPersister");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final coxk e;
    private final Context f;
    private final ckds g;
    private final ctwb h;
    private final byzp i;
    private final bcwz j;
    private final aolr k;

    static {
        cfvl.x(227918773, "use_sms_telephony_uri_for_sms_messages");
    }

    public ccpr(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, coxk coxkVar, ckds ckdsVar, ctwb ctwbVar, byzp byzpVar, bcwz bcwzVar, aolr aolrVar, Context context) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = coxkVar;
        this.g = ckdsVar;
        this.h = ctwbVar;
        this.f = context;
        this.i = byzpVar;
        this.j = bcwzVar;
        this.k = aolrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri a(MessagesTable.BindData bindData, engw engwVar) {
        String str;
        String ae;
        lx lxVar;
        MessageCoreData a2 = this.i.a();
        a2.bZ(bindData);
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            a2.aL(this.j.e((PartsTable.BindData) engwVar.get(i)));
        }
        String aA = a2.aA();
        bseh r = ((bczy) this.c.b()).r(a2.z());
        ParticipantsTable.BindData b = ((bdrr) this.b.b()).b(aA);
        b.getClass();
        bindData.C();
        r.getClass();
        cfva cfvaVar = aoqm.a;
        String o = ((Boolean) new emyl() { // from class: aoqe
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(ersy.a("bugle.enable_mi_in_cms_messages_to_telephony_persister", "bugle"));
            }
        }.get()).booleanValue() ? this.k.t(b).o() : b.U();
        boolean cS = a2.cS();
        if (!cS) {
            o.getClass();
        }
        long o2 = a2.o();
        long r2 = a2.r();
        cpxu M = r.M();
        int c = this.h.c();
        int d = a2.d();
        Uri uri = null;
        if (d == 0) {
            if (engwVar.isEmpty()) {
                throw new IllegalArgumentException("No parts provided for SMS message");
            }
            if (engwVar.size() > 1) {
                throw new IllegalArgumentException("More than 1 part provided for an SMS message.");
            }
            List L = ((bczy) this.c.b()).L(r.C());
            boolean booleanValue = ((Boolean) new emyl() { // from class: aoqe
                @Override // defpackage.emyl
                public final Object get() {
                    return Boolean.valueOf(ersy.a("bugle.enable_mi_in_cms_messages_to_telephony_persister", "bugle"));
                }
            }.get()).booleanValue();
            if (r.k() != 0) {
                if (booleanValue) {
                    engw n = engw.n(L);
                    aolr aolrVar = this.k;
                    ArrayList arrayList = new ArrayList(n.size());
                    int size2 = n.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList.add(aolrVar.t((ParticipantsTable.BindData) n.get(i2)).o());
                    }
                    str = TextUtils.join(" ", engw.n(arrayList));
                } else {
                    str = bdqu.v(L);
                }
                emxf.b(!TextUtils.isEmpty(str), "Not able to get participants for mass text SMS");
            } else {
                if (L.isEmpty()) {
                    throw new IllegalArgumentException(String.format("1:1 conversation does not have participant, conversation id = %s", r.C()));
                }
                if (((enou) L).c > 1) {
                    throw new IllegalArgumentException(String.format("1: 1 conversation has more than one participants, conversation id = %s", r.C()));
                }
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) L.get(0);
                String o3 = booleanValue ? this.k.q(bindData2).o() : bindData2.U();
                bindData2.S();
                o3.getClass();
                str = o3;
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ((MessageData) a2).i.get(0);
            UUID aI = a2.aI();
            Optional ad = a2.ad();
            if (messagePartCoreData.ae() == null) {
                csjb e = a.e();
                e.I("MessagePartCoreData's text is null! Continuing with empty part data.");
                e.A("draftId", aI);
                e.z("sentTimestamp", r2);
                e.z("receivedTimestampInMs", o2);
                e.A("threadId", M);
                e.r();
                ae = "";
            } else {
                ae = messagePartCoreData.ae();
                ae.getClass();
            }
            Uri n2 = this.e.n(this.f, Telephony.Sms.CONTENT_URI, c, str, ae, o2, 0, true == cS ? 2 : 1, M, aI, ad);
            if (n2 != null) {
                this.e.R(n2, 0, r2);
                uri = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, ContentUris.parseId(n2));
            }
        } else if (d == 1 || d == 3 || d == 7) {
            long a3 = cpxv.a(M);
            if (cS) {
                ConversationIdType z = a2.z();
                cgtf cgtfVar = new cgtf();
                cgtfVar.b = this.g.g(a2);
                ArrayList a4 = ((bdfw) this.d.b()).a(z, true);
                String av = a2.av();
                lz aa = this.e.aa((String[]) a4.toArray(new String[0]), a2, cgtfVar, 604800L, a2.b(), o2, !TextUtils.isEmpty(av) ? av.getBytes(StandardCharsets.US_ASCII) : null);
                aa.getClass();
                Uri l = this.e.l(this.f, aa, c, null, a3, null);
                if (l != null) {
                    uri = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(l));
                }
            } else {
                o.getClass();
                try {
                    lx lxVar2 = new lx();
                    lxVar2.b(new lg(o));
                    if (!TextUtils.isEmpty(a2.au())) {
                        lxVar2.g(new lg(a2.au()));
                    }
                    lxVar2.b = this.g.g(a2);
                    lxVar2.f(r2 / 1000);
                    lxVar2.i(new byte[0]);
                    if (a2.cX()) {
                        lxVar2.e();
                    }
                    String av2 = a2.av();
                    if (!TextUtils.isEmpty(av2)) {
                        lxVar2.i(av2.getBytes());
                    }
                    lxVar = lxVar2;
                } catch (li unused) {
                    lxVar = null;
                }
                lxVar.getClass();
                Uri k = this.e.k(this.f, lxVar, c, null, a3, o2 / 1000, null);
                if (k != null) {
                    uri = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(k));
                }
            }
        }
        Uri uri2 = uri;
        if (uri2 != null && bindData.s() >= 100 && bindData.s() <= 117) {
            this.e.ai(uri2, bindData.w());
        }
        return uri2;
    }
}
