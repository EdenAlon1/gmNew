package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yrn {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener");
    public static final ffbz b = ffca.a(new ffix() { // from class: yri
        @Override // defpackage.ffix
        public final Object invoke() {
            enru enruVar = yrn.a;
            String lowerCase = "text/x-vCard".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return fffi.d("application/hbs-vcs", "application/ics", "application/vcs", "application/ogg", "audio/*", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "image/*", "application/pdf", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "text/calendar", "text/x-vCalendar", "text/x-vCard", lowerCase, "text/x-vcalendar", "video/*", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        }
    });
    public static final ffbz c = ffca.a(new ffix() { // from class: yrj
        @Override // defpackage.ffix
        public final Object invoke() {
            enru enruVar = yrn.a;
            Set<String> a2 = yrk.a();
            ArrayList arrayList = new ArrayList(ffdx.n(a2, 10));
            for (String str : a2) {
                drlx a3 = drlo.a(str);
                if (a3 == null) {
                    throw new IllegalStateException("Bad type in SUPPORTED_MEDIA_TYPES: ".concat(String.valueOf(str)));
                }
                arrayList.add(a3);
            }
            Set ar = ffdx.ar(arrayList);
            if (ar.size() == yrk.a().size()) {
                return ar;
            }
            throw new IllegalStateException("SUPPORTED_MEDIA_TYPES has less items than SUPPORTED_MEDIA_TYPE_STRINGS");
        }
    });
    public final ffbr d;
    public final ffbr e;
    public final ataf f;
    private final Context g;
    private final ffsk h;
    private final xgp i;

    public yrn(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ataf atafVar, xgp xgpVar) {
        context.getClass();
        ffskVar.getClass();
        this.g = context;
        this.h = ffskVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = atafVar;
        this.i = xgpVar;
    }

    public final dsjk a() {
        return new dsjk(ffdx.ak((Set) c.a()), new yrm(this));
    }

    public final boolean b(ktm ktmVar, int i) {
        drlx drlxVar;
        int i2;
        ClipData.Item itemAt = ktmVar.d().getItemAt(i);
        Uri uri = itemAt.getUri();
        if (this.f.a()) {
            if (uri == null) {
                throw new IllegalArgumentException("A clip attachment must have an Uri");
            }
        } else if (uri == null) {
            ensk h = a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "addAttachment", 80, "ComposeRowContentInsertionListener.kt")).t("Skipping received content with null uri: %s", itemAt);
            return false;
        }
        ClipData d = ktmVar.d();
        d.getClass();
        int mimeTypeCount = d.getDescription().getMimeTypeCount();
        if (mimeTypeCount == 1) {
            String mimeType = d.getDescription().getMimeType(0);
            mimeType.getClass();
            drlxVar = drlo.a(mimeType);
        } else if (mimeTypeCount == d.getItemCount()) {
            String mimeType2 = d.getDescription().getMimeType(i);
            mimeType2.getClass();
            drlxVar = drlo.a(mimeType2);
        } else {
            drlxVar = null;
        }
        if (drlxVar == null || ffkj.e(drlxVar.c, "*")) {
            drlxVar = null;
        }
        if (drlxVar == null) {
            enru enruVar = a;
            ensk j = enruVar.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "resolveMediaType", 130, "ComposeRowContentInsertionListener.kt")).t("Getting type from content resolver for %s", uri);
            String type = this.g.getContentResolver().getType(uri);
            if (type == null) {
                ensk j2 = enruVar.j();
                j2.Y(ente.a, "BugleComposeRow2");
                ((enrr) j2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "resolveMediaType", 133, "ComposeRowContentInsertionListener.kt")).t("Unable to resolve type for %s", uri);
                drlxVar = null;
            } else {
                ensk e = enruVar.e();
                e.Y(ente.a, "BugleComposeRow2");
                ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "resolveMediaType", 136, "ComposeRowContentInsertionListener.kt")).D("Resolved type %s for %s", type, uri);
                drlxVar = drlo.a(type);
            }
        }
        if (drlxVar != null) {
            Set a2 = yrk.a();
            if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (ClipDescription.compareMimeTypes(drlxVar.a(), (String) it.next())) {
                        enru enruVar2 = a;
                        ensk e2 = enruVar2.e();
                        e2.Y(ente.a, "BugleComposeRow2");
                        ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "addAttachment", 89, "ComposeRowContentInsertionListener.kt")).D("Accepting received content with MediaType %s: %s", drlxVar, itemAt);
                        int b2 = ktmVar.b();
                        if (b2 == 1) {
                            i2 = 4;
                        } else if (b2 == 2) {
                            i2 = 3;
                        } else if (b2 != 3) {
                            ensk j3 = enruVar2.j();
                            j3.Y(ente.a, "BugleComposeRow2");
                            ((enrr) j3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "getSource", 151, "ComposeRowContentInsertionListener.kt")).w("Using EntryPoint.UNKNOWN for %d used by %s", b2, uri);
                            i2 = 1;
                        } else {
                            i2 = 5;
                        }
                        axol.k(this.h, null, new yrl(this, new xhl(this.i.a(), drlxVar, uri, null, new doxm(uri.getAuthority(), i2)), null), 3);
                        return true;
                    }
                }
            }
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "BugleComposeRow2");
        ((enrr) h2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "addAttachment", 86, "ComposeRowContentInsertionListener.kt")).D("Skipping received content with MediaType %s: %s", drlxVar, itemAt);
        return false;
    }
}
