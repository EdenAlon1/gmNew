package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqq implements cctr {
    private static final entd a = entd.c("BugleCms");
    private final cctp c;

    public ccqq(cctp cctpVar) {
        this.c = cctpVar;
    }

    @Override // defpackage.cctr
    public final List a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c.a(3, becg.INSERT, ccue.a(17)).a());
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantTriggers", "getCreateTriggersSqls", 37, "CmsParticipantTriggers.java")).q("Creating trigger SQL for delete participants");
        bech e = this.c.e(3, becg.DELETE, ccue.a(9), true);
        e.i = "cms_id";
        arrayList.add(e.a());
        bech a2 = this.c.a(3, becg.UPDATE, ccue.a(5));
        a2.d = enkr.c("sub_id", "normalized_destination", "profile_photo_blob_id", "profile_photo_encryption_key", "send_destination", "full_name", "first_name", "profile_photo_uri", "lookup_key", "extended_color", "blocked", "participant_type", "is_spam", "is_spam_source");
        arrayList.add(a2.a());
        return arrayList;
    }

    @Override // defpackage.cctr
    public final List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c.c(3, becg.INSERT));
        arrayList.add(this.c.c(3, becg.DELETE));
        arrayList.add(this.c.c(3, becg.UPDATE));
        return arrayList;
    }
}
