package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class dfbz {
    public static Bundle a(dfcb dfcbVar) {
        kzi a = dfcbVar.a();
        if (a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (a.c) {
            bundle.putInt("authentication_result_type", a.a.a);
            return bundle;
        }
        kzg kzgVar = a.b;
        bundle.putInt("authentication_error_code", kzgVar.a);
        CharSequence charSequence = kzgVar.b;
        if (charSequence == null) {
            return bundle;
        }
        bundle.putString("authentication_error_message", charSequence.toString());
        return bundle;
    }
}
