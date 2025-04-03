package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hm implements Parcelable.Creator {
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            android.os.Parcelable$Creator r0 = android.media.MediaDescription.CREATOR
            java.lang.Object r14 = r0.createFromParcel(r14)
            r0 = 0
            if (r14 == 0) goto L67
            android.media.MediaDescription r14 = (android.media.MediaDescription) r14
            java.lang.String r2 = r14.getMediaId()
            java.lang.CharSequence r3 = r14.getTitle()
            java.lang.CharSequence r4 = r14.getSubtitle()
            java.lang.CharSequence r5 = r14.getDescription()
            android.graphics.Bitmap r6 = r14.getIconBitmap()
            android.net.Uri r7 = r14.getIconUri()
            android.os.Bundle r1 = r14.getExtras()
            android.os.Bundle r1 = defpackage.ia.a(r1)
            if (r1 == 0) goto L33
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r1)
            r1 = r8
        L33:
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            if (r1 == 0) goto L3e
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L3f
        L3e:
            r9 = r0
        L3f:
            if (r9 == 0) goto L58
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L52
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L52
            r8 = r0
            goto L59
        L52:
            r1.remove(r8)
            r1.remove(r10)
        L58:
            r8 = r1
        L59:
            if (r9 != 0) goto L5f
            android.net.Uri r9 = r14.getMediaUri()
        L5f:
            hn r1 = new hn
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.a = r14
            return r1
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new hn[i];
    }
}
