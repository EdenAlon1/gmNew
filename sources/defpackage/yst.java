package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yst extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ysz b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yst(ffgu ffguVar, ysz yszVar, Uri uri) {
        super(2, ffguVar);
        this.b = yszVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yst) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ysz yszVar = this.b;
            Uri uri = this.c;
            String j = yszVar.h.j(uri);
            cbaq cbaqVar = null;
            if (j == null || ffpc.J(j)) {
                ensk j2 = ysz.b.j();
                j2.Y(ente.a, "BugleComposeRow2");
                ((enrr) j2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler", "persistVCardAttachmentToScratchSpace", 281, "ContactsShortcutHandler.kt")).t("Could not find lookupKey for the selected contact uri %s", uri);
            } else {
                ensk e = ysz.b.e();
                e.Y(ente.a, "BugleComposeRow2");
                ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler", "persistVCardAttachmentToScratchSpace", 286, "ContactsShortcutHandler.kt")).t("Persisting selected contact file to scratch space. contactUri %s", uri);
                Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, j);
                try {
                    Context context = yszVar.i;
                    cbaqVar = cbgi.c(context).f(withAppendedPath, "vcf", eepm.a("com.android.providers.contacts"));
                } catch (Exception e2) {
                    ensk i2 = ysz.b.i();
                    i2.Y(ente.a, "BugleComposeRow2");
                    ((enrr) ((enrr) i2).g(e2).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler", "persistVCardAttachmentToScratchSpace", 300, "ContactsShortcutHandler.kt")).t("Error while copying vcard to scratch space for lookupKey %s", j);
                }
            }
            if (cbaqVar != null) {
                ensk e3 = ysz.b.e();
                e3.Y(ente.a, "BugleComposeRow2");
                ((enrr) e3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler$sendContactAsLocalFileVCard$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 261, "ContactsShortcutHandler.kt")).t("Attaching selected contact as file. scratchContactUri %s", cbaqVar.a);
                ysz yszVar2 = this.b;
                drlx a = drlo.a("text/x-vCard");
                if (a == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dqlx dqlxVar = yszVar2.e;
                String uri2 = cbaqVar.a.toString();
                uri2.getClass();
                long j3 = cbaqVar.b;
                ysz yszVar3 = this.b;
                String m = csuu.m(yszVar3.i, cbaqVar.a);
                Instant now = Instant.now();
                now.getClass();
                doyd doydVar = new doyd(a, uri2, j3, m, now, doya.a);
                this.a = 1;
                if (dqlxVar.a(doydVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yst ystVar = new yst(ffguVar, this.b, this.c);
        ystVar.d = obj;
        return ystVar;
    }
}
