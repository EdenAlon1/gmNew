package com.google.android.apps.messaging.shared.datamodel.action;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.chooser.ChooserTarget;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.ames;
import defpackage.amet;
import defpackage.azwd;
import defpackage.azwi;
import defpackage.bafj;
import defpackage.bbfa;
import defpackage.bdgq;
import defpackage.byyr;
import defpackage.crpr;
import defpackage.dtve;
import defpackage.efbd;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class GetFrecentConversationsAction extends Action<List<ChooserTarget>> {
    public static final Parcelable.Creator<Action<List<ChooserTarget>>> CREATOR = new bafj();
    private final ffbr a;
    private final crpr b;
    private final azwd c;

    /* compiled from: PG */
    public interface a {
        bbfa aV();
    }

    public GetFrecentConversationsAction(ffbr ffbrVar, crpr crprVar, azwd azwdVar) {
        super(eogt.GET_FRECENT_CONVERSATIONS_ACTION);
        this.a = ffbrVar;
        this.b = crprVar;
        this.c = azwdVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("GetFrecentConversationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ekzz f = eleg.f("GetFrecentConversationsAction#getConversationsByFrecency");
        try {
            efbd.b();
            dtve dtveVar = (dtve) this.a.b();
            ArrayList arrayList = new ArrayList();
            Cursor query = dtveVar.j().query("conversation_frecency_view", (String[]) azwi.c.toArray(new String[0]), null, null, null, null, null);
            if (query != null) {
                int i = 1;
                while (query.moveToNext()) {
                    try {
                        azwd azwdVar = this.c;
                        crpr crprVar = this.b;
                        ConversationIdType b = bdgq.b(query.getString(0));
                        String c = azwdVar.c.c(query.getString(1));
                        int i2 = query.getInt(4);
                        Uri parse = Uri.parse(query.getString(2));
                        boolean b2 = byyr.b(i2);
                        int dimension = (int) azwdVar.b.getResources().getDimension(R.dimen.contact_icon_view_normal_size);
                        Bitmap b3 = crprVar.b(azwdVar.b, parse, dimension, dimension, 0, !b2);
                        Icon createWithBitmap = b3 != null ? Icon.createWithBitmap(b3) : null;
                        float f2 = (float) (1.0d / i);
                        Bundle bundle = new Bundle();
                        ConversationId a2 = ((ames) azwdVar.d.b()).a(b, query.getString(5), query.getInt(6) > 0);
                        amet.c(a2, bundle);
                        bundle.putBoolean("via_deep_link", true);
                        arrayList.add(new ChooserTarget(c, createWithBitmap, f2, azwdVar.a, bundle));
                        i++;
                    } finally {
                    }
                }
            }
            if (query != null) {
                query.close();
            }
            f.close();
            return arrayList;
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.GetFrecentConversations.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public GetFrecentConversationsAction(ffbr ffbrVar, crpr crprVar, azwd azwdVar, Parcel parcel) {
        super(parcel, eogt.GET_FRECENT_CONVERSATIONS_ACTION);
        this.a = ffbrVar;
        this.b = crprVar;
        this.c = azwdVar;
    }
}
