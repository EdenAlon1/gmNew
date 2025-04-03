package defpackage;

import android.view.ContentInfo;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvk {
    public static ktm a(View view, ktm ktmVar) {
        ContentInfo performReceiveContent;
        ContentInfo f = ktmVar.f();
        performReceiveContent = view.performReceiveContent(f);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == f ? ktmVar : ktm.g(performReceiveContent);
    }

    public static void b(View view, String[] strArr, kue kueVar) {
        if (kueVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new kvl(kueVar));
        }
    }

    public static String[] c(View view) {
        String[] receiveContentMimeTypes;
        receiveContentMimeTypes = view.getReceiveContentMimeTypes();
        return receiveContentMimeTypes;
    }
}
