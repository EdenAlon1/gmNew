package com.google.android.libraries.onegoogle.accountmenu.features.education.db;

import android.content.Context;
import defpackage.ebjl;
import defpackage.osq;
import defpackage.osy;
import defpackage.otb;
import defpackage.ovj;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class EducationDatabase extends otb {
    public static EducationDatabase x(Context context, Executor executor) {
        osy a = osq.a(context.getApplicationContext(), EducationDatabase.class, "og_education.db");
        a.e(executor);
        if (a.h != null) {
            throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
        }
        a.b = executor;
        a.e.add(1);
        a.b(new ovj[0]);
        return (EducationDatabase) a.a();
    }

    public abstract ebjl y();
}
