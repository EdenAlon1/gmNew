package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exak {
    public ewzb a;
    public Bundle b;
    private final CharSequence c;

    public exak(CharSequence charSequence) {
        charSequence.getClass();
        this.c = charSequence;
    }

    public final exal a() {
        ewzb ewzbVar = this.a;
        Bundle bundle = this.b;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new exal(this.c, ewzbVar, bundle);
    }
}
