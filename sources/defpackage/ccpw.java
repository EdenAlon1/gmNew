package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpw {
    public static final entd a = entd.c("BugleCms");
    public final ffbr b;
    public final coxk c;
    public final clbb d;
    public final aolr e;
    public final ccsb f;
    private final Context g;

    public ccpw(Context context, ffbr ffbrVar, coxk coxkVar, clbb clbbVar, aolr aolrVar, ccsb ccsbVar) {
        this.g = context;
        this.b = ffbrVar;
        this.c = coxkVar;
        this.d = clbbVar;
        this.e = aolrVar;
        this.f = ccsbVar;
    }

    public final long a(engw engwVar, bseh bsehVar) {
        if (engwVar.isEmpty()) {
            throw new ccpt(String.format("No participants for conversation of cmsId = %s", bsehVar.R()));
        }
        long g = this.c.g(this.g, coto.c, engwVar);
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cdii.h, bsehVar.R());
        enszVar.Y(csux.r, new cpxu(g));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantAndConversationToTelephonyPersister", "createTelephonyThreadIdBasedOnParticipants", 131, "CmsParticipantAndConversationToTelephonyPersister.java")).q("Get or Created");
        return g;
    }
}
