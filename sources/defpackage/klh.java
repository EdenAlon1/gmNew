package defpackage;

import android.app.ActivityOptions;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klh extends kli {
    private final ActivityOptions a;

    public klh(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // defpackage.kli
    public final Bundle a() {
        return this.a.toBundle();
    }
}
