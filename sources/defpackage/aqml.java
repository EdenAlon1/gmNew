package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqml {
    public final ParticipantsTable.BindData a;
    public final bqwx b;
    public final ProfilesTable.BindData c;
    private final ffbr d;
    private final ffbr e;

    public aqml(ffbr ffbrVar, ffbr ffbrVar2, ParticipantsTable.BindData bindData, bqwx bqwxVar, ProfilesTable.BindData bindData2) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.a = bindData;
        this.b = bqwxVar;
        this.c = bindData2;
    }

    public final Uri a(Recipient recipient, crjg crjgVar) {
        Uri k;
        crjgVar.getClass();
        if (crjgVar != crjg.b) {
            Uri a = ((azze) this.e.b()).a(this.a);
            a.getClass();
            return a;
        }
        cjwi p = recipient.p();
        if (p == cjwi.PROFILE_CONTACT_SOURCE || p == cjwi.PROFILE_UNSPECIFIED_SOURCE) {
            bqwx bqwxVar = this.b;
            if ((bqwxVar != null ? bqwxVar.k() : null) != null) {
                k = this.b.k();
                return c(recipient, k);
            }
        }
        k = this.a.x();
        return c(recipient, k);
    }

    public final cjwi b() {
        cjwi G = this.a.G();
        G.getClass();
        return G;
    }

    public final Uri c(Recipient recipient, Uri uri) {
        crji crjiVar = (crji) this.d.b();
        String w = recipient.w();
        ParticipantColor J = recipient.J();
        boolean D = recipient.D();
        boolean z = false;
        if (recipient.H() != null && recipient.H().b()) {
            z = true;
        }
        Uri h = crjiVar.h(uri, w, ((DefaultRecipient) recipient).c, J, D, z, recipient.z());
        h.getClass();
        return h;
    }
}
