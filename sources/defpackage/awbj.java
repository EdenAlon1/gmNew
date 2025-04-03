package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awbj extends awbn {
    public final Uri a;
    public final ContentType b;
    public final ContentType c;
    public final crce d;
    public final eyee e;
    public final ContentType f;
    public final eyee g;
    public final ContentType h;
    public final Uri i;
    public final cfmh j;
    public final awbt k;

    public awbj() {
        this(null, null, null, null, null, null, null, null, null, 2047);
    }

    public static /* synthetic */ awbj a(awbj awbjVar, eyee eyeeVar, ContentType contentType, eyee eyeeVar2, ContentType contentType2) {
        return new awbj(awbjVar.a, awbjVar.b, awbjVar.c, awbjVar.d, eyeeVar, contentType, eyeeVar2, contentType2, awbjVar.i, awbjVar.j, awbjVar.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awbj)) {
            return false;
        }
        awbj awbjVar = (awbj) obj;
        return ffkj.e(this.a, awbjVar.a) && ffkj.e(this.b, awbjVar.b) && ffkj.e(this.c, awbjVar.c) && ffkj.e(this.d, awbjVar.d) && ffkj.e(this.e, awbjVar.e) && ffkj.e(this.f, awbjVar.f) && ffkj.e(this.g, awbjVar.g) && ffkj.e(this.h, awbjVar.h) && ffkj.e(this.i, awbjVar.i) && ffkj.e(this.j, awbjVar.j) && ffkj.e(this.k, awbjVar.k);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = uri == null ? 0 : uri.hashCode();
        ContentType contentType = this.b;
        int hashCode2 = contentType == null ? 0 : contentType.hashCode();
        int i = hashCode * 31;
        ContentType contentType2 = this.c;
        int hashCode3 = (((i + hashCode2) * 31) + (contentType2 == null ? 0 : contentType2.hashCode())) * 31;
        crce crceVar = this.d;
        int hashCode4 = (hashCode3 + (crceVar == null ? 0 : crceVar.hashCode())) * 31;
        eyee eyeeVar = this.e;
        int hashCode5 = (hashCode4 + (eyeeVar == null ? 0 : eyeeVar.hashCode())) * 31;
        ContentType contentType3 = this.f;
        int hashCode6 = (hashCode5 + (contentType3 == null ? 0 : contentType3.hashCode())) * 31;
        eyee eyeeVar2 = this.g;
        int hashCode7 = (hashCode6 + (eyeeVar2 == null ? 0 : eyeeVar2.hashCode())) * 31;
        ContentType contentType4 = this.h;
        int hashCode8 = (hashCode7 + (contentType4 == null ? 0 : contentType4.hashCode())) * 31;
        Uri uri2 = this.i;
        int hashCode9 = (((hashCode8 + (uri2 == null ? 0 : uri2.hashCode())) * 31) + this.j.hashCode()) * 31;
        awbt awbtVar = this.k;
        return hashCode9 + (awbtVar != null ? awbtVar.hashCode() : 0);
    }

    public final String toString() {
        return "StepInfo(fileUri=" + this.a + ", contentType=" + this.b + ", unencryptedContentType=" + this.c + ", uploadResult=" + this.d + ", thumbnailBytes=" + this.e + ", thumbnailContentType=" + this.f + ", unencryptedThumbnailBytes=" + this.g + ", unencryptedThumbnailContentType=" + this.h + ", unencryptedFileUri=" + this.i + ", encryptionProtocol=" + this.j + ", uploadResumeTransferHandle=" + this.k + ")";
    }

    public awbj(Uri uri, ContentType contentType, ContentType contentType2, crce crceVar, eyee eyeeVar, ContentType contentType3, eyee eyeeVar2, ContentType contentType4, Uri uri2, cfmh cfmhVar, awbt awbtVar) {
        cfmhVar.getClass();
        this.a = uri;
        this.b = contentType;
        this.c = contentType2;
        this.d = crceVar;
        this.e = eyeeVar;
        this.f = contentType3;
        this.g = eyeeVar2;
        this.h = contentType4;
        this.i = uri2;
        this.j = cfmhVar;
        this.k = awbtVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ awbj(android.net.Uri r15, com.google.android.rcs.client.messaging.data.ContentType r16, com.google.android.rcs.client.messaging.data.ContentType r17, defpackage.crce r18, defpackage.eyee r19, defpackage.eyee r20, android.net.Uri r21, defpackage.cfmh r22, defpackage.awbt r23, int r24) {
        /*
            r14 = this;
            r0 = r24
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto La
            cfmh r1 = defpackage.cfmh.a
            r12 = r1
            goto Lc
        La:
            r12 = r22
        Lc:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = r0 & 64
            r3 = r0 & 16
            r4 = r0 & 8
            r5 = r0 & 4
            r6 = r0 & 2
            r7 = r0 & 1
            r8 = 0
            if (r1 == 0) goto L1f
            r11 = r8
            goto L21
        L1f:
            r11 = r21
        L21:
            if (r2 == 0) goto L25
            r9 = r8
            goto L27
        L25:
            r9 = r20
        L27:
            if (r3 == 0) goto L2b
            r1 = r8
            goto L2d
        L2b:
            r1 = r19
        L2d:
            if (r4 == 0) goto L31
            r2 = r8
            goto L33
        L31:
            r2 = r18
        L33:
            if (r5 == 0) goto L37
            r5 = r8
            goto L39
        L37:
            r5 = r17
        L39:
            if (r6 == 0) goto L3d
            r4 = r8
            goto L3f
        L3d:
            r4 = r16
        L3f:
            r3 = 1
            if (r3 != r7) goto L44
            r3 = r8
            goto L45
        L44:
            r3 = r15
        L45:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L4b
            r13 = r8
            goto L4d
        L4b:
            r13 = r23
        L4d:
            r8 = 0
            r10 = 0
            r7 = r1
            r6 = r2
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbj.<init>(android.net.Uri, com.google.android.rcs.client.messaging.data.ContentType, com.google.android.rcs.client.messaging.data.ContentType, crce, eyee, eyee, android.net.Uri, cfmh, awbt, int):void");
    }
}
