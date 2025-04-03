package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajsz extends ffhv implements ffjm {
    final /* synthetic */ MessageIdType a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajsz(ffgu ffguVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.a = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajsz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String[] strArr;
        Object apply;
        ffci.b(obj);
        String[] strArr2 = boao.a;
        Integer b = boao.b();
        if (b.intValue() == Integer.MAX_VALUE) {
            strArr = boao.a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("messages._id");
            engrVar.h("messages.received_timestamp");
            engrVar.h("participants._id");
            engrVar.h("participants.sub_id");
            engrVar.h("participants.normalized_destination");
            engrVar.h("participants.display_destination");
            engrVar.h("participants.full_name");
            engrVar.h("participants.first_name");
            engrVar.h("group_concat(quote(parts._id), '|')");
            engrVar.h("group_concat(quote(parts.text), '|')");
            engrVar.h("group_concat(quote(parts.uri), '|')");
            engrVar.h("group_concat(quote(parts.content_type), '|')");
            if (b.intValue() >= 26000) {
                engrVar.h("group_concat(quote(parts.file_name), '|')");
            }
            if (b.intValue() >= 26040) {
                engrVar.h("group_concat(quote(parts.duration), '|')");
            }
            engrVar.h("link_preview.trigger_url");
            engrVar.h("link_preview.expiration_time_millis");
            engrVar.h("link_preview.link_title");
            engrVar.h("link_preview.link_image_url");
            if (b.intValue() >= 22020) {
                engrVar.h("link_preview.link_preview_failed");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        boal boalVar = new boal(strArr);
        boalVar.z("queryMessageData");
        apply = new ajta(this.a).apply(new boan());
        boalVar.k(new boam((boan) apply));
        bnlw bnlwVar = (bnlw) ((boaj) boalVar.b().o()).cS();
        if (bnlwVar == null) {
            throw new IllegalArgumentException("Replied-to message with ID " + this.a + " does not exist");
        }
        entd entdVar = ajqu.a;
        MessageIdType D = bnlwVar.d.D();
        D.getClass();
        MessagesTable.BindData bindData = bnlwVar.d;
        bindData.getClass();
        ParticipantsTable.BindData bindData2 = bnlwVar.a;
        bindData2.getClass();
        PartsTable.BindData[] bindDataArr = bnlwVar.b;
        bindDataArr.getClass();
        return new ajra(D, bindData, bindData2, ffdo.L(bindDataArr), bnlwVar.c.s() != null ? bnlwVar.c : null);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajsz ajszVar = new ajsz(ffguVar, this.a);
        ajszVar.b = obj;
        return ajszVar;
    }
}
