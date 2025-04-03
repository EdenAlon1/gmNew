package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.vcard.VCardDetailActivity;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttm implements axul {
    static final cfup a = cfvl.i(cfvl.b, "disable_logging_uma_contact_details_launch", false);
    private final cbar b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ddzb g;
    private final aolr h;
    private final ffbr i;

    public ttm(cbar cbarVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ddzb ddzbVar, aolr aolrVar, ffbr ffbrVar5) {
        this.b = cbarVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ddzbVar;
        this.h = aolrVar;
        this.i = ffbrVar5;
    }

    @Override // defpackage.axul
    public final void a(ea eaVar) {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.addFlags(1);
            eaVar.startActivityForResult(intent, 143);
        } catch (ActivityNotFoundException e) {
            csjy.p("Bugle", e, "Couldn't find activity:");
            this.g.k(R.string.activity_not_found_message);
        }
    }

    @Override // defpackage.axul
    public final void b(Context context, Uri uri) {
        cbar cbarVar = this.b;
        Uri e = cbgi.e(context, uri);
        emxf.a(cbarVar.l(e));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(e, "text/x-vCard".toLowerCase(Locale.US));
        intent.addFlags(1);
        this.g.q(context, intent);
        if (((Boolean) ((cfup) ttv.a.get()).e()).booleanValue()) {
            ((tto) this.d.b()).a(7);
        } else {
            ((altk) this.c.b()).au(7);
        }
    }

    @Override // defpackage.axul
    public final void c(Context context, Uri uri) {
        eldl.p(context, new Intent(context, (Class<?>) VCardDetailActivity.class).putExtra("vcard_uri", cbgi.e(context, uri)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
    
        if (true != defpackage.aoqw.h(r5)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (true != r9.u()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        r2 = "email";
     */
    @Override // defpackage.axul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r8, defpackage.aoku r9, int r10, java.util.List r11) {
        /*
            r7 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.INSERT"
            r0.<init>(r1)
            cfva r1 = defpackage.aoqm.a
            aoph r1 = new aoph
            r1.<init>()
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "phone"
            java.lang.String r3 = "email"
            r4 = 1
            if (r1 == 0) goto L26
            boolean r5 = r9.u()
            if (r4 == r5) goto L33
            goto L34
        L26:
            java.lang.String r5 = r9.n()
            cskc r6 = defpackage.cpdg.a
            boolean r5 = defpackage.aoqw.h(r5)
            if (r4 == r5) goto L33
            goto L34
        L33:
            r2 = r3
        L34:
            java.lang.String r3 = "vnd.android.cursor.dir/contact"
            r0.setType(r3)
            ffbr r3 = r7.i
            java.lang.Object r3 = r3.b()
            astw r3 = (defpackage.astw) r3
            boolean r3 = r3.a()
            if (r3 == 0) goto L4c
            java.lang.String r9 = r9.m(r1)
            goto L50
        L4c:
            java.lang.String r9 = r9.p(r1)
        L50:
            r0.putExtra(r2, r9)
            if (r11 == 0) goto L65
            boolean r9 = r11.isEmpty()
            if (r9 != 0) goto L65
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r11)
            java.lang.String r11 = "data"
            r0.putParcelableArrayListExtra(r11, r9)
        L65:
            boolean r9 = r8 instanceof android.app.Activity
            if (r9 != 0) goto L6e
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r9)
        L6e:
            ddzb r9 = r7.g
            r9.q(r8, r0)
            emyl r8 = defpackage.ttv.a
            java.lang.Object r8 = r8.get()
            cfup r8 = (defpackage.cfup) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L93
            ffbr r8 = r7.d
            java.lang.Object r8 = r8.b()
            tto r8 = (defpackage.tto) r8
            r8.a(r10)
            return
        L93:
            ffbr r8 = r7.c
            java.lang.Object r8 = r8.b()
            altk r8 = (defpackage.altk) r8
            r8.au(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttm.d(android.content.Context, aoku, int, java.util.List):void");
    }

    @Override // defpackage.axul
    public final void e(Context context, Uri uri, int i) {
        f(context, uri, i, null);
    }

    @Override // defpackage.axul
    public final void f(Context context, Uri uri, final int i, List list) {
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(uri, "vnd.android.cursor.item/contact");
        intent.putExtra("finishActivityOnSaveCompleted", true);
        if (list != null && !list.isEmpty()) {
            intent.putParcelableArrayListExtra(GroupManagementRequest.DATA_TAG, new ArrayList<>(list));
        }
        this.g.q(context, intent);
        if (((Boolean) ((cfup) ttv.a.get()).e()).booleanValue()) {
            ((ttx) this.e.b()).a.b(new ffji() { // from class: ttw
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    eogx eogxVar = (eogx) obj;
                    eogxVar.getClass();
                    eogxVar.a(i);
                    eogxVar.b(4);
                    return ffcu.a;
                }
            });
        } else {
            ((altk) this.c.b()).az(i);
        }
    }

    protected final void g(Context context, View view, Rect rect, long j, String str, long j2, aoku aokuVar, int i, List list) {
        if (context == null && view != null) {
            context = view.getContext();
        }
        if (j == -1 || TextUtils.isEmpty(str)) {
            if (aokuVar != null) {
                cfva cfvaVar = aoqm.a;
                if (bdqu.o(aokuVar.p(((Boolean) new aoph().get()).booleanValue()))) {
                    return;
                }
                aoku w = this.h.w(aokuVar);
                context.getClass();
                d(context, w, i, list);
                return;
            }
            return;
        }
        Uri withAppendedPath = j == -2 ? Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, str) : ContactsContract.Contacts.getLookupUri(j, str);
        if (j2 != -1) {
            withAppendedPath = withAppendedPath.buildUpon().appendQueryParameter("directory", Long.toString(j2)).build();
        }
        context.getClass();
        String[] strArr = new String[0];
        if (view != null) {
            ContactsContract.QuickContact.showQuickContact(context, view, withAppendedPath, 3, strArr);
        } else if (rect != null) {
            ContactsContract.QuickContact.showQuickContact(context, rect, withAppendedPath, 3, strArr);
        }
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        akzt akztVar = (akzt) this.f.b();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        akztVar.e("Bugle.Contact.Details.Launch.Counts", i2);
    }

    @Override // defpackage.axul
    public final void h(View view, long j, String str, long j2, aoku aokuVar, int i) {
        g(null, view, null, j, str, j2, aokuVar, i, null);
    }

    @Override // defpackage.axul
    public final void i(Context context, Rect rect, long j, String str, long j2, aoku aokuVar, int i, List list) {
        g(context, null, rect, j, str, j2, aokuVar, i, list);
    }
}
