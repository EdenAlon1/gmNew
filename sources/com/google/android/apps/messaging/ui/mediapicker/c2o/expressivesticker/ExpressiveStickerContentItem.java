package com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.bwwz;
import defpackage.dccq;
import defpackage.eohh;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExpressiveStickerContentItem extends VisualContentItem {
    public static final Parcelable.Creator<ExpressiveStickerContentItem> CREATOR = new dccq();
    public final String a;

    public ExpressiveStickerContentItem(Uri uri, String str, int i, int i2, String str2, eohh eohhVar) {
        super(uri, str, (eohhVar == eohh.STICKER_CHOOSER || eohhVar == (r0 = eohh.EXPRESSIVE_STICKER_CHOOSER) || eohhVar == eohh.EXPRESSIVE_STICKER_PACK_DETAILS || eohhVar == eohh.EXPRESSIVE_STICKER_GALLERY_SEARCH) ? eohhVar : r0, i, i2);
        eohh eohhVar2;
        this.a = str2;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final Uri e() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExpressiveStickerContentItem) {
            return Objects.equals(this.a, ((ExpressiveStickerContentItem) obj).a);
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final String f() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public ExpressiveStickerContentItem(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
    }

    public ExpressiveStickerContentItem(bwwz bwwzVar) {
        this(bwwzVar.m(), bwwzVar.n(), bwwzVar.l(), bwwzVar.k(), bwwzVar.o(), eohh.EXPRESSIVE_STICKER_CHOOSER);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExpressiveStickerContentItem(defpackage.ewnk r9, defpackage.eohh r10) {
        /*
            r8 = this;
            ewmw r0 = r9.e
            if (r0 != 0) goto L6
            ewmw r0 = defpackage.ewmw.a
        L6:
            java.lang.String r0 = r0.c
            android.net.Uri r2 = android.net.Uri.parse(r0)
            ewmw r0 = r9.e
            if (r0 != 0) goto L12
            ewmw r0 = defpackage.ewmw.a
        L12:
            java.lang.String r3 = defpackage.caqv.a(r0)
            ewmw r0 = r9.e
            if (r0 != 0) goto L1c
            ewmw r0 = defpackage.ewmw.a
        L1c:
            ewmt r0 = r0.f
            if (r0 != 0) goto L22
            ewmt r0 = defpackage.ewmt.a
        L22:
            int r4 = r0.b
            ewmw r0 = r9.e
            if (r0 != 0) goto L2a
            ewmw r0 = defpackage.ewmw.a
        L2a:
            ewmt r0 = r0.f
            if (r0 != 0) goto L30
            ewmt r0 = defpackage.ewmt.a
        L30:
            int r5 = r0.c
            java.lang.String r6 = r9.c
            r1 = r8
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem.<init>(ewnk, eohh):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExpressiveStickerContentItem(defpackage.ewnk r9, defpackage.eumg r10) {
        /*
            r8 = this;
            ewmw r0 = r9.e
            if (r0 != 0) goto L6
            ewmw r0 = defpackage.ewmw.a
        L6:
            java.lang.String r0 = r0.c
            android.net.Uri r2 = android.net.Uri.parse(r0)
            ewmw r0 = r9.e
            if (r0 != 0) goto L12
            ewmw r0 = defpackage.ewmw.a
        L12:
            java.lang.String r3 = defpackage.caqv.a(r0)
            ewmw r0 = r9.e
            if (r0 != 0) goto L1c
            ewmw r0 = defpackage.ewmw.a
        L1c:
            ewmt r0 = r0.f
            if (r0 != 0) goto L22
            ewmt r0 = defpackage.ewmt.a
        L22:
            int r4 = r0.b
            ewmw r0 = r9.e
            if (r0 != 0) goto L2a
            ewmw r0 = defpackage.ewmw.a
        L2a:
            ewmt r0 = r0.f
            if (r0 != 0) goto L30
            ewmt r0 = defpackage.ewmt.a
        L30:
            int r5 = r0.c
            java.lang.String r6 = r9.c
            int r9 = r10.ordinal()
            r10 = 4
            if (r9 == r10) goto L45
            r10 = 12
            if (r9 == r10) goto L42
            eohh r9 = defpackage.eohh.EXPRESSIVE_STICKER_CHOOSER
            goto L47
        L42:
            eohh r9 = defpackage.eohh.EXPRESSIVE_STICKER_PACK_DETAILS
            goto L47
        L45:
            eohh r9 = defpackage.eohh.EXPRESSIVE_STICKER_GALLERY_SEARCH
        L47:
            r1 = r8
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem.<init>(ewnk, eumg):void");
    }
}
