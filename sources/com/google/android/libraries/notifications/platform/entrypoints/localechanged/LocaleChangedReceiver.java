package com.google.android.libraries.notifications.platform.entrypoints.localechanged;

import android.content.Context;
import defpackage.eagz;
import defpackage.eaha;
import defpackage.eajj;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class LocaleChangedReceiver extends eagz {
    @Override // defpackage.eagz
    public final eaha a(Context context) {
        ffbr ffbrVar = (ffbr) eajj.a(context).fI().get("localechanged");
        eaha eahaVar = ffbrVar != null ? (eaha) ffbrVar.b() : null;
        if (eahaVar != null) {
            return eahaVar;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
