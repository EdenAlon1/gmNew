package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.google.apps.tiktok.media.TikTokAppGlideModule;
import defpackage.qpq;
import defpackage.qpt;
import defpackage.qpy;
import defpackage.qqk;
import defpackage.rha;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final TikTokAppGlideModule a = new TikTokAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.google.apps.tiktok.media.TikTokAppGlideModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final /* synthetic */ rha a() {
        return new qpq();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set b() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.rhl
    public final void c(Context context, qpy qpyVar) {
        this.a.c(context, qpyVar);
    }

    @Override // defpackage.rhm
    public final void d(Context context, qpt qptVar, qqk qqkVar) {
        this.a.d(context, qptVar, qqkVar);
    }
}
