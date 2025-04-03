package defpackage;

import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekku extends fbae {
    public ekku(ea eaVar) {
        super(eaVar);
    }

    public static final void a(ea eaVar, eyhs eyhsVar) {
        fbae.e(eaVar);
        Bundle bundle = eaVar.m;
        eyhsVar.getClass();
        ProtoParsers.k(bundle, "TIKTOK_FRAGMENT_ARGUMENT", eyhsVar);
    }

    public static final void b(ea eaVar, String str) {
        fbae.e(eaVar);
        Bundle bundle = eaVar.m;
        str.getClass();
        bundle.putString("TIKTOK_FRAGMENT_ARGUMENT", str);
    }

    @Override // defpackage.fbae
    protected final void c(ea eaVar) {
        Class<?> cls = eaVar.getClass();
        eg G = eaVar.G();
        cls.getSimpleName();
        G.getClass();
        emxf.r(eaVar.G() instanceof ekke, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", eaVar.getClass().getSimpleName(), eaVar.G().getClass().getSimpleName());
    }
}
