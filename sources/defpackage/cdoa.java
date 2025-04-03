package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdoa {
    private final cgzv a;
    private final ctak b;
    private final ffbr c;

    public cdoa(cgzv cgzvVar, ctak ctakVar, ffbr ffbrVar) {
        this.a = cgzvVar;
        this.b = ctakVar;
        this.c = ffbrVar;
    }

    static final boolean c(MessagePartCoreData messagePartCoreData) {
        return messagePartCoreData.t() != null && TextUtils.isEmpty(messagePartCoreData.S());
    }

    public final boolean a(MessagePartCoreData messagePartCoreData) {
        String a;
        if (TextUtils.isEmpty(messagePartCoreData.R()) && messagePartCoreData.bo() && this.a.E(messagePartCoreData)) {
            String V = messagePartCoreData.V();
            Uri v = messagePartCoreData.v();
            if (!le.j(V)) {
                return true;
            }
            if (v != null && (a = this.b.a(v)) != null && new File(a).exists()) {
                return true;
            }
        }
        return false;
    }

    final boolean b(ParticipantsTable.BindData bindData) {
        boolean z;
        ffbr ffbrVar = this.c;
        Uri x = bindData.x();
        String V = bindData.V();
        if (!((Boolean) ffbrVar.b()).booleanValue()) {
            return x != null && TextUtils.isEmpty(V);
        }
        cjwi G = bindData.G();
        cjwi cjwiVar = cjwi.PROFILE_PEOPLE_SHARING_SOURCE;
        if (x != null) {
            z = csuu.w(x);
        } else {
            x = null;
            z = true;
        }
        return x != null && TextUtils.isEmpty(V) && G != cjwiVar && z;
    }
}
