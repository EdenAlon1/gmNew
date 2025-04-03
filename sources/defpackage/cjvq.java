package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.DesugarCollections;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjvq implements aqki {
    public static final String a = new String();
    public final String b;
    private final ResolvedRecipient c;
    private final ProfilesTable.BindData d;
    private final errl e;
    private final Optional f;
    private final ffsk g;
    private final ffbr h;
    private final ffbr i;
    private final auln j;
    private final Optional k;
    private final ffbr l;
    private final cjvt m;
    private final cjvu n;

    public cjvq(cjvt cjvtVar, cjvu cjvuVar, String str, ResolvedRecipient resolvedRecipient, ProfilesTable.BindData bindData, errl errlVar, Optional optional, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, auln aulnVar, Optional optional2, ffbr ffbrVar3) {
        this.m = cjvtVar;
        this.n = cjvuVar;
        this.b = str;
        this.c = resolvedRecipient;
        this.d = bindData;
        this.e = errlVar;
        this.f = optional;
        this.g = ffskVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = aulnVar;
        this.k = optional2;
        this.l = ffbrVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (r6.length() != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c6, code lost:
    
        if (java.lang.String.valueOf(r6).compareTo(java.lang.String.valueOf(r4 != null ? r4.B() : null)) > 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.aqki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjvq.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0080, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.aqki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r9, defpackage.cjtw r10, defpackage.aqpf r11, defpackage.eyja r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjvq.b(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, cjtw, aqpf, eyja, ffgu):java.lang.Object");
    }

    @Override // defpackage.aqki
    public final boolean c() {
        return this.m.b || this.n.c;
    }

    @Override // defpackage.aqki
    public final Object d(SelfIdentityId selfIdentityId, cjtw cjtwVar, aqpf aqpfVar) {
        ResolvedRecipient resolvedRecipient = this.c;
        int e = e(selfIdentityId);
        if (resolvedRecipient.D() || this.c.z() || this.c.H().b() || e == 3 || (cjtwVar == cjtw.SHARE_TO_CONTACTS_ONLY && !this.c.A())) {
            return aqkn.d;
        }
        if (!aqpfVar.i() || !aqpfVar.p() || !aqpfVar.l()) {
            return aqkn.c;
        }
        int i = e - 2;
        return i != 3 ? i != 4 ? aqkn.b : aqkn.f : aqkn.e;
    }

    @Override // defpackage.aqki
    public final int e(SelfIdentityId selfIdentityId) {
        cjwo t;
        cjwq cjwqVar;
        selfIdentityId.getClass();
        ProfilesTable.BindData bindData = this.d;
        if (bindData != null && (t = bindData.t()) != null && (cjwqVar = (cjwq) DesugarCollections.unmodifiableMap(t.b).get(selfIdentityId.b())) != null) {
            int i = cjwqVar.c;
            r1 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
            if (r1 == 0) {
                return 1;
            }
        }
        return r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjvq)) {
            return false;
        }
        cjvq cjvqVar = (cjvq) obj;
        return ffkj.e(this.m, cjvqVar.m) && ffkj.e(this.n, cjvqVar.n) && ffkj.e(this.b, cjvqVar.b) && ffkj.e(this.c, cjvqVar.c) && ffkj.e(this.d, cjvqVar.d) && ffkj.e(this.e, cjvqVar.e) && ffkj.e(this.f, cjvqVar.f) && ffkj.e(this.g, cjvqVar.g) && ffkj.e(this.h, cjvqVar.h) && ffkj.e(this.i, cjvqVar.i) && ffkj.e(this.j, cjvqVar.j) && ffkj.e(this.k, cjvqVar.k) && ffkj.e(this.l, cjvqVar.l);
    }

    @Override // defpackage.aqkj
    public final cjvt f() {
        throw null;
    }

    @Override // defpackage.aqkj
    public final cjvu g() {
        throw null;
    }

    public final String h() {
        ProfilesTable.BindData bindData = this.d;
        if (bindData != null) {
            return bindData.A();
        }
        return null;
    }

    public final int hashCode() {
        int hashCode = (this.m.hashCode() * 31) + this.n.hashCode();
        String str = this.b;
        int hashCode2 = ((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        ProfilesTable.BindData bindData = this.d;
        return ((((((((((((((((hashCode2 + (bindData != null ? bindData.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    public final String toString() {
        return "DefaultPeopleProfileV2(name=" + this.m + ", photo=" + this.n + ", personId=" + this.b + ", resolvedRecipient=" + this.c + ", profileBindData=" + this.d + ", lightweightExecutor=" + this.e + ", recipientsProfileCache=" + this.f + ", lightweightScope=" + this.g + ", forceRefreshProfileIntervalHours=" + this.h + ", enableSelfProfileTimestamp=" + this.i + ", fixProfileStalenessHeuristic=" + this.j + ", profileEventMetricsLogger=" + this.k + ", addLoggingForRecipientSharing=" + this.l + ")";
    }
}
