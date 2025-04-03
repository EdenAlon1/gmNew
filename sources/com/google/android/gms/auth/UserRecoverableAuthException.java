package com.google.android.gms.auth;

import android.content.Intent;
import android.util.Log;
import defpackage.dezu;
import defpackage.dfak;
import defpackage.dfwv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UserRecoverableAuthException extends dezu {
    private final Intent a;
    private final dfak b;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, dfak.LEGACY);
    }

    public final Intent a() {
        Intent intent = this.a;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (ordinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (ordinal != 2) {
            return null;
        }
        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }

    public UserRecoverableAuthException(String str, Intent intent, dfak dfakVar) {
        super(str);
        this.a = intent;
        dfwv.n(dfakVar);
        this.b = dfakVar;
    }
}
