package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuy extends deva {
    final /* synthetic */ Integer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deuy(devc devcVar, String str, Integer num) {
        super(devcVar, str);
        this.a = num;
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.c) ? Integer.valueOf(sharedPreferences.getInt(this.c, 0)) : this.a;
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            throw new IllegalArgumentException("null cannot be written for Integer");
        }
        editor.putInt(this.c, num.intValue());
    }
}
