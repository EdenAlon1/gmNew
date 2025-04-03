package com.bumptech.glide.load;

import defpackage.qxd;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* compiled from: PG */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean a;

        ImageType(boolean z) {
            this.a = z;
        }

        public boolean hasAlpha() {
            return this.a;
        }

        public boolean isWebp() {
            int ordinal = ordinal();
            return ordinal == 5 || ordinal == 6 || ordinal == 7;
        }
    }

    int a(InputStream inputStream, qxd qxdVar);

    int b(ByteBuffer byteBuffer, qxd qxdVar);

    ImageType c(InputStream inputStream);

    ImageType d(ByteBuffer byteBuffer);

    boolean e(InputStream inputStream, qxd qxdVar);

    boolean f(ByteBuffer byteBuffer, qxd qxdVar);
}
