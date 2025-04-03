package com.google.android.libraries.compose.tenor.rest;

import defpackage.ffkj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MediaResultsResponse {
    private final List<MediaResult> results;

    public MediaResultsResponse(List<MediaResult> list) {
        this.results = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaResultsResponse copy$default(MediaResultsResponse mediaResultsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mediaResultsResponse.results;
        }
        return mediaResultsResponse.copy(list);
    }

    public final List<MediaResult> component1() {
        return this.results;
    }

    public final MediaResultsResponse copy(List<MediaResult> list) {
        return new MediaResultsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MediaResultsResponse) && ffkj.e(this.results, ((MediaResultsResponse) obj).results);
    }

    public final List<MediaResult> getResults() {
        return this.results;
    }

    public int hashCode() {
        List<MediaResult> list = this.results;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "MediaResultsResponse(results=" + this.results + ")";
    }
}
