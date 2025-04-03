package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_ContentType;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awuq {
    public static final awup a(ContentType contentType) {
        awun awunVar = (awun) awup.a.createBuilder();
        awunVar.getClass();
        awur.c(contentType.c(), awunVar);
        awur.b(contentType.b(), awunVar);
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((awup) awunVar.instance).e)).getClass();
        enhk a = contentType.a();
        a.getClass();
        awunVar.a(a);
        return awur.a(awunVar);
    }

    public static final awup b(String str) {
        str.getClass();
        try {
            return a(ContentType.e(str));
        } catch (IllegalArgumentException unused) {
            awun awunVar = (awun) awup.a.createBuilder();
            awunVar.getClass();
            awur.c("application", awunVar);
            awur.b("octet-stream", awunVar);
            return awur.a(awunVar);
        }
    }

    public static final ContentType c(awup awupVar) {
        eifc d = ContentType.d();
        if ((awupVar.b & 1) != 0) {
            d.f(awupVar.c);
        }
        if ((awupVar.b & 2) != 0) {
            d.e(awupVar.d);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(awupVar.e);
        unmodifiableMap.getClass();
        if (!unmodifiableMap.isEmpty()) {
            Map unmodifiableMap2 = DesugarCollections.unmodifiableMap(awupVar.e);
            unmodifiableMap2.getClass();
            d.h(engq.e(unmodifiableMap2));
        }
        return d.g();
    }

    public static final ContentType d(awup awupVar) {
        awupVar.getClass();
        eifc d = ContentType.d();
        int i = awupVar.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            d.f("application");
            d.e("octet-stream");
        } else {
            d.f(awupVar.c);
            d.e(awupVar.d);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(awupVar.e);
        unmodifiableMap.getClass();
        if (!unmodifiableMap.isEmpty()) {
            Map unmodifiableMap2 = DesugarCollections.unmodifiableMap(awupVar.e);
            unmodifiableMap2.getClass();
            d.h(engq.e(unmodifiableMap2));
        }
        return d.g();
    }

    public static final ContentType e(String str) {
        str.getClass();
        try {
            return ContentType.e(str);
        } catch (IllegalArgumentException unused) {
            ContentType contentType = ContentType.d;
            contentType.getClass();
            return contentType;
        }
    }

    public static final boolean f(String str, ContentType contentType) {
        awup a = a(contentType);
        AutoValue_ContentType autoValue_ContentType = (AutoValue_ContentType) ContentType.e(str);
        return ffkj.e(a.c, autoValue_ContentType.a) && ffkj.e(a.d, autoValue_ContentType.b);
    }
}
