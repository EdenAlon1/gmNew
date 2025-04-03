package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class ciuw {
    public static ciuv m(ciux ciuxVar, IconCompat iconCompat, CharSequence charSequence, Optional optional) {
        cisq cisqVar = new cisq();
        cisqVar.b(ciuxVar);
        cisqVar.c = Optional.of(iconCompat);
        cisqVar.g(charSequence);
        cisqVar.c((Bundle) optional.orElse(new Bundle()));
        cisqVar.a = Optional.empty();
        cisqVar.b = Optional.empty();
        cisqVar.f(false);
        cisqVar.f = Optional.empty();
        cisqVar.d = Optional.empty();
        cisqVar.e(false);
        cisqVar.d(false);
        cisqVar.e = Optional.of(0);
        return cisqVar;
    }

    public static ciuv n(ciux ciuxVar, IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Optional optional) {
        cisq cisqVar = new cisq();
        cisqVar.b(ciuxVar);
        cisqVar.a = Optional.of(pendingIntent);
        cisqVar.c((Bundle) optional.orElse(new Bundle()));
        cisqVar.c = Optional.of(iconCompat);
        cisqVar.g(charSequence);
        cisqVar.b = Optional.empty();
        cisqVar.f = Optional.empty();
        cisqVar.f(false);
        cisqVar.d = Optional.empty();
        cisqVar.e(false);
        cisqVar.d(false);
        cisqVar.e = Optional.of(0);
        return cisqVar;
    }

    public static ciuw o(ciux ciuxVar, kma kmaVar, Optional optional) {
        cisq cisqVar = new cisq();
        cisqVar.b(ciuxVar);
        cisqVar.c((Bundle) optional.orElse(new Bundle()));
        cisqVar.c = Optional.ofNullable(kmaVar.a());
        cisqVar.g(kmaVar.h);
        cisqVar.b = Optional.empty();
        cisqVar.f = Optional.empty();
        cisqVar.f(false);
        cisqVar.e(false);
        cisqVar.d(false);
        cisqVar.e = Optional.of(0);
        cisqVar.d = Optional.of(Boolean.valueOf(kmaVar.c));
        kns[] knsVarArr = kmaVar.b;
        if (knsVarArr != null) {
            cisqVar.f = Optional.of(knsVarArr);
        } else {
            cisqVar.f = Optional.empty();
        }
        PendingIntent pendingIntent = kmaVar.i;
        if (pendingIntent != null) {
            cisqVar.a = Optional.of(pendingIntent);
        }
        cisqVar.e = Optional.of(Integer.valueOf(kmaVar.e));
        return cisqVar.a();
    }

    public static ciuv p(ciux ciuxVar, IconCompat iconCompat, CharSequence charSequence, Intent intent, boolean z) {
        cisq cisqVar = new cisq();
        cisqVar.b(ciuxVar);
        cisqVar.a = Optional.empty();
        cisqVar.b = Optional.of(intent);
        cisqVar.c = Optional.of(iconCompat);
        cisqVar.g(charSequence);
        cisqVar.f(false);
        cisqVar.f = Optional.empty();
        cisqVar.d = Optional.empty();
        cisqVar.c(new Bundle());
        cisqVar.e(true);
        cisqVar.d(z);
        cisqVar.e = Optional.of(0);
        return cisqVar;
    }

    public abstract Bundle a();

    public abstract ciux b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract CharSequence i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();
}
