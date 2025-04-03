package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface cswh {
    public static final String a = (String) cswg.a.e();

    @fjfd(a = "v1/registershare")
    ListenableFuture<csxq> a(@fjfi(a = "key") String str, @fjfi(a = "id") String str2, @fjfi(a = "q") String str3, @fjfi(a = "locale") String str4);

    @fjeu(a = "v1/search")
    ListenableFuture<csxr> b(@fjfi(a = "key") String str, @fjfi(a = "q") String str2, @fjfi(a = "limit") int i, @fjfi(a = "locale") String str3, @fjfi(a = "contentfilter") String str4);
}
