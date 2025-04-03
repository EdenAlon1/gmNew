package com.google.android.libraries.compose.tenor.rest;

import defpackage.ffkj;
import defpackage.ffpc;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MediaResult {
    private final String h1_title;
    private final String id;
    private final List<Map<String, Media>> media;
    private final String title;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaResult(String str, String str2, String str3, String str4, List<? extends Map<String, Media>> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.id = str;
        this.url = str2;
        this.title = str3;
        this.h1_title = str4;
        this.media = list;
    }

    private final String component3() {
        return this.title;
    }

    private final String component4() {
        return this.h1_title;
    }

    public static /* synthetic */ MediaResult copy$default(MediaResult mediaResult, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaResult.id;
        }
        if ((i & 2) != 0) {
            str2 = mediaResult.url;
        }
        if ((i & 4) != 0) {
            str3 = mediaResult.title;
        }
        if ((i & 8) != 0) {
            str4 = mediaResult.h1_title;
        }
        if ((i & 16) != 0) {
            list = mediaResult.media;
        }
        List list2 = list;
        String str5 = str3;
        return mediaResult.copy(str, str2, str5, str4, list2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.url;
    }

    public final List<Map<String, Media>> component5() {
        return this.media;
    }

    public final MediaResult copy(String str, String str2, String str3, String str4, List<? extends Map<String, Media>> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        return new MediaResult(str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaResult)) {
            return false;
        }
        MediaResult mediaResult = (MediaResult) obj;
        return ffkj.e(this.id, mediaResult.id) && ffkj.e(this.url, mediaResult.url) && ffkj.e(this.title, mediaResult.title) && ffkj.e(this.h1_title, mediaResult.h1_title) && ffkj.e(this.media, mediaResult.media);
    }

    public final String getId() {
        return this.id;
    }

    public final List<Map<String, Media>> getMedia() {
        return this.media;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.url.hashCode()) * 31) + this.title.hashCode()) * 31) + this.h1_title.hashCode()) * 31) + this.media.hashCode();
    }

    public final String title() {
        String str = this.title;
        if (true == ffpc.J(str)) {
            str = null;
        }
        return str == null ? this.h1_title : str;
    }

    public String toString() {
        return "MediaResult(id=" + this.id + ", url=" + this.url + ", title=" + this.title + ", h1_title=" + this.h1_title + ", media=" + this.media + ")";
    }
}
