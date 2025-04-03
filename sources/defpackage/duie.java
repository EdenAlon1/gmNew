package defpackage;

import com.android.vcard.VCardConfig;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duie implements qtp {
    public int b;
    public final int c = -1;
    public final int d = -1;
    public final int e = -1;
    private int f;
    private boolean g;
    private Integer h;
    private Integer i;
    private Integer j;

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(21).putInt(this.f).put((byte) 0).putInt(0).putInt(-1).putInt(-1).putInt(-1).array());
    }

    public final int b(int i) {
        if (i == Integer.MIN_VALUE) {
            return 0;
        }
        return i;
    }

    public final void c(int i) {
        this.b |= i;
        this.f = i | this.f;
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof duie) {
            duie duieVar = (duie) obj;
            if (this.f == duieVar.f) {
                boolean z = duieVar.g;
                Integer num = duieVar.h;
                if (rkh.l(null, null)) {
                    int i = duieVar.c;
                    int i2 = duieVar.d;
                    int i3 = duieVar.e;
                    Integer num2 = duieVar.i;
                    if (rkh.l(null, null)) {
                        Integer num3 = duieVar.j;
                        if (rkh.l(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return rkh.e(this.f, rkh.e(0, rkh.f(null, rkh.e(-1, rkh.e(-1, rkh.e(-1, rkh.e(0, rkh.d(0))))))));
    }

    public final String toString() {
        int i = this.b;
        int i2 = i & 16;
        int i3 = i & 4;
        int i4 = eera.a;
        int i5 = i & 8192;
        int i6 = this.b;
        int i7 = i6 & 1;
        int i8 = 4194304 & i6;
        int i9 = i6 & 8;
        int i10 = 33554432 & i6;
        int i11 = i6 & 4096;
        int i12 = i6 & 512;
        int i13 = i6 & 2048;
        int i14 = i6 & 32;
        int i15 = i6 & 16384;
        int i16 = 32768 & i6;
        int i17 = 131072 & i6;
        int i18 = i6 & 65536;
        int i19 = i6 & 262144;
        int i20 = i6 & 524288;
        int i21 = i6 & 64;
        int i22 = i6 & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        int i23 = i6 & 16777216;
        int i24 = i6 & VCardConfig.FLAG_APPEND_TYPE_PARAM;
        int i25 = i6 & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        String str = (i6 & 256) != 0 ? "soften-1,null,null " : "";
        String str2 = 1 != i7 ? "" : "crop ";
        StringBuilder sb = new StringBuilder("FifeUrlOptions{ ");
        sb.append(i2 != 0 ? "kill_animation " : "");
        sb.append(i3 != 0 ? "no_overlay " : "");
        sb.append(i5 != 0 ? "app_domain " : "");
        sb.append(str2);
        sb.append(i8 != 0 ? "circlecrop " : "");
        sb.append(i9 != 0 ? "smartcrop " : "");
        sb.append(i10 != 0 ? "centercrop " : "");
        sb.append(i11 != 0 ? "loose_face_crop " : "");
        sb.append(i12 != 0 ? "exif " : "");
        sb.append(i13 != 0 ? "jpeg " : "");
        sb.append("");
        sb.append(i14 != 0 ? "webp " : "");
        String str3 = i16 != 0 ? "blur " : "";
        String str4 = i17 != 0 ? "mp4 " : "";
        String str5 = i18 != 0 ? "loop " : "";
        String str6 = i19 != 0 ? "no_silhouette " : "";
        String str7 = i20 != 0 ? "monogram " : "";
        String str8 = i21 != 0 ? "no_upscale " : "";
        String str9 = i22 != 0 ? "no_google_metadata " : "";
        String str10 = i23 != 0 ? "google_metadata " : "";
        String str11 = i24 != 0 ? "force_transformation " : "";
        String str12 = i25 != 0 ? "colorize_filter " : "";
        sb.append(i15 != 0 ? "webp_animation " : "");
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        sb.append(str6);
        sb.append(str7);
        sb.append(str8);
        sb.append(str9);
        sb.append(str10);
        sb.append(str11);
        sb.append("");
        sb.append(str12);
        sb.append(str);
        sb.append(" }");
        return sb.toString();
    }
}
