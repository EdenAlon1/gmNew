package com.google.android.libraries.compose.tenor.rest;

import defpackage.ffkj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SearchSuggestionsResponse {
    private final List<String> results;

    public SearchSuggestionsResponse(List<String> list) {
        list.getClass();
        this.results = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchSuggestionsResponse copy$default(SearchSuggestionsResponse searchSuggestionsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchSuggestionsResponse.results;
        }
        return searchSuggestionsResponse.copy(list);
    }

    public final List<String> component1() {
        return this.results;
    }

    public final SearchSuggestionsResponse copy(List<String> list) {
        list.getClass();
        return new SearchSuggestionsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSuggestionsResponse) && ffkj.e(this.results, ((SearchSuggestionsResponse) obj).results);
    }

    public final List<String> getResults() {
        return this.results;
    }

    public int hashCode() {
        return this.results.hashCode();
    }

    public String toString() {
        return "SearchSuggestionsResponse(results=" + this.results + ")";
    }
}
