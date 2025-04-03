package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avhl {
    public static final cskc a = cskc.g("Bugle", "RbmBusinessInfoUpdateHelper");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoUpdateHelper");
    public final ContentResolver c;
    final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    private final ffbr k;

    public avhl(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        this.c = context.getContentResolver();
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.k = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.j = ffbrVar8;
    }

    public static void b(String str, String str2) {
        csjb e = a.e();
        e.I(str2);
        e.A("botId", str);
        e.r();
    }

    public final void a(String str, Iterable iterable, String str2) {
        ((altk) this.e.b()).aG(11, str);
        csjb b2 = a.b();
        b2.I(str2);
        b2.A("botId", str);
        b2.N("canonical address", iterable);
        b2.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(String str, String str2, BusinessInfoData businessInfoData, fayv fayvVar) {
        ParticipantsTable.BindData a2;
        String logoImageLocalUri;
        String str3;
        if (businessInfoData == null) {
            if (fayvVar != null) {
                fayz fayzVar = fayz.a;
                eyhm eyhmVar = fayvVar.b;
                if (eyhmVar.containsKey("urn:rcs:google:")) {
                    fayzVar = (fayz) eyhmVar.get("urn:rcs:google:");
                }
                eyhm eyhmVar2 = fayzVar.b;
                if (eyhmVar2.containsKey("Agent-Name")) {
                    str3 = (String) eyhmVar2.get("Agent-Name");
                    a2 = bdqu.a(str2, str3, null);
                }
            }
            str3 = null;
            a2 = bdqu.a(str2, str3, null);
        } else {
            a2 = bdqu.a(str2, businessInfoData.getName(), businessInfoData.getColor());
        }
        bvvr f = ParticipantsTable.f();
        f.ap("updateParticipantAndConversations");
        f.r(a2.P());
        f.s(a2.m());
        f.j(a2.k());
        f.k(a2.l());
        if (businessInfoData != null && (logoImageLocalUri = businessInfoData.getLogoImageLocalUri()) != null) {
            f.M(Uri.parse(logoImageLocalUri));
        }
        boolean e = f.e(str);
        csjb c = a.c();
        c.B("participant updated", e);
        c.r();
        if (e) {
            ((bczy) this.k.b()).R(str);
        }
        return e;
    }
}
