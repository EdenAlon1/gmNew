package com.google.android.libraries.compose.tenor.rest;

import defpackage.ffss;
import defpackage.fjeu;
import defpackage.fjfd;
import defpackage.fjfi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface TenorService {
    @fjeu(a = "v1/autocomplete")
    ffss<SearchSuggestionsResponse> autoCompleteSearch(@fjfi(a = "key") String str, @fjfi(a = "q") String str2, @fjfi(a = "limit") int i, @fjfi(a = "locale") String str3);

    @fjeu(a = "v1/categories")
    ffss<CategoriesResponse> getCategories(@fjfi(a = "key") String str, @fjfi(a = "locale") String str2, @fjfi(a = "contentfilter") String str3);

    @fjeu(a = "v1/search")
    ffss<MediaResultsResponse> getGifs(@fjfi(a = "key") String str, @fjfi(a = "q") String str2, @fjfi(a = "limit") int i, @fjfi(a = "locale") String str3, @fjfi(a = "contentfilter") String str4, @fjfi(a = "searchfilter") String str5);

    @fjeu(a = "v1/gifs")
    ffss<MediaResultsResponse> getGifsById(@fjfi(a = "key") String str, @fjfi(a = "ids") String str2);

    @fjeu(a = "v1/search_suggestions")
    ffss<SearchSuggestionsResponse> getSearchSuggestions(@fjfi(a = "key") String str, @fjfi(a = "q") String str2, @fjfi(a = "limit") int i, @fjfi(a = "locale") String str3);

    @fjfd(a = "v1/registershare")
    ffss<RegisterShareResponse> registerShare(@fjfi(a = "key") String str, @fjfi(a = "id") String str2);
}
