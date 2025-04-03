package defpackage;

import android.os.Bundle;
import android.text.SpannedString;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exal {
    public final CharSequence a;
    public final ewzb b;
    public final Bundle c;

    public exal(CharSequence charSequence, ewzb ewzbVar, Bundle bundle) {
        this.a = SpannedString.valueOf(charSequence);
        this.b = ewzbVar == null ? new ewza().a() : ewzbVar;
        this.c = bundle;
    }
}
