package com.google.android.odml.image;

import defpackage.ehuk;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ImageProperties {

    /* compiled from: PG */
    public static abstract class Builder {
        abstract ImageProperties build();

        abstract Builder setImageFormat(int i);

        abstract Builder setStorageType(int i);
    }

    static Builder builder() {
        return new ehuk();
    }

    public abstract int a();

    public abstract int b();
}
