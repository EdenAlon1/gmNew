package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucj {
    public static final entd a = entd.c("BugleDraft");
    public final ffbr b;
    public final bcvr c;
    public tys d;
    public bctw e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ephg i;
    private final azbq j;
    private final aolr k;

    public ucj(bcvr bcvrVar, ffbr ffbrVar, azbq azbqVar, aolr aolrVar) {
        this.c = bcvrVar;
        this.b = ffbrVar;
        this.j = azbqVar;
        this.k = aolrVar;
    }

    public final void a() {
        tys tysVar = this.d;
        if (tysVar == null) {
            return;
        }
        this.c.L(tysVar, this.i);
        tys tysVar2 = this.d;
        if (tysVar2 != null) {
            if (tysVar2.A() || b()) {
                this.g = true;
                if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                    ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", 184, "DraftEditorRcsController.java")).t("DraftEditorRcsController#updateRcsDraftSupported=%s because is rbm or rcs group", Boolean.valueOf(this.g));
                    return;
                }
                return;
            }
            bctw bctwVar = this.e;
            if (bctwVar == null) {
                if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                    ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", 193, "DraftEditorRcsController.java")).q("DraftEditorRcsController#updateRcsDraftSupported=false because conversation participants are not loaded");
                    return;
                }
                return;
            }
            ParticipantsTable.BindData a2 = bctwVar.a();
            if (a2 == null || bdqv.d(a2)) {
                if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                    ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", 204, "DraftEditorRcsController.java")).q("DraftEditorRcsController#updateRcsDraftSupported=false because 1:1 conversation participant is not found, or is rbm");
                }
            } else {
                boolean j = this.j.a(this.k.q(a2)).j();
                boolean f = ((aqgi) this.b.b()).f(this.c.z());
                this.g = this.c.aj(j) && !f;
                entd entdVar = a;
                ((ensz) entdVar.n().h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", 224, "DraftEditorRcsController.java")).t("isRcsDisabledForPreUpRecipient: %s", Boolean.valueOf(f));
                ((ensz) entdVar.n().h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", 225, "DraftEditorRcsController.java")).t("isRcsDraftSupported: %s", Boolean.valueOf(this.g));
            }
        }
    }

    public final boolean b() {
        bctw bctwVar = this.e;
        if (bctwVar != null) {
            return bctwVar.g();
        }
        tys tysVar = this.d;
        if (tysVar != null) {
            return ((typ) tysVar).e;
        }
        return false;
    }
}
