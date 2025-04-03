package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekks extends fazw {
    public ekks(Activity activity) {
        super(activity);
    }

    @Override // defpackage.fazw
    protected final Object a() {
        boolean z = this.a.getApplication() instanceof ekke;
        Activity activity = this.a;
        emxf.r(z, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", activity.getClass().getSimpleName(), activity.getApplication().getClass().getSimpleName());
        return super.a();
    }
}
