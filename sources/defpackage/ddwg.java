package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwg {
    public final ffbr a;
    private final Resources b;
    private final csrh c;

    public ddwg(Context context, csrh csrhVar, ffbr ffbrVar) {
        this.b = context.getResources();
        this.c = csrhVar;
        this.a = ffbrVar;
    }

    public final String a(MediaSearchResult mediaSearchResult, boolean z) {
        return this.b.getString(true != z ? R.string.zero_state_search_details_image_accessibility : R.string.zero_state_search_details_video_accessibility, e(mediaSearchResult.f(), mediaSearchResult.l(), Optional.ofNullable(mediaSearchResult.n()).map(new Function() { // from class: ddwd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aolr) ddwg.this.a.b()).n((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })), b(mediaSearchResult.g()));
    }

    public final String b(long j) {
        return this.c.d(j).toString();
    }

    public final String c(UrlSearchResult urlSearchResult) {
        return d(urlSearchResult.f(), urlSearchResult.m(), Optional.ofNullable(urlSearchResult.r()).map(new Function() { // from class: ddwf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aolr) ddwg.this.a.b()).n((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), urlSearchResult.i());
    }

    public final String d(int i, String str, Optional optional, long j) {
        String e = e(i, str, optional);
        return !TextUtils.isEmpty(e) ? String.format("%s · %s", e, b(j)) : b(j);
    }

    public final String e(int i, String str, Optional optional) {
        return i != -2 ? this.b.getString(R.string.zero_state_search_location_sender_you) : !TextUtils.isEmpty(str) ? str : (String) optional.map(new Function() { // from class: ddwe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aolr aolrVar = (aolr) ddwg.this.a.b();
                cfva cfvaVar = aoqm.a;
                return aolrVar.i((aoku) obj, !((Boolean) new emyl() { // from class: aoow
                    @Override // defpackage.emyl
                    public final Object get() {
                        return Boolean.valueOf(ersy.a("bugle.enable_messaging_identity_in_location_search_item_data", "bugle"));
                    }
                }.get()).booleanValue()).H(((Boolean) new emyl() { // from class: aoow
                    @Override // defpackage.emyl
                    public final Object get() {
                        return Boolean.valueOf(ersy.a("bugle.enable_messaging_identity_in_location_search_item_data", "bugle"));
                    }
                }.get()).booleanValue()).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("");
    }
}
