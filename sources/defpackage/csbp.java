package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes8.dex */
final /* synthetic */ class csbp {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] c;
    static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        d = iArr;
        try {
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            d[Bitmap.CompressFormat.JPEG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            d[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[esjm.values().length];
        c = iArr2;
        try {
            iArr2[esjm.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            c[esjm.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            c[esjm.AUDIO.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            c[esjm.VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            c[esjm.ATTACHMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            c[esjm.RICH_CARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            c[esjm.LOCATION.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            c[esjm.RCS_LOCATION.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        int[] iArr3 = new int[esji.values().length];
        b = iArr3;
        try {
            iArr3[esji.TOMBSTONE_GROUP_RENAMED_LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        int[] iArr4 = new int[csbj.values().length];
        a = iArr4;
        try {
            iArr4[csbj.OBJECT_PAYLOAD_PART_ADDITIONAL_FIELDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            a[csbj.OBJECT_PAYLOAD_PART_ENCRYPTED_FREQ_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            a[csbj.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
    }
}
