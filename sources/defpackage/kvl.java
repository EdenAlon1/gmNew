package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvl implements OnReceiveContentListener {
    private final kue a;

    public kvl(kue kueVar) {
        this.a = kueVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        kue kueVar = this.a;
        ktm g = ktm.g(contentInfo);
        ktm a = kueVar.a(view, g);
        if (a == null) {
            return null;
        }
        return a == g ? contentInfo : a.f();
    }
}
