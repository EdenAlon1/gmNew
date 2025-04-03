package defpackage;

import android.os.Bundle;
import androidx.core.app.RemoteActionCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewyv {
    public String a;
    public Bundle b;
    private String c;
    private final List d = new ArrayList();
    private final Map e = new cmh();

    public final ewyx a() {
        String str = this.c;
        ewxv ewxvVar = new ewxv(this.e);
        String str2 = this.a;
        Bundle bundle = this.b;
        return new ewyx(str, this.d, ewxvVar, str2, bundle == null ? Bundle.EMPTY : bundle.deepCopy());
    }

    public final void b(RemoteActionCompat remoteActionCompat) {
        emxf.a(remoteActionCompat != null);
        this.d.add(remoteActionCompat);
    }

    public final void c(String str, float f) {
        this.e.put(str, Float.valueOf(f));
    }

    public final void d(CharSequence charSequence) {
        this.c = charSequence == null ? null : charSequence.toString();
    }
}
