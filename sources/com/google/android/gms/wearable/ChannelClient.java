package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Parcelable;
import defpackage.dfqz;
import defpackage.dfra;
import defpackage.dhre;
import defpackage.diag;
import defpackage.diah;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ChannelClient extends dfra {

    /* compiled from: PG */
    public interface Channel extends Parcelable {
        String a();
    }

    public ChannelClient(Context context, dfqz dfqzVar) {
        super(context, diah.a, diag.a, dfqzVar);
    }

    public abstract dhre a(Channel channel);
}
