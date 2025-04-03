package defpackage;

import android.content.res.TypedArray;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ellu {
    /* JADX WARN: Multi-variable type inference failed */
    public static TypedArray a(View view) {
        emxf.m(view instanceof ellv, "Tried to @Inject @StyledAttributes TypedArray in a Peer not annotated by @Styleable. See g3doc.corp.google.com/java/com/google/apps/tiktok/g3doc/dagger/viewpeers.md#styleable for more information.");
        return ((ellv) view).a();
    }
}
