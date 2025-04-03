package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aolq {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/identity/MessagingIdentityDifferenceReporter");
    public final Context b;
    public final fazb c;
    public final fazb d;
    public final fazb e;
    public final fazb f;
    private final fazb g;

    public aolq(Context context, fazb fazbVar, fazb fazbVar2, fazb fazbVar3, fazb fazbVar4, fazb fazbVar5) {
        this.b = context;
        this.c = fazbVar;
        this.d = fazbVar2;
        this.g = fazbVar3;
        this.e = fazbVar4;
        this.f = fazbVar5;
    }

    public static evhq b(ayvm ayvmVar, String str) {
        return new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, str == null ? "null" : ((ayhf) ayvmVar.a(str)).a);
    }

    public final ctvf a(String str) {
        if (str != null && str.length() == 2) {
            ctvf ctvfVar = new ctvf(((esfl) this.g.b()).a(str.toUpperCase(Locale.US)));
            if (!ctvfVar.a()) {
                return ctvfVar;
            }
        }
        return new ctvf(0);
    }
}
