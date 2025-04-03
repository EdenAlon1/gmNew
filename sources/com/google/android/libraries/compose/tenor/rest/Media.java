package com.google.android.libraries.compose.tenor.rest;

import defpackage.ffkj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Media {
    private final List<Integer> dims;
    private final String preview;
    private final int size;
    private final String url;

    public Media(String str, String str2, int i, List<Integer> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.url = str;
        this.preview = str2;
        this.size = i;
        this.dims = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Media copy$default(Media media, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = media.url;
        }
        if ((i2 & 2) != 0) {
            str2 = media.preview;
        }
        if ((i2 & 4) != 0) {
            i = media.size;
        }
        if ((i2 & 8) != 0) {
            list = media.dims;
        }
        return media.copy(str, str2, i, list);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.preview;
    }

    public final int component3() {
        return this.size;
    }

    public final List<Integer> component4() {
        return this.dims;
    }

    public final Media copy(String str, String str2, int i, List<Integer> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        return new Media(str, str2, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media media = (Media) obj;
        return ffkj.e(this.url, media.url) && ffkj.e(this.preview, media.preview) && this.size == media.size && ffkj.e(this.dims, media.dims);
    }

    public final List<Integer> getDims() {
        return this.dims;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final int getSize() {
        return this.size;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.url.hashCode() * 31) + this.preview.hashCode()) * 31) + this.size) * 31) + this.dims.hashCode();
    }

    public String toString() {
        return "Media(url=" + this.url + ", preview=" + this.preview + ", size=" + this.size + ", dims=" + this.dims + ")";
    }
}
