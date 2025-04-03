package defpackage;

import android.os.Bundle;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekkj {
    public static Locale a(ea eaVar) {
        Bundle bundle = eaVar.m;
        if (bundle == null) {
            return null;
        }
        return (Locale) bundle.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }
}
