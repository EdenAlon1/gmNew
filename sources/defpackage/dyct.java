package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyct {
    public static dyct d(Context context, String str) {
        return new dycu(context.getPackageName(), str);
    }

    public abstract String a();

    public abstract String b();

    public abstract void c();

    public abstract void e();
}
