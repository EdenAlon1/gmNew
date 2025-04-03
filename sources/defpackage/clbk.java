package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.RichCardContainer;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clbk {
    private static final cskc a = cskc.g("BugleDataModel", "IncomingRbmMessageHandler");
    private final ffbr b;
    private final ffbr c;
    private final cowf d;
    private final ckep e;
    private final emyl f;
    private final atme g;
    private boolean h;
    private ParticipantsTable.BindData i;
    private boolean j;
    private RichCardContainer k;
    private BusinessInfoData l;

    public clbk(ffbr ffbrVar, ffbr ffbrVar2, cowf cowfVar, final aolr aolrVar, atme atmeVar, final ckep ckepVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = cowfVar;
        this.e = ckepVar;
        this.g = atmeVar;
        this.f = emys.a(new emyl() { // from class: clbj
            @Override // defpackage.emyl
            public final Object get() {
                return aolr.this.b(ckepVar.g());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ParticipantsTable.BindData g() {
        Optional empty;
        fayv n = this.e.n();
        if (n == null) {
            empty = Optional.empty();
        } else {
            csjb c = a.c();
            c.I("Trying to get Agent Name from custom CPIM header");
            c.r();
            fayz fayzVar = fayz.a;
            eyhm eyhmVar = n.b;
            if (eyhmVar.containsKey("urn:rcs:google:")) {
                fayzVar = (fayz) eyhmVar.get("urn:rcs:google:");
            }
            eyhm eyhmVar2 = fayzVar.b;
            String str = eyhmVar2.containsKey("Agent-Name") ? (String) eyhmVar2.get("Agent-Name") : "";
            empty = TextUtils.isEmpty(str) ? Optional.empty() : Optional.of(str);
        }
        if (this.l == null && empty.isPresent()) {
            csjb c2 = a.c();
            c2.I("Business Info missing, using Agent Name from custom CPIM Header");
            c2.A("Agent Name", empty.get());
            c2.r();
            return h((aoku) this.f.get(), (String) empty.get(), bcyu.a());
        }
        aoku aokuVar = (aoku) this.f.get();
        BusinessInfoData businessInfoData = this.l;
        if (businessInfoData != null) {
            return h(aokuVar, businessInfoData.getName(), businessInfoData.getColor());
        }
        csjb a2 = a.a();
        a2.I("No business info available for incoming RCS message for bot.");
        a2.M("senderId", aokuVar.h());
        a2.r();
        return h(aokuVar, null, null);
    }

    private final ParticipantsTable.BindData h(aoku aokuVar, String str, String str2) {
        String str3 = (String) Optional.ofNullable(aokuVar.h()).orElse(this.e.g().d);
        csjb c = a.c();
        c.I("No existing bot participant. Creating one.");
        c.M("id", str3);
        c.M("name", str);
        c.A(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, str2);
        c.r();
        return bdqu.a(str3, str, str2);
    }

    final ParticipantsTable.BindData a() {
        emxf.b(this.h, "Did you forget to call validateMessageAndInit()?");
        if (!this.g.a()) {
            if (this.i == null) {
                this.i = g();
            }
            return this.i;
        }
        emxf.b(this.j, "Attempting to get a bot sender for a non-bot message.");
        ParticipantsTable.BindData bindData = this.i;
        bindData.getClass();
        return bindData.C().a();
    }

    final void b() {
        ParticipantsTable.BindData bindData;
        emxf.b(this.h, "Did you forget to call validateMessageAndInit()?");
        BusinessInfoData businessInfoData = this.l;
        String logoImageLocalUri = businessInfoData == null ? null : businessInfoData.getLogoImageLocalUri();
        if (TextUtils.isEmpty(logoImageLocalUri) || (bindData = this.i) == null || bindData.S() == null) {
            return;
        }
        String S = this.i.S();
        if (((bdrr) this.b.b()).s(S, Uri.parse(logoImageLocalUri))) {
            ((bczy) this.c.b()).R(S);
        }
    }

    final boolean c() {
        emxf.b(this.h, "Did you forget to call validateMessageAndInit()?");
        return this.k != null;
    }

    final boolean d() {
        emxf.b(this.h, "Did you forget to call validateMessageAndInit()?");
        return this.j;
    }

    final boolean e() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.e.o());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean f(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r5.h = r0
            boolean r1 = r5.e()
            r2 = 0
            if (r1 == 0) goto L30
            com.google.android.ims.rcsservice.chatsession.message.RichCardParser r1 = new com.google.android.ims.rcsservice.chatsession.message.RichCardParser
            r1.<init>(r6, r2)
            com.google.android.ims.rcsservice.chatsession.message.RichCardContainer r6 = r1.parse()
            r5.k = r6
            if (r6 == 0) goto L18
            goto L30
        L18:
            cskc r6 = defpackage.clbk.a
            csjb r6 = r6.e()
            java.lang.String r0 = "Discarding incoming bot message not containing a Rich Card or Rich Card carousel for message id: {%s}"
            r6.I(r0)
            ckep r0 = r5.e
            bdhg r0 = r0.l()
            r6.h(r0)
            r6.r()
            return r2
        L30:
            ffbr r6 = r5.b
            java.lang.Object r6 = r6.b()
            bdrr r6 = (defpackage.bdrr) r6
            ckep r1 = r5.e
            awui r1 = r1.g()
            java.lang.String r1 = r1.d
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r6 = r6.c(r1)
            r5.i = r6
            ckep r6 = r5.e
            boolean r1 = r6.w()
            if (r1 != 0) goto L8d
            bdhg r6 = r6.l()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r1 = r5.i
            if (r1 == 0) goto L8b
            cskc r1 = defpackage.clbk.a
            csjb r1 = r1.b()
            java.lang.String r3 = "Server sent RCS message from bot but isBot flag is missing for rcsMessage: %s, senderId: %s."
            r1.I(r3)
            r1.h(r6)
            emyl r6 = r5.f
            java.lang.Object r6 = r6.get()
            aoku r6 = (defpackage.aoku) r6
            java.lang.String r6 = r6.h()
            boolean r3 = r1.d
            if (r3 == 0) goto L87
            java.lang.StringBuilder r3 = r1.b
            java.lang.String r4 = " senderId{"
            r3.append(r4)
            java.lang.String r6 = defpackage.cskt.e(r6)
            r3.append(r6)
            r6 = 125(0x7d, float:1.75E-43)
            r3.append(r6)
        L87:
            r1.r()
            goto L8d
        L8b:
            r6 = r2
            goto L8e
        L8d:
            r6 = r0
        L8e:
            r5.j = r6
            if (r6 == 0) goto Ldb
            ckep r6 = r5.e
            awui r6 = r6.g()
            java.lang.String r6 = r6.d
            j$.util.Optional r6 = defpackage.avff.d(r6)
            boolean r1 = r6.isPresent()
            if (r1 == 0) goto Lad
            java.lang.Object r6 = r6.get()
            com.google.android.ims.rcsservice.businessinfo.BusinessInfoData r6 = (com.google.android.ims.rcsservice.businessinfo.BusinessInfoData) r6
            r5.l = r6
            goto Lbd
        Lad:
            cowf r6 = r5.d
            ckep r1 = r5.e
            awui r1 = r1.g()
            java.lang.String r1 = r1.d
            com.google.android.ims.rcsservice.businessinfo.BusinessInfoData r6 = r6.a(r1)
            r5.l = r6
        Lbd:
            atme r6 = r5.g
            boolean r6 = r6.a()
            if (r6 == 0) goto Lf9
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r6 = r5.i
            if (r6 != 0) goto Lf9
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r6 = r5.g()
            ffbr r1 = r5.b
            java.lang.Object r1 = r1.b()
            bdrr r1 = (defpackage.bdrr) r1
            r1.i(r6)
            r5.i = r6
            goto Lf9
        Ldb:
            boolean r6 = r5.e()
            if (r6 == 0) goto Lf9
            cskc r6 = defpackage.clbk.a
            csjb r6 = r6.e()
            java.lang.String r0 = "Message id {%s} with RBM content type is not marked as from a bot, and there is not existing bot participant."
            r6.I(r0)
            ckep r0 = r5.e
            bdhg r0 = r0.l()
            r6.h(r0)
            r6.r()
            return r2
        Lf9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clbk.f(java.lang.String):boolean");
    }
}
