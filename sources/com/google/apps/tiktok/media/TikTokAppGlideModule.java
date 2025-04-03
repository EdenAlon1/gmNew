package com.google.apps.tiktok.media;

import android.content.Context;
import defpackage.ekhw;
import defpackage.emxc;
import defpackage.emxn;
import defpackage.qpt;
import defpackage.qpy;
import defpackage.qqk;
import defpackage.rhl;
import defpackage.rhm;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TikTokAppGlideModule extends rhl {

    /* compiled from: PG */
    public interface a {
        emxc eI();

        Set fW();
    }

    @Override // defpackage.rhl
    public final void c(Context context, qpy qpyVar) {
        ((rhl) ((emxn) ((a) ekhw.a(context, a.class)).eI()).a).c(context, qpyVar);
    }

    @Override // defpackage.rhm
    public final void d(Context context, qpt qptVar, qqk qqkVar) {
        ((a) ekhw.a(context, a.class)).eI();
        Iterator it = ((a) ekhw.a(context, a.class)).fW().iterator();
        while (it.hasNext()) {
            ((rhm) it.next()).d(context, qptVar, qqkVar);
        }
    }
}
