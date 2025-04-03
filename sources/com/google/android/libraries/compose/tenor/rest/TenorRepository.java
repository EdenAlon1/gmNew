package com.google.android.libraries.compose.tenor.rest;

import defpackage.evko;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.ffix;
import defpackage.ffkd;
import defpackage.ffnl;
import defpackage.ffno;
import defpackage.ffss;
import defpackage.fjdw;
import defpackage.fjem;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TenorRepository {
    public static final Companion Companion = new Companion(null);
    private final String apiKey;
    private final String contentFilter;
    private final ffbz service$delegate;

    /* compiled from: PG */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String currentLocale() {
            return Locale.getDefault().toLanguageTag();
        }

        public /* synthetic */ Companion(ffkd ffkdVar) {
            this();
        }
    }

    public TenorRepository(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.apiKey = str;
        this.contentFilter = str2;
        this.service$delegate = ffca.a(new ffix() { // from class: com.google.android.libraries.compose.tenor.rest.TenorRepository$$ExternalSyntheticLambda0
            @Override // defpackage.ffix
            public final Object invoke() {
                TenorService service_delegate$lambda$0;
                service_delegate$lambda$0 = TenorRepository.service_delegate$lambda$0();
                return service_delegate$lambda$0;
            }
        });
    }

    private final TenorService getService() {
        return (TenorService) this.service$delegate.a();
    }

    private final ffss<MediaResultsResponse> search(String str, String str2) {
        TenorService service = getService();
        String currentLocale = Companion.currentLocale();
        currentLocale.getClass();
        return service.getGifs(this.apiKey, str, 50, currentLocale, this.contentFilter, str2);
    }

    public static /* synthetic */ ffss searchSuggestions$default(TenorRepository tenorRepository, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return tenorRepository.searchSuggestions(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TenorService service_delegate$lambda$0() {
        fjdw fjdwVar = new fjdw();
        fjdwVar.d(TenorRepositoryKt.TENOR_URL);
        fjdwVar.c(fjem.c(new evko().a()));
        fjdwVar.b(CoroutineCallAdapterFactory.Companion.create());
        return (TenorService) fjdwVar.a().a(TenorService.class);
    }

    public final ffss<SearchSuggestionsResponse> autoCompleteSearch(String str, int i) {
        str.getClass();
        TenorService service = getService();
        String currentLocale = Companion.currentLocale();
        currentLocale.getClass();
        return service.autoCompleteSearch(this.apiKey, str, i, currentLocale);
    }

    public final ffss<CategoriesResponse> getCategories() {
        TenorService service = getService();
        String currentLocale = Companion.currentLocale();
        currentLocale.getClass();
        return service.getCategories(this.apiKey, currentLocale, this.contentFilter);
    }

    public final ffss<MediaResultsResponse> getGifsById(ffnl<String> ffnlVar) {
        ffnlVar.getClass();
        return getService().getGifsById(this.apiKey, ffno.l(ffnlVar, null, 63));
    }

    public final ffss<RegisterShareResponse> registerShare(String str) {
        str.getClass();
        return getService().registerShare(this.apiKey, str);
    }

    public final ffss<MediaResultsResponse> searchGifs(String str) {
        str.getClass();
        return search(str, "-sticker");
    }

    public final ffss<MediaResultsResponse> searchGifsAndStickers(String str) {
        str.getClass();
        return search(str, "none");
    }

    public final ffss<MediaResultsResponse> searchStickers(String str) {
        str.getClass();
        return search(str, "sticker");
    }

    public final ffss<SearchSuggestionsResponse> searchSuggestions(String str, int i) {
        str.getClass();
        TenorService service = getService();
        String currentLocale = Companion.currentLocale();
        currentLocale.getClass();
        return service.getSearchSuggestions(this.apiKey, str, i, currentLocale);
    }
}
