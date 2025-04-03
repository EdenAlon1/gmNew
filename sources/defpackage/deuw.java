package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuw extends deva {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deuw(devc devcVar, String str, String str2) {
        super(devcVar, str);
        this.a = str2;
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.c, this.a);
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        String str = (String) obj;
        if (str == null) {
            throw new IllegalArgumentException("null cannot be written for String");
        }
        editor.putString(this.c, str);
    }
}
