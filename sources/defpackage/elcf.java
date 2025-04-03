package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class elcf {
    public abstract engw a();

    public abstract engw b();

    public abstract UUID c();

    public final String toString() {
        return TextUtils.join(" -> ", b());
    }
}
