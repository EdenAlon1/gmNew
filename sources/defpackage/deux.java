package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deux extends deva {
    final /* synthetic */ Boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deux(devc devcVar, String str, Boolean bool) {
        super(devcVar, str);
        this.a = bool;
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.c) ? Boolean.valueOf(sharedPreferences.getBoolean(this.c, false)) : this.a;
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            throw new IllegalArgumentException("null cannot be written for Boolean");
        }
        editor.putBoolean(this.c, bool.booleanValue());
    }
}
