package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crpw {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/avatar/AvatarMonogramCreator");
    private final ffbr b;
    private final ffbr c;

    public crpw(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public final dnwn a(Uri uri, boolean z) {
        String a2;
        uri.getClass();
        String queryParameter = uri.getQueryParameter("m");
        if (queryParameter == null) {
            queryParameter = uri.toString();
            queryParameter.getClass();
        }
        if (((atzl) this.c.b()).a() && csuu.D(queryParameter)) {
            Uri parse = Uri.parse(queryParameter);
            parse.getClass();
            return new dnwn(parse, true, null, null, crjm.m(uri), 12);
        }
        if (!z || !csuu.D(queryParameter)) {
            ffbr ffbrVar = this.b;
            Boolean valueOf = Boolean.valueOf(z);
            a2 = crps.a(((crps) ffbrVar.b()).a.g());
            return new dnwn(uri, valueOf, a2, null, null, 24);
        }
        String queryParameter2 = uri.getQueryParameter("f");
        Uri uri2 = null;
        if (queryParameter2 != null && queryParameter2.length() != 0) {
            uri2 = Uri.parse(queryParameter2);
        }
        Uri parse2 = Uri.parse(queryParameter);
        parse2.getClass();
        return new dnwn(parse2, true, null, null, uri2, 12);
    }

    public final dnwn b(alxj alxjVar, engw engwVar) {
        alxjVar.getClass();
        engwVar.getClass();
        Uri a2 = alxjVar.a();
        if (a2 == null) {
            return null;
        }
        boolean z = true;
        if (alxjVar.b() == alxi.GROUP && engwVar.size() != 1) {
            z = false;
        }
        return a(a2, z);
    }

    public final dnwn c(ResolvedRecipient resolvedRecipient) {
        Uri b = resolvedRecipient.b();
        b.getClass();
        return a(b, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(j$.util.Optional r5, defpackage.aqux r6, int r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.crpv
            if (r0 == 0) goto L13
            r0 = r8
            crpv r0 = (defpackage.crpv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crpv r0 = new crpv
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            crpw r5 = r0.d
            defpackage.ffci.b(r8)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r8)
            elfl r5 = r6.x(r7, r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r8 = defpackage.fgfz.c(r5, r0)
            if (r8 == r1) goto L97
            r5 = r4
        L43:
            j$.util.Optional r8 = (j$.util.Optional) r8
            r8.getClass()
            crpt r6 = new crpt
            r6.<init>()
            crpu r7 = new crpu
            r7.<init>()
            j$.util.Optional r6 = r8.filter(r7)
            boolean r6 = r6.isPresent()
            if (r6 != 0) goto L77
            enru r5 = defpackage.crpw.a
            ensk r5 = r5.h()
            java.lang.String r6 = "createMonogramUiDataForSelf"
            r7 = 51
            java.lang.String r8 = "com/google/android/apps/messaging/shared/util/avatar/AvatarMonogramCreator"
            java.lang.String r0 = "AvatarMonogramCreator.kt"
            ensk r5 = r5.h(r8, r6, r7, r0)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "No people profile for current gaia"
            r5.q(r6)
            r5 = 0
            return r5
        L77:
            java.lang.Object r6 = defpackage.fflm.b(r8)
            aqvi r6 = (defpackage.aqvi) r6
            if (r6 == 0) goto L8d
            j$.util.Optional r6 = r6.c()
            android.net.Uri r7 = android.net.Uri.EMPTY
            java.lang.Object r6 = r6.orElse(r7)
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 != 0) goto L8f
        L8d:
            android.net.Uri r6 = android.net.Uri.EMPTY
        L8f:
            r6.getClass()
            dnwn r5 = r5.a(r6, r3)
            return r5
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crpw.d(j$.util.Optional, aqux, int, ffgu):java.lang.Object");
    }
}
