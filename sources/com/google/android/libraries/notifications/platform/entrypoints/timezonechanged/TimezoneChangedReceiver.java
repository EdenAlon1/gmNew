package com.google.android.libraries.notifications.platform.entrypoints.timezonechanged;

import android.content.Context;
import defpackage.eagz;
import defpackage.eaha;
import defpackage.eajj;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TimezoneChangedReceiver extends eagz {
    @Override // defpackage.eagz
    public final eaha a(Context context) {
        ffbr ffbrVar = (ffbr) eajj.a(context).fI().get("timezonechanged");
        eaha eahaVar = ffbrVar != null ? (eaha) ffbrVar.b() : null;
        if (eahaVar != null) {
            return eahaVar;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
