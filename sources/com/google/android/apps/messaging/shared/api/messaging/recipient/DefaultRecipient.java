package com.google.android.apps.messaging.shared.api.messaging.recipient;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aoku;
import defpackage.aolm;
import defpackage.aorb;
import defpackage.aqge;
import defpackage.aqhk;
import defpackage.aqhl;
import defpackage.aqkh;
import defpackage.aqkt;
import defpackage.aqkv;
import defpackage.aqkx;
import defpackage.aqly;
import defpackage.aqml;
import defpackage.aqmm;
import defpackage.aqmn;
import defpackage.aqmx;
import defpackage.aqox;
import defpackage.aqoy;
import defpackage.aqpe;
import defpackage.aqpn;
import defpackage.aqpo;
import defpackage.aqrx;
import defpackage.aqrz;
import defpackage.aqsa;
import defpackage.atly;
import defpackage.awui;
import defpackage.azaw;
import defpackage.azcn;
import defpackage.azcr;
import defpackage.azei;
import defpackage.azze;
import defpackage.bdqo;
import defpackage.bdqu;
import defpackage.bdtd;
import defpackage.bqwx;
import defpackage.cfup;
import defpackage.cjvk;
import defpackage.cjvl;
import defpackage.cjvr;
import defpackage.cjvs;
import defpackage.cjvt;
import defpackage.cjvu;
import defpackage.cjvv;
import defpackage.cjvw;
import defpackage.cjvx;
import defpackage.cjvy;
import defpackage.cjvz;
import defpackage.cjwa;
import defpackage.cjwe;
import defpackage.cjwi;
import defpackage.crjg;
import defpackage.csqw;
import defpackage.ctas;
import defpackage.ctbk;
import defpackage.ctva;
import defpackage.ctvb;
import defpackage.cudz;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.emxa;
import defpackage.emxf;
import defpackage.emyl;
import defpackage.emys;
import defpackage.engq;
import defpackage.engw;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eroh;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.ffca;
import defpackage.ffdx;
import defpackage.fffs;
import defpackage.ffhd;
import defpackage.ffix;
import defpackage.ffpc;
import defpackage.qmc;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DefaultRecipient implements ResolvedRecipient, aqkx {
    public final ParticipantsTable.BindData b;
    public final aoku c;
    public final ffbr d;
    private ProfilesTable.BindData e;
    private bqwx f;
    private final aqkv g;
    private final Context h;
    private final errl i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final emyl m;
    private final ffbr n;
    private final ffbr o;
    private final emyl p;
    private final emyl q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final atly v;
    private final aqml w;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient");
    public static final Parcelable.Creator<Recipient> CREATOR = new aqhk();

    /* compiled from: PG */
    public interface a {
        aolm ao();

        aqhl av();
    }

    public DefaultRecipient(Context context, errl errlVar, ffbr<csqw> ffbrVar, ffbr<azze> ffbrVar2, ffbr<aqoy> ffbrVar3, final ffbr<aqmx> ffbrVar4, ffbr<aqpe> ffbrVar5, ffbr<aqrx> ffbrVar6, final ffbr<aqsa> ffbrVar7, final ffbr<aqpo> ffbrVar8, ffbr<cjvl> ffbrVar9, ffbr<cjvr> ffbrVar10, aqmm aqmmVar, ffbr<aqly> ffbrVar11, ffbr<azcn> ffbrVar12, ffbr<ctvb> ffbrVar13, atly atlyVar, final ParticipantsTable.BindData bindData, final aoku aokuVar) {
        this.h = context;
        this.i = errlVar;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.u = ffbrVar13;
        this.m = emys.a(new emyl() { // from class: aqhb
            @Override // defpackage.emyl
            public final Object get() {
                return ((aqmx) ffbr.this.b()).a(aokuVar);
            }
        });
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = emys.a(new emyl() { // from class: aqhc
            @Override // defpackage.emyl
            public final Object get() {
                return aqsa.a(bindData);
            }
        });
        this.q = emys.a(new emyl() { // from class: aqhd
            @Override // defpackage.emyl
            public final Object get() {
                return aqpo.a(bindData);
            }
        });
        if (bindData.aE("profiles_table_join_tag")) {
            this.e = (ProfilesTable.BindData) bindData.aw("profiles_table_join_tag", ProfilesTable.BindData.class);
        }
        if (bindData.aE("contacts_table_join_tag")) {
            this.f = (bqwx) bindData.av("contacts_table_join_tag", bqwx.class);
        }
        emxf.a(!bdtd.m(bindData));
        this.b = bindData;
        this.g = new aqkv(bindData.S());
        this.c = aokuVar;
        this.r = ffbrVar9;
        this.s = ffbrVar10;
        this.t = ffbrVar11;
        this.w = aqmmVar.a(bindData, this.f, this.e);
        this.d = ffbrVar12;
        this.v = atlyVar;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean A() {
        return this.b.T() != null;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean B() {
        if (((Boolean) ((cfup) cudz.c.get()).e()).booleanValue() && D()) {
            return true;
        }
        if (((Boolean) ((cfup) cudz.b.get()).e()).booleanValue()) {
            return this.c.t() || this.c.D();
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean C() {
        return bdqu.n(this.b);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean D() {
        return this.b.o() == 1;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aqge E(int i) {
        aqoy aqoyVar = (aqoy) this.l.b();
        ctbk ctbkVar = (ctbk) aqoyVar.a.b();
        ctbkVar.getClass();
        errl errlVar = (errl) aqoyVar.b.b();
        errlVar.getClass();
        errl errlVar2 = (errl) aqoyVar.c.b();
        errlVar2.getClass();
        azei azeiVar = (azei) aqoyVar.d.b();
        azeiVar.getClass();
        azaw azawVar = (azaw) aqoyVar.e.b();
        azawVar.getClass();
        azaw azawVar2 = (azaw) aqoyVar.f.b();
        azawVar2.getClass();
        aoku aokuVar = this.c;
        aokuVar.getClass();
        if (i != 0) {
            return new aqox(ctbkVar, errlVar, errlVar2, azeiVar, azawVar, azawVar2, aokuVar, i);
        }
        throw null;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient
    public final aqkv F() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aqmn G() {
        crjg crjgVar = crjg.b;
        aqml aqmlVar = this.w;
        return new aqmn(aqmlVar.a(this, crjgVar), aqmlVar.a(this, crjg.a), aqmlVar.b());
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aqpn H() {
        return (aqpn) this.q.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aqrz I() {
        return (aqrz) this.p.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final ParticipantColor J() {
        return bdqo.a(this.b);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final elfl K() {
        return E(2).b().h(new emwl() { // from class: aqgy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                boolean q = ((aqpf) obj).q();
                ensk h = DefaultRecipient.a.h();
                h.Y(ente.a, "BugleRecipients");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(csux.D, cskt.c(DefaultRecipient.this.c).toString());
                enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient", "isRcsGroupChatEnabled", 481, "DefaultRecipient.java");
                Boolean valueOf = Boolean.valueOf(q);
                enrrVar2.t("isRcsGroupChatEnabled = %b.", valueOf);
                return valueOf;
            }
        }, this.i);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final long a() {
        return this.b.u();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    @Deprecated
    public final Uri b() {
        return ((azze) this.k.b()).a(this.b);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final Uri c(crjg crjgVar) {
        return this.w.a(this, crjgVar);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final Uri d() {
        bqwx bqwxVar = this.f;
        if (bqwxVar == null) {
            return this.b.w();
        }
        bqwxVar.az(8, "thumbnail");
        return bqwxVar.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final Uri e() {
        if (this.b.T() == null) {
            return null;
        }
        ParticipantsTable.BindData bindData = this.b;
        return ContactsContract.Contacts.getLookupUri(bindData.u(), bindData.T());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultRecipient) {
            return this.c.equals(((DefaultRecipient) obj).c);
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final qmc f() {
        csqw csqwVar = (csqw) this.j.b();
        String x = x(true);
        String str = this.c.G().a;
        aoku aokuVar = this.c;
        ParticipantsTable.BindData bindData = this.b;
        return csqwVar.m(x, aokuVar, 2, str, bindData.u(), bindData.T(), bindData.v(), bindData.u(), bindData.x(), true);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aoku g() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aorb h() {
        return this.b.y();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aqge i() {
        return (aqge) this.m.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aqkh j() {
        Long h;
        String uri;
        Instant instant = null;
        if (this.e == null) {
            return null;
        }
        cjvl cjvlVar = (cjvl) this.r.b();
        ProfilesTable.BindData bindData = this.e;
        bindData.getClass();
        final aoku aokuVar = this.c;
        aokuVar.getClass();
        ffbr ffbrVar = cjvlVar.a;
        ctas ctasVar = (ctas) cjvlVar.b.b();
        ctasVar.getClass();
        ffhd ffhdVar = (ffhd) cjvlVar.c.b();
        ffhdVar.getClass();
        Long l = (Long) cjvlVar.d.b();
        l.getClass();
        ffbr ffbrVar2 = cjvlVar.e;
        long longValue = l.longValue();
        Long l2 = (Long) ffbrVar2.b();
        l2.getClass();
        long longValue2 = l2.longValue();
        String v = bindData.v();
        String str = "";
        if (v == null) {
            v = "";
        }
        String w = bindData.w();
        if (w == null) {
            w = "";
        }
        String x = bindData.x();
        if (x == null) {
            x = "";
        }
        cjvv cjvvVar = (cjvv) cjvw.a.createBuilder();
        cjvvVar.getClass();
        cjvx.b(v, cjvvVar);
        cjvx.c(w, cjvvVar);
        cjvx.d(x, cjvvVar);
        cjvx.e(cjwi.PROFILE_PEOPLE_SHARING_SOURCE, cjvvVar);
        cjvt a2 = cjvs.a(cjvx.a(cjvvVar));
        cjvy cjvyVar = (cjvy) cjvz.a.createBuilder();
        cjvyVar.getClass();
        Uri q = bindData.q();
        if (q != null && (uri = q.toString()) != null) {
            str = uri;
        }
        cjwa.c(str, cjvyVar);
        cjwa.b(cjwi.PROFILE_PEOPLE_SHARING_SOURCE, cjvyVar);
        cjvu b = cjvs.b(cjwa.a(cjvyVar));
        String B = bindData.B();
        if (B != null && (h = ffpc.h(B)) != null) {
            instant = Instant.ofEpochMilli(h.longValue());
        }
        return new cjvk(a2, b, instant, false, false, ffca.a(new ffix() { // from class: cjvg
            @Override // defpackage.ffix
            public final Object invoke() {
                return aoku.this;
            }
        }), ffbrVar, ctasVar, ffhdVar, longValue, longValue2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final defpackage.aqki k() {
        /*
            r22 = this;
            r4 = r22
            ffbr r0 = r4.s
            java.lang.Object r0 = r0.b()
            cjvr r0 = (defpackage.cjvr) r0
            ffbr r1 = r0.a
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData r2 = r4.e
            cjvq r3 = new cjvq
            java.lang.Object r1 = r1.b()
            r6 = r1
            errl r6 = (defpackage.errl) r6
            r6.getClass()
            ffbr r1 = r0.b
            java.lang.Object r1 = r1.b()
            r7 = r1
            j$.util.Optional r7 = (j$.util.Optional) r7
            r7.getClass()
            ffbr r1 = r0.c
            java.lang.Object r1 = r1.b()
            r8 = r1
            ffsk r8 = (defpackage.ffsk) r8
            r8.getClass()
            ffbr r9 = r0.d
            ffbr r10 = r0.e
            ffbr r1 = r0.f
            java.lang.Object r1 = r1.b()
            r11 = r1
            auln r11 = (defpackage.auln) r11
            r11.getClass()
            ffbr r1 = r0.g
            java.lang.Object r1 = r1.b()
            r12 = r1
            j$.util.Optional r12 = (j$.util.Optional) r12
            r12.getClass()
            ffbr r13 = r0.h
            r1 = 1
            r5 = 0
            if (r2 == 0) goto L6d
            java.lang.String r14 = r2.v()
            if (r14 != 0) goto L69
            java.lang.String r14 = r2.w()
            if (r14 != 0) goto L69
            java.lang.String r14 = r2.x()
            if (r14 == 0) goto L67
            goto L69
        L67:
            r14 = r2
            goto L6e
        L69:
            r20 = r1
            r14 = r2
            goto L70
        L6d:
            r14 = r5
        L6e:
            r20 = 0
        L70:
            cjvt r15 = new cjvt
            if (r14 == 0) goto L79
            java.lang.String r16 = r14.w()
            goto L7b
        L79:
            r16 = r5
        L7b:
            if (r14 == 0) goto L82
            java.lang.String r17 = r14.x()
            goto L84
        L82:
            r17 = r5
        L84:
            if (r14 == 0) goto L8d
            java.lang.String r14 = r14.v()
            r18 = r14
            goto L8f
        L8d:
            r18 = r5
        L8f:
            r19 = 0
            r21 = 8
            r15.<init>(r16, r17, r18, r19, r20, r21)
            if (r2 == 0) goto La4
            android.net.Uri r14 = r2.q()
            if (r14 == 0) goto La4
            java.lang.String r14 = r14.toString()
            if (r14 != 0) goto La6
        La4:
            java.lang.String r14 = defpackage.cjvq.a
        La6:
            r16 = r2
            cjvu r2 = new cjvu
            android.net.Uri r0 = android.net.Uri.parse(r14)
            int r14 = r14.length()
            if (r14 <= 0) goto Lb5
            goto Lb6
        Lb5:
            r1 = 0
        Lb6:
            r14 = 2
            r2.<init>(r0, r5, r1, r14)
            if (r16 == 0) goto Lc5
            java.lang.String r5 = r16.y()
            r0 = r3
            r3 = r5
            r5 = r16
            goto Lc7
        Lc5:
            r0 = r3
            r3 = r5
        Lc7:
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient.k():aqki");
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aqkt l() {
        return (aqkt) emxa.c(this.b.z(), aqkt.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aqry m() {
        /*
            r9 = this;
            ffbr r0 = r9.o
            java.lang.Object r0 = r0.b()
            aqrx r0 = (defpackage.aqrx) r0
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r0 = r9.b
            int r0 = r0.t()
            r1 = 10
            r2 = 0
            r3 = 4
            r4 = 1
            r5 = 8
            if (r0 == r5) goto L1f
            if (r0 == r1) goto L1f
            if (r0 != r3) goto L1d
            r0 = r3
            goto L1f
        L1d:
            r6 = r2
            goto L20
        L1f:
            r6 = r4
        L20:
            r7 = 7
            r8 = 12
            if (r0 == r7) goto L3e
            r7 = 11
            if (r0 == r7) goto L3e
            if (r0 == r8) goto L3e
            r7 = 9
            if (r0 == r7) goto L3e
            if (r0 == r3) goto L3e
            r3 = 5
            if (r0 == r3) goto L3e
            if (r0 == r5) goto L3e
            if (r0 == r1) goto L3e
            r1 = 3
            if (r0 != r1) goto L3c
            goto L3e
        L3c:
            r1 = r2
            goto L3f
        L3e:
            r1 = r4
        L3f:
            if (r0 != r8) goto L42
            r2 = r4
        L42:
            aqrv r3 = new aqrv
            r3.<init>(r1, r6, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient.m():aqry");
    }

    @Override // defpackage.aqkx
    public final ParticipantsTable.BindData n() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final cjwe o() {
        cjwe E = this.w.a.E();
        E.getClass();
        return E;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final cjwi p() {
        return this.w.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final cjwi q() {
        return this.b.F();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient
    public final elfl r() {
        final Optional e = this.c.e();
        if (e.isEmpty()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleRecipients");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient", "getDestinationToken", 418, "DefaultRecipient.java")).q("No RCS identifier available, returning dummy destination token.");
            return elfo.e(azcr.a);
        }
        if (D()) {
            return ((azcn) this.d.b()).a((awui) e.get());
        }
        if (this.v.a()) {
            ctvb ctvbVar = (ctvb) this.u.b();
            String j = this.c.j();
            if (ctvbVar.M(j)) {
                ctva b = ctvbVar.b(j, "");
                if (b == null) {
                    b = ctvbVar.a(j, "");
                    ctvbVar.D(j, "", b);
                }
                if (b.b()) {
                    return ((azcn) this.d.b()).a((awui) e.get());
                }
            }
        }
        return E(2).b().i(new eroh() { // from class: aqhe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((aqpf) obj).p()) {
                    return ((azcn) DefaultRecipient.this.d.b()).a((awui) e.get());
                }
                ensk h2 = DefaultRecipient.a.h();
                h2.Y(ente.a, "BugleRecipients");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient", "getDestinationToken", 439, "DefaultRecipient.java")).q("Recipient does not support RCS, returning dummy destination token.");
                return elfo.e(azcr.a);
            }
        }, this.i);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final elfl s() {
        return ((aqly) this.t.b()).a(this.c).h(new emwl() { // from class: aqha
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((Boolean) obj).booleanValue() ? aqlx.c : aqlx.b;
            }
        }, this.i);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final elfl t() {
        return ((aqpe) this.n.b()).a(this.c);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final engw u() {
        Uri k;
        fffs fffsVar = new fffs((byte[]) null);
        aqml aqmlVar = this.w;
        ProfilesTable.BindData bindData = aqmlVar.c;
        Uri q = bindData != null ? bindData.q() : null;
        if (q != null) {
            fffsVar.add(new aqmn(aqmlVar.c(this, q), q, cjwi.PROFILE_PEOPLE_SHARING_SOURCE));
        }
        bqwx bqwxVar = aqmlVar.b;
        if (bqwxVar != null && (k = bqwxVar.k()) != null) {
            fffsVar.add(new aqmn(aqmlVar.c(this, k), d(), cjwi.PROFILE_CONTACT_SOURCE));
        }
        if (fffsVar.isEmpty()) {
            fffsVar.add(new aqmn(c(crjg.b), c(crjg.a), cjwi.PROFILE_UNSPECIFIED_SOURCE));
        }
        return engq.a(ffdx.a(fffsVar));
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final String v() {
        return this.b.Q();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final String w() {
        return this.b.R();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("participant", this.b);
        bundle.putParcelable("identity", aolm.f(this.c));
        bundle.putParcelable("profile", this.e);
        parcel.writeBundle(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        return r2.h.getResources().getString(com.google.android.apps.messaging.R.string.unknown_sender);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r3 = r2.b.P();
     */
    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String x(boolean r3) {
        /*
            r2 = this;
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r0 = r2.b
            java.lang.String r1 = r0.R()
            java.lang.String r0 = r0.Q()
            if (r3 == 0) goto L1a
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L13
            goto L27
        L13:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L20
            goto L28
        L1a:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L21
        L20:
            return r0
        L21:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L28
        L27:
            return r1
        L28:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r3 = r2.b
            java.lang.String r3 = r3.P()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L35
            return r3
        L35:
            android.content.Context r3 = r2.h
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2132088663(0x7f151757, float:1.9817616E38)
            java.lang.String r3 = r3.getString(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient.x(boolean):java.lang.String");
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient
    public final String y() {
        ProfilesTable.BindData bindData;
        ParticipantsTable.BindData bindData2 = this.b;
        String R = bindData2.R();
        if (TextUtils.isEmpty(bindData2.Q()) && TextUtils.isEmpty(R) && (bindData = this.e) != null) {
            return bindData.v();
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean z() {
        return this.b.Y();
    }

    public DefaultRecipient(Context context, errl errlVar, ffbr<csqw> ffbrVar, ffbr<azze> ffbrVar2, ffbr<aqoy> ffbrVar3, final ffbr<aqmx> ffbrVar4, ffbr<aqpe> ffbrVar5, ffbr<aqrx> ffbrVar6, final ffbr<aqsa> ffbrVar7, final ffbr<aqpo> ffbrVar8, ffbr<cjvl> ffbrVar9, ffbr<cjvr> ffbrVar10, aqmm aqmmVar, ffbr<aqly> ffbrVar11, ffbr<azcn> ffbrVar12, ffbr<ctvb> ffbrVar13, atly atlyVar, final ParticipantsTable.BindData bindData, ProfilesTable.BindData bindData2, final aoku aokuVar) {
        this.h = context;
        this.i = errlVar;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.u = ffbrVar13;
        this.m = emys.a(new emyl() { // from class: aqhi
            @Override // defpackage.emyl
            public final Object get() {
                return ((aqmx) ffbr.this.b()).a(aokuVar);
            }
        });
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = emys.a(new emyl() { // from class: aqhj
            @Override // defpackage.emyl
            public final Object get() {
                return aqsa.a(bindData);
            }
        });
        this.q = emys.a(new emyl() { // from class: aqgz
            @Override // defpackage.emyl
            public final Object get() {
                return aqpo.a(bindData);
            }
        });
        if (bindData.aE("profiles_table_join_tag")) {
            this.e = (ProfilesTable.BindData) bindData.aw("profiles_table_join_tag", ProfilesTable.BindData.class);
        } else {
            this.e = bindData2;
        }
        if (bindData.aE("contacts_table_join_tag")) {
            this.f = (bqwx) bindData.av("contacts_table_join_tag", bqwx.class);
        }
        emxf.a(!bdtd.m(bindData));
        this.b = bindData;
        this.r = ffbrVar9;
        this.s = ffbrVar10;
        this.g = new aqkv(bindData.S());
        this.c = aokuVar;
        this.t = ffbrVar11;
        this.w = aqmmVar.a(bindData, this.f, bindData2);
        this.d = ffbrVar12;
        this.v = atlyVar;
    }

    public DefaultRecipient(Context context, errl errlVar, ffbr<csqw> ffbrVar, ffbr<azze> ffbrVar2, ffbr<aqoy> ffbrVar3, final ffbr<aqmx> ffbrVar4, ffbr<aqpe> ffbrVar5, ffbr<aqrx> ffbrVar6, final ffbr<aqsa> ffbrVar7, final ffbr<aqpo> ffbrVar8, ffbr<cjvl> ffbrVar9, ffbr<cjvr> ffbrVar10, aqmm aqmmVar, ffbr<aqly> ffbrVar11, ffbr<azcn> ffbrVar12, ffbr<ctvb> ffbrVar13, atly atlyVar, final ParticipantsTable.BindData bindData, ProfilesTable.BindData bindData2, bqwx bqwxVar, final aoku aokuVar) {
        this.h = context;
        this.i = errlVar;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.u = ffbrVar13;
        this.m = emys.a(new emyl() { // from class: aqhf
            @Override // defpackage.emyl
            public final Object get() {
                return ((aqmx) ffbr.this.b()).a(aokuVar);
            }
        });
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = emys.a(new emyl() { // from class: aqhg
            @Override // defpackage.emyl
            public final Object get() {
                return aqsa.a(bindData);
            }
        });
        this.q = emys.a(new emyl() { // from class: aqhh
            @Override // defpackage.emyl
            public final Object get() {
                return aqpo.a(bindData);
            }
        });
        if (bindData.aE("profiles_table_join_tag")) {
            this.e = (ProfilesTable.BindData) bindData.aw("profiles_table_join_tag", ProfilesTable.BindData.class);
        } else {
            this.e = bindData2;
        }
        this.f = bqwxVar;
        emxf.a(!bdtd.m(bindData));
        this.b = bindData;
        this.r = ffbrVar9;
        this.s = ffbrVar10;
        this.g = new aqkv(bindData.S());
        this.c = aokuVar;
        this.t = ffbrVar11;
        this.w = aqmmVar.a(bindData, bqwxVar, bindData2);
        this.d = ffbrVar12;
        this.v = atlyVar;
    }
}
