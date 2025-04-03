package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class ciwn {
    public static ciwn c(Optional optional, Optional optional2) {
        return new cisy(optional, (Bundle) optional2.orElse(new Bundle()));
    }

    public abstract Bundle a();

    public abstract Optional b();
}
