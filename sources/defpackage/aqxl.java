package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqxl implements aqvi {
    public final SelfIdentityId a;
    public final ffbr b;
    private final Optional c;
    private final Optional d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final eyja i;
    private final ProfilesTable.BindData j;
    private final bxtp k;
    private final ffbr l;
    private final cqoh m;
    private final ffsk n;
    private final int o;

    public aqxl(Optional optional, Optional optional2, boolean z, boolean z2, boolean z3, int i, SelfIdentityId selfIdentityId, boolean z4, eyja eyjaVar, ProfilesTable.BindData bindData, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, ffsk ffskVar) {
        eyjaVar.getClass();
        this.c = optional;
        this.d = optional2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.o = i;
        this.a = selfIdentityId;
        this.h = z4;
        this.i = eyjaVar;
        this.j = bindData;
        this.k = null;
        this.l = ffbrVar;
        this.b = ffbrVar2;
        this.m = cqohVar;
        this.n = ffskVar;
    }

    @Override // defpackage.aqvi
    public final eyja a() {
        return this.i;
    }

    @Override // defpackage.aqvi
    public final Optional b() {
        return this.c;
    }

    @Override // defpackage.aqvi
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.aqvi
    public final boolean d() {
        return this.f;
    }

    @Override // defpackage.aqvi
    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqxl)) {
            return false;
        }
        aqxl aqxlVar = (aqxl) obj;
        if (!ffkj.e(this.c, aqxlVar.c) || !ffkj.e(this.d, aqxlVar.d) || this.e != aqxlVar.e || this.f != aqxlVar.f || this.g != aqxlVar.g || this.o != aqxlVar.o || !ffkj.e(this.a, aqxlVar.a) || this.h != aqxlVar.h || !ffkj.e(this.i, aqxlVar.i) || !ffkj.e(this.j, aqxlVar.j)) {
            return false;
        }
        bxtp bxtpVar = aqxlVar.k;
        return ffkj.e(null, null) && ffkj.e(this.l, aqxlVar.l) && ffkj.e(this.b, aqxlVar.b) && ffkj.e(this.m, aqxlVar.m) && ffkj.e(this.n, aqxlVar.n);
    }

    @Override // defpackage.aqvi
    public final boolean f() {
        return this.e;
    }

    @Override // defpackage.aqvi
    public final boolean g() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.aqxj
            if (r0 == 0) goto L13
            r0 = r7
            aqxj r0 = (defpackage.aqxj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqxj r0 = new aqxj
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aqxl r0 = r0.d
            defpackage.ffci.b(r7)
            goto L58
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.ffci.b(r7)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData r7 = r6.j
            if (r7 != 0) goto L5b
            r0.d = r6
            r0.c = r3
            ffsk r7 = r6.n
            ffhe r2 = defpackage.ffhe.a
            ffsm r3 = defpackage.ffsm.a
            ffhd r2 = defpackage.ekxi.a(r2)
            aqxh r4 = new aqxh
            r5 = 0
            r4.<init>(r5, r6)
            ffss r7 = defpackage.ffra.b(r7, r2, r3, r4)
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r0 = r6
        L58:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData r7 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable.BindData) r7
            goto L5c
        L5b:
            r0 = r6
        L5c:
            j$.util.Optional r1 = r0.c
            bwlt r7 = r7.s()
            java.lang.Object r1 = defpackage.fflm.b(r1)
            java.lang.String r1 = (java.lang.String) r1
            r7.d(r1)
            j$.util.Optional r1 = r0.d
            java.lang.Object r1 = defpackage.fflm.b(r1)
            android.net.Uri r1 = (android.net.Uri) r1
            r7.l(r1)
            boolean r1 = r0.f
            r7.b(r1)
            cqoh r1 = r0.m
            j$.time.Duration r1 = r1.d()
            long r1 = r1.toMillis()
            r7.f(r1)
            boolean r0 = r0.h
            r7.g(r0)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData r7 = r7.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqxl.h(ffgu):java.lang.Object");
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        SelfIdentityId selfIdentityId = this.a;
        int a = (((((((((((((hashCode * 31) + aqxf.a(this.e)) * 31) + aqxf.a(this.f)) * 31) + aqxf.a(this.g)) * 31) + this.o) * 31) + selfIdentityId.hashCode()) * 31) + aqxf.a(this.h)) * 31) + this.i.hashCode();
        ProfilesTable.BindData bindData = this.j;
        return (((((((((a * 31) + (bindData == null ? 0 : bindData.hashCode())) * 961) + this.l.hashCode()) * 31) + this.b.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ffgu r7) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqxl.i(ffgu):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfPeopleProfileImpl(displayName=");
        sb.append(this.c);
        sb.append(", photo=");
        sb.append(this.d);
        sb.append(", isPhotoAMonogram=");
        sb.append(this.e);
        sb.append(", belongsToSelfGaia=");
        sb.append(this.f);
        sb.append(", hasDiscoverableProfile=");
        sb.append(this.g);
        sb.append(", provenance=");
        sb.append((Object) (this.o != 4 ? "PROFILE_CACHE" : "LOCAL_CACHE"));
        sb.append(", selfIdentityId=");
        sb.append(this.a);
        sb.append(", isProfileShareable=");
        sb.append(this.h);
        sb.append(", lastUpdatedTimestamp=");
        sb.append(this.i);
        sb.append(", profileBindData=");
        sb.append(this.j);
        sb.append(", selfProfileBindData=null, selfProfileRowFactory=");
        sb.append(this.l);
        sb.append(", profileRowFactory=");
        sb.append(this.b);
        sb.append(", clock=");
        sb.append(this.m);
        sb.append(", blockingScope=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
